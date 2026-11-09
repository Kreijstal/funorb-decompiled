/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RendererStateSnapshot {
    static int[] field_e;
    private int[] projection;
    static String[] leaderboardSortLabels;
    private int[] clip;
    private int farPlane;
    private long startTimeMillis;
    private int nearPlane;

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_e = null;
        leaderboardSortLabels = null;
    }

    final void restore(RendererSession session, int bottomIndex) {
        GraphicsToolkit var4 = null;
        GraphicsToolkit var3 = null;
        try {
          var4 = session.toolkit;
          var3 = var4;
          var4.setClip(this.clip[0], this.clip[1], this.clip[2], this.clip[bottomIndex]);
          var4.setProjection(this.projection[0], this.projection[1], this.projection[2], this.projection[3]);
          var3.setDepthRange(this.nearPlane, this.farPlane);
          session.startTimeMillis = this.startTimeMillis;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cj.C(" + (session != null ? "{...}" : "null") + ',' + bottomIndex + ')');
        }
    }

    final void capture(int guard, RendererSession session) {
        GraphicsToolkit var3 = null;
        try {
          var3 = session.toolkit;
          var3.getClip(this.clip);
          if (guard >= -106) {
            this.farPlane = -2;
          }
          this.projection = var3.projectionParameters();
          this.nearPlane = var3.nearPlane();
          this.farPlane = var3.farPlane();
          this.startTimeMillis = session.startTimeMillis;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cj.B(" + guard + ',' + (session != null ? "{...}" : "null") + ')');
        }
    }

    RendererStateSnapshot() {
        this.clip = new int[4];
    }

    static {
        field_e = new int[]{0, 0, 1, 2, 0, 3, 0, 4, 0, 5, 6, 7, 0, 8, 9, 10, 0, 11, 0, 12, 0, 13, 14, 15, 0};
        leaderboardSortLabels = new String[]{"By rating", "By win percentage"};
    }
}
