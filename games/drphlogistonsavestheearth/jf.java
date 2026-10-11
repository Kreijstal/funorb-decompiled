/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class jf extends ca {
    private vg field_hb;
    private int field_lb;
    static String field_fb;
    private int field_jb;
    private int field_mb;
    private cd field_ob;
    private dl field_gb;
    static Random field_nb;
    private int field_pb;
    private int field_qb;
    static int[] field_ib;
    static String field_kb;

    boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 63) {
            return false;
          }
          if (super.a(param0, param1, param2, 113)) {
            return true;
          }
          if (this.field_gb == null) {
            return false;
          }
          if (98 == param0) {
            this.field_gb.a(false, param2);
          }
          if (param0 == 99) {
            this.field_gb.a(false, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("jf.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0, vg param1) {
        try {
          if (this.field_gb != null) {
            this.field_gb.a(param0 ^ 16157);
          }
          if (param0 != -52) {
            field_nb = (Random) null;
          }
          if (param1 != null) {
            param1.a(6 + this.field_jb, param1.field_k, 6, 16535, param1.field_w);
            this.field_gb = new dl(param1);
          } else {
            this.field_gb = new dl();
          }
          this.b(this.field_gb, (byte) 104);
          this.field_hb = null;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jf.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    jf(k param0, vg param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_w, param1.field_k + param2 + 12);
        try {
          this.field_mb = param4;
          this.field_jb = param2;
          this.field_qb = param3;
          this.field_lb = param3;
          this.a((byte) -52, param1);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void h(byte param0) {
        field_kb = null;
        if (param0 < 90) {
          return;
        }
        field_nb = null;
        field_fb = null;
        field_ib = null;
    }

    boolean k(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        vg var4 = null;
        int var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        vg var4Lifetime1;
        vg var4Lifetime2;
        vg var4Lifetime3;
        if (null != this.field_ob) {
          if (this.field_ob != oe.field_c) {
            if (this.field_ob != kh.field_h) {
              if (param0 != 2968) {
                var4 = (vg) null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              }
              return super.k(2968);
            }
            fieldTemp$0 = this.field_pb + 1;
            this.field_pb = this.field_pb + 1;
            if (fieldTemp$0 != this.field_qb) {
              this.field_gb.field_K = (this.field_pb << 8) / this.field_qb;
              if (param0 != 2968) {
                var4 = (vg) null;
                this.a((byte) -80, (vg) null);
                return super.k(2968);
              }
              return super.k(2968);
            }
            this.field_ob = null;
            this.field_gb.field_K = 256;
            if (param0 == 2968) {
              return super.k(2968);
            }
            var4 = (vg) null;
            this.a((byte) -80, (vg) null);
            return super.k(2968);
          }
          fieldTemp$1 = this.field_pb + 1;
          this.field_pb = this.field_pb + 1;
          if (this.field_lb == fieldTemp$1) {
            this.field_ob = ni.field_s;
            this.a(this.field_mb, this.field_hb.field_k + (12 + this.field_jb), this.field_hb.field_w + 12, (byte) 104);
            this.field_pb = 0;
            this.field_gb.field_K = 0;
            if (param0 == 2968) {
              return super.k(2968);
            }
            var4Lifetime2 = (vg) null;
            this.a((byte) -80, (vg) null);
            return super.k(2968);
          }
          this.field_gb.field_K = 256 - (this.field_pb << 8) / this.field_lb;
          if (param0 == 2968) {
            return super.k(2968);
          }
          var4Lifetime3 = (vg) null;
          this.a((byte) -80, (vg) null);
          return super.k(2968);
        }
        if (param0 == 2968) {
          return super.k(2968);
        }
        var4Lifetime1 = (vg) null;
        this.a((byte) -80, (vg) null);
        return super.k(2968);
    }

    final void g(byte param0) {
        if (param0 < -111) {
          if (this.field_ob != null) {
            if (this.field_ob != kh.field_h) {
              this.b(this.field_hb.field_w + 12, 1688990433, this.field_hb.field_k + (12 + this.field_jb));
              this.a((byte) -52, this.field_hb);
            }
            this.field_gb.field_K = 256;
            this.field_ob = null;
          }
          super.g((byte) -118);
          return;
        }
    }

    final void l(int param0) {
        if (oe.field_c == this.field_ob) {
          return;
        }
        this.field_pb = 0;
        this.field_ob = kh.field_h;
        this.a((byte) -52, this.field_hb);
        if (param0 == -24626) {
          this.field_gb.field_K = 0;
          this.field_hb = null;
          return;
        }
        this.k(-41);
        this.field_gb.field_K = 0;
        this.field_hb = null;
    }

    final boolean j(int param0) {
        this.g((byte) -120);
        if (param0 != 0) {
          return true;
        }
        return super.j(0);
    }

    void a(int param0, vg param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_hb = param1;
          if (this.field_ob == ni.field_s) {
            this.a(this.field_mb, 12 + this.field_jb + this.field_hb.field_k, 12 + this.field_hb.field_w, (byte) 66);
            this.field_pb = 0;
          } else {
            if (oe.field_c != this.field_ob) {
              this.field_ob = oe.field_c;
              this.field_pb = 0;
            }
          }
          if (param0 == 33) {
            return;
          }
          this.field_jb = -14;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jf.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7552) {
            var3 = (CharSequence) null;
            jf.a((CharSequence) null, 52);
          }
          stackIn_3_0 = fc.a(true, -44, param0, 10);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jf.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_fb = "Reload game";
        field_nb = new Random();
        field_kb = "Please enter your age in years";
        field_ib = new int[75];
    }
}
