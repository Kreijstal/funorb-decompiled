/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    private int[] field_c;
    private boolean field_d;
    static volatile boolean field_f;
    private int field_e;
    private int field_b;
    static String field_a;

    final static void c(int param0) {
        e.field_S.j(-636330975);
        if (!(vi.field_c != null)) {
            vi.field_c = new sa(e.field_S, ed.field_c);
        }
        e.field_S.a((ga) (Object) vi.field_c, true);
    }

    final int a(int param0, byte param1) {
        if (param0 <= ((rl) this).field_b) {
          if (param1 >= -91) {
            ((rl) this).field_e = -60;
            return ((rl) this).field_c[param0];
          } else {
            return ((rl) this).field_c[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (param1 <= ((rl) this).field_b) {
          L0: {
            if (((rl) this).field_c.length <= param1) {
              this.a(true, param1);
              break L0;
            } else {
              break L0;
            }
          }
          ((rl) this).field_c[param1] = param2;
          if (param0 != 93) {
            ((rl) this).field_e = -58;
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ((rl) this).field_b = param1;
            if (((rl) this).field_c.length <= param1) {
              this.a(true, param1);
              break L1;
            } else {
              break L1;
            }
          }
          ((rl) this).field_c[param1] = param2;
          if (param0 == 93) {
            return;
          } else {
            ((rl) this).field_e = -58;
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, boolean param6, byte param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (param5 == 1) {
                  break L2;
                } else {
                  if (param5 == 14) {
                    break L2;
                  } else {
                    if (param5 == 3) {
                      qk.field_Jb[param5] = (al) (Object) new vj(param5, param6, param0, param2, param1, param3, param8);
                      break L1;
                    } else {
                      if (param5 == 4) {
                        qk.field_Jb[param5] = (al) (Object) new fg(param5, param6, param0, param2, param1, param3, param8);
                        break L1;
                      } else {
                        L3: {
                          if (param5 == 5) {
                            break L3;
                          } else {
                            if (param5 != 6) {
                              if (param5 == 10) {
                                qk.field_Jb[param5] = (al) (Object) new ap(param5, param6, param0, param2, param1, param3, param8);
                                break L1;
                              } else {
                                if (9 != param5) {
                                  if (13 != param5) {
                                    if (param5 != 12) {
                                      qk.field_Jb[param5] = new al(param5, param6, param0, param2, param1, param3, param8);
                                      break L1;
                                    } else {
                                      qk.field_Jb[param5] = (al) (Object) new kl(param5, param6, param0, param2, param1, param3, param8);
                                      break L1;
                                    }
                                  } else {
                                    qk.field_Jb[param5] = (al) (Object) new ac(param5, param6, param0, param2, param1, param3, param8, param4);
                                    break L1;
                                  }
                                } else {
                                  qk.field_Jb[param5] = (al) (Object) new pl(param5, param6, param0, param2, param1, param3, param8, param4);
                                  break L1;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        qk.field_Jb[param5] = (al) (Object) new nl(param5, param6, param0, param2, param1, param3, param8);
                        break L1;
                      }
                    }
                  }
                }
              }
              qk.field_Jb[param5] = (al) (Object) new pg(param5, param6, param0, param2, param1, param3, param8);
              break L1;
            }
            var9_int = 124 / ((param7 - -57) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var9;
            stackOut_23_1 = new StringBuilder().append("rl.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          L5: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param8 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
    }

    final void b(int param0, int param1) {
        if (param0 >= 0) {
          if (((rl) this).field_b >= param0) {
            if (param0 == ((rl) this).field_b) {
              if (param1 != 1) {
                return;
              } else {
                ((rl) this).field_b = ((rl) this).field_b - 1;
                return;
              }
            } else {
              gp.a(((rl) this).field_c, param0 + 1, ((rl) this).field_c, param0, ((rl) this).field_b + -param0);
              if (param1 != 1) {
                return;
              } else {
                ((rl) this).field_b = ((rl) this).field_b - 1;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = -20;
    }

    private final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        var4 = 1;
        var3 = ((rl) this).field_c.length;
        L0: while (true) {
          if (param0 < var3) {
            return var3;
          } else {
            if (!((rl) this).field_d) {
              var3 = var3 + ((rl) this).field_e;
              continue L0;
            } else {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((rl) this).field_e;
                continue L0;
              }
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a(param1, -103)];
        var3 = var4;
        gp.a(((rl) this).field_c, 0, var4, 0, ((rl) this).field_c.length);
        ((rl) this).field_c = var4;
        if (!param0) {
          int discarded$2 = ((rl) this).a(9, (byte) 60);
          return;
        } else {
          return;
        }
    }

    final int a(int param0) {
        if (param0 != 12) {
            ((rl) this).field_e = 102;
            return ((rl) this).field_b + 1;
        }
        return ((rl) this).field_b + 1;
    }

    final void b(int param0, byte param1) {
        if (param1 != -3) {
            return;
        }
        this.a((byte) 93, 1 + ((rl) this).field_b, param0);
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_a = "Error connecting to server. Please try using a different server.";
    }
}
