/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GridPoint {
    int row;
    static Sprite field_c;
    int column;

    final void clear(int param0) {
        this.row = 0;
        this.column = 0;
        if (param0 != 17939) {
          this.column = 87;
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 12523) {
          GridPoint.releaseStatics(6);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final void set(int param0, GridPoint param1) {
        try {
          this.column = param1.column;
          if (param0 > -79) {
            GridPoint var4 = (GridPoint) null;
            this.set(86, (GridPoint) null);
          }
          this.row = param1.row;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ob.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int toTileIndex(byte param0) {
        int var2;
        int var2Lifetime1;
        if (param0 == -68) {
          var2 = 20 * this.row + this.column;
          if (var2 < 0) {
            var2 = 0;
          }
          if (var2 > 299) {
            var2 = 299;
          }
          return var2;
        }
        field_c = (Sprite) null;
        var2Lifetime1 = 20 * this.row + this.column;
        if (var2Lifetime1 < 0) {
          var2Lifetime1 = 0;
        }
        if (var2Lifetime1 > 299) {
          var2Lifetime1 = 299;
        }
        return var2Lifetime1;
    }

    GridPoint() {
        this.column = 0;
        this.row = 0;
    }

    GridPoint(GridPoint param0) {
        try {
          this.column = param0.column;
          this.row = param0.row;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
