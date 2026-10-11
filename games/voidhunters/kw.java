/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends llb {
    private int field_vb;
    private eab field_Db;
    private llb field_Cb;
    private boolean field_zb;
    private StringBuilder field_Eb;
    private boolean field_Bb;
    private int field_Ab;
    private long field_wb;
    private int field_Hb;
    llb field_Fb;
    private llb field_Kb;
    static gj field_xb;
    private int field_yb;
    static String field_Jb;
    private int field_Gb;
    private mob field_Ib;

    public static void g(byte param0) {
        if (param0 != 124) {
          kw.g((byte) 112);
        }
        field_xb = null;
        field_Jb = null;
    }

    final void a(String param0, int param1) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        int dupTemp$1 = 0;
        try {
          if (param1 > -85) {
            eab var4 = (eab) null;
            this.a(30, (eab) null);
          }
          this.field_Eb.setLength(0);
          var3_int = param0.length();
          if (this.field_yb != -1 &&
            this.field_yb < var3_int) {
            var3_int = this.field_yb;
          }
          discarded$0 = this.field_Eb.append(param0.substring(0, var3_int));
          dupTemp$1 = this.field_Eb.length();
          this.field_Gb = dupTemp$1;
          this.field_Ab = dupTemp$1;
          this.field_Fb.field_R = this.field_Eb.toString();
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kw.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, int param1) {
        if (param0 > -14) {
          String var4 = (String) null;
          this.a((String) null, -20);
        }
        this.field_Ab = param1;
        this.field_Gb = param1;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var5 = VoidHunters.field_G;
        int var4 = this.field_Eb.length();
        if (param2 < 0) {
          param2 = 0;
        } else {
          if (param2 > var4) {
            param2 = var4;
          }
        }
        if (param0 < 0) {
          param0 = 0;
        } else {
          if (var4 < param0) {
            param0 = var4;
          }
        }
        this.field_Ab = param0;
        this.field_Gb = param2;
        if (param1 != 31401) {
          discarded$0 = this.b(-50, 68);
        }
    }

    private final int b(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4 = param1;
        var5 = this.field_Eb.length();
        while (param0 > var4) {
          if (var3 < var5) {
            incrementValue$1 = var3;
            var3++;
            var4 = var4 + this.field_Fb.field_eb.a(this.field_Eb.charAt(incrementValue$1));
            continue;
          }
          break;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4) {
        if (!param4) {
          this.field_wb = 87L;
        }
        this.a(param1, -119, param0, param3, param2);
        this.field_Fb.a(0, -84, param0, 0, param2);
        this.field_Cb.a(0, 123, param0, 0, param2);
        this.field_Hb = -4 + param2;
    }

    private final void n(int param0) {
        if (null == this.field_Db) {
          return;
        }
        this.field_Ib = this.field_Db.c(param0 - 10964);
        if (param0 != 11090) {
          this.field_Bb = true;
        }
    }

    kw(long param0, llb param1, llb param2, llb param3) {
        this(param0, param1, param2, param3, -1);
    }

    final int j(int param0) {
        if (param0 != 0) {
          this.field_Ab = -109;
        }
        return this.field_Ab;
    }

    final void a(int param0, eab param1) {
        try {
          if (param0 != -20640) {
            this.b(false);
          }
          this.field_Db = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "kw.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 < 38) {
          return;
        }
        if (this.field_Db == null) {
          return;
        }
        this.h(31960);
        this.b(true);
    }

    final void f(byte param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_14_1 = false;
          int stackIn_32_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2 = 0;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = VoidHunters.field_G;
          var2 = this.b(-this.field_Fb.field_t + (-this.field_M + kc.field_b), param0 + 6);
          if (1 == this.field_o) {
            this.a(var2, 3047);
            this.field_Bb = true;
            var3_long = wt.a(false);
            stackIn_14_1 = !(var3_long - this.field_wb >= 250L);
            this.field_zb = stackIn_14_1;
            if (this.field_zb) {
              this.field_Gb = this.k(-1);
              this.field_Ab = this.m(-10001);
              if (this.field_Ab > 0 &&
                32 == this.field_Eb.charAt(this.field_Ab - 1)) {
                this.field_Ab = this.field_Ab - 1;
              }
              this.field_vb = this.field_Ab;
            }
            this.field_wb = var3_long;
          } else {
            if (hu.field_b == 1 &&
              this.field_Bb) {
              if (this.field_zb &&
                var2 < this.field_vb &&
                this.field_Gb < var2) {
                var2 = this.field_vb;
              }
              this.field_Ab = var2;
            } else {
              this.field_Bb = false;
            }
          }
          if (!this.field_pb) {
            dupTemp$0 = this.field_Eb.length();
            this.field_Gb = dupTemp$0;
            this.field_Ab = dupTemp$0;
          }
          this.field_Cb.field_L = this.field_Fb.field_eb.b(this.field_Eb.toString().substring(0, this.field_Ab));
          if (param0 != -6) {
            this.field_zb = true;
          }
          if (this.field_Gb != this.field_Ab) {
            var3 = this.field_Fb.field_L + this.field_Fb.field_eb.b(this.field_Eb.toString().substring(0, this.field_Gb));
            if (this.field_Cb.field_L <= var3) {
              stackIn_32_0 = this.field_Cb.field_L;
            } else {
              stackIn_32_0 = var3;
            }
            var4_int = stackIn_32_0;
            var5 = Math.abs(-this.field_Cb.field_L + var3);
            this.field_Kb.a(this.field_Fb.field_t + var4_int, 116, var5, 2, this.field_Hb);
          } else {
            this.field_Kb.a(this.field_Cb.field_L, -30, 0, 2, this.field_Hb);
          }
          if (this.field_Ib != null &&
            this.field_Ib.field_f != 0) {
            var7 = (java.awt.datatransfer.Transferable) (this.field_Ib.field_d);
            try {
              var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
              this.b(true);
              this.a(var8, false);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_Ib = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, boolean param1) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        String discarded$8 = null;
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_yb != -1) {
            var3_int = this.field_yb - this.field_Eb.length();
            if (var3_int == 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_Ab != this.field_Eb.length()) {
            var4 = this.field_Eb.toString().substring(this.field_Ab, this.field_Eb.length());
            npa.a(this.field_Ab, false, this.field_Eb, ' ');
            discarded$5 = this.field_Eb.append(param0);
            discarded$6 = this.field_Eb.append(var4);
          } else {
            discarded$7 = this.field_Eb.append(param0);
          }
          this.field_Fb.field_R = this.field_Eb.toString();
          this.field_Ab = this.field_Eb.length();
          if (param1) {
            discarded$8 = this.i(-87);
          }
          this.field_Gb = this.field_Ab;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kw.FA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        npa.a(0, !param0 ? true : false, this.field_Eb, ' ');
        if (!param0) {
          this.a(97, -10, -98);
        }
        this.field_Ab = 0;
        this.field_Gb = 0;
        this.field_Fb.field_R = this.field_Eb.toString();
    }

    private final void a(int param0, int param1) {
        this.field_Ab = param0;
        if (!si.field_o[81]) {
          this.field_Gb = this.field_Ab;
        }
        if (param1 != 3047) {
          kw.g((byte) -20);
        }
    }

    private final int k(int param0) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (~this.field_Ab == param0) {
          return this.field_Ab;
        }
        for (var2 = this.field_Ab - 1; var2 > 0; var2--) {
          if (!deb.a(-126, this.field_Eb.charAt(var2 - 1))) {
            continue;
          }
          break;
        }
        return var2;
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_22_0 = 0;
        int stackIn_41_0 = 0;
        int var4;
        String var5;
        if (param2 == 60) {
          return false;
        }
        if (62 == param2) {
          return false;
        }
        if (param1 != -1) {
          this.field_Kb = (llb) null;
        }
        if (param2 >= 32 &&
          param2 <= 126) {
          if (this.field_Ab != this.field_Gb) {
            this.b(true);
          }
          if (this.field_yb == -1 ||
            !(this.field_Eb.length() >= this.field_yb)) {
            if (this.field_Ab == this.field_Eb.length()) {
              discarded$0 = this.field_Eb.append(param2);
            } else {
              var5 = this.field_Eb.toString().substring(this.field_Ab, this.field_Eb.length());
              npa.a(this.field_Ab, false, this.field_Eb, ' ');
              discarded$1 = this.field_Eb.append(param2);
              discarded$2 = this.field_Eb.append(var5);
            }
            this.field_Fb.field_R = this.field_Eb.toString();
            this.field_Ab = this.field_Ab + 1;
            this.field_Gb = this.field_Ab;
          }
          return true;
        }
        if (85 != param0) {
          if (param0 == 101) {
            if (this.field_Ab != this.field_Gb) {
              this.b(true);
              return true;
            }
            if (this.field_Ab < this.field_Eb.length()) {
              this.field_Gb = 1 + this.field_Ab;
              this.b(true);
              return true;
            }
          } else {
            if (13 == param0) {
              this.a(true);
              return true;
            }
            if (96 != param0) {
              if (param0 == 97) {
                if (this.field_Ab < this.field_Eb.length()) {
                  if (si.field_o[82]) {
                    stackIn_41_0 = this.m(-10001);
                  } else {
                    stackIn_41_0 = 1 + this.field_Ab;
                  }
                  var4 = stackIn_41_0;
                  this.a(var4, param1 + 3048);
                  return true;
                }
              } else {
                if (param0 == 102) {
                  this.a(0, 3047);
                  return true;
                }
                if (param0 == 103) {
                  this.a(this.field_Eb.length(), 3047);
                  return true;
                }
                if (si.field_o[82] &&
                  param0 == 65) {
                  this.e((byte) 116);
                  return true;
                }
                if (si.field_o[82] &&
                  param0 == 66) {
                  this.h(param1 + 31961);
                  return true;
                }
                if (si.field_o[82] &&
                  67 == param0) {
                  this.n(11090);
                  return true;
                }
              }
            } else {
              if (this.field_Ab > 0) {
                if (!si.field_o[82]) {
                  stackIn_22_0 = this.field_Ab - 1;
                } else {
                  stackIn_22_0 = this.k(param1 + 0);
                }
                var4 = stackIn_22_0;
                this.a(var4, 3047);
                return true;
              }
            }
          }
        } else {
          if (this.field_Ab != this.field_Gb) {
            this.b(true);
            return true;
          }
          if (this.field_Ab > 0) {
            this.field_Gb = -1 + this.field_Ab;
            this.b(true);
            return true;
          }
        }
        return false;
    }

    private final String i(int param0) {
        if (param0 > -46) {
          this.j(-108);
        }
        String var2 = this.field_Eb.toString();
        int var3 = this.field_Ab > this.field_Gb ? this.field_Gb : this.field_Ab;
        int var4 = this.field_Ab > this.field_Gb ? this.field_Ab : this.field_Gb;
        return var2.substring(var3, var4);
    }

    private kw(long param0, llb param1, llb param2, llb param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_Bb = false;
        this.field_wb = 0L;
        this.field_vb = -1;
        this.field_zb = false;
        try {
          this.field_yb = param4;
          this.field_Kb = new llb(0L, param2);
          this.field_Fb = new llb(0L, param3);
          this.field_Cb = new llb(0L, param3);
          this.field_T = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.field_yb == -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.field_yb;
          }
          this.field_Eb = new StringBuilder(stackIn_4_3);
          this.field_Fb.field_R = this.field_Eb.toString();
          this.field_Cb.field_s = "|";
          this.field_Cb.field_R = "";
          this.field_lb = new ij();
          this.b(-561, this.field_Kb);
          this.b(-561, this.field_Fb);
          this.b(-561, this.field_Cb);
          this.field_pb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("kw.<init>(").append(param0).append(',');
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
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final String l(int param0) {
        if (param0 != -14453) {
          return (String) null;
        }
        return this.field_Eb.toString();
    }

    private final void h(int param0) {
        if (null == this.field_Db) {
          return;
        }
        if (param0 != 31960) {
          return;
        }
        String var2 = this.i(-51);
        if (var2.length() == 0) {
          return;
        }
        java.awt.datatransfer.StringSelection var3 = new java.awt.datatransfer.StringSelection(this.i(-100));
        this.field_Db.a((byte) -45, (java.awt.datatransfer.Transferable) ((Object) var3));
    }

    private final int m(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        if (param0 != -10001) {
          this.a((byte) 4, 75);
        }
        var2 = this.field_Eb.length();
        if (var2 == this.field_Ab) {
          return this.field_Ab;
        }
        for (var3 = 1 + this.field_Ab; var3 < var2; var3++) {
          if (!deb.a(-113, this.field_Eb.charAt(var3 - 1))) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        StringBuilder discarded$0 = null;
        if (this.field_Gb != this.field_Ab) {
          var2 = this.field_Gb >= this.field_Ab ? this.field_Ab : this.field_Gb;
          var3 = this.field_Ab <= this.field_Gb ? this.field_Gb : this.field_Ab;
          this.field_Ab = var2;
          this.field_Gb = var2;
          var4 = this.field_Eb.toString().substring(var3, this.field_Eb.length());
          npa.a(var2, !param0 ? true : false, this.field_Eb, ' ');
          discarded$0 = this.field_Eb.append(var4);
          this.field_Fb.field_R = this.field_Eb.toString();
        }
        if (!param0) {
          this.field_vb = -102;
        }
    }

    static {
        field_Jb = "Shortcut Reference";
        field_xb = new gj();
    }
}
