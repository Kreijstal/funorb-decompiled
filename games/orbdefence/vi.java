/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class vi extends s {
    private int field_P;
    private int field_N;
    private boolean field_G;
    private long field_R;
    private long field_Q;
    static int[] field_O;
    static String field_H;
    private boolean field_J;
    private int field_K;
    static int field_I;
    private int field_L;

    final static void a(boolean param0, int param1) {
        nk.a((byte) -126);
        if (param0) {
          vi.a(false, -63);
        }
    }

    private final int l(int param0) {
        int var2;
        int var3;
        var3 = OrbDefence.field_D ? 1 : 0;
        if (param0 == ~this.field_N) {
          return this.field_N;
        }
        for (var2 = this.field_N - 1; var2 > 0; var2--) {
          if (32 == this.field_l.charAt(var2 - 1)) {
            return var2;
          }
        }
        return var2;
    }

    final void a(int param0, boolean param1, String param2) {
        int dupTemp$2 = 0;
        int var4_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 == null) {
            param2 = "";
          }
          this.field_l = param2;
          var4_int = param2.length();
          if (param0 != ~this.field_P &&
            this.field_P < var4_int) {
            this.field_l = this.field_l.substring(0, this.field_P);
          }
          dupTemp$2 = this.field_l.length();
          this.field_L = dupTemp$2;
          this.field_N = dupTemp$2;
          if (!param1) {
            this.c((byte) -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("vi.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static String a(int param0, Throwable param1) throws IOException {
        ui var15 = null;
        PrintWriter var21 = null;
        String var22 = null;
        BufferedReader var23 = null;
        String var29 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var2 = null;
        CharSequence[] var14 = null;
        String var11 = null;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = OrbDefence.field_D ? 1 : 0;
        String var2Lifetime1;
        String var2Lifetime2;
        String var2Lifetime3;
        String var2Lifetime4;
        String var2Lifetime5;
        String var11Lifetime1;
        String var11Lifetime2;
        String var11Lifetime3;
        String var11Lifetime4;
        String var11Lifetime5;
        String var11Lifetime6;
        String var11Lifetime7;
        String var11Lifetime8;
        String var11Lifetime9;
        String var11Lifetime10;
        String var11Lifetime11;
        String var2Lifetime1Lifetime1;
        String var2Lifetime1Lifetime2;
        String var11Lifetime1Lifetime1;
        String var11Lifetime1Lifetime2;
        String var11Lifetime1Lifetime3;
        String var11Lifetime1Lifetime4;
        String var11Lifetime1Lifetime5;
        String var11Lifetime1Lifetime6;
        String var11Lifetime8Lifetime1;
        String var11Lifetime8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        if (!(param1 instanceof ui)) {
          var2 = "";
        } else {
          var15 = (ui) ((Object) param1);
          var2 = var15.field_d + " | ";
          var11 = var2;
          var2 = var11;
          var11Lifetime11 = var2;
          param1 = var15.field_c;
        }
        StringWriter var16 = new StringWriter();
        if (param0 != 41) {
          var14 = (CharSequence[]) null;
          vi.a((CharSequence[]) null, -61, -90, 112);
        } else {
          var21 = new PrintWriter((Writer) ((Object) var16));
          param1.printStackTrace(var21);
          var21.close();
          var22 = var16.toString();
          var11Lifetime1 = var22;
          var2Lifetime1 = var11Lifetime1;
          var11Lifetime1Lifetime1 = var22;
          var23 = new BufferedReader((Reader) ((Object) new StringReader(var22)));
          var29 = var23.readLine();
          var11Lifetime1Lifetime2 = var29;
          var2Lifetime1Lifetime1 = var11Lifetime1Lifetime2;
          var11Lifetime1Lifetime3 = var29;
          while (true) {
            var24 = var23.readLine();
            var11Lifetime1Lifetime4 = var24;
            var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            var11Lifetime1Lifetime4 = var24;
            if (var24 == null) {
              break;
            }
            var9 = var24.indexOf('(');
            var10 = var24.indexOf(')', 1 + var9);
            if (var9 != -1) {
              var11Lifetime1Lifetime4 = var24.substring(0, var9);
            } else {
              var11Lifetime1Lifetime4 = var24;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
              var2Lifetime1Lifetime1 = var11Lifetime1Lifetime4;
            }
            var25 = var11Lifetime1Lifetime4.trim();
            var2Lifetime1Lifetime1 = var25;
            var2Lifetime1Lifetime1 = var25;
            var26 = var25.substring(1 + var25.lastIndexOf(' '));
            var2Lifetime1Lifetime1 = var26;
            var2Lifetime1Lifetime1 = var26;
            var27 = var26.substring(1 + var26.lastIndexOf('\t'));
            var2Lifetime1Lifetime1 = var27;
            var2Lifetime1Lifetime1 = var27;
            var28 = var2Lifetime1Lifetime1 + var27;
            var2Lifetime1Lifetime1 = var28;
            var2Lifetime1Lifetime1 = var28;
            var2Lifetime1Lifetime1 = var28;
            if (var9 != -1 &&
              var10 != -1) {
              var12 = var24.indexOf(".java:", var9);
              if (var12 >= 0) {
                var2Lifetime1Lifetime1 = var28 + var24.substring(5 + var12, var10);
              }
            }
            var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + ' ';
          }
          var2Lifetime1Lifetime1 = var2Lifetime1Lifetime1 + "| " + var29;
          var11Lifetime1Lifetime5 = var2Lifetime1Lifetime1;
          var2Lifetime1Lifetime2 = var11Lifetime1Lifetime5;
          var11Lifetime1Lifetime6 = var2Lifetime1Lifetime2;
          return var2Lifetime1Lifetime2;
        }
        PrintWriter var30 = new PrintWriter((Writer) ((Object) var16));
        param1.printStackTrace(var30);
        var30.close();
        String var31 = var16.toString();
        var11Lifetime2 = var31;
        var2Lifetime2 = var11Lifetime2;
        var11Lifetime3 = var31;
        BufferedReader var32 = new BufferedReader((Reader) ((Object) new StringReader(var31)));
        BufferedReader var6 = var32;
        String var38 = var32.readLine();
        var11Lifetime4 = var38;
        var2Lifetime3 = var11Lifetime4;
        var11Lifetime5 = var38;
        String var7 = var38;
        var11Lifetime6 = var7;
        var2Lifetime4 = var11Lifetime6;
        var11Lifetime7 = var7;
        while (true) {
          var33 = var32.readLine();
          var11Lifetime8 = var33;
          var2Lifetime4 = var11Lifetime8;
          var11Lifetime8Lifetime1 = var33;
          if (var33 == null) {
            break;
          }
          var9Lifetime1 = var33.indexOf('(');
          var10Lifetime1 = var33.indexOf(')', 1 + var9Lifetime1);
          if (var9Lifetime1 != -1) {
            var11Lifetime8Lifetime2 = var33.substring(0, var9Lifetime1);
          } else {
            var11Lifetime8Lifetime2 = var33;
            var2Lifetime4 = var11Lifetime8Lifetime2;
            var2Lifetime4 = var11Lifetime8Lifetime2;
          }
          var34 = var11Lifetime8Lifetime2.trim();
          var2Lifetime4 = var34;
          var2Lifetime4 = var34;
          var35 = var34.substring(1 + var34.lastIndexOf(' '));
          var2Lifetime4 = var35;
          var2Lifetime4 = var35;
          var36 = var35.substring(1 + var35.lastIndexOf('\t'));
          var2Lifetime4 = var36;
          var2Lifetime4 = var36;
          var37 = var2Lifetime4 + var36;
          var2Lifetime4 = var37;
          var2Lifetime4 = var37;
          var2Lifetime4 = var37;
          if (var9Lifetime1 != -1 &&
            var10Lifetime1 != -1) {
            var12Lifetime1 = var33.indexOf(".java:", var9Lifetime1);
            if (var12Lifetime1 >= 0) {
              var2Lifetime4 = var37 + var33.substring(5 + var12Lifetime1, var10Lifetime1);
            }
          }
          var2Lifetime4 = var2Lifetime4 + ' ';
        }
        var2Lifetime4 = var2Lifetime4 + "| " + var38;
        var11Lifetime9 = var2Lifetime4;
        var2Lifetime5 = var11Lifetime9;
        var11Lifetime10 = var2Lifetime5;
        return var2Lifetime5;
    }

    final static sc a(int param0, ki param1, ki param2, int param3, int param4) {
        RuntimeException var5 = null;
        sc stackIn_5_0 = null;
        sc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!pk.a(113, param4, param2, param3)) {
            return null;
          }
          if (param0 == -13449) {
            stackIn_7_0 = fc.a(param1.b(param4, false, param3), -62);
            return stackIn_7_0;
          }
          stackIn_5_0 = (sc) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("vi.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void e(byte param0) {
        this.field_N = 0;
        this.field_L = 0;
        this.field_l = "";
        this.c((byte) -125);
        if (param0 >= -119) {
          field_O = (int[]) null;
        }
    }

    private final String d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (param0 == -114) {
          var2 = this.field_N > this.field_L ? this.field_L : this.field_N;
          var3 = this.field_N <= this.field_L ? this.field_L : this.field_N;
          return this.field_l.substring(var2, var3);
        }
        return (String) null;
    }

    private final void p(int param0) {
        dm var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        rj var9;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (!this.field_G) {
          this.field_f = 0;
          this.field_q = 0;
          return;
        }
        if (!(this.field_j instanceof rj)) {
          return;
        }
        var9 = (rj) ((Object) this.field_j);
        var3 = var9.a((pj) (this), true);
        if (param0 != 1970553377) {
          this.field_L = -101;
          var4 = var3.a(false);
          var5 = var9.a((pj) (this), param0 - 1970553495);
          var6 = var9.a((byte) 94) >> 1;
          if (-var6 + var5 > var4) {
            this.field_f = 0;
            this.field_q = 0;
            return;
          }
          var7 = this.field_f + var3.a(param0 - 1970553503, this.field_N);
          if (var7 <= -var6 + var5) {
            if (var7 < var6) {
              this.field_f = this.field_f - var7 + var6;
            }
          } else {
            this.field_f = -var7 - var6 + var5 + this.field_f;
          }
          if (0 < this.field_f) {
            this.field_f = 0;
            return;
          }
          if (this.field_f >= -var5 + var6) {
            return;
          }
          this.field_f = -var5 + var6;
          return;
        }
        var4Lifetime1 = var3.a(false);
        var5Lifetime1 = var9.a((pj) (this), param0 - 1970553495);
        var6Lifetime1 = var9.a((byte) 94) >> 1;
        if (-var6Lifetime1 + var5Lifetime1 > var4Lifetime1) {
          this.field_f = 0;
          this.field_q = 0;
          return;
        }
        var7Lifetime1 = this.field_f + var3.a(param0 - 1970553503, this.field_N);
        if (var7Lifetime1 > -var6Lifetime1 + var5Lifetime1) {
          this.field_f = -var7Lifetime1 - var6Lifetime1 + var5Lifetime1 + this.field_f;
        } else {
          if (var7Lifetime1 < var6Lifetime1) {
            this.field_f = this.field_f - var7Lifetime1 + var6Lifetime1;
          }
        }
        if (0 < this.field_f) {
          this.field_f = 0;
          return;
        }
        if (this.field_f >= -var5Lifetime1 + var6Lifetime1) {
          return;
        }
        this.field_f = -var5Lifetime1 + var6Lifetime1;
        return;
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (this.field_L != this.field_N) {
          var2 = this.field_L < this.field_N ? this.field_L : this.field_N;
          var3 = this.field_N > this.field_L ? this.field_N : this.field_L;
          this.field_N = var2;
          this.field_L = var2;
          this.field_l = this.field_l.substring(0, var2) + this.field_l.substring(var3, this.field_l.length());
          this.c((byte) -128);
        }
        if (param0 == 25177) {
          return;
        }
        this.m(68);
    }

    private final int b(byte param0) {
        int var2;
        int var3;
        int var4;
        pj var5;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 < -47) {
          var2 = this.field_l.length();
          if (var2 == this.field_N) {
            return this.field_N;
          }
          for (var3 = 1 + this.field_N; var2 > var3; var3++) {
            if (this.field_l.charAt(-1 + var3) == 32) {
              return var3;
            }
          }
          return var3;
        }
        var5 = (pj) null;
        this.a('i', 85, (pj) null, 10);
        var2Lifetime1 = this.field_l.length();
        if (var2Lifetime1 == this.field_N) {
          return this.field_N;
        }
        for (var3Lifetime1 = 1 + this.field_N; var2Lifetime1 > var3Lifetime1; var3Lifetime1++) {
          if (this.field_l.charAt(-1 + var3Lifetime1) == 32) {
            return var3Lifetime1;
          }
        }
        return var3Lifetime1;
    }

    private final void f(byte param0) {
        try {
          String var2 = this.d((byte) -114);
          if (!(var2.length() <= 0)) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) ((Object) new java.awt.datatransfer.StringSelection(this.d((byte) -114))), (java.awt.datatransfer.ClipboardOwner) null);
          }
          if (param0 >= 5) {
            return;
          }
          pj var3 = (pj) null;
          this.a('ﾦ', 54, (pj) null, -16);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        int dupTemp$0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_Q = ji.b(109);
          if (60 == param0) {
            return false;
          }
          if (param0 == 62) {
            return false;
          }
          if (param0 >= 32 &&
            param0 <= 126) {
            if (this.field_N != this.field_L) {
              this.m(25177);
            }
            if (this.field_P == -1 ||
              !(this.field_l.length() >= this.field_P)) {
              if (this.field_N >= this.field_l.length()) {
                this.field_l = this.field_l + param0;
                dupTemp$0 = this.field_l.length();
                this.field_N = dupTemp$0;
                this.field_L = dupTemp$0;
              } else {
                this.field_l = this.field_l.substring(0, this.field_N) + param0 + this.field_l.substring(this.field_N, this.field_l.length());
                this.field_N = this.field_N + 1;
                this.field_L = this.field_N;
              }
              this.c((byte) -122);
            }
            return true;
          }
          if (param1 != 85) {
            if (param1 == 101) {
              if (this.field_N != this.field_L) {
                this.m(25177);
                return true;
              }
              if (this.field_N < this.field_l.length()) {
                this.field_L = this.field_N + 1;
                this.m(25177);
                return true;
              }
            } else {
              if (13 == param1) {
                this.e((byte) -126);
                return true;
              }
              if (param1 != 96) {
                if (param1 == 97) {
                  if (this.field_N < this.field_l.length()) {
                    if (!ek.field_a[82]) {
                      stackIn_66_1 = this.field_N + 1;
                    } else {
                      stackIn_66_1 = this.b((byte) -123);
                    }
                    this.b(stackIn_66_1, 1242);
                    return true;
                  }
                } else {
                  if (param1 == 102) {
                    this.b(0, 1242);
                    return true;
                  }
                  if (103 == param1) {
                    this.b(this.field_l.length(), 1242);
                    return true;
                  }
                  if (param1 == 84) {
                    this.j(param3 - 8108);
                    return true;
                  }
                  if (ek.field_a[82] &&
                    param1 == 65) {
                    this.k(param3 - 89);
                    return true;
                  }
                  if (ek.field_a[82] &&
                    param1 == 66) {
                    this.f((byte) 64);
                    return true;
                  }
                  if (ek.field_a[82] &&
                    param1 == 67) {
                    this.o(0);
                    return true;
                  }
                }
              } else {
                if (this.field_N > 0) {
                  if (ek.field_a[82]) {
                    stackIn_36_1 = this.l(-1);
                  } else {
                    stackIn_36_1 = -1 + this.field_N;
                  }
                  this.b(stackIn_36_1, 1242);
                  return true;
                }
              }
            }
          } else {
            if (this.field_N != this.field_L) {
              this.m(25177);
              return true;
            }
            if (this.field_N > 0) {
              this.field_L = -1 + this.field_N;
              this.m(25177);
              return true;
            }
          }
          if (param3 != 0) {
            vi.a(true, 15);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_81_0 = var5;
          stackIn_81_1 = new StringBuilder().append("vi.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        rj var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.p(1970553377);
          if (this.field_v == 1) {
            if (this.field_j instanceof rj) {
              var5 = (rj) ((Object) this.field_j);
              var6 = var5.a(vl.field_d, param3, 2147483647, ua.field_a, (pj) (this), param2);
              if (var6 != -1) {
                if (this.field_J &&
                  this.field_K > var6 &&
                  var6 > this.field_L) {
                  var6 = this.field_K;
                }
                this.field_N = var6;
              }
            }
            this.field_Q = ji.b(-98);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_6_1 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        long var8_long = 0L;
        RuntimeException var8 = null;
        try {
          if (super.a((byte) -116, param1, param2, param3, param4, param5, param6) &&
            this.field_j instanceof rj) {
            var8_int = ((rj) ((Object) this.field_j)).a(vl.field_d, param6, 2147483647, ua.field_a, (pj) (this), param3);
            if (var8_int != -1) {
              stackIn_6_1 = var8_int;
            } else {
              stackIn_6_1 = 0;
            }
            this.b(stackIn_6_1, 1242);
            var8_long = ji.b(119);
            stackIn_9_1 = !(-this.field_R + var8_long >= 250L);
            this.field_J = stackIn_9_1;
            if (this.field_J) {
              this.field_L = this.l(-1);
              this.field_N = this.b((byte) -115);
              if (this.field_N > 0 &&
                this.field_l.charAt(-1 + this.field_N) == 32) {
                this.field_N = this.field_N - 1;
              }
              this.field_K = this.field_N;
            }
            this.field_R = var8_long;
            return true;
          }
          if (param0 <= -115) {
            return false;
          }
          this.field_Q = 71L;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("vi.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    vi(String param0, ag param1, int param2) {
        super(param0, param1);
        this.field_J = false;
        this.field_R = 0L;
        this.field_K = -1;
        try {
          this.field_P = param2;
          this.field_j = mb.field_a.field_q;
          this.a(0, true, param0);
          this.field_G = true;
          this.field_Q = ji.b(-53);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void k(int param0) {
        if (param0 >= -33) {
          return;
        }
        this.f((byte) 91);
        this.m(25177);
    }

    private final void o(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          String var2 = null;
          Exception var2_ref = null;
          if (param0 != 0) {
            return;
          }
          try {
            var2 = (String) (java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
            this.m(25177);
            this.a(var2, true);
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

    final static String a(CharSequence[] param0, int param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param2 == 0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (1 == param2) {
            var10 = param0[param3];
            var4 = var10;
            if (var4 != null) {
              stackIn_9_0 = var10.toString();
              return stackIn_9_0;
            }
            stackIn_7_0 = "null";
            return stackIn_7_0;
          }
          var4_int = param2 + param3;
          var5 = param1;
          for (var6_int = param3; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = param0[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param3; var4_int > var7; var7++) {
            var8 = param0[var7];
            if (var8 != null) {
              discarded$3 = var6.append(var8);
            } else {
              discarded$4 = var6.append("null");
            }
          }
          stackIn_23_0 = var6.toString();
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_26_0 = var4_ref;
          stackIn_26_1 = new StringBuilder().append("vi.S(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_P != -1) {
            var3_int = this.field_P - this.field_l.length();
            if (var3_int >= 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_N == this.field_l.length()) {
            this.field_l = this.field_l + param0;
          } else {
            this.field_l = this.field_l.substring(0, this.field_N) + param0 + this.field_l.substring(this.field_N, this.field_l.length());
          }
          this.field_N = this.field_N + param0.length();
          this.field_L = this.field_N;
          if (!param1) {
            this.field_G = false;
            this.c((byte) -127);
          } else {
            this.c((byte) -127);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("vi.CA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    void c(byte param0) {
        if (this.field_h instanceof jb) {
          ((jb) (this.field_h)).a(this, 66);
        }
        if (param0 <= -120) {
          return;
        }
        this.p(89);
    }

    private final void j(int param0) {
        if (param0 != -8108) {
          pj var3 = (pj) null;
          this.a((byte) -122, (pj) null, -81, 77);
          if (this.field_h instanceof jb) {
            ((jb) (this.field_h)).a(this, false);
            return;
          }
          return;
        }
        if (!(this.field_h instanceof jb)) {
          return;
        }
        ((jb) (this.field_h)).a(this, false);
    }

    final void a(int param0, int param1, int param2, int param3) {
        long var6;
        rj var8;
        if (this.field_j == null) {
          if (param2 == 1048575) {
            return;
          }
          this.b(-122, -76);
          return;
        }
        if (param1 != 0) {
          if (param2 == 1048575) {
            return;
          }
          this.b(-122, -76);
          return;
        }
        this.field_j.a(param0, param3, (pj) (this), -4394, this.field_F);
        if (!(this.field_j instanceof rj)) {
          if (param2 == 1048575) {
            return;
          }
          this.b(-122, -76);
          return;
        }
        var8 = (rj) ((Object) this.field_j);
        if (this.field_N != this.field_L) {
          var8.a(this.field_L, this.field_N, (pj) (this), param3, param2 ^ -1048511, param0);
        }
        var6 = ji.b(126);
        if ((-this.field_Q + var6) % 1000L < 500L) {
          var8.a(param0, (pj) (this), param3, (byte) 94, this.field_N);
        }
        if (param2 == 1048575) {
          return;
        }
        this.b(-122, -76);
        return;
    }

    public static void n(int param0) {
        field_O = null;
        if (param0 == 1) {
          field_H = null;
          return;
        }
        CharSequence[] var2 = (CharSequence[]) null;
        vi.a((CharSequence[]) null, 10, 59, 11);
        field_H = null;
    }

    private final void b(int param0, int param1) {
        this.field_N = param0;
        if (param1 != 1242) {
          return;
        }
        if (!ek.field_a[81]) {
          this.field_L = this.field_N;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_H = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_O = new int[256];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) != 1) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_O[var1] = var0;
        }
    }
}
