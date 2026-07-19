/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca {
    static boolean field_b;
    ca field_c;
    long field_d;
    ca field_e;
    static String field_a;

    final static short[] a(short[] param0, int param1, boolean param2, se param3) {
        short[] discarded$1 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        short[] stackIn_20_0 = null;
        short[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_19_0 = null;
        short[] stackOut_22_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4_int = param3.h(param1, 8);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param0 == null) {
                    break L2;
                  } else {
                    if (var4_int != param0.length) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param0 = new short[var4_int];
                break L1;
              }
              L3: {
                var5 = param3.h(4, 8);
                if (!param2) {
                  break L3;
                } else {
                  var9 = (se) null;
                  discarded$1 = ca.a((short[]) null, -25, true, (se) null);
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var6 = (short)param3.h(16, 8);
                    if (0 < var5) {
                      break L6;
                    } else {
                      var7 = 0;
                      L7: while (true) {
                        L8: {
                          if ((var7 ^ -1) <= (var4_int ^ -1)) {
                            break L8;
                          } else {
                            param0[var7] = (short)var6;
                            var7++;
                            if (var8 != 0) {
                              break L5;
                            } else {
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (var8 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L9: while (true) {
                    if ((var7 ^ -1) <= (var4_int ^ -1)) {
                      break L5;
                    } else {
                      stackOut_19_0 = (short[]) (param0);
                      stackIn_23_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (var8 != 0) {
                        break L4;
                      } else {
                        stackIn_20_0[var7] = (short)(var6 + param3.h(var5, 8));
                        var7++;
                        if (var8 == 0) {
                          continue L9;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                stackOut_22_0 = (short[]) (param0);
                stackIn_23_0 = stackOut_22_0;
                break L4;
              }
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var4);
            stackOut_24_1 = new StringBuilder().append("ca.JB(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        return stackIn_23_0;
    }

    public static void a(int param0) {
        if (param0 != 40) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(boolean param0) {
        if (vh.field_n < 2) {
          return 0;
        } else {
          if (!param0) {
            if ((wj.field_m ^ -1) == -1) {
              if (og.field_g.b(-1)) {
                if (!og.field_g.b((byte) 112, "commonui")) {
                  return 40;
                } else {
                  if (am.field_b.b(-1)) {
                    if (am.field_b.b((byte) 111, "commonui")) {
                      if (!wb.field_b.b(-1)) {
                        return 70;
                      } else {
                        if (wb.field_b.c(7715)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            } else {
              if (lf.field_a != null) {
                if (lf.field_a.b(-1)) {
                  if (!lf.field_a.c((byte) -62, "")) {
                    return 29;
                  } else {
                    if (!lf.field_a.b((byte) -113, "")) {
                      return 29;
                    } else {
                      if (!og.field_g.b(-1)) {
                        return 43;
                      } else {
                        if (og.field_g.b((byte) 58, "commonui")) {
                          if (am.field_b.b(-1)) {
                            if (!am.field_b.b((byte) 94, "commonui")) {
                              return 80;
                            } else {
                              if (!wb.field_b.b(-1)) {
                                return 82;
                              } else {
                                if (wb.field_b.c(7715)) {
                                  return 100;
                                } else {
                                  return 86;
                                }
                              }
                            }
                          } else {
                            return 71;
                          }
                        } else {
                          return 57;
                        }
                      }
                    }
                  }
                } else {
                  return 14;
                }
              } else {
                if (!og.field_g.b(-1)) {
                  return 43;
                } else {
                  if (og.field_g.b((byte) 58, "commonui")) {
                    if (am.field_b.b(-1)) {
                      if (!am.field_b.b((byte) 94, "commonui")) {
                        return 80;
                      } else {
                        if (!wb.field_b.b(-1)) {
                          return 82;
                        } else {
                          if (wb.field_b.c(7715)) {
                            return 100;
                          } else {
                            return 86;
                          }
                        }
                      }
                    } else {
                      return 71;
                    }
                  } else {
                    return 57;
                  }
                }
              }
            }
          } else {
            field_b = false;
            if ((wj.field_m ^ -1) == -1) {
              if (og.field_g.b(-1)) {
                if (!og.field_g.b((byte) 112, "commonui")) {
                  return 40;
                } else {
                  if (am.field_b.b(-1)) {
                    if (am.field_b.b((byte) 111, "commonui")) {
                      if (!wb.field_b.b(-1)) {
                        return 70;
                      } else {
                        if (!wb.field_b.c(7715)) {
                          return 80;
                        } else {
                          return 100;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            } else {
              if (lf.field_a != null) {
                if (lf.field_a.b(-1)) {
                  if (!lf.field_a.c((byte) -62, "")) {
                    return 29;
                  } else {
                    if (!lf.field_a.b((byte) -113, "")) {
                      return 29;
                    } else {
                      if (!og.field_g.b(-1)) {
                        return 43;
                      } else {
                        if (og.field_g.b((byte) 58, "commonui")) {
                          if (am.field_b.b(-1)) {
                            if (!am.field_b.b((byte) 94, "commonui")) {
                              return 80;
                            } else {
                              if (!wb.field_b.b(-1)) {
                                return 82;
                              } else {
                                if (!wb.field_b.c(7715)) {
                                  return 86;
                                } else {
                                  return 100;
                                }
                              }
                            }
                          } else {
                            return 71;
                          }
                        } else {
                          return 57;
                        }
                      }
                    }
                  }
                } else {
                  return 14;
                }
              } else {
                if (!og.field_g.b(-1)) {
                  return 43;
                } else {
                  if (og.field_g.b((byte) 58, "commonui")) {
                    if (am.field_b.b(-1)) {
                      if (!am.field_b.b((byte) 94, "commonui")) {
                        return 80;
                      } else {
                        if (!wb.field_b.b(-1)) {
                          return 82;
                        } else {
                          if (!wb.field_b.c(7715)) {
                            return 86;
                          } else {
                            return 100;
                          }
                        }
                      }
                    } else {
                      return 71;
                    }
                  } else {
                    return 57;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        short[] discarded$0 = null;
        if (!(null != this.field_c)) {
            return;
        }
        this.field_c.field_e = this.field_e;
        if (param0 != 57) {
            se var3 = (se) null;
            discarded$0 = ca.a((short[]) null, 120, true, (se) null);
            this.field_e.field_c = this.field_c;
            this.field_e = null;
            this.field_c = null;
            return;
        }
        this.field_e.field_c = this.field_c;
        this.field_e = null;
        this.field_c = null;
    }

    final boolean b(boolean param0) {
        if (!(null != this.field_c)) {
            return false;
        }
        if (!param0) {
            ca.a(-7);
            return true;
        }
        return true;
    }

    static {
        field_a = "Max Bolts";
    }
}
