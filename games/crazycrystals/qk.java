/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qk extends og implements fd, vd {
    private pc field_C;
    static dl field_H;
    static int[] field_E;
    private pc field_B;
    static int field_F;
    static String field_z;
    private sd field_G;
    nh field_A;
    static int field_D;

    private final void i(int param0) {
        if (!(this.e((byte) -32))) {
            return;
        }
        ba.a((byte) -65, ((qk) this).field_G.field_o);
        if (param0 != -25) {
            ((qk) this).field_G = null;
        }
    }

    public qk() {
        super(0, 0, 496, 0, (wo) null);
        ((qk) this).field_G = new sd("", (bi) null, 12);
        lb var1 = new lb(ba.field_i, 0, 0, 0, 0, 16777215, -1, 3, 0, ai.field_h.field_o, -1, 2147483647, true);
        qm var2 = new qm(gg.field_a, (wo) (Object) var1, (bi) null);
        ((qk) this).field_B = new pc(hb.field_i, (bi) null);
        ((qk) this).field_C = new pc(wa.field_k, (bi) null);
        ((qk) this).field_G.field_t = ac.field_k;
        ((qk) this).field_G.a(true, (n) (Object) new no((ga) (Object) ((qk) this).field_G));
        ((qk) this).field_B.field_x = false;
        ((qk) this).field_B.field_i = (wo) (Object) new ve();
        ((qk) this).field_C.field_i = (wo) (Object) new ok();
        ((qk) this).field_G.field_i = (wo) (Object) new wc(10000536);
        int var3 = 20;
        int var4 = 4;
        var2.a(50, 20, var3, 270, (byte) -52);
        int var5 = 200;
        var3 += 50;
        ((qk) this).b(var2, 12);
        var3 = var3 + (5 + this.a((qm) (Object) ((qk) this).field_G, tb.field_c, var3, 170, fh.field_g, (byte) 122));
        ((qk) this).field_B.a(40, 496 - var5 >> 628205697, var3, var5, (byte) -52);
        ((qk) this).field_C.a(40, var4 + 3, 15 + var3, 60, (byte) -52);
        ((qk) this).field_C.field_l = (bi) this;
        ((qk) this).field_B.field_l = (bi) this;
        ((qk) this).b((qm) (Object) ((qk) this).field_B, -126);
        ((qk) this).b((qm) (Object) ((qk) this).field_C, 4);
        ((qk) this).field_A = new nh((fd) this);
        ((qk) this).field_A.a(150, ((qk) this).field_G.field_r + ((qk) this).field_G.field_g + 60, 20, ((qk) this).field_g - ((qk) this).field_G.field_r + (-((qk) this).field_G.field_g + -60), (byte) -52);
        ((qk) this).b((qm) (Object) ((qk) this).field_A, -123);
        ((qk) this).a(var4 + (55 + var3), 0, 0, 496, (byte) -52);
    }

    private final boolean a(lf param0, int param1) {
        int var3 = 113 % ((-35 - param1) / 36);
        n var4 = param0.a(-79);
        if (var4 == null) {
            return true;
        }
        oi var5 = var4.c((byte) 45);
        return var5 == ih.field_b ? true : false;
    }

    final static db a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            int var8 = 0;
            ee var9 = null;
            db stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            db stackOut_13_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  if (cc.field_a.field_p == null) {
                    break L1;
                  } else {
                    fj.field_c = new qa(cc.field_a.field_p, 5200, 0);
                    cc.field_a.field_p = null;
                    var6 = (Object) (Object) new sp(255, fj.field_c, new qa(cc.field_a.field_g, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var7 = null;
                  var8 = -47 % ((-23 - param1) / 46);
                  if (null != fj.field_c) {
                    L3: {
                      if (null != li.field_d) {
                        break L3;
                      } else {
                        li.field_d = new qa[cc.field_a.field_n.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (li.field_d[param0] == null) {
                        li.field_d[param0] = new qa(cc.field_a.field_n[param0], 12000, 0);
                        cc.field_a.field_n[param0] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new sp(param0, fj.field_c, li.field_d[param0], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  var9 = ch.field_d.a(64, (sp) var6, param4, param0, (sp) var7);
                  if (param2) {
                    var9.b((byte) 125);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_13_0 = new db((lk) (Object) var9, param3, param5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_14_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(int param0, String param1, String param2, int param3, qm param4, int param5, int param6) {
        ei var11 = new ei(20, param0, 120 - -param5, 25, param4, false, 120, 3, ai.field_h, 16777215, param2);
        ((qk) this).b((qm) (Object) var11, 29);
        int var10 = -20 / ((13 - param3) / 40);
        io var9 = new io(((lf) (Object) param4).a(-88), param1, 126, var11.field_f + param0, param5 - -25, param6);
        var9.field_l = (bi) this;
        ((qk) this).b((qm) (Object) var9, 112);
        return var11.field_f + var9.field_f;
    }

    final static wj[] a(boolean param0, int param1, db param2, int param3) {
        if (!gm.a(param2, param3, true, param1)) {
            return null;
        }
        if (param0) {
            field_F = 85;
        }
        return wm.a(-119);
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        L0: {
          if (param4 == ((qk) this).field_C) {
            gl.b(-108);
            break L0;
          } else {
            if (((qk) this).field_B != param4) {
              break L0;
            } else {
              this.i(-25);
              break L0;
            }
          }
        }
        var6 = 79 % ((83 - param0) / 36);
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!(param0 != 98)) {
            return ((qk) this).a((byte) -122, param2);
        }
        if (-100 != (param0 ^ -1)) {
            return false;
        }
        return ((qk) this).a(param2, param1 + -45190);
    }

    final static int a(int param0, int param1, ak param2, hp param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (param2 == null) {
            break L0;
          } else {
            if (param2.field_l == null) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (param3.field_k == param2.field_g) {
                  L1: {
                    var4 = param3.field_p.length;
                    if (param1 >= 79) {
                      break L1;
                    } else {
                      qk.j(-119);
                      break L1;
                    }
                  }
                  var5 = param2.field_l[param0].length / var4;
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var5) {
                      return -1;
                    } else {
                      if (param3.field_i == param2.field_k[param0][var6]) {
                        if (ai.a((byte) 82, param2.field_i[param0][var6])) {
                          var7 = 0;
                          L3: while (true) {
                            if (var4 <= var7) {
                              return var6;
                            } else {
                              if (param3.field_p[var7] == param2.field_l[param0][var6 * var4 + var7]) {
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    public static void j(int param0) {
        field_E = null;
        field_z = null;
        if (param0 != -26005) {
            return;
        }
        field_H = null;
    }

    private final boolean e(byte param0) {
        if (!this.a((lf) (Object) ((qk) this).field_G, -101)) {
            return false;
        }
        if (param0 != -32) {
            field_F = 13;
            return true;
        }
        return true;
    }

    private final int a(qm param0, String param1, int param2, int param3, String param4, byte param5) {
        if (param5 <= 104) {
            Object var8 = null;
            ((qk) this).a((String) null, 110);
        }
        return this.a(param2, param4, param1, 90, param0, param3, 35);
    }

    final void a(qm param0, int param1, int param2, int param3) {
        super.a(param0, -111, param2, param3);
        ((qk) this).field_B.field_x = this.e((byte) -32);
        int var5 = -17 % ((-50 - param1) / 59);
    }

    public final void a(String param0, int param1) {
        if (param1 != -23752) {
            db discarded$0 = qk.a(42, -119, true, false, true, -114);
        }
        sd var3 = ((qk) this).field_G;
        String var4 = param0;
        ((ga) (Object) var3).a(false, -65, var4);
    }

    public final void a(int param0) {
        if (param0 != 20) {
            return;
        }
        ((no) (Object) ((qk) this).field_G.a(param0 ^ -35)).d(-31626);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "This is a mirror. Mirrors<br><br>- reflect lasers;<br>- deflect bouncy balls.";
        field_E = new int[8192];
        field_F = 40;
        field_D = 0;
    }
}
