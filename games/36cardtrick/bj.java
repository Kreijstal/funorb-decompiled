/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj {
    private int field_o;
    private int field_v;
    private int field_g;
    private float field_l;
    static boolean field_m;
    private int field_d;
    static String field_u;
    private int field_j;
    private int field_e;
    private int field_r;
    private int field_f;
    private int field_c;
    private int field_s;
    private fa field_q;
    static int field_h;
    private int field_a;
    private int field_n;
    private int field_p;
    private boolean field_k;
    static String field_b;
    private int field_t;
    private int field_i;

    final oe c(int param0) {
        ((bj) this).field_r = gg.field_d;
        ((bj) this).field_o = hj.field_j;
        if (param0 != -1) {
            oe discarded$0 = ((bj) this).c(-67);
        }
        ((bj) this).field_q.a(-23603, ((bj) this).field_p, ((bj) this).field_v);
        vd.field_w = false;
        oe var2 = qa.a(0, ((bj) this).field_p, 0, 17651, jk.field_a, ((bj) this).field_v);
        if (!(var2 != null)) {
            ((bj) this).a((byte) 10);
        }
        return var2;
    }

    final boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (((bj) this).field_t > v.field_Q) {
                break L1;
              } else {
                if (0 >= d.field_c) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((bj) this).field_c = param2;
        if (param1 != 115) {
            ((bj) this).a(118, (byte) 102, 61);
        }
        ((bj) this).field_f = param0;
    }

    final void b(int param0) {
        if (gj.field_a != null) {
          return;
        } else {
          L0: {
            if (d.field_c <= 0) {
              ((bj) this).field_k = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((bj) this).field_k) {
            L1: {
              if (((bj) this).field_c <= gg.field_d) {
                if (0 < ((bj) this).field_c) {
                  sk.field_d = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                sk.field_d = (((bj) this).field_c + -gg.field_d) / 2;
                break L1;
              }
            }
            L2: {
              L3: {
                if (gg.field_d != ((bj) this).field_a) {
                  break L3;
                } else {
                  if (hj.field_j != ((bj) this).field_j) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              ((bj) this).field_q.a(-23603, ((bj) this).field_j, ((bj) this).field_a);
              break L2;
            }
            return;
          } else {
            int fieldTemp$4 = ((bj) this).field_i - 1;
            ((bj) this).field_i = ((bj) this).field_i - 1;
            if (fieldTemp$4 <= 0) {
              L4: {
                if (param0 == 5718) {
                  break L4;
                } else {
                  field_h = -103;
                  break L4;
                }
              }
              ((bj) this).field_i = ((bj) this).field_e;
              if (((bj) this).field_t <= v.field_Q) {
                int discarded$5 = 0;
                this.a();
                return;
              } else {
                ((bj) this).field_k = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Main.field_T;
        var2 = ((bj) this).field_c;
        var3 = ((bj) this).field_f;
        if (!((bj) this).b(true)) {
          ((bj) this).field_k = false;
          return;
        } else {
          L0: {
            ((bj) this).a((byte) -114);
            if (var2 > ((bj) this).field_d) {
              var2 = ((bj) this).field_d;
              break L0;
            } else {
              if (var2 < ((bj) this).field_g) {
                var2 = ((bj) this).field_g;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (((bj) this).field_n < var3) {
              var3 = ((bj) this).field_n;
              break L1;
            } else {
              if (var3 >= ((bj) this).field_s) {
                break L1;
              } else {
                var3 = ((bj) this).field_s;
                break L1;
              }
            }
          }
          L2: {
            if (((bj) this).field_l > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * ((bj) this).field_l);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((bj) this).field_l);
                break L2;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  break L2;
                } else {
                  break L2;
                }
              }
            } else {
              break L2;
            }
          }
          L3: {
            if (var2 != gg.field_d) {
              ((bj) this).field_q.a(-23603, var3, var2);
              break L3;
            } else {
              if (hj.field_j == var3) {
                break L3;
              } else {
                ((bj) this).field_q.a(-23603, var3, var2);
                break L3;
              }
            }
          }
          L4: {
            if (0 >= ((bj) this).field_c) {
              break L4;
            } else {
              sk.field_d = (((bj) this).field_c - gg.field_d) / 2;
              break L4;
            }
          }
          return;
        }
    }

    final void a(byte param0) {
        if (param0 != 10) {
            bj.a(-113);
        }
        ((bj) this).field_q.a(-23603, ((bj) this).field_o, ((bj) this).field_r);
    }

    private bj() throws Throwable {
        throw new Error();
    }

    final static void a(pb param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var5 = Main.field_T;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (e.field_e != null) {
                    try {
                      L2: {
                        e.field_e.a(0L, -67);
                        e.field_e.a(0, var6);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (24 > var3_int) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (var4 >= 24) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param0.a(24, 0, var2, (byte) -106);
                    break L1;
                  } else {
                    param0.a(24, 0, var2, (byte) -106);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var2_ref;
                stackOut_18_1 = new StringBuilder().append("bj.C(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                  stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + -25 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_u = null;
        if (param0 >= -96) {
            bj.a(-59);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "This password contains your email address, and would be easy to guess";
        field_b = "Continue";
    }
}
