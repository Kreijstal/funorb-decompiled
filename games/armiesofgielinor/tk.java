/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tk implements kh {
    private BitmapFont field_g;
    private int field_e;
    private int field_l;
    private int field_i;
    private int field_h;
    private int field_k;
    private int field_j;
    private int field_d;
    private int field_a;
    private int field_b;
    private int field_m;
    static boolean[] field_f;
    private int field_c;

    final static ResourceArchive a(int param0, boolean param1, int param2, boolean param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveProvider var8 = null;
          ResourceArchive stackIn_2_0 = null;
          ResourceArchive stackIn_17_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != 1) {
              stackIn_2_0 = (ResourceArchive) null;
              return stackIn_2_0;
            }
            var6 = null;
            if (null != vq.field_c.field_r) {
              SpellMenuGroup.field_b = new BufferedFile(vq.field_c.field_r, 5200, 0);
              vq.field_c.field_r = null;
              var6 = new SectorCacheStore(255, SpellMenuGroup.field_b, new BufferedFile(vq.field_c.field_d, 12000, 0), 2097152);
            }
            var7 = null;
            if (null != SpellMenuGroup.field_b) {
              if (mu.field_b == null) {
                mu.field_b = new BufferedFile[vq.field_c.field_c.length];
              }
              if (mu.field_b[param0] == null) {
                mu.field_b[param0] = new BufferedFile(vq.field_c.field_c[param0], 12000, 0);
                vq.field_c.field_c[param0] = null;
              }
              var7 = new SectorCacheStore(param0, SpellMenuGroup.field_b, mu.field_b[param0], 2097152);
            }
            var8 = oi.field_c.a(param3, (SectorCacheStore) (var7), param0, 0, (SectorCacheStore) (var6));
            if (param4) {
              var8.c(31637);
            }
            stackIn_17_0 = new ResourceArchive(var8, param1, param5);
            return stackIn_17_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 > -36) {
          tk.a(-28, true, 82, false, false, -112);
        }
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        kb stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vu var11 = null;
        try {
          if (param0 instanceof vu) {
            stackIn_3_0 = (kb) (param0);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (vu) (stackIn_3_0);
          if (var11 != null) {
            param3 = param3 & var11.field_I;
          }
          if (param2 >= -79) {
            this.field_e = -101;
          }
          var7 = 5592405;
          SoftwareRaster.f(param1 + param0.field_B, param0.field_p + param4, param0.field_l, param0.field_w, this.field_l);
          if (param3) {
            var7 = 16777215;
          }
          var8 = this.field_i + (param1 + param0.field_B);
          var9 = param0.field_p + (param4 + this.field_m);
          SoftwareRaster.g(var8, var9, this.field_h, this.field_j, 5592405);
          SoftwareRaster.f(var8, var9, this.field_h, this.field_j, var7);
          if (var11.field_K) {
            SoftwareRaster.h(var8, var9, this.field_h + var8, this.field_j + var9, 1);
            SoftwareRaster.h(var8 + this.field_h, var9, var8, this.field_j + var9, 1);
          }
          if (this.field_g != null) {
            var10 = this.field_a + this.field_h + this.field_i;
            this.field_g.a(param0.field_v, param1 + param0.field_B + var10, param0.field_p + param4 + this.field_k, -this.field_a - var10 + param0.field_l, param0.field_w - (this.field_a << 1), this.field_b, this.field_c, this.field_d, this.field_e, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("tk.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    tk(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_d = 1;
        try {
          this.field_i = param5;
          this.field_b = param3;
          this.field_c = param4;
          this.field_j = param7;
          this.field_k = param2;
          this.field_a = param1;
          this.field_m = param6;
          this.field_h = param8;
          this.field_g = param0;
          this.field_l = param9;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = new boolean[64];
    }
}
