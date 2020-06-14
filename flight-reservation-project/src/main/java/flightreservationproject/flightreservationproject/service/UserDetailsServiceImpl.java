//package flightreservationproject.flightreservationproject.service;
//
//import flightreservationproject.flightreservationproject.domain.User;
//import flightreservationproject.flightreservationproject.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.Optional;
//
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> userOptional = userRepository.findByEmail(username);
//
//        if(userOptional.isPresent())
//            throw new UsernameNotFoundException("User not found for email "+username);
//        User user = userOptional.get();
//
//        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), user.getRoles());
//    }
//}
