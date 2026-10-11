/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sl extends fe {
    private int field_O;
    static byte[] field_Y;
    private int field_Z;
    private long field_T;
    private long field_X;
    static int[] field_V;
    private int field_R;
    static int[] field_P;
    private int field_N;
    private boolean field_S;
    private boolean field_Q;
    static String field_W;
    static String field_U;

    private final void j(byte param0) {
        if (this.field_t instanceof pe) {
          ((pe) (this.field_t)).a(this, false);
        }
        if (param0 != 3) {
          this.field_N = 98;
        }
    }

    final static String a(boolean param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        if (0L >= param1) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
          var7 = param1;
          param1 = param1 / 37L;
          var9 = dp.field_d[(int)(var7 - param1 * 37L)];
          if (var9 == 95) {
            var10 = -1 + var6.length();
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            var9 = 160;
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param0) {
          field_U = (String) null;
        }
        return var6.toString();
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          if (!(this.field_z instanceof io)) {
            return false;
          }
          var8_int = ((io) ((Object) this.field_z)).a(param5, wn.field_i, gg.field_f, (ei) (this), 105, param1);
          stackIn_6_1 = 86;
          if (var8_int != -1) {
            stackIn_7_2 = var8_int;
          } else {
            stackIn_7_2 = 0;
          }
          this.a(stackIn_6_1, stackIn_7_2);
          var8_long = rl.a((byte) -107);
          stackIn_10_1 = !(var8_long - this.field_X >= 250L);
          this.field_Q = stackIn_10_1;
          if (this.field_Q) {
            this.field_N = this.j(32);
            this.field_R = this.h(27);
            if (this.field_R > 0 &&
              this.field_m.charAt(this.field_R - 1) == 32) {
              this.field_R = this.field_R - 1;
            }
            this.field_Z = this.field_R;
          }
          this.field_X = var8_long;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_23_0 = var8;
          stackIn_23_1 = new StringBuilder().append("sl.AA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void g(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 != -14642) {
          ei var4 = (ei) null;
          this.a('ﾣ', -96, true, (ei) null);
        }
        if (this.field_N != this.field_R) {
          var2 = this.field_N < this.field_R ? this.field_N : this.field_R;
          var3 = this.field_N >= this.field_R ? this.field_N : this.field_R;
          this.field_N = var2;
          this.field_R = var2;
          this.field_m = this.field_m.substring(0, var2) + this.field_m.substring(var3, this.field_m.length());
          this.i(117);
        }
    }

    private final int h(int param0) {
        int discarded$1 = 0;
        int var2;
        int var3;
        int var4;
        var4 = Pool.field_O;
        if (param0 <= 15) {
          discarded$1 = this.h(-3);
        }
        var2 = this.field_m.length();
        if (this.field_R == var2) {
          return this.field_R;
        }
        for (var3 = 1 + this.field_R; var3 < var2; var3++) {
          if (this.field_m.charAt(-1 + var3) != 32) {
            continue;
          }
          break;
        }
        return var3;
    }

    private final void a(int param0, int param1) {
        this.field_R = param1;
        if (!vj.field_c[81]) {
          this.field_N = this.field_R;
        }
        int var3 = -72 / ((param0 + 33) / 62);
    }

    void a(ei param0, int param1, int param2, int param3) {
        io var7 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.k(-20923);
          if (this.field_n == 1) {
            if (this.field_z instanceof io) {
              var7 = (io) ((Object) this.field_z);
              var6 = var7.a(param3, wn.field_i, gg.field_f, (ei) (this), param1 - 882, param2);
              if (-1 != var6) {
                if (this.field_Q && var6 < this.field_Z &&
                  var6 > this.field_N) {
                  var6 = this.field_Z;
                }
                this.field_R = var6;
              }
            }
            this.field_T = rl.a((byte) -126);
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sl.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(int param0) {
        if (param0 < 55) {
          this.field_Z = -85;
        }
        this.field_R = 0;
        this.field_N = 0;
        this.field_m = "";
        this.i(-44);
    }

    final void a(byte param0, boolean param1, String param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_m = param2;
          if (param0 != -124) {
            return;
          }
          var4_int = param2.length();
          if (-1 != this.field_O &&
            var4_int > this.field_O) {
            this.field_m = this.field_m.substring(0, this.field_O);
          }
          dupTemp$1 = this.field_m.length();
          this.field_N = dupTemp$1;
          this.field_R = dupTemp$1;
          if (!param1) {
            this.i(param0 + 211);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("sl.T(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (-1 != this.field_O) {
            var3_int = this.field_O - this.field_m.length();
            if (var3_int >= 0) {
              return;
            }
            param1 = param1.substring(0, var3_int);
          }
          if (this.field_R != this.field_m.length()) {
            this.field_m = this.field_m.substring(0, this.field_R) + param1 + this.field_m.substring(this.field_R, this.field_m.length());
          } else {
            this.field_m = this.field_m + param1;
          }
          this.field_R = this.field_R + param1.length();
          if (param0 <= 21) {
            this.a(-32, -52);
          }
          this.field_N = this.field_R;
          this.i(118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("sl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_Y = null;
        field_V = null;
        field_U = null;
        field_W = null;
        if (param0 != 23) {
          return;
        }
        field_P = null;
    }

    private final void g(byte param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 4) {
            return;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.g(-14642);
            this.a(param0 + 106, var2);
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

    private final void k(int param0) {
        int var8 = Pool.field_O;
        if (!this.field_S) {
          this.field_r = 0;
          this.field_v = 0;
          return;
        }
        if (!(this.field_z instanceof io)) {
          return;
        }
        io var9 = (io) ((Object) this.field_z);
        op var3 = var9.b(0, (ei) (this));
        int var4 = var3.a(-1);
        int var5 = var9.a((byte) 26, (ei) (this));
        int var6 = var9.a(-10492) >> 1;
        if (-var6 + var5 > var4) {
          this.field_v = 0;
          this.field_r = 0;
          return;
        }
        int var7 = this.field_v + var3.a(this.field_R, (byte) -88);
        if (-var6 + var5 < var7) {
          this.field_v = -var7 + (-var6 + (var5 + this.field_v));
        } else {
          if (var7 < var6) {
            this.field_v = this.field_v - var7 + var6;
          }
        }
        if (param0 != -20923) {
          return;
        }
        if (0 < this.field_v) {
          this.field_v = 0;
        } else {
          if (!(-var5 + var6 <= this.field_v)) {
            this.field_v = -var5 + var6;
          }
        }
    }

    sl(String param0, cc param1, int param2) {
        super(param0, param1);
        this.field_Z = -1;
        this.field_Q = false;
        this.field_X = 0L;
        try {
          this.field_O = param2;
          this.field_z = db.field_Sb.field_j;
          this.a((byte) -124, true, param0);
          this.field_S = true;
          this.field_T = rl.a((byte) -101);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "sl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0) {
        String var2 = this.h((byte) 63);
        if (param0) {
          this.field_O = 71;
        }
        if (0 < var2.length()) {
          java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.h((byte) 63))), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final boolean a(char param0, int param1, boolean param2, ei param3) {
        int dupTemp$0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_T = rl.a((byte) -116);
          if (param2) {
            this.field_T = 25L;
          }
          if (param0 != 60 &&
            param0 != 62) {
            if (param0 >= 32 &&
              param0 <= 126) {
              if (this.field_R != this.field_N) {
                this.g(-14642);
              }
              if (this.field_O != -1 &&
                this.field_m.length() >= this.field_O) {
                return true;
              }
              if (this.field_R >= this.field_m.length()) {
                this.field_m = this.field_m + param0;
                dupTemp$0 = this.field_m.length();
                this.field_R = dupTemp$0;
                this.field_N = dupTemp$0;
              } else {
                this.field_m = this.field_m.substring(0, this.field_R) + param0 + this.field_m.substring(this.field_R, this.field_m.length());
                this.field_R = this.field_R + 1;
                this.field_N = this.field_R;
              }
              this.i(-27);
              return true;
            }
            if (85 != param1) {
              if (param1 == 101) {
                if (this.field_R != this.field_N) {
                  this.g(-14642);
                  return true;
                }
                if (this.field_R < this.field_m.length()) {
                  this.field_N = 1 + this.field_R;
                  this.g(-14642);
                  return true;
                }
              } else {
                if (param1 == 13) {
                  this.f(57);
                  return true;
                }
                if (param1 != 96) {
                  if (param1 != 97) {
                    if (102 == param1) {
                      this.a(-113, 0);
                      return true;
                    }
                    if (param1 == 103) {
                      this.a(76, this.field_m.length());
                      return true;
                    }
                    if (84 == param1) {
                      this.j((byte) 3);
                      return true;
                    }
                    if (vj.field_c[82] &&
                      65 == param1) {
                      this.l(-98);
                      return true;
                    }
                    if (vj.field_c[82] &&
                      66 == param1) {
                      this.a(param2);
                      return true;
                    }
                    if (vj.field_c[82] &&
                      param1 == 67) {
                      this.g((byte) 4);
                      return true;
                    }
                  } else {
                    if (this.field_R < this.field_m.length()) {
                      stackIn_43_1 = -128;
                      if (!vj.field_c[82]) {
                        stackIn_44_2 = this.field_R + 1;
                      } else {
                        stackIn_44_2 = this.h(31);
                      }
                      this.a(stackIn_43_1, stackIn_44_2);
                      return true;
                    }
                  }
                } else {
                  if (this.field_R > 0) {
                    stackIn_35_1 = 97;
                    if (vj.field_c[82]) {
                      stackIn_36_2 = this.j(32);
                    } else {
                      stackIn_36_2 = this.field_R - 1;
                    }
                    this.a(stackIn_35_1, stackIn_36_2);
                    return true;
                  }
                }
              }
            } else {
              if (this.field_N != this.field_R) {
                this.g(-14642);
                return true;
              }
              if (this.field_R > 0) {
                this.field_N = -1 + this.field_R;
                this.g(-14642);
                return true;
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_79_0 = var5;
          stackIn_79_1 = new StringBuilder().append("sl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(')').toString());
        }
    }

    private final void l(int param0) {
        this.a(false);
        int var2 = -115 % ((-16 - param0) / 63);
        this.g(-14642);
    }

    private final int j(int param0) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        if (0 == this.field_R) {
          return this.field_R;
        }
        if (param0 != 32) {
          this.field_T = -5L;
        }
        for (var2 = -1 + this.field_R; var2 > 0; var2--) {
          if (32 != this.field_m.charAt(var2 - 1)) {
            continue;
          }
          break;
        }
        return var2;
    }

    private final String h(byte param0) {
        if (param0 != 63) {
          sl.a(true, -93L);
        }
        int var2 = this.field_N >= this.field_R ? this.field_R : this.field_N;
        int var3 = this.field_R <= this.field_N ? this.field_N : this.field_R;
        return this.field_m.substring(var2, var3);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        io var6 = null;
        long var7 = 0L;
        int var5 = 60 % ((-42 - param1) / 53);
        if (null != this.field_z &&
          param0 == 0) {
          this.field_z.a(this.field_I, param2, (byte) 77, param3, (ei) (this));
          if (this.field_z instanceof io) {
            var6 = (io) ((Object) this.field_z);
            if (this.field_N != this.field_R) {
              var6.a(this.field_R, this.field_N, param2, param3, 154888568, (ei) (this));
            }
            var7 = rl.a((byte) -126);
            if (500L > (-this.field_T + var7) % 1000L) {
              var6.a(1, param3, this.field_R, param2, (ei) (this));
            }
          }
        }
    }

    void i(int param0) {
        if (this.field_t instanceof pe) {
          ((pe) (this.field_t)).a(this, -79);
        }
        int var2 = -31 % ((param0 - 28) / 49);
    }

    static {
        field_Y = new byte[]{(byte)2, (byte)3, (byte)4, (byte)5};
        field_P = new int[8192];
        field_U = "Basics";
        field_W = "You and <%0> are out of lives!";
    }
}
