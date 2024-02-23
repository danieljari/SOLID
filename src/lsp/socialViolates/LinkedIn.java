package lsp.socialViolates;

public class LinkedIn extends SocialMedia{


    @Override
    public void chatFeature() {

    }

    @Override
    public void publishPost(Object Post) {

    }
    // On LinkedIn you cannot send Gifs to someone ( Violates  LSP)
    @Override
    public void sendGifs() {

    }
    // On LinkedIn you cannot call someone ( Violates  LSP)
    @Override
    public void videoCallFeature(String user) {

    }
}
