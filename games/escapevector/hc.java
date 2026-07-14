/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hc extends hm {
    static int[] field_C;
    boolean field_z;
    private boolean field_B;
    boolean field_y;
    private boolean field_A;

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_3_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = EscapeVector.field_A;
                        if (!an.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            if (!param0) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = 0;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return stackIn_4_0 != 0;
                    }
                    case 5: {
                        try {
                            var3 = (String) sd.a(param1, "getcookies", -29155);
                            var4 = bb.a(-128, var3, ';');
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        if (param3 > 0) {
          if (((hc) this).h(0)) {
            if ((param2 ^ -1) != -85) {
              if (83 != param2) {
                return false;
              } else {
                ((hc) this).a(-19646, -1, -1, 1);
                return true;
              }
            } else {
              ((hc) this).a(-19646, -1, -1, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$6 = ((hc) this).h(-2);
          if (((hc) this).h(0)) {
            if ((param2 ^ -1) != -85) {
              if (83 == param2) {
                ((hc) this).a(-19646, -1, -1, 1);
                return true;
              } else {
                return false;
              }
            } else {
              ((hc) this).a(-19646, -1, -1, 1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        if (param0 == -14472) {
          super.a(param0 ^ 0, param1, param2, param3);
          if (-1 != (((hc) this).field_t ^ -1)) {
            if (eb.field_K != ((hc) this).field_t) {
              if (((hc) this).a(dh.field_d, bj.field_y, param2, (byte) 97, param1)) {
                if (eb.field_K == 0) {
                  ((hc) this).a(-19646, bj.field_y - param1, -param2 + dh.field_d, ((hc) this).field_t);
                  ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                  return;
                } else {
                  ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                  return;
                }
              } else {
                ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_C = null;
          super.a(param0 ^ 0, param1, param2, param3);
          if (-1 != (((hc) this).field_t ^ -1)) {
            if (eb.field_K != ((hc) this).field_t) {
              if (((hc) this).a(dh.field_d, bj.field_y, param2, (byte) 97, param1)) {
                if (eb.field_K == 0) {
                  ((hc) this).a(-19646, bj.field_y - param1, -param2 + dh.field_d, ((hc) this).field_t);
                  ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                  return;
                } else {
                  ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                  return;
                }
              } else {
                ((hc) this).a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        int var7 = 0;
        var7 = -18 % ((param5 - -39) / 45);
        if (((hc) this).field_q != null) {
          if (!(((hc) this).field_q instanceof ne)) {
            ((hc) this).field_t = 0;
            return;
          } else {
            ((ne) (Object) ((hc) this).field_q).a(param2, (hc) this, param3, (byte) 114, param1, param0);
            ((hc) this).field_t = 0;
            return;
          }
        } else {
          ((hc) this).field_t = 0;
          return;
        }
    }

    boolean a(int param0, hm param1) {
        if (((hc) this).field_y) {
          if (((hc) this).field_A) {
            param1.f(93);
            ((hc) this).field_B = true;
            if (param0 == -4659) {
              if (((hc) this).field_q != null) {
                if (!(((hc) this).field_q instanceof ql)) {
                  return true;
                } else {
                  ((ql) (Object) ((hc) this).field_q).a(((hc) this).field_B, param0 ^ -4679, (hm) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              ((hc) this).field_z = true;
              if (((hc) this).field_q != null) {
                if (!(((hc) this).field_q instanceof ql)) {
                  return true;
                } else {
                  ((ql) (Object) ((hc) this).field_q).a(((hc) this).field_B, param0 ^ -4679, (hm) this);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    hc(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        ((hc) this).field_B = false;
        ((hc) this).field_A = true;
        ((hc) this).field_y = true;
    }

    final void f(int param0) {
        if (((hc) this).field_B) {
          ((hc) this).field_B = false;
          if (null != ((hc) this).field_q) {
            if (((hc) this).field_q instanceof ql) {
              ((ql) (Object) ((hc) this).field_q).a(((hc) this).field_B, 117, (hm) this);
              if (param0 <= 46) {
                field_C = null;
                return;
              } else {
                return;
              }
            } else {
              if (param0 <= 46) {
                field_C = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 <= 46) {
              field_C = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 <= 46) {
            field_C = null;
            return;
          } else {
            return;
          }
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        Object var6 = null;
        if (param0 == 0) {
          if (((hc) this).a(param3, param1, param2, false)) {
            ((hc) this).a(param1, param2, param3, 1);
            if (!((hc) this).field_z) {
              if (((hc) this).field_y) {
                return param2;
              } else {
                StringBuilder discarded$7 = param2.append(" disabled");
                return param2;
              }
            } else {
              L0: {
                StringBuilder discarded$8 = param2.append(" active");
                if (!((hc) this).field_y) {
                  StringBuilder discarded$9 = param2.append(" disabled");
                  break L0;
                } else {
                  break L0;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          var6 = null;
          boolean discarded$10 = ((hc) this).a(-48, 8, (byte) 115, -28, 107, (hm) null, -53);
          if (((hc) this).a(param3, param1, param2, false)) {
            ((hc) this).a(param1, param2, param3, 1);
            if (((hc) this).field_z) {
              StringBuilder discarded$11 = param2.append(" active");
              if (((hc) this).field_y) {
                return param2;
              } else {
                StringBuilder discarded$12 = param2.append(" disabled");
                return param2;
              }
            } else {
              L1: {
                if (!((hc) this).field_y) {
                  StringBuilder discarded$13 = param2.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    hc(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 64) {
            hc.j(54);
            return ul.a(500, param0, 123);
        }
        return ul.a(500, param0, 123);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 == -19646) {
          if (null != ((hc) this).field_q) {
            if (!(((hc) this).field_q instanceof qb)) {
              return;
            } else {
              ((qb) (Object) ((hc) this).field_q).a((hc) this, param3, param1, 1, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          ((hc) this).field_A = false;
          if (null != ((hc) this).field_q) {
            if (!(((hc) this).field_q instanceof qb)) {
              return;
            } else {
              ((qb) (Object) ((hc) this).field_q).a((hc) this, param3, param1, 1, param2);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 1) {
            hc.j(-28);
        }
    }

    final boolean h(int param0) {
        if (param0 != 0) {
            ((hc) this).field_y = false;
            return ((hc) this).field_B;
        }
        return ((hc) this).field_B;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        if (((hc) this).field_y) {
          if (((hc) this).a(param1, param3, param4, (byte) 83, param0)) {
            boolean discarded$2 = ((hc) this).a(-4659, param5);
            ((hc) this).field_t = param6;
            if (((hc) this).field_q != null) {
              if (!(((hc) this).field_q instanceof ne)) {
                return true;
              } else {
                ((ne) (Object) ((hc) this).field_q).a(param4, (hc) this, param1, param0, param6, (byte) 105, param3);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param2 != 3) {
              hc.j(15);
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param2 != 3) {
            hc.j(15);
            return false;
          } else {
            return false;
          }
        }
    }

    protected hc() {
        ((hc) this).field_B = false;
        ((hc) this).field_A = true;
        ((hc) this).field_y = true;
        ((hc) this).field_s = mb.field_g.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[128];
    }
}
