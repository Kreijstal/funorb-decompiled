/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sw extends jea {
    private int field_Ib;
    private boolean field_tb;
    private int field_Gb;
    private int field_ub;
    private int field_yb;
    private naa field_Db;
    jea field_Cb;
    private int field_Ab;
    static String field_Fb;
    private fia field_Bb;
    private jea field_Eb;
    private StringBuilder field_wb;
    private long field_Hb;
    private jea field_xb;
    static int[] field_zb;
    private boolean field_vb;

    private final void a(String param0, boolean param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          if (this.field_Ib != -1) {
            var3_int = this.field_Ib - this.field_wb.length();
            if (var3_int == 0) {
              return;
            }
            param0 = param0.substring(0, var3_int);
          }
          if (this.field_ub != this.field_wb.length()) {
            var4 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
            ana.a(this.field_ub, ' ', -11, this.field_wb);
            discarded$0 = this.field_wb.append(param0);
            discarded$1 = this.field_wb.append(var4);
          } else {
            discarded$2 = this.field_wb.append(param0);
          }
          if (!param1) {
            this.field_yb = -100;
          }
          this.field_Cb.field_r = this.field_wb.toString();
          this.field_ub = this.field_wb.length();
          this.field_Ab = this.field_ub;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("sw.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void h(byte param0) {
        try {
          int dupTemp$0 = 0;
          boolean stackIn_6_1 = false;
          int stackIn_35_0 = 0;
          Throwable decompiledCaughtException = null;
          int var2_int = 0;
          RuntimeException var2 = null;
          long var3_long = 0L;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var5 = 0;
          int var6 = 0;
          java.awt.datatransfer.Transferable var7 = null;
          String var8 = null;
          var6 = TombRacer.field_G ? 1 : 0;
          try {
            var2_int = this.b(-2, -this.field_Cb.field_S + (-this.field_q + jba.field_j));
            if (this.field_y != 1) {
              if (ksa.field_p == 1 &&
                this.field_tb) {
                if (this.field_vb &&
                  this.field_yb > var2_int &&
                  this.field_Ab < var2_int) {
                  var2_int = this.field_yb;
                }
                this.field_ub = var2_int;
              } else {
                this.field_tb = false;
              }
            } else {
              this.d(param0 + 18539, var2_int);
              this.field_tb = true;
              var3_long = bva.b((byte) -107);
              stackIn_6_1 = !(-this.field_Hb + var3_long >= 250L);
              this.field_vb = stackIn_6_1;
              if (this.field_vb) {
                this.field_Ab = this.j((byte) -69);
                this.field_ub = this.g((byte) 24);
                if (this.field_ub > 0 &&
                  this.field_wb.charAt(this.field_ub - 1) == 32) {
                  this.field_ub = this.field_ub - 1;
                }
                this.field_yb = this.field_ub;
              }
              this.field_Hb = var3_long;
            }
            if (!this.field_L) {
              dupTemp$0 = this.field_wb.length();
              this.field_Ab = dupTemp$0;
              this.field_ub = dupTemp$0;
            }
            this.field_Eb.field_qb = this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_ub));
            if (this.field_Ab == this.field_ub) {
              this.field_xb.a(0, this.field_Gb, -23776, 2, this.field_Eb.field_qb);
            } else {
              var3 = this.field_Cb.field_qb + this.field_Cb.field_H.b(this.field_wb.toString().substring(0, this.field_Ab));
              if (this.field_Eb.field_qb <= var3) {
                stackIn_35_0 = this.field_Eb.field_qb;
              } else {
                stackIn_35_0 = var3;
              }
              var4_int = stackIn_35_0;
              var5 = Math.abs(-this.field_Eb.field_qb + var3);
              this.field_xb.a(var5, this.field_Gb, param0 ^ -23689, 2, this.field_Cb.field_S + var4_int);
            }
            if (null != this.field_Db &&
              0 != this.field_Db.field_b) {
              var7 = (java.awt.datatransfer.Transferable) (this.field_Db.field_f);
              try {
                var8 = (String) (var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor));
                this.i((byte) -126);
                this.a(var8, true);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_Db = null;
            }
            if (param0 == 87) {
              return;
            }
            this.field_ub = 115;
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            throw tba.a((Throwable) ((Object) var2), "sw.JA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0, int param1) {
        try {
          this.field_Ab = param0;
          if (param1 != 1) {
            this.field_Db = (naa) null;
          }
          this.field_ub = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(int param0) {
        if (this.field_Bb == null) {
          return;
        }
        try {
          this.f(82);
          int var2_int = -100 / ((param0 - 14) / 52);
          this.i((byte) -125);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.E(" + param0 + ')');
        }
    }

    sw(long param0, jea param1, jea param2, jea param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 65) {
            discarded$1 = this.b(-116, -81);
          }
          var4_int = this.field_wb.length();
          if (param2 >= 0) {
            if (var4_int < param2) {
              param2 = var4_int;
            }
          } else {
            param2 = 0;
          }
          if (param0 >= 0) {
            if (param0 > var4_int) {
              param0 = var4_int;
            }
          } else {
            param0 = 0;
          }
          this.field_ub = param2;
          this.field_Ab = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "sw.IA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(byte param0) {
        StringBuilder discarded$0 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        try {
          if (param0 > -119) {
            this.j(-109);
          }
          if (this.field_ub != this.field_Ab) {
            if (this.field_Ab < this.field_ub) {
              stackIn_7_0 = this.field_Ab;
            } else {
              stackIn_7_0 = this.field_ub;
            }
            var2_int = stackIn_7_0;
            if (this.field_ub > this.field_Ab) {
              stackIn_11_0 = this.field_ub;
            } else {
              stackIn_11_0 = this.field_Ab;
            }
            var3 = stackIn_11_0;
            this.field_Ab = var2_int;
            this.field_ub = var2_int;
            var4 = this.field_wb.toString().substring(var3, this.field_wb.length());
            ana.a(var2_int, ' ', -11, this.field_wb);
            discarded$0 = this.field_wb.append(var4);
            this.field_Cb.field_r = this.field_wb.toString();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.H(" + param0 + ')');
        }
    }

    final void d(byte param0) {
        if (param0 > -84) {
          return;
        }
        try {
          ana.a(0, ' ', -11, this.field_wb);
          this.field_Ab = 0;
          this.field_ub = 0;
          this.field_Cb.field_r = this.field_wb.toString();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.HA(" + param0 + ')');
        }
    }

    final static void h(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          if (!lca.a(false)) {
            if (dq.field_f != null &&
              dq.field_f.field_b) {
              og.b(0);
              wu.field_a.c(new gga(wu.field_a, or.field_j), 122);
            }
            return;
          }
          wu.field_a.a(sc.field_k, true, oqa.field_w, param0 ^ -11);
          wu.field_a.g((byte) -128);
          while (es.a(true)) {
            wu.field_a.a((byte) -53, fna.field_h, kda.field_td);
          }
          if (param0 == 100) {
            return;
          }
          field_zb = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "sw.K(" + param0 + ')');
        }
    }

    private final int j(byte param0) {
        int var2_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_ub == 0) {
            stackIn_3_0 = this.field_ub;
            return stackIn_3_0;
          }
          for (var2_int = this.field_ub - 1; var2_int > 0; var2_int--) {
            if (!up.a(this.field_wb.charAt(var2_int - 1), true)) {
              continue;
            }
            break;
          }
          var3 = 59 / ((74 - param0) / 41);
          stackIn_10_0 = var2_int;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.RA(" + param0 + ')');
        }
    }

    final void a(fia param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_Bb = param0;
          var3_int = 85 / ((param1 + 26) / 51);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("sw.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void g(int param0) {
        if (param0 != 100) {
          this.field_Gb = -61;
        }
        if (this.field_Bb == null) {
          return;
        }
        try {
          this.field_Db = this.field_Bb.b(param0 + 25);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.D(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        try {
          java.awt.datatransfer.StringSelection var3 = null;
          if (this.field_Bb == null) {
            return;
          }
          String var2 = this.f((byte) -107);
          if (var2.length() == 0) {
            return;
          }
          try {
            var3 = new java.awt.datatransfer.StringSelection(this.f((byte) -89));
            if (param0 != 82) {
              this.field_wb = (StringBuilder) null;
            }
            this.field_Bb.a((byte) 84, (java.awt.datatransfer.Transferable) ((Object) var3));
          } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sw.OA(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String f(byte param0) {
        int discarded$1 = 0;
        String var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        String stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 > -76) {
            discarded$1 = this.g((byte) 84);
          }
          var2 = this.field_wb.toString();
          if (this.field_Ab < this.field_ub) {
            stackIn_6_0 = this.field_Ab;
          } else {
            stackIn_6_0 = this.field_ub;
          }
          var3 = stackIn_6_0;
          if (this.field_ub > this.field_Ab) {
            stackIn_10_0 = this.field_ub;
          } else {
            stackIn_10_0 = this.field_Ab;
          }
          var4 = stackIn_10_0;
          stackIn_11_0 = var2.substring(var3, var4);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "sw.TA(" + param0 + ')');
        }
    }

    final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -1320) {
            stackIn_4_0 = this.field_ub;
            return stackIn_4_0;
          }
          stackIn_2_0 = 58;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.NA(" + param0 + ')');
        }
    }

    public static void i(int param0) {
        field_Fb = null;
        if (param0 > -33) {
          return;
        }
        try {
          field_zb = null;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.B(" + param0 + ')');
        }
    }

    private sw(long param0, jea param1, jea param2, jea param3, int param4) {
        super(param0, param1);
        StringBuilder stackIn_3_1 = null;
        StringBuilder stackIn_3_2 = null;
        Object stackIn_4_0;
        StringBuilder stackIn_4_1;
        StringBuilder stackIn_4_2;
        int stackIn_4_3;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        this.field_tb = false;
        this.field_yb = -1;
        this.field_Hb = 0L;
        this.field_vb = false;
        try {
          this.field_Ib = param4;
          this.field_xb = new jea(0L, param2);
          this.field_Cb = new jea(0L, param3);
          this.field_Eb = new jea(0L, param3);
          this.field_Z = true;
          stackIn_3_1 = null;
          stackIn_3_2 = null;
          if (this.field_Ib == -1) {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = 256;
          } else {
            stackIn_4_0 = this;
            stackIn_4_1 = null;
            stackIn_4_2 = null;
            stackIn_4_3 = this.field_Ib;
          }
          this.field_wb = new StringBuilder(stackIn_4_3);
          this.field_Cb.field_r = this.field_wb.toString();
          this.field_Eb.field_r = "";
          this.field_Eb.field_sb = "|";
          this.field_J = new vna();
          this.b(-122, this.field_xb);
          this.b(-122, this.field_Cb);
          this.b(-123, this.field_Eb);
          this.field_L = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("sw.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_14_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_14_0;
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        StringBuilder discarded$4 = null;
        int dupTemp$5 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_wb.setLength(0);
          var3_int = param1.length();
          if (this.field_Ib != -1 &&
            var3_int > this.field_Ib) {
            var3_int = this.field_Ib;
          }
          if (param0 < 0) {
            this.field_Ib = 96;
          }
          discarded$4 = this.field_wb.append(param1.substring(0, var3_int));
          dupTemp$5 = this.field_wb.length();
          this.field_Ab = dupTemp$5;
          this.field_ub = dupTemp$5;
          this.field_Cb.field_r = this.field_wb.toString();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("sw.KA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, char param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_41_0 = 0;
        int stackIn_52_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        try {
          if (param1 != -19696) {
            return true;
          }
          if (param2 != 60 &&
            param2 != 62) {
            if (param2 >= 32 &&
              param2 <= 126) {
              if (this.field_Ab != this.field_ub) {
                this.i((byte) -124);
              }
              if (this.field_Ib == -1 ||
                !(this.field_wb.length() >= this.field_Ib)) {
                if (this.field_ub == this.field_wb.length()) {
                  discarded$0 = this.field_wb.append(param2);
                } else {
                  var5 = this.field_wb.toString().substring(this.field_ub, this.field_wb.length());
                  ana.a(this.field_ub, ' ', -11, this.field_wb);
                  discarded$1 = this.field_wb.append(param2);
                  discarded$2 = this.field_wb.append(var5);
                }
                this.field_Cb.field_r = this.field_wb.toString();
                this.field_ub = this.field_ub + 1;
                this.field_Ab = this.field_ub;
              }
              return true;
            }
            if (85 == param0) {
              if (this.field_Ab != this.field_ub) {
                this.i((byte) -120);
                return true;
              }
              if (this.field_ub > 0) {
                this.field_Ab = this.field_ub - 1;
                this.i((byte) -125);
                return true;
              }
            } else {
              if (101 != param0) {
                if (param0 == 13) {
                  this.d((byte) -95);
                  return true;
                }
                if (96 != param0) {
                  if (param0 == 97) {
                    if (this.field_ub >= this.field_wb.length()) {
                      return false;
                    }
                    if (!oj.field_tb[82]) {
                      stackIn_52_0 = this.field_ub + 1;
                    } else {
                      stackIn_52_0 = this.g((byte) 50);
                    }
                    var4_int = stackIn_52_0;
                    this.d(18626, var4_int);
                    return true;
                  }
                  if (param0 == 102) {
                    this.d(param1 + 38322, 0);
                    return true;
                  }
                  if (param0 == 103) {
                    this.d(param1 ^ -1070, this.field_wb.length());
                    return true;
                  }
                  if (oj.field_tb[82] &&
                    param0 == 65) {
                    this.k(param1 ^ 19666);
                    return true;
                  }
                  if (oj.field_tb[82] &&
                    param0 == 66) {
                    this.f(82);
                    return true;
                  }
                  if (oj.field_tb[82] &&
                    67 == param0) {
                    this.g(100);
                    return true;
                  }
                } else {
                  if (0 < this.field_ub) {
                    if (oj.field_tb[82]) {
                      stackIn_41_0 = this.j((byte) -92);
                    } else {
                      stackIn_41_0 = -1 + this.field_ub;
                    }
                    var4_int = stackIn_41_0;
                    this.d(18626, var4_int);
                    return true;
                  }
                }
              } else {
                if (this.field_Ab != this.field_ub) {
                  this.i((byte) -124);
                  return true;
                }
                if (this.field_ub < this.field_wb.length()) {
                  this.field_Ab = 1 + this.field_ub;
                  this.i((byte) -124);
                  return true;
                }
              }
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "sw.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 6) {
            stackIn_3_0 = 65;
            return stackIn_3_0;
          }
          var2_int = param0;
          if (var2_int == 1) {
            stackIn_21_0 = 7;
            return stackIn_21_0;
          }
          if (2 == var2_int) {
            stackIn_23_0 = 6;
            return stackIn_23_0;
          }
          if (3 == var2_int) {
            stackIn_25_0 = 5;
            return stackIn_25_0;
          }
          if (var2_int == 7) {
            stackIn_27_0 = 1;
            return stackIn_27_0;
          }
          if (var2_int == 6) {
            stackIn_29_0 = 2;
            return stackIn_29_0;
          }
          if (var2_int == 5) {
            stackIn_31_0 = 3;
            return stackIn_31_0;
          }
          stackIn_33_0 = param0;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_ub = param1;
          if (param0 != 18626) {
            this.a(83, (byte) 112, 70);
          }
          if (oj.field_tb[81]) {
            return;
          }
          this.field_Ab = this.field_ub;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "sw.J(" + param0 + ',' + param1 + ')');
        }
    }

    final static void k(byte param0) {
        try {
          ta.field_ub = null;
          gca.field_g = null;
          mma.field_b = null;
          rl.field_t = null;
          df.field_J = null;
          ola.field_Ib = null;
          koa.field_b = null;
          int var1_int = -56 % ((6 - param0) / 33);
          mh.field_F = null;
          jna.field_j = null;
          jma.field_a = null;
          qi.field_O = null;
          System.gc();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.SA(" + param0 + ')');
        }
    }

    private final int g(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 3) {
            this.field_tb = true;
          }
          var2_int = this.field_wb.length();
          if (this.field_ub == var2_int) {
            stackIn_5_0 = this.field_ub;
            return stackIn_5_0;
          }
          for (var3 = 1 + this.field_ub; var2_int > var3; var3++) {
            if (!up.a(this.field_wb.charAt(var3 - 1), true)) {
              continue;
            }
            break;
          }
          stackIn_12_0 = var3;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.PA(" + param0 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        try {
          this.a(param0, param3, -23776, param2, param4);
          this.field_Cb.a(param0, param3, -23776, 0, 0);
          this.field_Eb.a(param0, param3, -23776, 0, 0);
          this.field_Gb = param3 - 4;
          if (param1 < 101) {
            this.e((byte) 103);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sw.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int b(int param0, int param1) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = 0;
          if (param0 != -2) {
            this.d((byte) -86);
          }
          var5 = this.field_wb.length();
          while (var4 < param1) {
            if (var3_int < var5) {
              incrementValue$1 = var3_int;
              var3_int++;
              var4 = var4 + this.field_Cb.field_H.a(this.field_wb.charAt(incrementValue$1));
              continue;
            }
            break;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "sw.LA(" + param0 + ',' + param1 + ')');
        }
    }

    final String e(byte param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -99) {
            this.field_ub = -43;
          }
          stackIn_3_0 = this.field_wb.toString();
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "sw.F(" + param0 + ')');
        }
    }

    static {
        field_Fb = "Open in popup window";
        field_zb = new int[]{1, 200, 300, 1000, 200, 500, 300, 100, 200, 300, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 500, 500, 300, 300, 100, 200, 300, 100, 100, 200, 300, 500, 300, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    }
}
