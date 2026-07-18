/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends hd {
    private hd field_Cb;
    private hd field_Db;
    private int field_Fb;
    static boolean field_Eb;
    private StringBuilder field_yb;
    static String field_zb;
    static String field_Ab;
    static String field_Bb;

    sl(int param0, int param1, int param2, int param3, String param4, hd param5, hd param6, hd param7) {
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
        ((sl) this).field_Fb = 0;
        try {
          L0: {
            ((sl) this).field_Cb = new hd(0L, param6, param4);
            ((sl) this).a((byte) -124, ((sl) this).field_Cb);
            ((sl) this).field_Db = new hd(0L, param7);
            ((sl) this).field_Db.field_y = 16764006;
            ((sl) this).a((byte) -116, ((sl) this).field_Db);
            ((sl) this).field_Db.field_V = "|";
            ((sl) this).field_yb = new StringBuilder(12);
            var9_int = ((sl) this).field_Cb.g((byte) 116);
            ((sl) this).field_Cb.a(true, var9_int, 5, 3, sh.field_c);
            ((sl) this).field_Db.a(true, var9_int, 5, sh.field_c + 3, sh.field_c);
            var10 = 5 + var9_int + 5;
            var11 = 3 + (sh.field_c * 2 + 3);
            var12 = ou.b(var10, param0, param2, 127);
            int discarded$1 = 29079;
            var13 = nj.a(param1, param3, var11);
            ((sl) this).a(true, var10, var12, var13, var11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("sl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        int var4 = 0;
        var4 = Kickabout.field_G;
        ((sl) this).b(0, param1);
        if (!param1) {
          if (param0 != 84) {
            L0: {
              ((sl) this).field_Fb = 41;
              ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
              if (!param1) {
                break L0;
              } else {
                if (wj.field_A == 0) {
                  break L0;
                } else {
                  if (((sl) this).field_sb == 0) {
                    ((sl) this).field_Fb = 1;
                    break L0;
                  } else {
                    return ((sl) this).field_Fb;
                  }
                }
              }
            }
            return ((sl) this).field_Fb;
          } else {
            L1: {
              ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
              if (!param1) {
                break L1;
              } else {
                if (wj.field_A == 0) {
                  break L1;
                } else {
                  if (((sl) this).field_sb == 0) {
                    ((sl) this).field_Fb = 1;
                    break L1;
                  } else {
                    return ((sl) this).field_Fb;
                  }
                }
              }
            }
            return ((sl) this).field_Fb;
          }
        } else {
          L2: while (true) {
            if (!nk.b((byte) -59)) {
              if (param0 == 84) {
                L3: {
                  ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
                  if (!param1) {
                    break L3;
                  } else {
                    if (wj.field_A == 0) {
                      break L3;
                    } else {
                      if (((sl) this).field_sb == 0) {
                        ((sl) this).field_Fb = 1;
                        break L3;
                      } else {
                        return ((sl) this).field_Fb;
                      }
                    }
                  }
                }
                return ((sl) this).field_Fb;
              } else {
                L4: {
                  ((sl) this).field_Fb = 41;
                  ((sl) this).field_Db.field_E = ((sl) this).field_yb.toString();
                  if (!param1) {
                    break L4;
                  } else {
                    if (wj.field_A == 0) {
                      break L4;
                    } else {
                      if (((sl) this).field_sb == 0) {
                        ((sl) this).field_Fb = 1;
                        break L4;
                      } else {
                        return ((sl) this).field_Fb;
                      }
                    }
                  }
                }
                return ((sl) this).field_Fb;
              }
            } else {
              L5: {
                if (cc.field_e != 85) {
                  break L5;
                } else {
                  if (0 < ((sl) this).field_yb.length()) {
                    StringBuilder discarded$5 = dj.a(-1 + ((sl) this).field_yb.length(), ' ', -11407, ((sl) this).field_yb);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (id.a(false, (CharSequence) (Object) ((sl) this).field_yb, il.field_c)) {
                  StringBuilder discarded$6 = ((sl) this).field_yb.append(il.field_c);
                  break L6;
                } else {
                  L7: {
                    if (((sl) this).field_yb.length() != 0) {
                      break L7;
                    } else {
                      if (91 == il.field_c) {
                        StringBuilder discarded$7 = ((sl) this).field_yb.append(il.field_c);
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (((sl) this).field_yb.length() != 1) {
                      break L8;
                    } else {
                      if (35 == il.field_c) {
                        StringBuilder discarded$8 = ((sl) this).field_yb.append(il.field_c);
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (93 != il.field_c) {
                    break L6;
                  } else {
                    StringBuilder discarded$9 = ((sl) this).field_yb.append(il.field_c);
                    break L6;
                  }
                }
              }
              if (cc.field_e == 84) {
                if (0 < ((sl) this).field_yb.length()) {
                  ((sl) this).field_E = ((sl) this).field_yb.toString();
                  return 2;
                } else {
                  return 1;
                }
              } else {
                if (cc.field_e != 13) {
                  continue L2;
                } else {
                  return 1;
                }
              }
            }
          }
        }
    }

    public static void i(byte param0) {
        field_Bb = null;
        field_zb = null;
        field_Ab = null;
        if (param0 == 39) {
            return;
        }
        sl.i((byte) 36);
    }

    final boolean h(byte param0) {
        int var2 = 0;
        if (((sl) this).field_Fb == 0) {
          if (cc.field_e == 85) {
            if (-1 > ((sl) this).field_yb.length()) {
              StringBuilder discarded$13 = dj.a(((sl) this).field_yb.length() + -1, ' ', -11407, ((sl) this).field_yb);
              if (((sl) this).field_yb.length() < 12) {
                L0: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L0;
                      } else {
                        StringBuilder discarded$14 = ((sl) this).field_yb.append((char) var2);
                        break L0;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L0;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L0;
                      } else {
                        StringBuilder discarded$15 = ((sl) this).field_yb.append((char) var2);
                        break L0;
                      }
                    }
                  }
                }
                if (!se.a((byte) -118, (char) var2)) {
                  if (gn.a(12105, (char) var2)) {
                    StringBuilder discarded$16 = ((sl) this).field_yb.append((char) var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      } else {
                        L1: {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          if (cc.field_e != 13) {
                            break L1;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L1;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (cc.field_e != 13) {
                        return true;
                      } else {
                        ((sl) this).field_Fb = 1;
                        return true;
                      }
                    }
                  } else {
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        if (cc.field_e != 13) {
                          return true;
                        } else {
                          ((sl) this).field_Fb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (cc.field_e == 13) {
                        ((sl) this).field_Fb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  L2: {
                    StringBuilder discarded$17 = ((sl) this).field_yb.append((char) var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L2;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (cc.field_e != 13) {
                      break L3;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L3;
                    }
                  }
                  return true;
                }
              } else {
                var2 = -60 % ((-76 - param0) / 48);
                if (cc.field_e == 84) {
                  if (0 >= ((sl) this).field_yb.length()) {
                    ((sl) this).field_Fb = 1;
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  } else {
                    ((sl) this).field_E = ((sl) this).field_yb.toString();
                    ((sl) this).field_Fb = 2;
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  }
                } else {
                  if (cc.field_e != 13) {
                    return true;
                  } else {
                    ((sl) this).field_Fb = 1;
                    return true;
                  }
                }
              }
            } else {
              if (-13 > ((sl) this).field_yb.length()) {
                L4: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L4;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L4;
                      } else {
                        StringBuilder discarded$18 = ((sl) this).field_yb.append((char) var2);
                        break L4;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L4;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L4;
                      } else {
                        StringBuilder discarded$19 = ((sl) this).field_yb.append((char) var2);
                        break L4;
                      }
                    }
                  }
                }
                if (!se.a((byte) -118, (char) var2)) {
                  if (gn.a(12105, (char) var2)) {
                    L5: {
                      StringBuilder discarded$20 = ((sl) this).field_yb.append((char) var2);
                      var2 = -60 % ((-76 - param0) / 48);
                      if (cc.field_e == 84) {
                        if (0 >= ((sl) this).field_yb.length()) {
                          ((sl) this).field_Fb = 1;
                          break L5;
                        } else {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (cc.field_e != 13) {
                      return true;
                    } else {
                      ((sl) this).field_Fb = 1;
                      return true;
                    }
                  } else {
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 < ((sl) this).field_yb.length()) {
                        L6: {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          if (cc.field_e != 13) {
                            break L6;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L6;
                          }
                        }
                        return true;
                      } else {
                        L7: {
                          ((sl) this).field_Fb = 1;
                          if (cc.field_e != 13) {
                            break L7;
                          } else {
                            ((sl) this).field_Fb = 1;
                            break L7;
                          }
                        }
                        return true;
                      }
                    } else {
                      L8: {
                        if (cc.field_e != 13) {
                          break L8;
                        } else {
                          ((sl) this).field_Fb = 1;
                          break L8;
                        }
                      }
                      return true;
                    }
                  }
                } else {
                  L9: {
                    StringBuilder discarded$21 = ((sl) this).field_yb.append((char) var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L9;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (cc.field_e != 13) {
                      break L10;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L10;
                    }
                  }
                  return true;
                }
              } else {
                var2 = -60 % ((-76 - param0) / 48);
                if (cc.field_e == 84) {
                  if (0 < ((sl) this).field_yb.length()) {
                    L11: {
                      ((sl) this).field_E = ((sl) this).field_yb.toString();
                      ((sl) this).field_Fb = 2;
                      if (cc.field_e != 13) {
                        break L11;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L11;
                      }
                    }
                    return true;
                  } else {
                    L12: {
                      ((sl) this).field_Fb = 1;
                      if (cc.field_e != 13) {
                        break L12;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L12;
                      }
                    }
                    return true;
                  }
                } else {
                  L13: {
                    if (cc.field_e != 13) {
                      break L13;
                    } else {
                      ((sl) this).field_Fb = 1;
                      break L13;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L14: {
              if (((sl) this).field_yb.length() < 12) {
                L15: {
                  var2 = Character.toLowerCase(il.field_c);
                  if (32 != var2) {
                    if (var2 != 95) {
                      break L15;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L15;
                      } else {
                        StringBuilder discarded$22 = ((sl) this).field_yb.append((char) var2);
                        break L15;
                      }
                    }
                  } else {
                    if (var2 != 95) {
                      break L15;
                    } else {
                      if (((sl) this).field_yb.length() <= 0) {
                        break L15;
                      } else {
                        StringBuilder discarded$23 = ((sl) this).field_yb.append((char) var2);
                        break L15;
                      }
                    }
                  }
                }
                if (se.a((byte) -118, (char) var2)) {
                  L16: {
                    StringBuilder discarded$24 = ((sl) this).field_yb.append((char) var2);
                    var2 = -60 % ((-76 - param0) / 48);
                    if (cc.field_e == 84) {
                      if (0 >= ((sl) this).field_yb.length()) {
                        ((sl) this).field_Fb = 1;
                        break L16;
                      } else {
                        ((sl) this).field_E = ((sl) this).field_yb.toString();
                        ((sl) this).field_Fb = 2;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  if (cc.field_e == 13) {
                    ((sl) this).field_Fb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!gn.a(12105, (char) var2)) {
                    break L14;
                  } else {
                    L17: {
                      StringBuilder discarded$25 = ((sl) this).field_yb.append((char) var2);
                      var2 = -60 % ((-76 - param0) / 48);
                      if (cc.field_e == 84) {
                        if (0 >= ((sl) this).field_yb.length()) {
                          ((sl) this).field_Fb = 1;
                          break L17;
                        } else {
                          ((sl) this).field_E = ((sl) this).field_yb.toString();
                          ((sl) this).field_Fb = 2;
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    L18: {
                      if (cc.field_e != 13) {
                        break L18;
                      } else {
                        ((sl) this).field_Fb = 1;
                        break L18;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L14;
              }
            }
            var2 = -60 % ((-76 - param0) / 48);
            if (cc.field_e == 84) {
              if (0 < ((sl) this).field_yb.length()) {
                L19: {
                  ((sl) this).field_E = ((sl) this).field_yb.toString();
                  ((sl) this).field_Fb = 2;
                  if (cc.field_e != 13) {
                    break L19;
                  } else {
                    ((sl) this).field_Fb = 1;
                    break L19;
                  }
                }
                return true;
              } else {
                L20: {
                  ((sl) this).field_Fb = 1;
                  if (cc.field_e != 13) {
                    break L20;
                  } else {
                    ((sl) this).field_Fb = 1;
                    break L20;
                  }
                }
                return true;
              }
            } else {
              L21: {
                if (cc.field_e != 13) {
                  break L21;
                } else {
                  ((sl) this).field_Fb = 1;
                  break L21;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Eb = true;
        field_Bb = "To report a player, right-click on their name and select the option to report abuse.";
        field_zb = "Rankings";
        field_Ab = "ready";
    }
}
