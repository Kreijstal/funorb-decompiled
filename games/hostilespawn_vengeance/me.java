/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

abstract class me extends wb {
    private jn field_fb;
    private int field_cb;
    private int field_db;
    private int field_hb;
    private int field_gb;
    private int field_eb;
    private ag field_bb;
    private je field_ab;
    static bd[] field_ib;

    final void o(int param0) {
        if (bf.field_j != ((me) this).field_ab) {
          ((me) this).field_gb = 0;
          ((me) this).field_ab = u.field_d;
          int discarded$2 = -9797;
          this.a(((me) this).field_bb);
          ((me) this).field_bb = null;
          if (param0 != 20) {
            ((me) this).field_bb = null;
            ((me) this).field_fb.field_D = 0;
            return;
          } else {
            ((me) this).field_fb.field_D = 0;
            return;
          }
        } else {
          return;
        }
    }

    void b(ag param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 110) {
                break L1;
              } else {
                ((me) this).field_bb = null;
                break L1;
              }
            }
            ((me) this).field_bb = param0;
            if (((me) this).field_ab == oa.field_k) {
              ((me) this).a(((me) this).field_eb, 12 + ((me) this).field_bb.field_s, 88, ((me) this).field_bb.field_x + 12 - -((me) this).field_cb);
              ((me) this).field_gb = 0;
              return;
            } else {
              if (((me) this).field_ab == bf.field_j) {
                break L0;
              } else {
                ((me) this).field_ab = bf.field_j;
                ((me) this).field_gb = 0;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("me.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        if (param0 != -56) {
            me.f((byte) 91);
            field_ib = null;
            return;
        }
        field_ib = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            en var2 = null;
            IOException var2_ref = null;
            int stackIn_11_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_9_0 = 0;
            L0: {
              if (null != oa.field_l) {
                break L0;
              } else {
                oa.field_l = uj.field_k.a(uc.field_d, 101, cb.field_c);
                break L0;
              }
            }
            if (param1 >= 87) {
              if (oa.field_l.field_f == 0) {
                return false;
              } else {
                long dupTemp$4 = hn.a((byte) 80);
                gf.field_h = dupTemp$4;
                bb.field_c = dupTemp$4;
                if (oa.field_l.field_f != 1) {
                  rc.field_a = sg.field_c;
                  oa.field_l = null;
                  return true;
                } else {
                  try {
                    L1: {
                      L2: {
                        ag.field_t = new td((java.net.Socket) oa.field_l.field_c, uj.field_k);
                        s.field_b.field_i = 0;
                        var2 = sc.field_g;
                        if (param0) {
                          stackOut_10_0 = -2;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_9_0 = -1;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                      bj.field_f = stackIn_11_0;
                      ae.field_u = stackIn_11_0;
                      ne.field_o = stackIn_11_0;
                      rc.field_a = sa.field_c;
                      var2.field_i = 0;
                      int discarded$5 = 4122;
                      hm.a(og.field_c, rl.field_b, (vi) (Object) s.field_b, ea.field_c);
                      mb.d(-1, -22370);
                      break L1;
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var2_ref = (IOException) (Object) decompiledCaughtException;
                    rc.field_a = sg.field_c;
                    oa.field_l = null;
                    return true;
                  }
                  oa.field_l = null;
                  return true;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean l(int param0) {
        int var3 = 0;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (((me) this).field_ab != null) {
          if (bf.field_j != ((me) this).field_ab) {
            if (((me) this).field_ab == u.field_d) {
              int fieldTemp$2 = ((me) this).field_gb + 1;
              ((me) this).field_gb = ((me) this).field_gb + 1;
              if (((me) this).field_db != fieldTemp$2) {
                ((me) this).field_fb.field_D = (((me) this).field_gb << 8) / ((me) this).field_db;
                return super.l(65393);
              } else {
                ((me) this).field_fb.field_D = 256;
                ((me) this).field_ab = null;
                return super.l(65393);
              }
            } else {
              return super.l(65393);
            }
          } else {
            int fieldTemp$3 = ((me) this).field_gb + 1;
            ((me) this).field_gb = ((me) this).field_gb + 1;
            if (fieldTemp$3 == ((me) this).field_hb) {
              ((me) this).field_ab = oa.field_k;
              ((me) this).a(((me) this).field_eb, 12 + ((me) this).field_bb.field_s, 121, ((me) this).field_bb.field_x + ((me) this).field_cb + 12);
              ((me) this).field_gb = 0;
              ((me) this).field_fb.field_D = 0;
              return super.l(65393);
            } else {
              ((me) this).field_fb.field_D = 256 + -((((me) this).field_gb << 8) / ((me) this).field_hb);
              return super.l(65393);
            }
          }
        } else {
          return super.l(65393);
        }
    }

    final static void a(java.awt.Component param0) {
        try {
            param0.setFocusTraversalKeysEnabled(false);
            int var2_int = -39;
            param0.addKeyListener((java.awt.event.KeyListener) (Object) nj.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) nj.field_c);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "me.V(" + (param0 != null ? "{...}" : "null") + ',' + 118 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 != -15953) {
            return false;
        }
        ((me) this).m(-92);
        return super.j(-15953);
    }

    final void m(int param0) {
        if (null == ((me) this).field_ab) {
          if (param0 > 0) {
            field_ib = null;
            super.m(-3);
            return;
          } else {
            super.m(-3);
            return;
          }
        } else {
          if (((me) this).field_ab == u.field_d) {
            ((me) this).field_fb.field_D = 256;
            ((me) this).field_ab = null;
            if (param0 <= 0) {
              super.m(-3);
              return;
            } else {
              field_ib = null;
              super.m(-3);
              return;
            }
          } else {
            ((me) this).a(((me) this).field_bb.field_s + 12, 15767, ((me) this).field_bb.field_x + 12 + ((me) this).field_cb);
            int discarded$1 = -9797;
            this.a(((me) this).field_bb);
            ((me) this).field_fb.field_D = 256;
            ((me) this).field_ab = null;
            if (param0 <= 0) {
              super.m(-3);
              return;
            } else {
              field_ib = null;
              super.m(-3);
              return;
            }
          }
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (super.a(274, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (null == ((me) this).field_fb) {
                  break L1;
                } else {
                  L2: {
                    if (param2 != 98) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((me) this).field_fb.a((byte) -109, param1);
                      break L2;
                    }
                  }
                  if (param2 == 99) {
                    boolean discarded$5 = ((me) this).field_fb.a((byte) -73, param1);
                    break L1;
                  } else {
                    return false;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("me.F(").append(274).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    private final void a(ag param0) {
        try {
            if (!(((me) this).field_fb == null)) {
                ((me) this).field_fb.b(121);
            }
            if (param0 != null) {
                param0.a(param0.field_s, 6 + ((me) this).field_cb, 0, 6, param0.field_x);
                ((me) this).field_fb = new jn(param0);
            } else {
                ((me) this).field_fb = new jn();
            }
            ((me) this).a(51448, (ag) (Object) ((me) this).field_fb);
            ((me) this).field_bb = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "me.T(" + (param0 != null ? "{...}" : "null") + ',' + -9797 + ')');
        }
    }

    final static void b(int param0, int param1) {
        try {
            Object var8_ref3 = null;
            RuntimeException var2 = null;
            int var2_int = 0;
            int var3 = 0;
            Object var4 = null;
            bd var5 = null;
            int[] var6 = null;
            Object var7 = null;
            int var7_int = 0;
            java.awt.Cursor var7_ref = null;
            IllegalAccessException var8 = null;
            InstantiationException var8_ref = null;
            java.lang.reflect.InvocationTargetException var8_ref2 = null;
            int var9 = 0;
            Object var10 = null;
            Object stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            java.awt.Canvas stackOut_5_0 = null;
            ue stackOut_4_0 = null;
            var8_ref3 = null;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                if (param1 != qm.field_R) {
                  L1: {
                    var2_int = 15;
                    qm.field_R = param1;
                    var3 = 15;
                    if (null == wa.field_q) {
                      stackOut_5_0 = se.field_h;
                      stackIn_6_0 = (Object) (Object) stackOut_5_0;
                      break L1;
                    } else {
                      stackOut_4_0 = wa.field_q;
                      stackIn_6_0 = (Object) (Object) stackOut_4_0;
                      break L1;
                    }
                  }
                  var4 = stackIn_6_0;
                  if (0 != param1) {
                    if (!cc.a((byte) -102)) {
                      return;
                    } else {
                      L2: {
                        if (param0 > 83) {
                          break L2;
                        } else {
                          field_ib = null;
                          break L2;
                        }
                      }
                      var5 = ee.field_d[-1 + param1];
                      var6 = new int[var5.field_D.length];
                      var7_int = 0;
                      L3: while (true) {
                        if (var6.length <= var7_int) {
                          var7 = null;
                          try {
                            L4: {
                              var10 = od.field_F.newInstance(new Object[3]);
                              var8_ref3 = var10;
                              Object discarded$1 = aa.field_e.invoke(var8_ref3, new Object[7]);
                              var7_ref = (java.awt.Cursor) kh.field_eb.invoke((Object) (Object) ((java.awt.Canvas) var4).getToolkit(), new Object[3]);
                              break L4;
                            }
                          } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L5: {
                              var8 = (IllegalAccessException) (Object) decompiledCaughtException;
                              kh.field_eb = null;
                              break L5;
                            }
                          } catch (java.lang.InstantiationException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var8_ref = (InstantiationException) (Object) decompiledCaughtException;
                            throw new RuntimeException();
                          } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter2) {
                            decompiledCaughtException = decompiledCaughtParameter2;
                            var8_ref2 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                            throw new RuntimeException();
                          }
                          ((java.awt.Canvas) var4).setCursor(var7_ref);
                          break L0;
                        } else {
                          L6: {
                            if (0 == var5.field_D[var7_int]) {
                              var6[var7_int] = 0;
                              var7_int++;
                              break L6;
                            } else {
                              var6[var7_int] = ll.a(var5.field_D[var7_int], -16777216);
                              var7_int++;
                              var7_int++;
                              break L6;
                            }
                          }
                          var7_int++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    ((java.awt.Canvas) var4).setCursor((java.awt.Cursor) null);
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw wg.a((Throwable) (Object) var2, "me.Q(" + param0 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    me(gg param0, ag param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_s, param2 + 12 - -param1.field_x);
        try {
            ((me) this).field_eb = param4;
            ((me) this).field_cb = param2;
            ((me) this).field_db = param3;
            ((me) this).field_hb = param3;
            int discarded$0 = -9797;
            this.a(param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
