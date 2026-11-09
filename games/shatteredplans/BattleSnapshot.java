/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class BattleSnapshot extends IntrusiveNode {
    int field_z;
    Player field_k;
    int field_x;
    int field_n;
    Player field_j;
    Player[] field_q;
    int field_u;
    int[] field_m;
    static int[] field_r;
    static String field_p;
    int[] field_v;
    Star field_o;
    Territory field_h;
    Player field_l;
    static String field_A;
    static String field_i;
    static DiskCacheWorker field_w;
    static HitRegion field_s;
    static AnimatedPanel field_t;
    static AnimatedPanel field_y;

    final static void d(int param0) {
        int var2 = 0;
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          BufferedSocket.a(-6187, 640, 480, 372, 0);
          var1_int = -RasterBuffer.field_a + 480;
          for (var2 = 0; PlacementEvent.field_l.length > var2; var2++) {
            if (null != PlacementEvent.field_l[var2]) {
              PlacementEvent.field_l[var2].a(-208410008, var1_int);
              var1_int -= 18;
              continue;
            }
            break;
          }
          if (param0 != -14145) {
            BattleSnapshot.getCurrentYear(-71);
          }
          Star.f((byte) -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vn.A(" + param0 + ')');
        }
    }

    final static int getCurrentYear(int param0) {
        if (param0 != -13299) {
          BattleSnapshot.clearStatics((byte) 41);
        }
        return new Date().getYear() + 1900;
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2Lifetime1;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (BirthDateConfirmationForm.field_L == null) {
            stackIn_4_0 = 0;
          } else {
            stackIn_4_0 = BirthDateConfirmationForm.field_L.length;
          }
          var1_int = stackIn_4_0;
          if (null != oi.field_i) {
            for (var2 = 0; oi.field_i.length > var2; var2++) {
              var1_int = var1_int + oi.field_i[var2].length;
            }
          }
          if (param0 != 0) {
            return false;
          }
          var2Lifetime1 = var1_int * WeightedLruCache.field_g.field_j;
          if (var2Lifetime1 <= te.field_c) {
            return true;
          }
          te.field_c = var2Lifetime1;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1), "vn.F(" + param0 + ')');
        }
    }

    final void c(boolean param0) {
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_v = (int[]) ((Object) this.field_m.clone());
        if (!param0) {
          this.c(false);
        }
        this.field_u = 0;
        for (var2 = 0; this.field_m.length > var2; var2++) {
          this.field_u = this.field_u + this.field_m[var2];
        }
        if (this.field_q.length == 1) {
          this.field_u = 0;
          for (var2Lifetime1 = 0; this.field_v.length > var2Lifetime1; var2Lifetime1++) {
            this.field_v[var2Lifetime1] = 0;
          }
          return;
        }
        this.field_l = this.field_q[vc.a((byte) -39, -1 + this.field_q.length)];
        if (this.field_k == this.field_l) {
          this.field_l = this.field_q[-1 + this.field_q.length];
        }
        var2Lifetime2 = -1 + this.field_m.length;
        if (null != this.field_k) {
          stackIn_15_0 = this.field_k.field_x;
        } else {
          stackIn_15_0 = var2Lifetime2;
        }
        var3 = stackIn_15_0;
        if (this.field_l == null) {
          stackIn_18_0 = var2Lifetime2;
        } else {
          stackIn_18_0 = this.field_l.field_x;
        }
        var4 = stackIn_18_0;
        this.field_v[var3] = this.field_v[var3] - this.field_n;
        this.field_u = this.field_u - this.field_n;
        this.field_v[var4] = this.field_v[var4] - 1;
        this.field_u = this.field_u - 1;
        return;
    }

    public static void clearStatics(byte param0) {
        field_p = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_t = null;
        field_w = null;
        field_A = null;
        field_i = null;
        if (param0 != 68) {
          BattleSnapshot.getCurrentYear(52);
        }
    }

    BattleSnapshot(BattleEvent param0) {
        int var2_int = 0;
        try {
          this.field_z = 0;
          this.field_m = param0.field_j;
          this.field_j = param0.field_w;
          this.field_n = param0.field_l;
          this.field_q = param0.field_h;
          this.field_k = param0.field_i;
          this.field_o = param0.field_p;
          this.field_h = param0.field_m;
          this.field_x = param0.field_n;
          for (var2_int = 0; var2_int < this.field_m.length; var2_int++) {
            if (this.field_z < this.field_m[var2_int]) {
              this.field_z = this.field_m[var2_int];
            }
          }
          this.c(true);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static ro a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ro var5 = null;
        ro stackIn_4_0 = null;
        ro stackIn_8_0 = null;
        ro stackIn_11_0 = null;
        ro stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            0 != param1.length()) {
            var2_int = param1.indexOf((int) (char)param0);
            if (-1 == var2_int) {
              stackIn_8_0 = fg.field_a;
              return stackIn_8_0;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(var2_int + 1);
            var5 = uc.a(-77, var3);
            if (var5 == null) {
              stackIn_13_0 = fg.a(var4, (byte) 111);
              return stackIn_13_0;
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = hd.field_r;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("vn.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        field_r = new int[6];
        field_p = "<%0> has left the lobby.";
        int[] var0 = new int[]{150, 60, 60, 60, 60, 60};
        int var1 = 560;
        for (var2 = 0; 6 > var2; var2++) {
          var1 = var1 - var0[var2];
        }
        var2Lifetime1 = 560;
        for (var3 = 5; var3 > 0; var3--) {
          var4 = var1 / (2 + var3);
          var1 = var1 - var4;
          var2Lifetime1 = var2Lifetime1 - var4;
          field_r[var3] = var2Lifetime1 - (var0[var3] >> 1);
          var2Lifetime1 = var2Lifetime1 - var0[var3];
        }
        field_r[0] = var1 >> 1;
        field_i = "(hiding this text)";
        field_A = "Your rating is <%0>";
    }
}
