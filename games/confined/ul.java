/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ul extends rg {
    private long field_Y;
    private boolean field_Z;
    static boolean field_W;
    private int field_S;
    static bi field_P;
    private int field_R;
    static mi field_U;
    private long field_T;
    private boolean field_X;
    private int field_Q;
    private int field_V;

    private final void m(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_Q != this.field_R) {
          var2 = this.field_R < this.field_Q ? this.field_R : this.field_Q;
          var3 = this.field_Q <= this.field_R ? this.field_R : this.field_Q;
          this.field_Q = var2;
          this.field_R = var2;
          this.field_B = this.field_B.substring(0, var2) + this.field_B.substring(var3, this.field_B.length());
          this.k((byte) -126);
        }
        if (param0 >= -120) {
          this.l((byte) -38);
        }
    }

    ul(String param0, uk param1, int param2) {
        super(param0, param1);
        this.field_T = 0L;
        this.field_Z = false;
        this.field_V = -1;
        try {
          this.field_S = param2;
          this.field_n = bg.field_d.field_u;
          this.a(true, false, param0);
          this.field_X = true;
          this.field_Y = ri.a(-3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void b(int param0, int param1) {
        String discarded$0 = null;
        this.field_Q = param1;
        if (param0 != -12521) {
          discarded$0 = this.j(47);
        }
        if (!mc.field_e[81]) {
          this.field_R = this.field_Q;
        }
    }

    final void a(boolean param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1) {
            this.field_T = 93L;
          }
          if (param2 == null) {
            param2 = "";
          }
          this.field_B = param2;
          var4_int = param2.length();
          if (this.field_S != -1 &&
            this.field_S < var4_int) {
            this.field_B = this.field_B.substring(0, this.field_S);
          }
          dupTemp$2 = this.field_B.length();
          this.field_R = dupTemp$2;
          this.field_Q = dupTemp$2;
          if (!param0) {
            this.k((byte) -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ul.P(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void l(byte param0) {
        this.field_B = "";
        this.field_Q = 0;
        this.field_R = 0;
        this.k((byte) -126);
        if (param0 < 13) {
          ul.k(-26);
        }
    }

    private final void j(byte param0) {
        this.h((byte) 32);
        this.m((byte) -124);
        if (param0 >= -14) {
          this.field_S = -93;
        }
    }

    private final void g(int param0) {
        sc var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        pj var9;
        var8 = Confined.field_J ? 1 : 0;
        if (!this.field_X) {
          this.field_y = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.field_n instanceof pj)) {
          return;
        }
        var9 = (pj) ((Object) this.field_n);
        var3 = var9.a((fj) (this), (byte) -114);
        if (param0 < 111) {
          return;
        }
        var4 = var3.a(true);
        var5 = var9.a((fj) (this), -123);
        var6 = var9.a(-1431655766) >> 1;
        if (var4 < -var6 + var5) {
          this.field_y = 0;
          this.field_v = 0;
          return;
        }
        var7 = this.field_v + var3.a(this.field_Q, -125);
        if (var7 > var5 - var6) {
          this.field_v = this.field_v + var5 - (var6 + var7);
        } else {
          if (var6 > var7) {
            this.field_v = -var7 - (-var6 - this.field_v);
          }
        }
        if (this.field_v <= 0) {
          if (var6 - var5 > this.field_v) {
            this.field_v = -var5 + var6;
          }
        } else {
          this.field_v = 0;
        }
        return;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        pj var5;
        long var6;
        if (param2 <= 36) {
          return;
        }
        if (this.field_n != null &&
          param1 == 0) {
          this.field_n.a((byte) -122, param3, this.field_L, (fj) (this), param0);
          if (this.field_n instanceof pj) {
            var5 = (pj) ((Object) this.field_n);
            if (this.field_Q != this.field_R) {
              var5.a(param3, (fj) (this), 0, this.field_R, param0, this.field_Q);
            }
            var6 = ri.a(-3);
            if (500L > (var6 - this.field_Y) % 1000L) {
              var5.a(param3, (fj) (this), param0, -71, this.field_Q);
            }
          }
        }
    }

    private final int f(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        var2 = this.field_B.length();
        if (param0 != 0) {
          return 39;
        }
        if (var2 == this.field_Q) {
          return this.field_Q;
        }
        for (var3 = this.field_Q + 1; var3 < var2; var3++) {
          if (32 != this.field_B.charAt(-1 + var3)) {
            continue;
          }
          break;
        }
        return var3;
    }

    final boolean a(fj param0, byte param1, int param2, char param3) {
        int dupTemp$0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_33_1 = 0;
        int stackIn_34_2 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        try {
          this.field_Y = ri.a(-3);
          if (param3 == 60) {
            return false;
          }
          if (param3 == 62) {
            return false;
          }
          if (param3 >= 32 &&
            param3 <= 126) {
            if (this.field_Q != this.field_R) {
              this.m((byte) -121);
            }
            if (this.field_S == -1 ||
              !(this.field_B.length() >= this.field_S)) {
              if (this.field_Q < this.field_B.length()) {
                this.field_B = this.field_B.substring(0, this.field_Q) + param3 + this.field_B.substring(this.field_Q, this.field_B.length());
                this.field_Q = this.field_Q + 1;
                this.field_R = this.field_Q;
              } else {
                this.field_B = this.field_B + param3;
                dupTemp$0 = this.field_B.length();
                this.field_Q = dupTemp$0;
                this.field_R = dupTemp$0;
              }
              this.k((byte) -121);
            }
            return true;
          }
          if (85 == param2) {
            if (this.field_R != this.field_Q) {
              this.m((byte) -123);
              return true;
            }
            if (0 < this.field_Q) {
              this.field_R = this.field_Q - 1;
              this.m((byte) -127);
              return true;
            }
          } else {
            if (param2 != 101) {
              if (param2 == 13) {
                this.l((byte) 101);
                return true;
              }
              if (param2 != 96) {
                if (param2 != 97) {
                  if (param2 == 102) {
                    this.b(-12521, 0);
                    return true;
                  }
                  if (103 == param2) {
                    this.b(-12521, this.field_B.length());
                    return true;
                  }
                  if (param2 == 84) {
                    this.i((byte) 122);
                    return true;
                  }
                  if (mc.field_e[82] &&
                    65 == param2) {
                    this.j((byte) -89);
                    return true;
                  }
                  if (mc.field_e[82] &&
                    66 == param2) {
                    this.h((byte) 71);
                    return true;
                  }
                  if (mc.field_e[82] &&
                    param2 == 67) {
                    this.i(83);
                    return true;
                  }
                } else {
                  if (this.field_Q < this.field_B.length()) {
                    stackIn_33_1 = -12521;
                    if (!mc.field_e[82]) {
                      stackIn_34_2 = this.field_Q + 1;
                    } else {
                      stackIn_34_2 = this.f(0);
                    }
                    this.b(stackIn_33_1, stackIn_34_2);
                    return true;
                  }
                }
              } else {
                if (this.field_Q > 0) {
                  stackIn_25_1 = -12521;
                  if (mc.field_e[82]) {
                    stackIn_26_2 = this.h(-9674);
                  } else {
                    stackIn_26_2 = -1 + this.field_Q;
                  }
                  this.b(stackIn_25_1, stackIn_26_2);
                  return true;
                }
              }
            } else {
              if (this.field_R != this.field_Q) {
                this.m((byte) -126);
                return true;
              }
              if (this.field_Q < this.field_B.length()) {
                this.field_R = 1 + this.field_Q;
                this.m((byte) -122);
                return true;
              }
            }
          }
          var5_int = -114 % ((param1 - 47) / 43);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("ul.Q(");
          if (param0 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        int stackIn_5_1 = 0;
        int stackIn_6_2 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_n instanceof pj)) {
            return false;
          }
          var8_int = ((pj) ((Object) this.field_n)).a((byte) 108, param3, jh.field_R, param0, ld.field_l, (fj) (this));
          stackIn_5_1 = -12521;
          if (var8_int != -1) {
            stackIn_6_2 = var8_int;
          } else {
            stackIn_6_2 = 0;
          }
          this.b(stackIn_5_1, stackIn_6_2);
          var8_long = ri.a(-3);
          stackIn_9_1 = !(-this.field_T + var8_long >= 250L);
          this.field_Z = stackIn_9_1;
          if (this.field_Z) {
            this.field_R = this.h(param2 - 9765);
            this.field_Q = this.f(0);
            if (this.field_Q > 0 &&
              32 == this.field_B.charAt(this.field_Q - 1)) {
              this.field_Q = this.field_Q - 1;
            }
            this.field_V = this.field_Q;
          }
          this.field_T = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("ul.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static String k(int param0) {
        if (2 > we.field_c) {
          return fb.field_c;
        }
        if (null != o.field_f) {
          if (!o.field_f.b(0)) {
            return hc.field_s;
          }
          return b.field_k;
        }
        if (!wc.field_Wb.b(0)) {
          return fi.field_b;
        }
        if (!wc.field_Wb.a("commonui", 0)) {
          return dl.field_a + " - " + wc.field_Wb.b(-8087, "commonui") + "%";
        }
        if (!i.field_r.b(0)) {
          return pb.field_a;
        }
        if (!i.field_r.a("commonui", 0)) {
          return qf.field_d + " - " + i.field_r.b(param0 - 8087, "commonui") + "%";
        }
        if (!tf.field_k.b(param0)) {
          return nl.field_d;
        }
        if (!tf.field_k.a(25057)) {
          return bd.field_c + " - " + tf.field_k.c(-123) + "%";
        }
        return hm.field_W;
    }

    void k(byte param0) {
        if (param0 > -117) {
          this.field_X = false;
        }
        if (this.field_t instanceof uj) {
          ((uj) (this.field_t)).a(32175, this);
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        pj var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          super.a(param0, param1, param2, param3);
          this.g(122);
          if (1 == this.field_o) {
            if (this.field_n instanceof pj) {
              var5 = (pj) ((Object) this.field_n);
              var6 = var5.a((byte) 77, param3, jh.field_R, param2, ld.field_l, (fj) (this));
              if (-1 != var6) {
                if (this.field_Z &&
                  this.field_V > var6 &&
                  this.field_R < var6) {
                  var6 = this.field_V;
                }
                this.field_Q = var6;
              }
            }
            this.field_Y = ri.a(-3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("ul.V(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void h(byte param0) {
        if (param0 <= 23) {
          this.a((fj) null, (byte) -24, 52, 'ﾬ');
        }
        String var2 = this.j(82);
        if (!(var2.length() <= 0)) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.j(82))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        try {
          nn.field_t[param2].d(param0, param4);
          pn.field_a.c(param1, 2 + param0, 14 + param4, 16777215, -1);
          if (param3 != -4245) {
            ul.k(69);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ul.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != ~this.field_S) {
            var3_int = this.field_S - this.field_B.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_Q == this.field_B.length()) {
            this.field_B = this.field_B + param1;
          } else {
            this.field_B = this.field_B.substring(0, this.field_Q) + param1 + this.field_B.substring(this.field_Q, this.field_B.length());
          }
          this.field_Q = this.field_Q + param1.length();
          this.field_R = this.field_Q;
          this.k((byte) -119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ul.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_P = null;
        field_U = null;
    }

    private final int h(int param0) {
        int var2;
        int var3;
        var3 = Confined.field_J ? 1 : 0;
        if (0 == this.field_Q) {
          return this.field_Q;
        }
        var2 = this.field_Q - 1;
        if (param0 != -9674) {
          return 26;
        }
        while (var2 > 0) {
          if (this.field_B.charAt(var2 - 1) != 32) {
            var2--;
            continue;
          }
          break;
        }
        return var2;
    }

    private final void i(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          int var3 = 0;
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.m((byte) -122);
            var3 = 127 / ((param0 - 5) / 59);
            this.a(0, var2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void i(byte param0) {
        if (param0 <= 117) {
          return;
        }
        if (this.field_t instanceof uj) {
          ((uj) (this.field_t)).a(this, (byte) 83);
        }
    }

    final static he[] a(hb param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        he[] var4 = null;
        he var6_ref_he = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        he[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          var2_int = param0.g(8, 0);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (he[]) (stackIn_3_0);
          }
          var3 = param0.g(12, param1 ^ param1);
          var4 = new he[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (!sm.a(param1 - 31570, param0)) {
              var6 = param0.g(ic.a(var5 - 1, (byte) 68), 0);
              var4[var5] = var4[var6];
            } else {
              var6_ref_he = new he();
              param0.g(24, 0);
              param0.g(24, param1 - 31662);
              var6_ref_he.field_a = param0.g(24, param1 - 31662);
              param0.g(9, 0);
              param0.g(12, 0);
              param0.g(12, 0);
              param0.g(12, 0);
              var4[var5] = var6_ref_he;
            }
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ul.HA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final String j(int param0) {
        if (param0 != 82) {
          return (String) null;
        }
        int var2 = this.field_R < this.field_Q ? this.field_R : this.field_Q;
        int var3 = this.field_Q <= this.field_R ? this.field_R : this.field_Q;
        return this.field_B.substring(var2, var3);
    }

    static {
    }
}
