/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mea extends ksa {
    boolean field_f;
    static ij field_e;
    qfa field_d;

    abstract void a(int param0, int param1);

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 >= 112) {
                break L1;
              } else {
                mea.a(-5, (byte) 121, 58, -64);
                break L1;
              }
            }
            var2_int = param1.charAt(0);
            var3 = 1;
            L2: while (true) {
              if (param1.length() <= var3) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (var2_int == param1.charAt(var3)) {
                  var3++;
                  continue L2;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("mea.J(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final int d(int param0) {
        if (param0 != 23230) {
            ((mea) this).field_f = false;
            return 1;
        }
        return 1;
    }

    public static void c(int param0) {
        field_e = null;
    }

    abstract void c(byte param0);

    abstract void a(int param0, int param1, int param2);

    int d(byte param0) {
        if (param0 != 7) {
            ((mea) this).a(39, 72);
            return 0;
        }
        return 0;
    }

    final boolean e(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final boolean e(byte param0) {
        if (param0 <= 56) {
            ((mea) this).field_f = false;
            return ((mea) this).field_f;
        }
        return ((mea) this).field_f;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        L0: {
          if (param3 != 0) {
            break L0;
          } else {
            if (param0 != kib.field_d) {
              kib.field_d = param0;
              ebb.field_b = true;
              deb.a(40, param2);
              break L0;
            } else {
              if (param1 > -69) {
                field_e = null;
                if (param3 == 1) {
                  L1: {
                    if (idb.field_p != param0) {
                      ebb.field_b = true;
                      idb.field_p = param0;
                      deb.a(40, param2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (2 == param3) {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (2 == param3) {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L2: {
                  if (param3 != 1) {
                    break L2;
                  } else {
                    if (idb.field_p != param0) {
                      ebb.field_b = true;
                      idb.field_p = param0;
                      deb.a(40, param2);
                      break L2;
                    } else {
                      if (2 == param3) {
                        if (lla.field_h == param0) {
                          return;
                        } else {
                          ebb.field_b = true;
                          lla.field_h = param0;
                          deb.a(40, param2);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (2 == param3) {
                  if (lla.field_h == param0) {
                    return;
                  } else {
                    ebb.field_b = true;
                    lla.field_h = param0;
                    deb.a(40, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
        }
        if (param1 <= -69) {
          L3: {
            if (param3 != 1) {
              break L3;
            } else {
              if (idb.field_p != param0) {
                ebb.field_b = true;
                idb.field_p = param0;
                deb.a(40, param2);
                break L3;
              } else {
                L4: {
                  if (2 != param3) {
                    break L4;
                  } else {
                    if (lla.field_h != param0) {
                      ebb.field_b = true;
                      lla.field_h = param0;
                      deb.a(40, param2);
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          L5: {
            if (2 != param3) {
              break L5;
            } else {
              if (lla.field_h != param0) {
                ebb.field_b = true;
                lla.field_h = param0;
                deb.a(40, param2);
                break L5;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L6: {
            field_e = null;
            if (param3 != 1) {
              break L6;
            } else {
              if (idb.field_p != param0) {
                ebb.field_b = true;
                idb.field_p = param0;
                deb.a(40, param2);
                break L6;
              } else {
                if (2 == param3) {
                  if (lla.field_h == param0) {
                    return;
                  } else {
                    ebb.field_b = true;
                    lla.field_h = param0;
                    deb.a(40, param2);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L7: {
            if (2 != param3) {
              break L7;
            } else {
              if (lla.field_h != param0) {
                ebb.field_b = true;
                lla.field_h = param0;
                deb.a(40, param2);
                break L7;
              } else {
                return;
              }
            }
          }
          return;
        }
    }

    abstract void a(aia param0, int param1, aia param2, int param3);

    abstract boolean f(int param0);

    abstract boolean a(int param0);

    mea(qfa param0) {
        try {
            ((mea) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mea.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static String a(boolean param0) {
        return qga.field_b.a(-1);
    }

    static {
    }
}
