package isp;


/***
 *  ISP -  designing interfaces tailored to the specific needs of clients
 */
public class Guide {
    // Interface for basic media player functionality
    public interface MediaPlayer {
        void play();
        void pause();
        void stop();
    }

    // Interface for video player functionality
    public interface VideoPlayer {
        void playVideo();
    }

    // Interface for audio player functionality
    public interface AudioPlayer {
        void playAudio();
    }

    // Class representing a basic media player
    public class SimpleMediaPlayer implements MediaPlayer {
        @Override
        public void play() {
            System.out.println("Playing media");
        }

        @Override
        public void pause() {
            System.out.println("Pausing media");
        }

        @Override
        public void stop() {
            System.out.println("Stopping media");
        }
    }

    // Class representing an advanced media player supporting video
    public class VideoMediaPlayer implements MediaPlayer, VideoPlayer {
        @Override
        public void play() {
            System.out.println("Playing media");
        }

        @Override
        public void pause() {
            System.out.println("Pausing media");
        }

        @Override
        public void stop() {
            System.out.println("Stopping media");
        }

        @Override
        public void playVideo() {
            System.out.println("Playing video");
        }
    }

    // Class representing an advanced media player supporting audio
    public class AudioMediaPlayer implements MediaPlayer, AudioPlayer {
        @Override
        public void play() {
            System.out.println("Playing media");
        }

        @Override
        public void pause() {
            System.out.println("Pausing media");
        }

        @Override
        public void stop() {
            System.out.println("Stopping media");
        }

        @Override
        public void playAudio() {
            System.out.println("Playing audio");
        }
    }
}
