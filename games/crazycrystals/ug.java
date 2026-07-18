/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ug implements Iterable {
    static String field_a;
    int field_e;
    private jb field_b;
    static String field_d;
    jb[] field_c;

    final static void a(byte param0) {
        try {
            IOException var1 = null;
            RuntimeException var1_ref = null;
            int var1_int = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (null != oi.field_d) {
                    oi.field_d.a((byte) 43);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (null != hc.field_a) {
                    hc.field_a.a(-3);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (null != fj.field_c) {
                    {
                      L4: {
                        fj.field_c.d(-200000001);
                        break L4;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  if (param0 == -127) {
                    break L6;
                  } else {
                    ug.a((byte) 124);
                    break L6;
                  }
                }
                L7: {
                  L8: {
                    if (li.field_d != null) {
                      var1_int = 0;
                      L9: while (true) {
                        if (~var1_int <= ~li.field_d.length) {
                          break L8;
                        } else {
                          if (var3 != 0) {
                            break L7;
                          } else {
                            L10: {
                              if (li.field_d[var1_int] == null) {
                                break L10;
                              } else {
                                {
                                  L11: {
                                    li.field_d[var1_int].d(-200000001);
                                    break L11;
                                  }
                                }
                                break L10;
                              }
                            }
                            var1_int++;
                            if (var3 == 0) {
                              continue L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  break L7;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw dn.a((Throwable) (Object) var1_ref, "ug.B(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        RuntimeException var1 = null;
        ii stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        ii stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = new ii((ug) this);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "ug.iterator()");
        }
        return (Iterator) (Object) stackIn_1_0;
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_d = null;
              if (param0 == 32) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "ug.C(" + param0 + ')');
        }
    }

    final static String a(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        Object stackOut_2_0 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var1_ref = "(" + fl.field_m + " " + ea.field_n + " " + qn.field_u + ") " + bf.field_b;
            if (param0 == -1815) {
              L1: {
                L2: {
                  if (rk.field_b <= 0) {
                    break L2;
                  } else {
                    var1_ref = var1_ref + ":";
                    var2 = 0;
                    L3: while (true) {
                      if (~rk.field_b >= ~var2) {
                        break L2;
                      } else {
                        stackOut_7_0 = var1_ref + ' ';
                        stackIn_22_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var5 != 0) {
                          break L1;
                        } else {
                          L4: {
                            L5: {
                              var1_ref = stackIn_8_0;
                              var3 = kd.field_n.field_h[var2] & 255;
                              var4 = var3 >> 1055252964;
                              var3 = var3 & 15;
                              if (var4 >= 10) {
                                break L5;
                              } else {
                                var4 += 48;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var4 += 55;
                            break L4;
                          }
                          L6: {
                            L7: {
                              var1_ref = var1_ref + (char)var4;
                              if (10 <= var3) {
                                break L7;
                              } else {
                                var3 += 48;
                                if (var5 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 += 55;
                            break L6;
                          }
                          var1_ref = var1_ref + (char)var3;
                          var2++;
                          if (var5 == 0) {
                            continue L3;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_21_0 = (String) var1_ref;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "ug.E(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final jb a(long param0, int param1) {
        jb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        jb var6 = null;
        int var7 = 0;
        jb stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_9_0 = null;
        Object stackOut_13_0 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            var4 = ((ug) this).field_c[(int)((long)(-1 + ((ug) this).field_e) & param0)];
            var5 = -65 % ((param1 - -31) / 54);
            ((ug) this).field_b = var4.field_b;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == ((ug) this).field_b) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (param0 == ((ug) this).field_b.field_e) {
                        var6 = ((ug) this).field_b;
                        ((ug) this).field_b = ((ug) this).field_b.field_b;
                        stackOut_9_0 = (jb) var6;
                        stackIn_10_0 = stackOut_9_0;
                        return stackIn_10_0;
                      } else {
                        ((ug) this).field_b = ((ug) this).field_b.field_b;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                ((ug) this).field_b = null;
                break L2;
              }
              stackOut_13_0 = null;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var4_ref, "ug.D(" + param0 + ',' + param1 + ')');
        }
        return (jb) (Object) stackIn_14_0;
    }

    private ug() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "ug.<init>()");
        }
    }

    final void a(long param0, byte param1, jb param2) {
        jb var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (null != param2.field_d) {
                param2.a(false);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var5 = ((ug) this).field_c[(int)((long)(-1 + ((ug) this).field_e) & param0)];
              param2.field_b = var5;
              param2.field_d = var5.field_d;
              if (param1 == 42) {
                break L2;
              } else {
                field_a = null;
                break L2;
              }
            }
            param2.field_d.field_b = param2;
            param2.field_b.field_d = param2;
            param2.field_e = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("ug.A(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_d = "Members only";
    }
}
