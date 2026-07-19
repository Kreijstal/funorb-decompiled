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
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        int var2 = 0;
        if (param0 == 76) {
          if (this.field_Yb == 0) {
            if (ei.field_q == 85) {
              L0: {
                if (0 < this.field_Wb.length()) {
                  discarded$7 = dm.a(' ', 200, this.field_Wb, this.field_Wb.length() + -1);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-13 < (this.field_Wb.length() ^ -1)) {
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
                    if ((this.field_Wb.length() ^ -1) < -1) {
                      discarded$8 = this.field_Wb.append((char) var2);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                if (kf.a((char) var2, (byte) 120)) {
                  L3: {
                    discarded$9 = this.field_Wb.append((char) var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < this.field_Wb.length()) {
                        this.field_S = this.field_Wb.toString();
                        this.field_Yb = 2;
                        break L3;
                      } else {
                        this.field_Yb = 1;
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
                      this.field_Yb = 1;
                      break L4;
                    }
                  }
                  return true;
                } else {
                  if (!oa.a(-4278, (char) var2)) {
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < this.field_Wb.length()) {
                        this.field_S = this.field_Wb.toString();
                        this.field_Yb = 2;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          this.field_Yb = 1;
                          return true;
                        }
                      } else {
                        this.field_Yb = 1;
                        if (13 != ei.field_q) {
                          return true;
                        } else {
                          this.field_Yb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (13 != ei.field_q) {
                        return true;
                      } else {
                        this.field_Yb = 1;
                        return true;
                      }
                    }
                  } else {
                    discarded$10 = this.field_Wb.append((char) var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < this.field_Wb.length()) {
                        this.field_S = this.field_Wb.toString();
                        this.field_Yb = 2;
                        if (13 == ei.field_q) {
                          this.field_Yb = 1;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        L5: {
                          this.field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L5;
                          } else {
                            this.field_Yb = 1;
                            break L5;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (13 == ei.field_q) {
                        this.field_Yb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                }
              } else {
                if (-85 == (ei.field_q ^ -1)) {
                  if (0 >= this.field_Wb.length()) {
                    L6: {
                      this.field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L6;
                      } else {
                        this.field_Yb = 1;
                        break L6;
                      }
                    }
                    return true;
                  } else {
                    L7: {
                      this.field_S = this.field_Wb.toString();
                      this.field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L7;
                      } else {
                        this.field_Yb = 1;
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
                      this.field_Yb = 1;
                      break L8;
                    }
                  }
                  return true;
                }
              }
            } else {
              if (-13 < (this.field_Wb.length() ^ -1)) {
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
                    if ((this.field_Wb.length() ^ -1) < -1) {
                      discarded$11 = this.field_Wb.append((char) var2);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                if (!kf.a((char) var2, (byte) 120)) {
                  if (!oa.a(-4278, (char) var2)) {
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 >= this.field_Wb.length()) {
                        L11: {
                          this.field_Yb = 1;
                          if (13 != ei.field_q) {
                            break L11;
                          } else {
                            this.field_Yb = 1;
                            break L11;
                          }
                        }
                        return true;
                      } else {
                        L12: {
                          this.field_S = this.field_Wb.toString();
                          this.field_Yb = 2;
                          if (13 != ei.field_q) {
                            break L12;
                          } else {
                            this.field_Yb = 1;
                            break L12;
                          }
                        }
                        return true;
                      }
                    } else {
                      L13: {
                        if (13 != ei.field_q) {
                          break L13;
                        } else {
                          this.field_Yb = 1;
                          break L13;
                        }
                      }
                      return true;
                    }
                  } else {
                    L14: {
                      discarded$12 = this.field_Wb.append((char) var2);
                      if (-85 == (ei.field_q ^ -1)) {
                        if (0 < this.field_Wb.length()) {
                          this.field_S = this.field_Wb.toString();
                          this.field_Yb = 2;
                          break L14;
                        } else {
                          this.field_Yb = 1;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (13 != ei.field_q) {
                        break L15;
                      } else {
                        this.field_Yb = 1;
                        break L15;
                      }
                    }
                    return true;
                  }
                } else {
                  L16: {
                    discarded$13 = this.field_Wb.append((char) var2);
                    if (-85 == (ei.field_q ^ -1)) {
                      if (0 < this.field_Wb.length()) {
                        this.field_S = this.field_Wb.toString();
                        this.field_Yb = 2;
                        break L16;
                      } else {
                        this.field_Yb = 1;
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (13 != ei.field_q) {
                      break L17;
                    } else {
                      this.field_Yb = 1;
                      break L17;
                    }
                  }
                  return true;
                }
              } else {
                if (-85 == (ei.field_q ^ -1)) {
                  if (0 >= this.field_Wb.length()) {
                    L18: {
                      this.field_Yb = 1;
                      if (13 != ei.field_q) {
                        break L18;
                      } else {
                        this.field_Yb = 1;
                        break L18;
                      }
                    }
                    return true;
                  } else {
                    L19: {
                      this.field_S = this.field_Wb.toString();
                      this.field_Yb = 2;
                      if (13 != ei.field_q) {
                        break L19;
                      } else {
                        this.field_Yb = 1;
                        break L19;
                      }
                    }
                    return true;
                  }
                } else {
                  if (13 == ei.field_q) {
                    this.field_Yb = 1;
                    return true;
                  } else {
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
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        this.a((byte) 108, param1);
        if (!param1) {
          if (param0 == -2) {
            L0: {
              this.field_Tb.field_S = this.field_Wb.toString();
              if (!param1) {
                break L0;
              } else {
                if (lb.field_gc == 0) {
                  break L0;
                } else {
                  if (this.field_Eb != 0) {
                    break L0;
                  } else {
                    this.field_Yb = 1;
                    return this.field_Yb;
                  }
                }
              }
            }
            return this.field_Yb;
          } else {
            field_Vb = (String[]) null;
            this.field_Tb.field_S = this.field_Wb.toString();
            if (param1) {
              if (lb.field_gc != 0) {
                if (this.field_Eb != 0) {
                  return this.field_Yb;
                } else {
                  this.field_Yb = 1;
                  return this.field_Yb;
                }
              } else {
                return this.field_Yb;
              }
            } else {
              return this.field_Yb;
            }
          }
        } else {
          L1: while (true) {
            if (dl.f(22759)) {
              L2: {
                if (85 != ei.field_q) {
                  break L2;
                } else {
                  if (-1 > (this.field_Wb.length() ^ -1)) {
                    discarded$5 = dm.a(' ', 200, this.field_Wb, -1 + this.field_Wb.length());
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (fj.a(de.field_c, (CharSequence) ((Object) this.field_Wb), -99)) {
                  discarded$6 = this.field_Wb.append(de.field_c);
                  break L3;
                } else {
                  L4: {
                    if (this.field_Wb.length() != 0) {
                      break L4;
                    } else {
                      if (91 == de.field_c) {
                        discarded$7 = this.field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if ((this.field_Wb.length() ^ -1) != -2) {
                      break L5;
                    } else {
                      if (35 == de.field_c) {
                        discarded$8 = this.field_Wb.append(de.field_c);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (de.field_c != 93) {
                    break L3;
                  } else {
                    discarded$9 = this.field_Wb.append(de.field_c);
                    break L3;
                  }
                }
              }
              if (-85 != (ei.field_q ^ -1)) {
                if (13 != ei.field_q) {
                  continue L1;
                } else {
                  return 1;
                }
              } else {
                if (-1 > (this.field_Wb.length() ^ -1)) {
                  this.field_S = this.field_Wb.toString();
                  return 2;
                } else {
                  return 1;
                }
              }
            } else {
              if (param0 == -2) {
                this.field_Tb.field_S = this.field_Wb.toString();
                if (param1) {
                  if (lb.field_gc != 0) {
                    if (this.field_Eb == 0) {
                      this.field_Yb = 1;
                      return this.field_Yb;
                    } else {
                      return this.field_Yb;
                    }
                  } else {
                    return this.field_Yb;
                  }
                } else {
                  return this.field_Yb;
                }
              } else {
                L6: {
                  field_Vb = (String[]) null;
                  this.field_Tb.field_S = this.field_Wb.toString();
                  if (!param1) {
                    break L6;
                  } else {
                    if (lb.field_gc == 0) {
                      break L6;
                    } else {
                      if (this.field_Eb != 0) {
                        break L6;
                      } else {
                        this.field_Yb = 1;
                        break L6;
                      }
                    }
                  }
                }
                return this.field_Yb;
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
        this.field_Yb = 0;
        try {
          L0: {
            this.field_Xb = new gh(0L, param6, param4);
            this.a(this.field_Xb, 124);
            this.field_Tb = new gh(0L, param7);
            this.field_Tb.field_nb = 16764006;
            this.a(this.field_Tb, 123);
            this.field_Tb.field_Db = "|";
            this.field_Wb = new StringBuilder(12);
            var9_int = this.field_Xb.g(-2147483648);
            this.field_Xb.a(0, 3, db.field_b, 5, var9_int);
            this.field_Tb.a(0, 3 - -db.field_b, db.field_b, 5, var9_int);
            var10 = var9_int + 10;
            var11 = 3 + (2 * db.field_b - -3);
            var12 = dl.a(param2, 127, param0, var10);
            var13 = ol.a(param1, 0, param3, var11);
            this.a(0, var13, var11, var12, var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var9);
            stackOut_3_1 = new StringBuilder().append("el.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void b(boolean param0) {
        field_Sb = (byte[][]) null;
        if (!param0) {
            return;
        }
        field_Zb = null;
        field_ac = null;
        field_Vb = null;
        field_Ub = null;
    }

    static {
        field_Zb = "Passwords must be between 5 and 20 characters long";
        field_Vb = new String[]{"YES", "NO"};
        field_Sb = new byte[][]{new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)5, (byte)5, (byte) 2}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 6, (byte) 1}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 5, (byte) 5, (byte) 2}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)2, (byte)4, (byte) 4, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte)2, (byte)3, (byte) 2, (byte) 4, (byte) 3, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)4, (byte)3, (byte) 1, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)4, (byte)3, (byte) 2, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)3, (byte)3, (byte) 3, (byte) 8, (byte) 3}, new byte[]{(byte) 0, (byte)2, (byte)2, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)3, (byte)4, (byte) 5, (byte) 8, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)4, (byte)3, (byte) 2, (byte) 5, (byte) 1}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)5, (byte)5, (byte) 2}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)3, (byte)6, (byte) 1}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)3, (byte) 1, (byte) 6, (byte) 2}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)6, (byte) 2}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 4, (byte) 5, (byte) 3}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)2, (byte)4, (byte) 3, (byte) 7, (byte) 2}, new byte[]{(byte) 0, (byte)2, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 4, (byte) 2, (byte) 7, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)2, (byte)3, (byte) 4, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte)2, (byte)3, (byte) 3, (byte) 6, (byte) 4}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)4, (byte)4, (byte) 3, (byte) 8, (byte) 2}, new byte[]{}, new byte[]{}, new byte[]{}, new byte[]{}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)5, (byte)5, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)3, (byte)3, (byte) 2, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)4, (byte) 1, (byte)2, (byte)3, (byte) 2, (byte) 6, (byte) 3}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte)3, (byte)4, (byte) 3, (byte) 5, (byte) 4}, new byte[]{(byte) 0, (byte)5, (byte) 1, (byte) 1, (byte)4, (byte) 1, (byte) 7, (byte) 3}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte)2, (byte)3, (byte) 3, (byte) 4, (byte) 0, (byte) 7, (byte) 5}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte) 0, (byte)3, (byte) 5, (byte) 6, (byte) 5, (byte) 8, (byte) 4}, new byte[]{(byte) 0, (byte)4, (byte)2, (byte) 1, (byte)3, (byte) 4, (byte) 6, (byte) 5}, new byte[]{(byte) 0, (byte)3, (byte)2, (byte) 1, (byte)3, (byte) 3, (byte) 6, (byte) 4}, new byte[]{(byte) 0, (byte)3, (byte) 1, (byte) 1, (byte)4, (byte) 2, (byte) 8, (byte) 5}};
    }
}
