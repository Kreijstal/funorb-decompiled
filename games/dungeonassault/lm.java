/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class lm extends ne {
    int field_y;
    static byte[][] field_l;
    boolean field_u;
    pg field_n;
    static String field_r;
    String field_w;
    int field_A;
    int field_j;
    int field_v;
    static int field_k;
    static int[] field_m;
    int field_x;
    l field_t;
    static String field_p;
    ca field_o;
    int field_q;
    int field_s;
    static cn field_z;
    String field_i;

    final static void b(byte param0) {
        try {
          IOException iOException = null;
          IOException var3_ref = null;
          int var1_int = 0;
          int var2 = 0;
          int var4 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          var4 = DungeonAssault.field_K;
          try {
            if (hb.field_a != null) {
              hb.field_a.a(-1016);
            }
            if (null != na.field_y) {
              na.field_y.a(-65);
            }
            if (null != sa.field_x) {
              try {
                sa.field_x.c((byte) -118);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            var1_int = -105 / ((-8 - param0) / 61);
            if (null != cf.field_c) {
              var2 = 0;
              while (cf.field_c.length > var2) {
                if (var4 != 0) {
                  return;
                }
                if (null != cf.field_c[var2]) {
                  try {
                    cf.field_c[var2].c((byte) -42);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3_ref = (IOException) (Object) decompiledCaughtException;
                  }
                }
                var2++;
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw vk.a((Throwable) ((Object) var1), "lm.VB(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    void b(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param4;
        this.field_v = param2;
        this.field_x = param1;
        if (param0 != 0) {
          return;
        }
        this.field_q = param3;
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            try {
              var4 = param1.getCodeBase();
              var3 = j.a((byte) 116, var4, param1).getFile();
              ee.a("updatelinks", param1, param0 ^ -15735, new Object[]{"home", var3 + "home.ws"});
              if (param0 != -106) {
                lm.a(true, (String) null, 27L, (java.applet.Applet) null, (String) null);
              }
              ee.a("updatelinks", param1, 15647, new Object[]{"gamelist", var3 + "togamelist.ws"});
              ee.a("updatelinks", param1, 15647, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              ee.a("updatelinks", param1, 15647, new Object[]{"options", var3 + "options.ws"});
              ee.a("updatelinks", param1, 15647, new Object[]{"terms", var3 + "terms.ws"});
              ee.a("updatelinks", param1, 15647, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("lm.CC(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, lm param5, byte param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 == -84) {
            return false;
          }
          this.field_j = -54;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("lm.GB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          var3_int = 0;
          if (param1 != -113) {
            lm.a(true, (String) null, -94L, (java.applet.Applet) null, (String) null);
          }
          while (ib.field_k > var3_int) {
            if (var4 != 0) {
              return;
            }
            if (param0 == ue.field_j[var3_int]) {
              ue.field_j[var3_int] = param2;
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "lm.PB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, byte param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -76) {
            this.field_t = (l) null;
          }
          if (this.a(param1, param0, -113, param2)) {
            this.a(param0, param2, param1, 1);
          }
          stackIn_5_0 = (StringBuilder) (param2);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("lm.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, lm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 34) {
            return false;
          }
          this.field_q = 81;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void f(int param0) {
        this.b(0, this.field_x, this.field_v, this.field_q, this.field_s);
        if (param0 != 12591) {
          this.field_y = 64;
          return;
        }
    }

    final static void a(boolean param0, String param1, long param2, java.applet.Applet param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          try {
            try {
              var8 = param3.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              if (param0) {
                field_k = 1;
              }
              var7Lifetime2 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              if (param2 >= 0L) {
                var7Lifetime2 = var7Lifetime2 + "; Expires=" + go.a(kd.c(-2456) + param2 * 1000L, -124) + "; Max-Age=" + param2;
              }
              if (param2 < 0L ||
                DungeonAssault.field_K != 0) {
                var7Lifetime2 = var7Lifetime2 + "; Discard;";
              }
              ee.a("document.cookie=\"" + var7Lifetime2 + "\"", (byte) -46, param3);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("lm.RB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        String var5Lifetime1;
        String var5Lifetime2;
        var6 = DungeonAssault.field_K;
        var4 = this.d(127);
        var5_int = 0;
        while (true) {
          if (var4 < var5_int) {
            if (param2 == 452) {
              var5 = bk.b(param2 ^ 453);
              if (var5 != null) {
                hl.field_a.a(var5, 6710886, fl.field_l, wa.field_c);
              }
              return;
            }
            this.a((lm) null, -108, -48, 123, 4, (byte) -62, -69);
            var5Lifetime2 = bk.b(param2 ^ 453);
            if (var5Lifetime2 != null) {
              hl.field_a.a(var5Lifetime2, 6710886, fl.field_l, wa.field_c);
            }
            return;
          }
          this.a(var5_int, param1, 0, param0);
          var5_int++;
          if (var6 != 0) {
            var5Lifetime1 = bk.b(param2 ^ 453);
            if (var5Lifetime1 != null) {
              hl.field_a.a(var5Lifetime1, 6710886, fl.field_l, wa.field_c);
            }
            return;
          }
        }
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), (byte) -89).toString();
    }

    lm(String param0, pg param1) {
        this(param0, hl.field_a.field_m, param1);
    }

    final boolean a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        StringBuilder discarded$1 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 120 / ((29 - param2) / 55);
          if (!param0.containsKey(this)) {
            param0.put(this, this);
            return true;
          }
          discarded$1 = param3.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("lm.WB(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
          lm.a((cn) null, (byte) 98);
          if (param0 != 0) {
            return;
          }
          if (null != this.field_o) {
            this.field_o.a((byte) 34, this, param1, param3, true);
            return;
          }
          return;
        }
        if (param0 != 0) {
          return;
        }
        if (null == this.field_o) {
          return;
        }
        this.field_o.a((byte) 34, this, param1, param3, true);
    }

    public static void d(byte param0) {
        field_p = null;
        field_l = (byte[][]) null;
        if (param0 > -110) {
          return;
        }
        field_m = null;
        field_z = null;
        field_r = null;
    }

    String c(byte param0) {
        if (param0 <= 3) {
          this.a(12, (lm) null);
          if (this.field_u) {
            return this.field_i;
          }
          return null;
        }
        if (this.field_u) {
          return this.field_i;
        }
        return null;
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (!this.a((byte) 117)) {
          var4 = param1;
          if (var4 != 80) {
            var4 = -107 % ((82 - param0) / 44);
            return false;
          }
          return this.a(34, this);
        }
        if (this.a(this, param2, param1, (byte) 63)) {
          return true;
        }
        var4Lifetime1 = param1;
        if (var4Lifetime1 != 80) {
          var4Lifetime1 = -107 % ((82 - param0) / 44);
          return false;
        }
        return this.a(34, this);
    }

    final void a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        try {
          discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_q).append(",").append(this.field_v).append(" ").append(this.field_x).append("x").append(this.field_s);
          if (this.field_w != null) {
            discarded$1 = param1.append(" text=\"").append(this.field_w).append('"');
          }
          if (this.field_u) {
            discarded$2 = param1.append(" mouseover");
          }
          if (this.a((byte) 31)) {
            discarded$3 = param1.append(" focused");
          }
          if (this.field_o != null) {
            discarded$4 = param1.append(" renderer=");
            if (!(this.field_o instanceof lm)) {
              discarded$5 = param1.append(this.field_o);
              if (var6 != 0) {
                param1 = this.a(1 + param0, param2, param1, (byte) -99);
              }
            } else {
              param1 = this.a(1 + param0, param2, param1, (byte) -99);
            }
          }
          if (param3 != 1) {
            return;
          }
          if (this.field_n != null) {
            discarded$6 = param1.append(" listener=");
            if (!(this.field_n instanceof lm)) {
              discarded$7 = param1.append(this.field_n);
              if (var6 == 0) {
                return;
              }
            }
            param1 = this.a(1 + param0, param2, param1, (byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("lm.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= 55) {
            return false;
          }
          this.field_t = (l) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lm.W(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, boolean param1, int param2, lm param3, int param4, int param5) {
        try {
          this.field_y = 0;
          if (!param1) {
            this.field_i = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lm.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != -1) {
          return false;
        }
        if (param0 < this.field_q + param1) {
          return false;
        }
        if (param2 + this.field_v > param4) {
          return false;
        }
        if (param1 + this.field_q + this.field_x <= param0) {
          return false;
        }
        if (param4 < this.field_v + param2 + this.field_s) {
          return true;
        }
        return false;
    }

    boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param4, param3, param6, -1, param2)) {
            this.field_y = param1;
          }
          var8_int = -53 % ((-80 - param5) / 35);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("lm.U(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    int d(int param0) {
        int var2 = 115 % ((67 - param0) / 58);
        return 0;
    }

    final static void a(cn param0, byte param1) {
        try {
          ie.a(116);
          gf.a(param0.field_B, param0.field_E, param0.field_G);
          int var2_int = -127 / ((param1 + 38) / 37);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lm.BC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, lm param2, boolean param3) {
        int var5_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(hj.field_S, param0, param1, -1, eh.field_h) ? 1 : 0;
          if (!param3) {
            return;
          }
          if (var5_int != (this.field_u ? 1 : 0)) {
            stackIn_7_1 = (var5_int != 0);
            this.field_u = stackIn_7_1;
            if (null != this.field_n) {
              if (!(this.field_n instanceof de)) {
                return;
              }
              ((de) (this.field_n)).a(true, this, var5_int != 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lm.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    void e(int param0) {
        if (param0 >= 1) {
          return;
        }
        this.toString();
    }

    final boolean a(int param0, byte param1, int param2, boolean param3) {
        int var5;
        oi var6;
        int var7;
        oi var8;
        oi var11;
        oi var16;
        oi var21;
        oi var22;
        oi var24;
        oi var26;
        oi var27;
        oi var28;
        oi var29;
        oi var30;
        int var5Lifetime1;
        oi var6Lifetime1;
        var7 = DungeonAssault.field_K;
        if (param1 != 66) {
          this.field_A = -58;
          this.a(param2, param0, this, true);
          var5 = this.a((byte) 95) ? 1 : 0;
          if (param3) {
            if (0 != pj.field_r &&
              var5 != 0) {
              this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, this, (byte) -84);
            }
            if (no.field_d != 0) {
              if (!this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                if (var5 != 0) {
                  this.e(127);
                  if (var7 != 0) {
                    param3 = false;
                  }
                }
              } else {
                param3 = false;
              }
            }
            if (0 != la.field_g) {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            if (oe.field_i == 0) {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            this.a(param0, true, eh.field_h, this, param2, hj.field_S);
            var8 = ah.field_b;
            var6 = var8;
            if (var8 != null) {
              if (var8.field_n instanceof qo) {
                ((qo) (var8.field_n)).a((bj) null, var8, false);
              }
              ah.field_b = null;
            }
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          if (var5 == 0) {
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          if (no.field_d == 0) {
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          this.e(23);
          if (var7 == 0) {
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          if (0 != pj.field_r) {
            if (var5 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (no.field_d != 0) {
                if ((!this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) &&
                  (decompiledFrameRemainder0 = (var5 != 0))) {
                  this.e(127);
                }
                if (decompiledFrameRemainder0) {
                  param3 = false;
                }
              }
              if (0 != la.field_g) {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
              if (oe.field_i == 0) {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
              this.a(param0, true, eh.field_h, this, param2, hj.field_S);
              var11 = ah.field_b;
              if (var11 != null) {
                if (var11.field_n instanceof qo) {
                  ((qo) (var11.field_n)).a((bj) null, var11, false);
                }
                ah.field_b = null;
              }
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, this, (byte) -84);
          }
          if (no.field_d != 0) {
            if (this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
              param3 = false;
            } else {
              this.e(127);
              param3 = false;
              if (0 != la.field_g) {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
              if (oe.field_i == 0) {
                oe.field_i = la.field_g;
                nk.a(this.c((byte) 34), (byte) 23);
                return param3;
              }
              this.a(param0, true, eh.field_h, this, param2, hj.field_S);
              var16 = ah.field_b;
              if (var16 != null) {
                if (var16.field_n instanceof qo) {
                  ((qo) (var16.field_n)).a((bj) null, var16, false);
                }
                ah.field_b = null;
              }
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
          }
          if (0 != la.field_g) {
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          if (oe.field_i == 0) {
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
          this.a(param0, true, eh.field_h, this, param2, hj.field_S);
          var21 = ah.field_b;
          if (var21 != null) {
            if (var21.field_n instanceof qo) {
              ((qo) (var21.field_n)).a((bj) null, var21, false);
            }
            ah.field_b = null;
          }
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        this.a(param2, param0, this, true);
        var5Lifetime1 = this.a((byte) 95) ? 1 : 0;
        if (param3) {
          if (0 != pj.field_r) {
            if (var5Lifetime1 == 0) {
              if (no.field_d != 0) {
                if (this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                  param3 = false;
                } else {
                }
              }
              if (0 == la.field_g &&
                oe.field_i != 0) {
                this.a(param0, true, eh.field_h, this, param2, hj.field_S);
                var28 = ah.field_b;
                if (var28 != null) {
                  if (var28.field_n instanceof qo) {
                    ((qo) (var28.field_n)).a((bj) null, var28, false);
                  }
                  ah.field_b = null;
                }
              }
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, this, (byte) -84);
          }
          sharedTailExit_5: {
            if (no.field_d != 0) {
              if (this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
                param3 = false;
              } else {
                if (var5Lifetime1 != 0) {
                  this.e(127);
                  if (var7 != 0) {
                    param3 = false;
                    if (0 == la.field_g &&
                      oe.field_i != 0) {
                      this.a(param0, true, eh.field_h, this, param2, hj.field_S);
                      var29 = ah.field_b;
                      if (var29 != null) {
                        if (var29.field_n instanceof qo) {
                          ((qo) (var29.field_n)).a((bj) null, var29, false);
                        }
                        ah.field_b = null;
                      }
                    }
                    break sharedTailExit_5;
                  }
                }
              }
            }
            if (0 == la.field_g &&
              oe.field_i != 0) {
              this.a(param0, true, eh.field_h, this, param2, hj.field_S);
              var30 = ah.field_b;
              if (var30 != null) {
                if (var30.field_n instanceof qo) {
                  ((qo) (var30.field_n)).a((bj) null, var30, false);
                }
                ah.field_b = null;
              }
            }
          }
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        if (var5Lifetime1 == 0) {
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        if (no.field_d == 0) {
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        this.e(23);
        if (var7 == 0) {
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        if (0 != pj.field_r) {
          this.a(param2, param0, hj.field_S, pj.field_r, eh.field_h, this, (byte) -84);
        }
        if (no.field_d != 0) {
          if (this.a(this, no.field_d, hm.field_k, param2, lc.field_c, (byte) 0, param0)) {
            param3 = false;
          } else {
            this.e(127);
            param3 = false;
            if (0 != la.field_g) {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            if (oe.field_i == 0) {
              oe.field_i = la.field_g;
              nk.a(this.c((byte) 34), (byte) 23);
              return param3;
            }
            this.a(param0, true, eh.field_h, this, param2, hj.field_S);
            var24 = ah.field_b;
            var6Lifetime1 = var24;
            if (var24 != null) {
              if (var24.field_n instanceof qo) {
                ((qo) (var24.field_n)).a((bj) null, var24, false);
              }
              ah.field_b = null;
            }
            oe.field_i = la.field_g;
            nk.a(this.c((byte) 34), (byte) 23);
            return param3;
          }
        }
        if (0 != la.field_g) {
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        if (oe.field_i == 0) {
          oe.field_i = la.field_g;
          nk.a(this.c((byte) 34), (byte) 23);
          return param3;
        }
        this.a(param0, true, eh.field_h, this, param2, hj.field_S);
        var26 = ah.field_b;
        if (var26 != null) {
          if (var26.field_n instanceof qo) {
            ((qo) (var26.field_n)).a((bj) null, var26, false);
          }
          ah.field_b = null;
        }
        oe.field_i = la.field_g;
        nk.a(this.c((byte) 34), (byte) 23);
        return param3;
    }

    protected lm() {
        this.field_A = 0;
        this.field_j = 0;
    }

    boolean a(byte param0) {
        if (param0 <= 6) {
          this.a(42, 36, -17);
          return false;
        }
        return false;
    }

    lm(String param0, ca param1, pg param2) {
        RuntimeException runtimeException = null;
        th var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_A = 0;
        this.field_j = 0;
        try {
          this.field_n = param2;
          this.field_o = param1;
          this.field_w = param0;
          if (this.field_o instanceof th) {
            var4 = (th) ((Object) this.field_o);
            this.field_x = var4.a(82, this);
            this.field_s = var4.a(this, 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("lm.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    lm(int param0, int param1, int param2, int param3, ca param4, pg param5) {
        this.field_A = 0;
        this.field_j = 0;
        try {
          this.field_s = param3;
          this.field_x = param2;
          this.field_o = param4;
          this.field_n = param5;
          this.field_v = param1;
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Dryad";
        field_l = new byte[50][];
        field_p = "Type your password again to make sure it's correct";
        field_m = new int[8192];
    }
}
