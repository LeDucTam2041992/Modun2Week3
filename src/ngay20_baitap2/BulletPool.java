package ngay20_baitap2;

public class BulletPool extends MemoryPool<Bullet> {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
