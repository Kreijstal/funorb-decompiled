/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends mh {
    static jp field_Sb;
    static String field_Wb;
    private mh field_Qb;
    static mi field_Xb;
    private StringBuilder field_Vb;
    private mh field_Pb;
    private int field_Tb;
    static int field_Yb;
    static jp[] field_Ub;
    static mf field_Rb;

    final int a(boolean param0, byte param1) {
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 >= 88) {
          ((gq) this).a(param0, -15211);
          if (!param0) {
            ((gq) this).field_Qb.field_Mb = ((gq) this).field_Vb.toString();
            if (param0) {
              L0: {
                if (ki.field_e == 0) {
                  break L0;
                } else {
                  if (((gq) this).field_L == 0) {
                    ((gq) this).field_Tb = 1;
                    break L0;
                  } else {
                    return ((gq) this).field_Tb;
                  }
                }
              }
              return ((gq) this).field_Tb;
            } else {
              return ((gq) this).field_Tb;
            }
          } else {
            L1: while (true) {
              int discarded$7 = 5;
              if (!jl.a()) {
                ((gq) this).field_Qb.field_Mb = ((gq) this).field_Vb.toString();
                if (param0) {
                  if (ki.field_e != 0) {
                    if (((gq) this).field_L == 0) {
                      ((gq) this).field_Tb = 1;
                      return ((gq) this).field_Tb;
                    } else {
                      return ((gq) this).field_Tb;
                    }
                  } else {
                    return ((gq) this).field_Tb;
                  }
                } else {
                  return ((gq) this).field_Tb;
                }
              } else {
                L2: {
                  if (dc.field_b != 85) {
                    break L2;
                  } else {
                    if (((gq) this).field_Vb.length() > 0) {
                      StringBuilder discarded$8 = uk.a(' ', ((gq) this).field_Vb, -1 + ((gq) this).field_Vb.length(), false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  int discarded$9 = 0;
                  if (nk.a(go.field_b, (CharSequence) (Object) ((gq) this).field_Vb)) {
                    StringBuilder discarded$10 = ((gq) this).field_Vb.append(go.field_b);
                    break L3;
                  } else {
                    L4: {
                      if (((gq) this).field_Vb.length() != -1) {
                        break L4;
                      } else {
                        if (go.field_b == 91) {
                          StringBuilder discarded$11 = ((gq) this).field_Vb.append(go.field_b);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-2 != ((gq) this).field_Vb.length()) {
                        break L5;
                      } else {
                        if (go.field_b == 35) {
                          StringBuilder discarded$12 = ((gq) this).field_Vb.append(go.field_b);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (go.field_b != 93) {
                      break L3;
                    } else {
                      StringBuilder discarded$13 = ((gq) this).field_Vb.append(go.field_b);
                      break L3;
                    }
                  }
                }
                if (dc.field_b != 84) {
                  if (dc.field_b == 13) {
                    return 1;
                  } else {
                    continue L1;
                  }
                } else {
                  if (0 >= ((gq) this).field_Vb.length()) {
                    return 1;
                  } else {
                    ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                    return 2;
                  }
                }
              }
            }
          }
        } else {
          return 77;
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        if (((gq) this).field_Tb != 0) {
          return false;
        } else {
          if (dc.field_b == 85) {
            if (((gq) this).field_Vb.length() > 0) {
              StringBuilder discarded$10 = uk.a(' ', ((gq) this).field_Vb, -1 + ((gq) this).field_Vb.length(), false);
              if (12 > ((gq) this).field_Vb.length()) {
                L0: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (95 != var2) {
                    break L1;
                  } else {
                    if (0 < ((gq) this).field_Vb.length()) {
                      StringBuilder discarded$11 = ((gq) this).field_Vb.append((char) var2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L2: {
                    StringBuilder discarded$12 = ((gq) this).field_Vb.append((char) var2);
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        break L2;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (dc.field_b != param0) {
                      break L3;
                    } else {
                      ((gq) this).field_Tb = 1;
                      break L3;
                    }
                  }
                  return true;
                } else {
                  if (eh.a((char) var2, (byte) 83)) {
                    StringBuilder discarded$13 = ((gq) this).field_Vb.append((char) var2);
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          ((gq) this).field_Tb = 1;
                          return true;
                        }
                      } else {
                        L4: {
                          ((gq) this).field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L4;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L4;
                          }
                        }
                        return true;
                      }
                    } else {
                      if (dc.field_b != param0) {
                        return true;
                      } else {
                        ((gq) this).field_Tb = 1;
                        return true;
                      }
                    }
                  } else {
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          ((gq) this).field_Tb = 1;
                          return true;
                        }
                      } else {
                        ((gq) this).field_Tb = 1;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          ((gq) this).field_Tb = 1;
                          return true;
                        }
                      }
                    } else {
                      if (dc.field_b != param0) {
                        return true;
                      } else {
                        ((gq) this).field_Tb = 1;
                        return true;
                      }
                    }
                  }
                }
              } else {
                if (dc.field_b == 84) {
                  if (((gq) this).field_Vb.length() > 0) {
                    ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                    ((gq) this).field_Tb = 2;
                    if (dc.field_b != param0) {
                      return true;
                    } else {
                      ((gq) this).field_Tb = 1;
                      return true;
                    }
                  } else {
                    ((gq) this).field_Tb = 1;
                    if (dc.field_b != param0) {
                      return true;
                    } else {
                      ((gq) this).field_Tb = 1;
                      return true;
                    }
                  }
                } else {
                  if (dc.field_b != param0) {
                    return true;
                  } else {
                    ((gq) this).field_Tb = 1;
                    return true;
                  }
                }
              }
            } else {
              if (12 > ((gq) this).field_Vb.length()) {
                L5: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (95 != var2) {
                    break L6;
                  } else {
                    if (0 < ((gq) this).field_Vb.length()) {
                      StringBuilder discarded$14 = ((gq) this).field_Vb.append((char) var2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L7: {
                    StringBuilder discarded$15 = ((gq) this).field_Vb.append((char) var2);
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        break L7;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (dc.field_b == param0) {
                    ((gq) this).field_Tb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (eh.a((char) var2, (byte) 83)) {
                    L8: {
                      StringBuilder discarded$16 = ((gq) this).field_Vb.append((char) var2);
                      if (dc.field_b == 84) {
                        if (((gq) this).field_Vb.length() > 0) {
                          ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                          ((gq) this).field_Tb = 2;
                          break L8;
                        } else {
                          ((gq) this).field_Tb = 1;
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (dc.field_b != param0) {
                        break L9;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L9;
                      }
                    }
                    return true;
                  } else {
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        L10: {
                          ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                          ((gq) this).field_Tb = 2;
                          if (dc.field_b != param0) {
                            break L10;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L10;
                          }
                        }
                        return true;
                      } else {
                        L11: {
                          ((gq) this).field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L11;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L11;
                          }
                        }
                        return true;
                      }
                    } else {
                      L12: {
                        if (dc.field_b != param0) {
                          break L12;
                        } else {
                          ((gq) this).field_Tb = 1;
                          break L12;
                        }
                      }
                      return true;
                    }
                  }
                }
              } else {
                if (dc.field_b == 84) {
                  if (((gq) this).field_Vb.length() > 0) {
                    L13: {
                      ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                      ((gq) this).field_Tb = 2;
                      if (dc.field_b != param0) {
                        break L13;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L13;
                      }
                    }
                    return true;
                  } else {
                    L14: {
                      ((gq) this).field_Tb = 1;
                      if (dc.field_b != param0) {
                        break L14;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L14;
                      }
                    }
                    return true;
                  }
                } else {
                  L15: {
                    if (dc.field_b != param0) {
                      break L15;
                    } else {
                      ((gq) this).field_Tb = 1;
                      break L15;
                    }
                  }
                  return true;
                }
              }
            }
          } else {
            L16: {
              if (12 > ((gq) this).field_Vb.length()) {
                L17: {
                  var2 = Character.toLowerCase(go.field_b);
                  if (var2 == 32) {
                    var2 = 95;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (95 != var2) {
                    break L18;
                  } else {
                    if (0 < ((gq) this).field_Vb.length()) {
                      StringBuilder discarded$17 = ((gq) this).field_Vb.append((char) var2);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L19: {
                    StringBuilder discarded$18 = ((gq) this).field_Vb.append((char) var2);
                    if (dc.field_b == 84) {
                      if (((gq) this).field_Vb.length() > 0) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        break L19;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  if (dc.field_b != param0) {
                    return true;
                  } else {
                    ((gq) this).field_Tb = 1;
                    return true;
                  }
                } else {
                  if (!eh.a((char) var2, (byte) 83)) {
                    break L16;
                  } else {
                    L20: {
                      StringBuilder discarded$19 = ((gq) this).field_Vb.append((char) var2);
                      if (dc.field_b == 84) {
                        if (((gq) this).field_Vb.length() > 0) {
                          ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                          ((gq) this).field_Tb = 2;
                          break L20;
                        } else {
                          ((gq) this).field_Tb = 1;
                          break L20;
                        }
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (dc.field_b != param0) {
                        break L21;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L21;
                      }
                    }
                    return true;
                  }
                }
              } else {
                break L16;
              }
            }
            if (dc.field_b == 84) {
              if (((gq) this).field_Vb.length() > 0) {
                L22: {
                  ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                  ((gq) this).field_Tb = 2;
                  if (dc.field_b != param0) {
                    break L22;
                  } else {
                    ((gq) this).field_Tb = 1;
                    break L22;
                  }
                }
                return true;
              } else {
                L23: {
                  ((gq) this).field_Tb = 1;
                  if (dc.field_b != param0) {
                    break L23;
                  } else {
                    ((gq) this).field_Tb = 1;
                    break L23;
                  }
                }
                return true;
              }
            } else {
              L24: {
                if (dc.field_b != param0) {
                  break L24;
                } else {
                  ((gq) this).field_Tb = 1;
                  break L24;
                }
              }
              return true;
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_Rb = null;
        field_Sb = null;
        field_Wb = null;
        field_Xb = null;
        field_Ub = null;
    }

    final static boolean d() {
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (bd.field_b != null) {
                break L1;
              } else {
                bd.field_b = mq.a((byte) 107, 4);
                break L1;
              }
            }
            if (!bd.field_b.field_i) {
              var1_int = 31;
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              var5 = mk.field_b;
              var1 = var5;
              var6 = bd.field_b.field_k;
              var3 = 0;
              L2: while (true) {
                if (8 <= var3) {
                  var7 = pl.field_b;
                  var1 = var7;
                  var8 = bd.field_b.field_k;
                  var9 = 0;
                  var3 = var9;
                  L3: while (true) {
                    if (var9 >= 8) {
                      bd.field_b = null;
                      stackOut_10_0 = 1;
                      stackIn_11_0 = stackOut_10_0;
                      return stackIn_11_0 != 0;
                    } else {
                      var7[var9] = ik.a(var7[var9], ~var8[var9]);
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  var5[var3] = ud.d(var5[var3], var6[var3]);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1_ref, "gq.B(" + -126 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static boolean b(int param0, int param1) {
        if (param0 < 0) {
            return (1 + param0) % 4 == 0 ? true : false;
        }
        if (!(param0 >= 1582)) {
            return param0 % 4 == 0 ? true : false;
        }
        if (!(param0 % 4 == 0)) {
            return false;
        }
        if (0 != param0 % 100) {
            return true;
        }
        if (param0 % 400 != 0) {
            return false;
        }
        return true;
    }

    gq(int param0, int param1, int param2, int param3, String param4, mh param5, mh param6, mh param7) {
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
        ((gq) this).field_Tb = 0;
        try {
          L0: {
            ((gq) this).field_Pb = new mh(0L, param6, param4);
            ((gq) this).a(((gq) this).field_Pb, 0);
            ((gq) this).field_Qb = new mh(0L, param7);
            ((gq) this).field_Qb.field_X = 16764006;
            ((gq) this).a(((gq) this).field_Qb, 0);
            ((gq) this).field_Qb.field_Cb = "|";
            ((gq) this).field_Vb = new StringBuilder(12);
            var9_int = ((gq) this).field_Pb.g(81);
            ((gq) this).field_Pb.a(np.field_a, 3, 5, var9_int, (byte) 64);
            ((gq) this).field_Qb.a(np.field_a, np.field_a + 3, 5, var9_int, (byte) 64);
            var10 = 10 - -var9_int;
            var11 = 3 + np.field_a * 2 + 3;
            var12 = fp.a(-1, var10, param0, param2);
            var13 = br.a(var11, param1, param3, 121);
            ((gq) this).a(var11, var13, var12, var10, (byte) 64);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("gq.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Wb = "Reject";
        field_Xb = new mi();
    }
}
