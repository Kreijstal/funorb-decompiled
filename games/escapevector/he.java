/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends k {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private ef[] field_w;
    static eh field_r;
    static int field_y;
    private ef field_t;
    static mf field_u;
    static int field_x;

    final ef a(int param0, byte param1) {
        ef dupTemp$0 = null;
        if (param1 == -53) {
          dupTemp$0 = new ef();
          this.field_w[param0] = dupTemp$0;
          return dupTemp$0;
        }
        this.field_t = (ef) null;
        ef dupTemp$1 = new ef();
        this.field_w[param0] = dupTemp$1;
        return dupTemp$1;
    }

    final static te a(mf param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        te stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -18109) {
            field_v = (String) null;
          }
          if (uc.a(param0, 96, param3, param2)) {
            stackIn_6_0 = da.b((byte) 8);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (te) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("he.Q(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(ed[] param0, int param1) {
        int var4 = 0;
        ef[] var3 = null;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param0;
            }
          }
          if (param1 == 6) {
            return;
          }
          field_v = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("he.O(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        hm stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ef var7 = null;
        ef var9 = null;
        hc var10 = null;
        ef var11 = null;
        ef var12 = null;
        ef var13 = null;
        ef var14 = null;
        try {
          if (!(param3 instanceof hc)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (hm) (param3);
          }
          var10 = (hc) (stackIn_3_0);
          rd.a(param3.field_g + param3.field_k + param0, param0 + param3.field_k, param3.field_j + (param1 + param3.field_x), 19807, param1 + param3.field_j);
          if (var10 != null) {
            param4 = param4 & var10.field_y;
          }
          var7 = this.field_w[0];
          this.field_t.a(true);
          var7.a(param0, this.field_t, param3, param1, 63, this);
          if (var10 != null) {
            if (var10.field_z) {
              var11 = this.field_w[1];
              if (var11 != null) {
                var11.a(param0, this.field_t, param3, param1, -106, this);
              }
            }
            if (var10.field_u) {
              var12 = this.field_w[3];
              if (0 != var10.field_t &&
                var12 != null) {
                var12.a(param0, this.field_t, param3, param1, -124, this);
              } else {
                var9 = this.field_w[2];
                if (var9 != null) {
                  var9.a(param0, this.field_t, param3, param1, -101, this);
                }
              }
            }
          }
          if (param3.h(0)) {
            var13 = this.field_w[5];
            if (var13 != null) {
              var13.a(param0, this.field_t, param3, param1, 51, this);
            }
          }
          if (!param4) {
            var14 = this.field_w[4];
            if (var14 != null) {
              var14.a(param0, this.field_t, param3, param1, -94, this);
            }
          }
          if (param2 >= -14) {
            he.a(true);
          }
          this.field_t.a(this, param3, param0, param1, (byte) 21);
          dl.a((byte) -8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("he.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(ed param0, byte param1) {
        int var4 = 0;
        ef[] var3 = null;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = EscapeVector.field_A;
        try {
          var7 = this.field_w;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
            }
          }
          if (param1 > 65) {
            return;
          }
          he.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("he.R(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    he(he param0, boolean param1) {
        this();
        try {
          param0.a(param1, 123, this);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static kb a(String param0, int param1, byte param2) {
        jb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        jb stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new jb();
          var4 = -90 / ((param2 + 5) / 40);
          ((kb) ((Object) var3)).field_b = param1;
          ((kb) ((Object) var3)).field_a = param0;
          stackIn_1_0 = var3;
          return (kb) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("he.S(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!param0) {
          return;
        }
        field_s = null;
    }

    public he() {
        this.field_w = new ef[6];
        this.field_t = new ef();
        ef dupTemp$0 = new ef();
        this.field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
        int var4_int = 0;
        ef dupTemp$0 = null;
        ef stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ef stackIn_9_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ef var5 = null;
        ef var6 = null;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        try {
          super.a(param2, 127);
          if (param0) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_w[var4_int];
              if (var5 != null) {
                var6 = param2.field_w[var4_int];
                stackIn_8_0 = var5;
                stackIn_8_1 = -2;
                if (var6 == null) {
                  dupTemp$0 = new ef();
                  param2.field_w[var4_int] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                } else {
                  stackIn_9_2 = var6;
                }
                ((ef) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
              } else {
                param2.field_w[var4_int] = null;
              }
            }
          } else {
            qg.a(this.field_w, 0, param2.field_w, 0, 6);
          }
          if (param1 > 120) {
            return;
          }
          field_r = (eh) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("he.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(ed[] param0, int param1, byte param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (param2 != -117) {
            he var5 = (he) null;
            this.a(false, -105, (he) null);
          }
          if (this.field_w[var4_int] == null) {
            this.field_w[var4_int] = new ef();
          }
          this.field_w[param1].field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "he.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
