/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class qm extends jb {
    int field_s;
    String field_t;
    wo field_i;
    static int field_n;
    static int[] field_q;
    tb field_p;
    int field_j;
    String field_o;
    int field_f;
    int field_r;
    bi field_l;
    boolean field_m;
    int field_h;
    int field_g;
    int field_k;

    final void a(byte param0, int param1, int param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = CrazyCrystals.field_B;
        var4 = this.c((byte) 38);
        var5_int = 0;
        while (var4 >= var5_int) {
          this.a(param2, (byte) -77, param1, var5_int);
          var5_int++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        var5 = mc.a((byte) 6);
        if (var5 != null) {
          pi.field_j.a(var5, 3370, ni.field_b, rf.field_G);
        }
        var6 = 8 % ((param0 - 66) / 48);
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 1) {
            return false;
          }
          this.a(-81, 38, true, -102, 61);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.FB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, qm param4, int param5) {
        try {
          this.field_s = param5;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qm.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    String a(byte param0) {
        if (param0 >= -23) {
          this.field_f = 96;
          if (this.field_m) {
            return this.field_t;
          }
          return null;
        }
        if (this.field_m) {
          return this.field_t;
        }
        return null;
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = this.a(bm.field_h, param3, false, param2, qh.field_i) ? 1 : 0;
          var6 = 125 % ((-50 - param1) / 59);
          if ((this.field_m ? 1 : 0) != var5_int) {
            stackIn_5_1 = (var5_int != 0);
            this.field_m = stackIn_5_1;
            if (this.field_l != null &&
              this.field_l instanceof t) {
              ((t) (this.field_l)).a(var5_int != 0, -2095, this);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("qm.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, byte param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          discarded$0 = param2.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_r).append(",").append(this.field_j).append(" ").append(this.field_g).append("x").append(this.field_f);
          if (this.field_o != null) {
            discarded$1 = param2.append(" text=\"").append(this.field_o).append('"');
          }
          if (this.field_m) {
            discarded$2 = param2.append(" mouseover");
          }
          if (param1 < 119) {
            return;
          }
          if (this.e(-111)) {
            discarded$3 = param2.append(" focused");
          }
          if (this.field_i != null) {
            discarded$4 = param2.append(" renderer=");
            if (this.field_i instanceof qm) {
              param2 = this.a(param0 + 1, -86, param3, param2);
              if (var6 != 0) {
                discarded$5 = param2.append(this.field_i);
              }
            } else {
              discarded$5 = param2.append(this.field_i);
            }
          }
          if (null != this.field_l) {
            discarded$6 = param2.append(" listener=");
            if (this.field_l instanceof qm) {
              param2 = this.a(1 + param0, -124, param3, param2);
              if (var6 == 0) {
                return;
              }
            }
            discarded$7 = param2.append(this.field_l);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("qm.QB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static jm d(int param0) {
        try {
          Throwable var1 = null;
          jm stackIn_3_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 1) {
              field_q = (int[]) null;
            }
            stackIn_3_0 = (jm) (Class.forName("sf").newInstance());
            return stackIn_3_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return this.a(0, -115, new Hashtable(), new StringBuilder()).toString();
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(0, param0, param3, param2)) {
            this.a(param0, (byte) 123, param3, param2);
          }
          if (param1 > -85) {
            this.field_k = 84;
          }
          stackIn_5_0 = (StringBuilder) (param3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("qm.MA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 == -52) {
          this.field_j = param2;
          this.field_g = param3;
          this.field_f = param0;
          this.field_r = param1;
          return;
        }
        field_q = (int[]) null;
        this.field_j = param2;
        this.field_g = param3;
        this.field_f = param0;
        this.field_r = param1;
    }

    void b(byte param0) {
        if (param0 > -84) {
          this.field_k = 97;
        }
    }

    final boolean a(int param0, boolean param1, char param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (this.e(-121)) {
          if (this.a(param0, 19279, this, param2)) {
            return true;
          }
          var4 = param0;
          if (var4 == 80) {
            return this.a(true, this);
          }
          if (param1) {
            this.a((byte) -42);
            return false;
          }
          return false;
        }
        var4Lifetime1 = param0;
        if (var4Lifetime1 == 80) {
          return this.a(true, this);
        }
        if (!param1) {
          return false;
        }
        this.a((byte) -42);
        return false;
    }

    public static void g(int param0) {
        if (param0 != 1) {
          qm.d(38);
          field_q = null;
          return;
        }
        field_q = null;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param3 == 0) {
          if (this.field_i == null) {
            if (param1 > -12) {
              this.field_h = -114;
              return;
            }
            return;
          }
          this.field_i.a(param0, false, param2, this, true);
        }
        if (param1 <= -12) {
          return;
        }
        this.field_h = -114;
    }

    final boolean a(int param0, boolean param1, boolean param2, int param3) {
        int var5;
        oj var6;
        int var7;
        oj var8;
        oj var9;
        oj var10;
        oj var11;
        oj var12;
        oj var13;
        oj var6Lifetime1;
        oj var6Lifetime2;
        L0: {
          var7 = CrazyCrystals.field_B;
          this.a(this, -125, param0, param3);
          var5 = this.e(-111) ? 1 : 0;
          if (param2) {
            if (of.field_H != 0) {
              if (var5 == 0) {
                if (pj.field_v == 0) {
                  if (gg.field_c == 0 &&
                    qk.field_D != 0) {
                    this.a(bm.field_h, param0, param3, qh.field_i, this, 0);
                    var8 = ok.field_e;
                    var6 = var8;
                    if (var8 != null) {
                      if (var8.field_l instanceof sk) {
                        ((sk) (var8.field_l)).a((ed) null, -27167, var8);
                      }
                      ok.field_e = null;
                    }
                    if (var7 != 0 &&
                      var5 != 0 &&
                      pj.field_v != 0) {
                      this.b((byte) -110);
                    }
                  }
                } else {
                  if (this.a(param3, dp.field_h, this, false, param0, pj.field_v, to.field_a)) {
                    param2 = false;
                    if (var7 == 0) {
                      if (gg.field_c == 0 &&
                        qk.field_D != 0) {
                        this.a(bm.field_h, param0, param3, qh.field_i, this, 0);
                        var9 = ok.field_e;
                        var6Lifetime1 = var9;
                        if (var9 != null) {
                          if (var9.field_l instanceof sk) {
                            ((sk) (var9.field_l)).a((ed) null, -27167, var9);
                          }
                          ok.field_e = null;
                        }
                        if (var7 != 0 &&
                          var5 != 0 &&
                          pj.field_v != 0) {
                          this.b((byte) -110);
                        }
                      }
                      break L0;
                    }
                  }
                  if (((gg.field_c == 0)) &&
                    ((qk.field_D != 0))) {
                    this.a(bm.field_h, param0, param3, qh.field_i, this, 0);
                    var11 = ok.field_e;
                    var6Lifetime2 = var11;
                    if (var11 != null) {
                      if (var11.field_l instanceof sk) {
                        ((sk) (var11.field_l)).a((ed) null, -27167, var11);
                      }
                      ok.field_e = null;
                    }
                  }
                }
                break L0;
              }
              this.a(1, bm.field_h, this, qh.field_i, param0, param3, of.field_H);
            }
            L16: {
              if (pj.field_v != 0) {
                if (this.a(param3, dp.field_h, this, false, param0, pj.field_v, to.field_a)) {
                  param2 = false;
                  if (var7 == 0) {
                    break L16;
                  }
                }
                if (var5 != 0) {
                  this.b((byte) -118);
                  if (gg.field_c == 0) {
                    if (qk.field_D == 0) {
                      break L0;
                    }
                    this.a(bm.field_h, param0, param3, qh.field_i, this, 0);
                    var12 = ok.field_e;
                    if (var12 != null) {
                      if (var12.field_l instanceof sk) {
                        ((sk) (var12.field_l)).a((ed) null, -27167, var12);
                      }
                      ok.field_e = null;
                    }
                    if (var7 != 0) {
                      if (pj.field_v == 0) {
                        break L0;
                      }
                      this.b((byte) -110);
                    }
                  }
                  break L0;
                }
              }
            }
            if ((gg.field_c == 0) &&
              (qk.field_D != 0)) {
              this.a(bm.field_h, param0, param3, qh.field_i, this, 0);
              var13 = ok.field_e;
              if (var13 != null) {
                if (var13.field_l instanceof sk) {
                  ((sk) (var13.field_l)).a((ed) null, -27167, var13);
                }
                ok.field_e = null;
              }
              if ((var7 != 0) &&
                (var5 != 0 &&
                pj.field_v != 0)) {
                this.b((byte) -110);
              }
            }
          } else {
            if (var5 != 0 &&
              pj.field_v != 0) {
              this.b((byte) -110);
            }
          }
        }
        qk.field_D = gg.field_c;
        if (param1) {
          return true;
        }
        ia.a((byte) -47, this.a((byte) -54));
        return param2;
    }

    final void f(int param0) {
        this.a(this.field_f, this.field_r, this.field_j, this.field_g, (byte) -52);
        if (param0 > -27) {
          this.e(-107);
        }
    }

    boolean e(int param0) {
        if (param0 >= -107) {
          return true;
        }
        return false;
    }

    boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param1, param0, param3, param4, param6)) {
            return false;
          }
          this.field_s = param5;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("qm.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    boolean a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qm.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 19279) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("qm.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    int c(byte param0) {
        if (param0 < 30) {
          this.a(-13, -26, (Hashtable) null, (StringBuilder) null);
          return 0;
        }
        return 0;
    }

    qm(String param0, bi param1) {
        this(param0, pi.field_j.field_n, param1);
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
          return false;
        }
        if (param1 + this.field_r > param4) {
          return false;
        }
        if (this.field_j + param3 > param0) {
          return false;
        }
        if (param1 - (-this.field_r - this.field_g) <= param4) {
          return false;
        }
        if (param3 + this.field_j + this.field_f > param0) {
          return true;
        }
        return false;
    }

    final boolean a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            return true;
          }
          if (param3.containsKey(this)) {
            discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          }
          param3.put(this, this);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("qm.IB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    protected qm() {
        this.field_h = 0;
        this.field_k = 0;
    }

    qm(String param0, wo param1, bi param2) {
        RuntimeException runtimeException = null;
        fi var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_h = 0;
        this.field_k = 0;
        try {
          this.field_l = param2;
          this.field_o = param0;
          this.field_i = param1;
          if (this.field_i instanceof fi) {
            var4 = (fi) ((Object) this.field_i);
            this.field_g = var4.b(this, -12817);
            this.field_f = var4.c(this, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("qm.<init>(");
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
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static int a(rh param0, int param1, rh param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 84) {
            qm.g(-54);
          }
          stackIn_3_0 = ai.a(param2, false, (String) null, 0, param0, (byte) 84, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qm.HB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    qm(int param0, int param1, int param2, int param3, wo param4, bi param5) {
        this.field_h = 0;
        this.field_k = 0;
        try {
          this.field_g = param2;
          this.field_i = param4;
          this.field_r = param0;
          this.field_l = param5;
          this.field_f = param3;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "qm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = new int[8192];
    }
}
