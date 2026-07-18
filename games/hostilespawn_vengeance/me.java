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
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bf.field_j != ((me) this).field_ab) {
              L1: {
                ((me) this).field_gb = 0;
                ((me) this).field_ab = u.field_d;
                this.a(((me) this).field_bb, -9797);
                ((me) this).field_bb = null;
                if (param0 == 20) {
                  break L1;
                } else {
                  ((me) this).field_bb = null;
                  break L1;
                }
              }
              ((me) this).field_fb.field_D = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "me.BA(" + param0 + ')');
        }
    }

    void b(ag param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            L2: {
              L3: {
                ((me) this).field_bb = param0;
                if (((me) this).field_ab == oa.field_k) {
                  break L3;
                } else {
                  if (((me) this).field_ab == bf.field_j) {
                    break L2;
                  } else {
                    ((me) this).field_ab = bf.field_j;
                    ((me) this).field_gb = 0;
                    if (!HostileSpawn.field_I) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ((me) this).a(((me) this).field_eb, 12 + ((me) this).field_bb.field_s, 88, ((me) this).field_bb.field_x + 12 - -((me) this).field_cb);
              ((me) this).field_gb = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("me.D(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -56) {
                break L1;
              } else {
                me.f((byte) 91);
                break L1;
              }
            }
            field_ib = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "me.P(" + param0 + ')');
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException iOException = null;
            en var2 = null;
            RuntimeException var2_ref = null;
            int stackIn_5_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_16_0 = 0;
            int stackIn_22_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_4_0 = 0;
            try {
              L0: {
                L1: {
                  if (null != oa.field_l) {
                    break L1;
                  } else {
                    oa.field_l = uj.field_k.a(uc.field_d, 101, cb.field_c);
                    break L1;
                  }
                }
                if (param1 >= 87) {
                  if (oa.field_l.field_f == 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    L2: {
                      L3: {
                        long dupTemp$2 = hn.a((byte) 80);
                        gf.field_h = dupTemp$2;
                        bb.field_c = dupTemp$2;
                        if (oa.field_l.field_f != 1) {
                          break L3;
                        } else {
                          try {
                            L4: {
                              L5: {
                                ag.field_t = new td((java.net.Socket) oa.field_l.field_c, uj.field_k);
                                s.field_b.field_i = 0;
                                var2 = sc.field_g;
                                if (param0) {
                                  stackOut_15_0 = -2;
                                  stackIn_16_0 = stackOut_15_0;
                                  break L5;
                                } else {
                                  stackOut_13_0 = -1;
                                  stackIn_16_0 = stackOut_13_0;
                                  break L5;
                                }
                              }
                              bj.field_f = stackIn_16_0;
                              ae.field_u = stackIn_16_0;
                              ne.field_o = stackIn_16_0;
                              rc.field_a = sa.field_c;
                              var2.field_i = 0;
                              hm.a(og.field_c, rl.field_b, (vi) (Object) s.field_b, ea.field_c, 4122);
                              mb.d(-1, -22370);
                              decompiledRegionSelector0 = 0;
                              break L4;
                            }
                          } catch (java.io.IOException decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L6: {
                              iOException = (IOException) (Object) decompiledCaughtException;
                              rc.field_a = sg.field_c;
                              if (!HostileSpawn.field_I) {
                                decompiledRegionSelector0 = 0;
                                break L6;
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L6;
                              }
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      rc.field_a = sg.field_c;
                      break L2;
                    }
                    oa.field_l = null;
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw wg.a((Throwable) (Object) var2_ref, "me.AA(" + param0 + ',' + param1 + ')');
            }
            return stackIn_22_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean l(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        boolean stackIn_29_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_28_0 = false;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 65393) {
                break L1;
              } else {
                ((me) this).b((ag) null, (byte) 96);
                break L1;
              }
            }
            L2: {
              if (((me) this).field_ab != null) {
                L3: {
                  if (bf.field_j != ((me) this).field_ab) {
                    break L3;
                  } else {
                    L4: {
                      int fieldTemp$2 = ((me) this).field_gb + 1;
                      ((me) this).field_gb = ((me) this).field_gb + 1;
                      if (~fieldTemp$2 != ~((me) this).field_hb) {
                        break L4;
                      } else {
                        ((me) this).field_ab = oa.field_k;
                        ((me) this).a(((me) this).field_eb, 12 + ((me) this).field_bb.field_s, 121, ((me) this).field_bb.field_x + ((me) this).field_cb + 12);
                        ((me) this).field_gb = 0;
                        ((me) this).field_fb.field_D = 0;
                        if (var3 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ((me) this).field_fb.field_D = 256 + -((((me) this).field_gb << 766918760) / ((me) this).field_hb);
                    if (var3 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (((me) this).field_ab != u.field_d) {
                  break L2;
                } else {
                  L5: {
                    int fieldTemp$3 = ((me) this).field_gb + 1;
                    ((me) this).field_gb = ((me) this).field_gb + 1;
                    if (((me) this).field_db == fieldTemp$3) {
                      break L5;
                    } else {
                      ((me) this).field_fb.field_D = (((me) this).field_gb << -754436728) / ((me) this).field_db;
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((me) this).field_fb.field_D = 256;
                  ((me) this).field_ab = null;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            stackOut_28_0 = super.l(65393);
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "me.U(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    final static void a(java.awt.Component param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.setFocusTraversalKeysEnabled(false);
            var2_int = -39 / ((param1 - 44) / 60);
            param0.addKeyListener((java.awt.event.KeyListener) (Object) nj.field_c);
            param0.addFocusListener((java.awt.event.FocusListener) (Object) nj.field_c);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("me.V(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final boolean j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -15953) {
              ((me) this).m(-92);
              stackOut_3_0 = super.j(-15953);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "me.S(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final void m(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ((me) this).field_ab) {
                break L1;
              } else {
                L2: {
                  if (((me) this).field_ab == u.field_d) {
                    break L2;
                  } else {
                    ((me) this).a(((me) this).field_bb.field_s + 12, 15767, ((me) this).field_bb.field_x + 12 + ((me) this).field_cb);
                    this.a(((me) this).field_bb, -9797);
                    break L2;
                  }
                }
                ((me) this).field_fb.field_D = 256;
                ((me) this).field_ab = null;
                break L1;
              }
            }
            L3: {
              if (param0 <= 0) {
                break L3;
              } else {
                field_ib = null;
                break L3;
              }
            }
            super.m(-3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2, "me.R(" + param0 + ')');
        }
    }

    boolean a(int param0, ag param1, int param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((me) this).field_fb) {
                  break L1;
                } else {
                  L2: {
                    if (param2 != 98) {
                      break L2;
                    } else {
                      boolean discarded$3 = ((me) this).field_fb.a((byte) -109, param1);
                      break L2;
                    }
                  }
                  if (param2 == 99) {
                    boolean discarded$4 = ((me) this).field_fb.a((byte) -73, param1);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("me.F(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_16_0 != 0;
    }

    private final void a(ag param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -9797) {
                break L1;
              } else {
                boolean discarded$2 = ((me) this).j(1);
                break L1;
              }
            }
            L2: {
              if (((me) this).field_fb != null) {
                ((me) this).field_fb.b(121);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                if (null == param0) {
                  break L4;
                } else {
                  param0.a(param0.field_s, 6 + ((me) this).field_cb, 0, 6, param0.field_x);
                  ((me) this).field_fb = new jn(param0);
                  if (!HostileSpawn.field_I) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((me) this).field_fb = new jn();
              break L3;
            }
            ((me) this).a(51448, (ag) (Object) ((me) this).field_fb);
            ((me) this).field_bb = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("me.T(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
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
            Object stackIn_7_0 = null;
            Throwable decompiledCaughtException = null;
            java.awt.Canvas stackOut_6_0 = null;
            ue stackOut_4_0 = null;
            var8_ref3 = null;
            var9 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                if (~param1 != ~qm.field_R) {
                  L1: {
                    var2_int = 15;
                    qm.field_R = param1;
                    var3 = 15;
                    if (null == wa.field_q) {
                      stackOut_6_0 = se.field_h;
                      stackIn_7_0 = (Object) (Object) stackOut_6_0;
                      break L1;
                    } else {
                      stackOut_4_0 = wa.field_q;
                      stackIn_7_0 = (Object) (Object) stackOut_4_0;
                      break L1;
                    }
                  }
                  var4 = stackIn_7_0;
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
                        L4: {
                          if (~var6.length >= ~var7_int) {
                            break L4;
                          } else {
                            L5: {
                              L6: {
                                if (0 == var5.field_D[var7_int]) {
                                  break L6;
                                } else {
                                  var6[var7_int] = ll.a(var5.field_D[var7_int], -16777216);
                                  if (var9 == 0) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var6[var7_int] = 0;
                              break L5;
                            }
                            var7_int++;
                            if (var9 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var7 = null;
                        try {
                          L7: {
                            var8_ref3 = od.field_F.newInstance(new Object[3]);
                            Object discarded$1 = aa.field_e.invoke(var8_ref3, new Object[7]);
                            var7_ref = (java.awt.Cursor) kh.field_eb.invoke((Object) (Object) ((java.awt.Canvas) var4).getToolkit(), new Object[3]);
                            break L7;
                          }
                        } catch (java.lang.IllegalAccessException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L8: {
                            var8 = (IllegalAccessException) (Object) decompiledCaughtException;
                            kh.field_eb = null;
                            break L8;
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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            ((me) this).field_eb = param4;
            ((me) this).field_cb = param2;
            ((me) this).field_db = param3;
            ((me) this).field_hb = param3;
            this.a(param1, -9797);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("me.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
