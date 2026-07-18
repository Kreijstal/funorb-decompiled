/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static String field_a;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mi var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        nf var11 = null;
        mi var12 = null;
        int[] var13 = null;
        hq var14 = null;
        hq var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var12 = id.field_f;
            var2 = var12.h(-11);
            if (var2 != 0) {
              if (1 == var2) {
                var11 = (nf) (Object) ki.field_a.a((byte) 100);
                if (var11 == null) {
                  rm.b((byte) 11);
                  return;
                } else {
                  var11.c(2);
                  break L0;
                }
              } else {
                if (var2 == 2) {
                  var15 = (hq) (Object) mo.field_h.a((byte) 100);
                  if (var15 != null) {
                    var15.field_n = mm.a(8);
                    var15.field_o = true;
                    var15.field_p = var15.field_n[0];
                    var15.c(2);
                    return;
                  } else {
                    rm.b((byte) 100);
                    return;
                  }
                } else {
                  ke.a((Throwable) null, "A1: " + or.a(117), 0);
                  rm.b((byte) 89);
                  return;
                }
              }
            } else {
              var10 = mm.a(8);
              var18 = var10;
              var17 = var18;
              var16 = var17;
              var13 = var16;
              var3 = var13;
              var9 = var10;
              var4 = var9;
              var5 = var12;
              var6 = ((ed) (Object) var5).h(-11);
              var7 = 0;
              L1: while (true) {
                if (var6 <= var7) {
                  var14 = (hq) (Object) mo.field_h.a((byte) 100);
                  if (var14 == null) {
                    rm.b((byte) 88);
                    return;
                  } else {
                    var14.field_o = true;
                    var14.field_n = var3;
                    var14.field_p = var18[0];
                    var14.c(2);
                    return;
                  }
                } else {
                  var9[var7] = ((ed) (Object) var5).b(true);
                  var7++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "p.B(" + -118 + ')');
        }
    }

    final static boolean a(int param0, char param1) {
        if (param1 < 32) {
          if (param1 < 160) {
            L0: {
              if (param1 == 8364) {
                break L0;
              } else {
                if (param1 == 338) {
                  break L0;
                } else {
                  if (param1 == 8212) {
                    break L0;
                  } else {
                    if (param1 == 339) {
                      break L0;
                    } else {
                      if (376 == param1) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
            }
            return true;
          } else {
            if (param1 > 255) {
              L1: {
                if (param1 == 8364) {
                  break L1;
                } else {
                  if (param1 == 338) {
                    break L1;
                  } else {
                    if (param1 == 8212) {
                      break L1;
                    } else {
                      if (param1 == 339) {
                        break L1;
                      } else {
                        if (376 == param1) {
                          break L1;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          if (126 < param1) {
            if (param1 >= 160) {
              if (param1 <= 255) {
                return true;
              } else {
                if (param1 != 8364) {
                  L2: {
                    if (param1 == 338) {
                      break L2;
                    } else {
                      if (param1 == 8212) {
                        break L2;
                      } else {
                        if (param1 == 339) {
                          break L2;
                        } else {
                          if (376 == param1) {
                            break L2;
                          } else {
                            return false;
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              if (param1 != 8364) {
                if (param1 != 338) {
                  L3: {
                    if (param1 == 8212) {
                      break L3;
                    } else {
                      if (param1 == 339) {
                        break L3;
                      } else {
                        if (376 == param1) {
                          break L3;
                        } else {
                          return false;
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0) {
        ch.field_e.i(0);
        if (!(null != bb.field_F)) {
            bb.field_F = new fg(ch.field_e, eg.field_t);
        }
        ch.field_e.b((iq) (Object) bb.field_F, 0);
    }

    public static void b(int param0) {
        if (param0 != 0) {
            p.b(36);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Please remove <%0> from your ignore list first.";
    }
}
