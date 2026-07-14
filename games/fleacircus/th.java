/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
            return;
        }
        param3.a((byte) -49, param1);
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        ei stackIn_38_0 = null;
        ei stackIn_39_0 = null;
        ei stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ei stackIn_47_0 = null;
        ei stackIn_48_0 = null;
        ei stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        ei stackOut_46_0 = null;
        ei stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        ei stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        ei stackOut_37_0 = null;
        ei stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ei stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var8 = fleas.field_A ? 1 : 0;
          if (!((th) this).field_B) {
            break L0;
          } else {
            if (param3) {
              L1: {
                if (((th) this).field_u > 0) {
                  L2: {
                    if (((th) this).field_F != null) {
                      ((th) this).field_C.e(-398);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((th) this).field_F = param0;
                  if (param0 != null) {
                    ((th) this).field_C.a(false, param2 + 524395, param0);
                    this.a((byte) 87, param1, param5, ((th) this).field_C);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  L3: {
                    if (((th) this).field_r == null) {
                      break L3;
                    } else {
                      ((th) this).field_o.e(-398);
                      break L3;
                    }
                  }
                  ((th) this).field_r = param0;
                  if (param0 == null) {
                    break L1;
                  } else {
                    ((th) this).field_o.a(false, 64, param0);
                    this.a((byte) 64, param1, param5, ((th) this).field_o);
                    break L1;
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
        L4: {
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param3) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L4;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L4;
          }
        }
        ((th) this).field_B = stackIn_18_1 != 0;
        if (param0 != ((th) this).field_F) {
          if (param0 != ((th) this).field_r) {
            L5: {
              if (param2 == -524289) {
                break L5;
              } else {
                ((th) this).field_r = null;
                break L5;
              }
            }
            L6: {
              if (null != ((th) this).field_F) {
                if (((th) this).field_r == null) {
                  var7 = 0;
                  break L6;
                } else {
                  L7: {
                    if ((((th) this).field_E ^ -1) <= -524289) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                  var7 = stackIn_30_0;
                  break L6;
                }
              } else {
                var7 = 1;
                break L6;
              }
            }
            L8: {
              if (var7 != 0) {
                L9: {
                  if (((th) this).field_F != null) {
                    ((th) this).field_C.e(-398);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  ((th) this).field_F = param0;
                  if (param0 == null) {
                    break L10;
                  } else {
                    L11: {
                      stackOut_46_0 = ((th) this).field_C;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_47_0 = stackOut_46_0;
                      if (param3) {
                        stackOut_48_0 = (ei) (Object) stackIn_48_0;
                        stackOut_48_1 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        break L11;
                      } else {
                        stackOut_47_0 = (ei) (Object) stackIn_47_0;
                        stackOut_47_1 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        break L11;
                      }
                    }
                    ((ei) (Object) stackIn_49_0).a(stackIn_49_1 != 0, 101, param0);
                    this.a((byte) 79, param1, param5, ((th) this).field_C);
                    break L10;
                  }
                }
                ((th) this).field_u = param4;
                break L8;
              } else {
                L12: {
                  if (((th) this).field_r != null) {
                    ((th) this).field_o.e(-398);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  ((th) this).field_r = param0;
                  if (param0 == null) {
                    break L13;
                  } else {
                    L14: {
                      stackOut_37_0 = ((th) this).field_o;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (param3) {
                        stackOut_39_0 = (ei) (Object) stackIn_39_0;
                        stackOut_39_1 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        break L14;
                      } else {
                        stackOut_38_0 = (ei) (Object) stackIn_38_0;
                        stackOut_38_1 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L14;
                      }
                    }
                    ((ei) (Object) stackIn_40_0).a(stackIn_40_1 != 0, param2 + 524353, param0);
                    this.a((byte) 104, param1, param5, ((th) this).field_o);
                    break L13;
                  }
                }
                ((th) this).field_u = -param4;
                break L8;
              }
            }
            return;
          } else {
            ((th) this).field_u = -param4;
            this.a((byte) 57, param1, param5, ((th) this).field_o);
            return;
          }
        } else {
          ((th) this).field_u = param4;
          this.a((byte) 72, param1, param5, ((th) this).field_C);
          return;
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        if (param0) {
            field_D = -86;
        }
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_31_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        var11 = fleas.field_A ? 1 : 0;
        if (0 < ((th) this).field_x) {
          L0: {
            if (!((th) this).field_B) {
              break L0;
            } else {
              L1: {
                if (-1 <= (((th) this).field_u ^ -1)) {
                  break L1;
                } else {
                  if (!((th) this).field_C.d(31499)) {
                    ((th) this).field_F = null;
                    ((th) this).field_B = false;
                    ((th) this).field_u = -((th) this).field_u;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 <= ((th) this).field_u) {
                break L0;
              } else {
                if (!((th) this).field_o.d(31499)) {
                  ((th) this).field_B = false;
                  ((th) this).field_u = -((th) this).field_u;
                  ((th) this).field_r = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L2: {
            var4 = ((th) this).field_x * (((th) this).field_E >> 439093676) / 256;
            var5 = ((th) this).field_x - var4;
            if (0 != ((th) this).field_u) {
              ((th) this).field_E = ((th) this).field_E + param2 * ((th) this).field_u;
              if (((th) this).field_E < 1048576) {
                if (0 >= ((th) this).field_E) {
                  ((th) this).field_E = 0;
                  if (!((th) this).field_B) {
                    ((th) this).field_u = 0;
                    if (((th) this).field_w) {
                      break L2;
                    } else {
                      L3: {
                        if (((th) this).field_F != null) {
                          ((th) this).field_C.e(-398);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((th) this).field_F = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                ((th) this).field_E = 1048576;
                if (((th) this).field_B) {
                  break L2;
                } else {
                  ((th) this).field_u = 0;
                  if (((th) this).field_w) {
                    break L2;
                  } else {
                    L4: {
                      if (((th) this).field_r == null) {
                        break L4;
                      } else {
                        ((th) this).field_o.e(-398);
                        break L4;
                      }
                    }
                    ((th) this).field_r = null;
                    break L2;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          L5: {
            if (la.field_h) {
              stackOut_30_0 = param2 << 1335842689;
              stackIn_31_0 = stackOut_30_0;
              break L5;
            } else {
              stackOut_29_0 = param2;
              stackIn_31_0 = stackOut_29_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_31_0;
            if (-257 < ((th) this).field_A) {
              L7: {
                if (((th) this).field_F != null) {
                  break L7;
                } else {
                  if (((th) this).field_r != null) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              if (-257 != var4) {
                if ((var5 ^ -1) == -257) {
                  ((th) this).field_o.b(param0, param1, param2);
                  break L6;
                } else {
                  L8: {
                    L9: {
                      if (((th) this).field_q == null) {
                        break L9;
                      } else {
                        if (var6 <= ((th) this).field_q.length) {
                          dm.a(((th) this).field_q, 0, var6);
                          dm.a(((th) this).field_p, 0, var6);
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    ((th) this).field_p = new int[var6];
                    ((th) this).field_q = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((th) this).field_C.b(((th) this).field_q, 0, param2);
                    ((th) this).field_o.b(((th) this).field_p, 0, param2);
                    if (!la.field_h) {
                      stackOut_46_0 = param1;
                      stackIn_47_0 = stackOut_46_0;
                      break L10;
                    } else {
                      param1 = param1 << 1;
                      stackOut_45_0 = param1 << 1;
                      stackIn_47_0 = stackOut_45_0;
                      break L10;
                    }
                  }
                  var7 = stackIn_47_0;
                  var8 = 0;
                  L11: while (true) {
                    if (var8 >= var6) {
                      break L6;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (var4 * ((th) this).field_q[var8] + ((th) this).field_p[var8] * var5 >> 1604844392);
                      var8++;
                      continue L11;
                    }
                  }
                }
              } else {
                ((th) this).field_C.b(param0, param1, param2);
                break L6;
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (((th) this).field_y == null) {
              break L12;
            } else {
              if (((th) this).field_A != 0) {
                L13: {
                  L14: {
                    if (null == ((th) this).field_q) {
                      break L14;
                    } else {
                      if (((th) this).field_q.length < var6) {
                        break L14;
                      } else {
                        dm.a(((th) this).field_q, 0, var6);
                        break L13;
                      }
                    }
                  }
                  ((th) this).field_q = new int[var6];
                  ((th) this).field_p = new int[var6];
                  break L13;
                }
                L15: {
                  ((th) this).field_t.b(((th) this).field_q, 0, param2);
                  if (la.field_h) {
                    param1 = param1 << 1;
                    stackOut_60_0 = param1 << 1;
                    stackIn_61_0 = stackOut_60_0;
                    break L15;
                  } else {
                    stackOut_59_0 = param1;
                    stackIn_61_0 = stackOut_59_0;
                    break L15;
                  }
                }
                var7 = stackIn_61_0;
                var8 = ((th) this).field_A * ((th) this).field_x / 256;
                var9 = -var8 + ((th) this).field_x;
                var10 = 0;
                L16: while (true) {
                  if (var6 <= var10) {
                    break L12;
                  } else {
                    param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((th) this).field_q[var10] * var8) >> 1513585096;
                    var10++;
                    continue L16;
                  }
                }
              } else {
                break L12;
              }
            }
          }
          return;
        } else {
          ((th) this).a(param2);
          return;
        }
    }

    final synchronized void a(int param0, byte param1) {
        ((th) this).field_x = param0;
        if (param1 <= 2) {
            ((th) this).field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (((th) this).field_E > 0) {
            if (((th) this).field_F == null) {
              if (-1048577 > ((th) this).field_E) {
                if (((th) this).field_r != null) {
                  ((th) this).field_o.a(param0);
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (0 >= ((th) this).field_A) {
                break L0;
              } else {
                if (null == ((th) this).field_y) {
                  break L0;
                } else {
                  ((th) this).field_t.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 < ((th) this).field_E) {
              if (((th) this).field_r != null) {
                ((th) this).field_o.a(param0);
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              } else {
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (0 >= ((th) this).field_A) {
                break L0;
              } else {
                if (null != ((th) this).field_y) {
                  ((th) this).field_t.a(param0);
                  break L0;
                } else {
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (!((th) this).field_B) {
            break L1;
          } else {
            L2: {
              if (-1 <= (((th) this).field_u ^ -1)) {
                break L2;
              } else {
                if (((th) this).field_C.d(31499)) {
                  break L2;
                } else {
                  ((th) this).field_u = -((th) this).field_u;
                  ((th) this).field_F = null;
                  ((th) this).field_B = false;
                  break L1;
                }
              }
            }
            if (((th) this).field_u >= 0) {
              break L1;
            } else {
              if (!((th) this).field_o.d(31499)) {
                ((th) this).field_B = false;
                ((th) this).field_r = null;
                ((th) this).field_u = -((th) this).field_u;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (-1 == (((th) this).field_u ^ -1)) {
            break L3;
          } else {
            ((th) this).field_E = ((th) this).field_E + param0 * ((th) this).field_u;
            if (1048576 <= ((th) this).field_E) {
              ((th) this).field_E = 1048576;
              if (!((th) this).field_B) {
                ((th) this).field_u = 0;
                if (((th) this).field_w) {
                  break L3;
                } else {
                  L4: {
                    if (null == ((th) this).field_r) {
                      break L4;
                    } else {
                      ((th) this).field_o.e(-398);
                      break L4;
                    }
                  }
                  ((th) this).field_r = null;
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (((th) this).field_E <= 0) {
                ((th) this).field_E = 0;
                if (!((th) this).field_B) {
                  ((th) this).field_u = 0;
                  if (((th) this).field_w) {
                    break L3;
                  } else {
                    L5: {
                      if (((th) this).field_F != null) {
                        ((th) this).field_C.e(-398);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((th) this).field_F = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
