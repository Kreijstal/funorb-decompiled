/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends gh {
    static String field_Zb;
    static wk field_Ub;
    static wk field_ac;
    private int field_Yb;
    static byte[][] field_Sb;
    static String[] field_Vb;
    private gh field_Xb;
    private gh field_Tb;
    private StringBuilder field_Wb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean d(byte param0) {
        int var2 = 0;
        if (param0 == 76) {
          if (((el) this).field_Yb == 0) {
            if (ei.field_q == 85) {
              L0: {
                if (0 < ((el) this).field_Wb.length()) {
                  StringBuilder discarded$7 = dm.a(' ', 200, ((el) this).field_Wb, ((el) this).field_Wb.length() + -1);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((el) this).field_Wb.length() < 12) {
                L1: {
                  var2 = Character.toLowerCase(de.field_c);
                  if (var2 != 32) {
                    break L1;
                  } else {
                    var2 = 95;
                    break L1;
                  }
                }
                L2: {
                  if (95 != var2) {
                    break L2;
                  } else {
                    if (((el) this).field_Wb.length() > 0) {
                      StringBuilder discarded$8 = ((el) this).field_Wb.append((char) var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (kf.a((char) var2, (byte) 120)) {
                  L3: {
                    StringBuilder discarded$9 = ((el) this).field_Wb.append((char) var2);
                    if (ei.field_q == 84) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        break L3;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (13 != ei.field_q) {
                      break L4;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L4;
                    }
                  }
                  return true;
                } else {
                  if (!oa.a(-4278, (char) var2)) {
                    if (ei.field_q == 84) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          ((el) this).field_Yb = 1;
                          return true;
                        }
                      } else {
                        ((el) this).field_Yb = 1;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          ((el) this).field_Yb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (13 != ei.field_q) {
                        return true;
                      } else {
                        ((el) this).field_Yb = 1;
                        return true;
                      }
                    }
                  } else {
                    StringBuilder discarded$10 = ((el) this).field_Wb.append((char) var2);
                    if (ei.field_q == 84) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          ((el) this).field_Yb = 1;
                          return true;
                        }
                      } else {
                        L5: {
                          ((el) this).field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L5;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L5;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (13 != ei.field_q) {
                        return true;
                      } else {
                        ((el) this).field_Yb = 1;
                        return true;
                      }
                    }
                  }
                }
              } else {
                if (ei.field_q == 84) {
                  if (0 < ((el) this).field_Wb.length()) {
                    L6: {
                      ((el) this).field_S = ((el) this).field_Wb.toString();
                      ((el) this).field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L6;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L6;
                      }
                    }
                    return true;
                  } else {
                    L7: {
                      ((el) this).field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L7;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L7;
                      }
                    }
                    return true;
                  }
                } else {
                  L8: {
                    if (13 != ei.field_q) {
                      break L8;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L8;
                    }
                  }
                  return true;
                }
              }
            } else {
              if (((el) this).field_Wb.length() < 12) {
                L9: {
                  var2 = Character.toLowerCase(de.field_c);
                  if (var2 != 32) {
                    break L9;
                  } else {
                    var2 = 95;
                    break L9;
                  }
                }
                L10: {
                  if (95 != var2) {
                    break L10;
                  } else {
                    if (((el) this).field_Wb.length() > 0) {
                      StringBuilder discarded$11 = ((el) this).field_Wb.append((char) var2);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (kf.a((char) var2, (byte) 120)) {
                  L11: {
                    StringBuilder discarded$12 = ((el) this).field_Wb.append((char) var2);
                    if (ei.field_q == 84) {
                      if (0 < ((el) this).field_Wb.length()) {
                        ((el) this).field_S = ((el) this).field_Wb.toString();
                        ((el) this).field_Yb = 2;
                        break L11;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (13 != ei.field_q) {
                      break L12;
                    } else {
                      ((el) this).field_Yb = 1;
                      break L12;
                    }
                  }
                  return true;
                } else {
                  if (oa.a(-4278, (char) var2)) {
                    L13: {
                      StringBuilder discarded$13 = ((el) this).field_Wb.append((char) var2);
                      if (ei.field_q == 84) {
                        if (0 < ((el) this).field_Wb.length()) {
                          ((el) this).field_S = ((el) this).field_Wb.toString();
                          ((el) this).field_Yb = 2;
                          break L13;
                        } else {
                          ((el) this).field_Yb = 1;
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (13 != ei.field_q) {
                        break L14;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L14;
                      }
                    }
                    return true;
                  } else {
                    if (ei.field_q == 84) {
                      if (0 < ((el) this).field_Wb.length()) {
                        L15: {
                          ((el) this).field_S = ((el) this).field_Wb.toString();
                          ((el) this).field_Yb = 2;
                          if (13 != ei.field_q) {
                            break L15;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L15;
                          }
                        }
                        return true;
                      } else {
                        L16: {
                          ((el) this).field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L16;
                          } else {
                            ((el) this).field_Yb = 1;
                            break L16;
                          }
                        }
                        return true;
                      }
                    } else {
                      L17: {
                        if (13 != ei.field_q) {
                          break L17;
                        } else {
                          ((el) this).field_Yb = 1;
                          break L17;
                        }
                      }
                      return true;
                    }
                  }
                }
              } else {
                if (ei.field_q == 84) {
                  if (0 < ((el) this).field_Wb.length()) {
                    L18: {
                      ((el) this).field_S = ((el) this).field_Wb.toString();
                      ((el) this).field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L18;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L18;
                      }
                    }
                    return true;
                  } else {
                    L19: {
                      ((el) this).field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L19;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L19;
                      }
                    }
                    return true;
                  }
                } else {
                  if (13 != ei.field_q) {
                    return true;
                  } else {
                    ((el) this).field_Yb = 1;
                    return true;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        ((el) this).a((byte) 108, param1);
        if (!param1) {
          if (param0 == -2) {
            L0: {
              ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
              if (!param1) {
                break L0;
              } else {
                if (lb.field_gc == 0) {
                  break L0;
                } else {
                  if (((el) this).field_Eb != 0) {
                    break L0;
                  } else {
                    ((el) this).field_Yb = 1;
                    return ((el) this).field_Yb;
                  }
                }
              }
            }
            return ((el) this).field_Yb;
          } else {
            field_Vb = null;
            ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
            if (param1) {
              if (lb.field_gc != 0) {
                if (((el) this).field_Eb == 0) {
                  ((el) this).field_Yb = 1;
                  return ((el) this).field_Yb;
                } else {
                  return ((el) this).field_Yb;
                }
              } else {
                return ((el) this).field_Yb;
              }
            } else {
              return ((el) this).field_Yb;
            }
          }
        } else {
          L1: while (true) {
            if (dl.f(22759)) {
              L2: {
                if (85 != ei.field_q) {
                  break L2;
                } else {
                  if (((el) this).field_Wb.length() > 0) {
                    StringBuilder discarded$6 = dm.a(' ', 200, ((el) this).field_Wb, -1 + ((el) this).field_Wb.length());
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                int discarded$7 = -99;
                if (fj.a(de.field_c, (CharSequence) (Object) ((el) this).field_Wb)) {
                  StringBuilder discarded$8 = ((el) this).field_Wb.append(de.field_c);
                  break L3;
                } else {
                  L4: {
                    if (((el) this).field_Wb.length() != 0) {
                      break L4;
                    } else {
                      if (91 == de.field_c) {
                        StringBuilder discarded$9 = ((el) this).field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (((el) this).field_Wb.length() != 1) {
                      break L5;
                    } else {
                      if (35 == de.field_c) {
                        StringBuilder discarded$10 = ((el) this).field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (de.field_c != 93) {
                    break L3;
                  } else {
                    StringBuilder discarded$11 = ((el) this).field_Wb.append(de.field_c);
                    break L3;
                  }
                }
              }
              if (ei.field_q != 84) {
                if (13 != ei.field_q) {
                  continue L1;
                } else {
                  return 1;
                }
              } else {
                if (((el) this).field_Wb.length() <= 0) {
                  return 1;
                } else {
                  ((el) this).field_S = ((el) this).field_Wb.toString();
                  return 2;
                }
              }
            } else {
              if (param0 == -2) {
                L6: {
                  ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
                  if (!param1) {
                    break L6;
                  } else {
                    if (lb.field_gc == 0) {
                      break L6;
                    } else {
                      if (((el) this).field_Eb != 0) {
                        break L6;
                      } else {
                        ((el) this).field_Yb = 1;
                        return ((el) this).field_Yb;
                      }
                    }
                  }
                }
                return ((el) this).field_Yb;
              } else {
                L7: {
                  field_Vb = null;
                  ((el) this).field_Tb.field_S = ((el) this).field_Wb.toString();
                  if (!param1) {
                    break L7;
                  } else {
                    if (lb.field_gc == 0) {
                      break L7;
                    } else {
                      if (((el) this).field_Eb != 0) {
                        break L7;
                      } else {
                        ((el) this).field_Yb = 1;
                        break L7;
                      }
                    }
                  }
                }
                return ((el) this).field_Yb;
              }
            }
          }
        }
    }

    el(int param0, int param1, int param2, int param3, String param4, gh param5, gh param6, gh param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((el) this).field_Yb = 0;
        try {
          L0: {
            ((el) this).field_Xb = new gh(0L, param6, param4);
            ((el) this).a(((el) this).field_Xb, 124);
            ((el) this).field_Tb = new gh(0L, param7);
            ((el) this).field_Tb.field_nb = 16764006;
            ((el) this).a(((el) this).field_Tb, 123);
            ((el) this).field_Tb.field_Db = "|";
            ((el) this).field_Wb = new StringBuilder(12);
            var9_int = ((el) this).field_Xb.g(-2147483648);
            ((el) this).field_Xb.a(0, 3, db.field_b, 5, var9_int);
            ((el) this).field_Tb.a(0, 3 - -db.field_b, db.field_b, 5, var9_int);
            var10 = var9_int + 10;
            var11 = 3 + (2 * db.field_b - -3);
            var12 = dl.a(param2, 127, param0, var10);
            var13 = ol.a(param1, 0, param3, var11);
            ((el) this).a(0, var13, var11, var12, var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("el.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public static void b() {
        field_Sb = null;
        field_Zb = null;
        field_ac = null;
        field_Vb = null;
        field_Ub = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Passwords must be between 5 and 20 characters long";
        field_Vb = new String[]{"YES", "NO"};
        field_Sb = new byte[][]{new byte[8], new byte[6], new byte[8], new byte[8], new byte[8], new byte[10], new byte[8], new byte[8], new byte[8], new byte[8], new byte[8], new byte[8], new byte[6], new byte[6], new byte[8], new byte[6], new byte[8], new byte[8], new byte[10], new byte[8], new byte[8], new byte[8], new byte[0], new byte[0], new byte[0], new byte[0], new byte[6], new byte[8], new byte[8], new byte[8], new byte[8], new byte[10], new byte[10], new byte[8], new byte[8], new byte[8]};
    }
}
