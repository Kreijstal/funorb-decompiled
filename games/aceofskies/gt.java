/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt extends DualLinkNode {
    static ll field_o;
    private long field_p;
    int field_n;
    static String field_r;
    private wl field_q;

    protected final void finalize() throws Throwable {
        this.c((byte) -95);
        super.finalize();
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 <= -120) {
          field_r = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        gt.a(110, (d) null, (java.awt.Canvas) null, (ResourceArchive) null, 56);
        field_r = null;
    }

    final static cd a(byte param0) {
        if (param0 != -46) {
          return (cd) null;
        }
        return new cd(ve.a(true), oh.a((byte) 114));
    }

    final static GraphicsRenderer a(int param0, d param1, java.awt.Canvas param2, ResourceArchive param3, int param4) {
        RuntimeException var5 = null;
        long var6 = 0L;
        jc var8 = null;
        jaggl.OpenGL var9 = null;
        jc stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!tq.c(true)) {
            throw new RuntimeException("");
          }
          if (!ei.a("jaggl", (byte) -16)) {
            throw new RuntimeException("");
          }
          if (param0 > -25) {
            gt.e(19);
          }
          var9 = new jaggl.OpenGL();
          var6 = var9.init(param2, 8, 8, 8, 24, 0, param4);
          if (0L == var6) {
            throw new RuntimeException("");
          }
          var8 = new jc(var9, param2, var6, param1, param3, param4);
          var8.f((byte) 101);
          stackIn_10_0 = var8;
          return (GraphicsRenderer) ((Object) stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("gt.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, String param1, int param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          nb.field_c = uk.field_j;
          if (param0 <= 119) {
            field_o = (ll) null;
          }
          if (param2 != 255) {
            if (param2 < 100) {
              GameAppletShell.field_l = dq.a(param2, 32, param1);
              return;
            }
            if (param2 > 105) {
              GameAppletShell.field_l = dq.a(param2, 32, param1);
              return;
            }
            var7 = param3;
            ArchiveIndex.a(var7, (byte) -17);
            GameAppletShell.field_l = oq.a((byte) -93, param3);
            return;
          }
          stackIn_6_0 = 111;
          stackIn_7_1 = !(sd.field_h >= 13);
          GameAppletShell.field_l = in.$cfr$intArgs$a$1ded6534de63(stackIn_6_0, stackIn_7_1);
          var6 = (String[]) null;
          ArchiveIndex.a((String[]) null, (byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("gt.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        if (param0 <= -64) {
          if (this.field_p > 0L) {
            this.field_q.field_kc.releasePbuffer(this.field_p);
            this.field_p = 0L;
          }
          return;
        }
        this.field_q = (wl) null;
        if (this.field_p > 0L) {
          this.field_q.field_kc.releasePbuffer(this.field_p);
          this.field_p = 0L;
        }
    }

    gt(wl param0, int param1, int param2) {
        try {
          this.field_n = param2 * param1;
          this.field_q = param0;
          this.field_p = this.field_q.field_kc.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gt.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final long f(int param0) {
        if (param0 != 25766) {
          return -63L;
        }
        return this.field_p;
    }

    static {
    }
}
