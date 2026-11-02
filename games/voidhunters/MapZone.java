/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MapZone extends IntrusiveNode implements DiffableState {
    int x;
    int height;
    int y;
    int width;

    public final void b(byte param0, tv param1) {
        MapZone var5 = null;
        MapZone var6 = null;
        try {
          if (param0 < 54) {
            this.y = 98;
          }
          var5 = (MapZone) (param1);
          var6 = var5;
          var6.y = this.y;
          var6.width = this.width;
          var6.x = this.x;
          var6.height = this.height;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        if (param2 != -98) {
          return true;
        }
        if (this.x > param1) {
          return false;
        }
        if (param0 < this.y) {
          return false;
        }
        if (param1 >= this.x + this.width) {
          return false;
        }
        if (param0 < this.y + this.height) {
          return true;
        }
        return false;
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.x = param0.i(0, 32);
          this.y = param0.i(0, 32);
          this.width = param0.i(0, 32);
          this.height = param0.i(0, 32);
          if (param1) {
            this.a(64, 118, (byte) 59);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cq.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        MapZone var5 = null;
        try {
          var5 = (MapZone) (other);
          var4 = 0;
          if (this.x != var5.x) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.x + ", now=" + this.x);
          }
          if (var5.y != this.y) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.y + ", now=" + this.y);
          }
          if (var5.width != this.width) {
            var4 = 1;
            System.out.println("int width has changed. before=" + var5.width + ", now=" + this.width);
          }
          if (var5.height != this.height) {
            System.out.println("int height has changed. before=" + var5.height + ", now=" + this.height);
            var4 = 1;
          }
          if (obfuscationGuard >= -19) {
            return;
          }
          if (var4 != 0) {
            System.out.println("This instance of MapZone has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("cq.F(");
          if (other == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.x, 32);
          param0.a(-632, this.y, 32);
          param0.a(-632, this.width, 32);
          if (param1 > -109) {
            lta var4 = (lta) null;
            this.a(-77, 104, (lta) null);
          }
          param0.a(-632, this.height, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cq.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        MapZone var3 = null;
        int var4 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (MapZone) (param1);
          var4 = 86 % ((param0 - 22) / 59);
          stackIn_7_0 = (this.x != var3.x) || (this.y != var3.y) || (var3.width != this.width) || (var3.height != this.height);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, lta param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          var4_int = param2.a(this.x, (byte) 126);
          var5 = param2.b(true, this.y);
          if (param0 != 32) {
            faa var8 = (faa) null;
            this.b((faa) null, 76);
          }
          var6 = param2.a(this.width + this.x, (byte) 125);
          var7 = param2.b(true, this.height + this.y);
          ga.a(64, false, var4_int, var5, -var5 + var7, -var4_int + var6, param1);
          uv.a(112, var4_int, -var5 + var7, var5, param1, -var4_int + var6);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cq.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    MapZone() {
    }

    MapZone(int param0, int param1) {
        this.height = 65536;
        this.x = param0;
        this.y = param1;
        this.width = 65536;
    }

    static {
    }
}
