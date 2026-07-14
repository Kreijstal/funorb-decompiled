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
              if (!jl.a((byte) 5)) {
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
                  if ((dc.field_b ^ -1) != -86) {
                    break L2;
                  } else {
                    if (((gq) this).field_Vb.length() > 0) {
                      StringBuilder discarded$5 = uk.a(' ', ((gq) this).field_Vb, -1 + ((gq) this).field_Vb.length(), false);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (nk.a(go.field_b, (CharSequence) (Object) ((gq) this).field_Vb, false)) {
                    StringBuilder discarded$6 = ((gq) this).field_Vb.append(go.field_b);
                    break L3;
                  } else {
                    L4: {
                      if (((gq) this).field_Vb.length() != -1) {
                        break L4;
                      } else {
                        if (go.field_b == 91) {
                          StringBuilder discarded$7 = ((gq) this).field_Vb.append(go.field_b);
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
                          StringBuilder discarded$8 = ((gq) this).field_Vb.append(go.field_b);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (go.field_b != 93) {
                      break L3;
                    } else {
                      StringBuilder discarded$9 = ((gq) this).field_Vb.append(go.field_b);
                      break L3;
                    }
                  }
                }
                if (dc.field_b != 84) {
                  if (-14 == (dc.field_b ^ -1)) {
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
          if ((dc.field_b ^ -1) == -86) {
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
                      StringBuilder discarded$11 = ((gq) this).field_Vb.append(var2);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                if (!ni.b(true, (char) var2)) {
                  if (eh.a((char) var2, (byte) 83)) {
                    StringBuilder discarded$12 = ((gq) this).field_Vb.append(var2);
                    if (-85 == dc.field_b) {
                      if (-1 < ((gq) this).field_Vb.length()) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        if (dc.field_b != param0) {
                          return true;
                        } else {
                          ((gq) this).field_Tb = 1;
                          return true;
                        }
                      } else {
                        L2: {
                          ((gq) this).field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L2;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L2;
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
                    if (-85 == dc.field_b) {
                      if (-1 < ((gq) this).field_Vb.length()) {
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
                      if (dc.field_b == param0) {
                        ((gq) this).field_Tb = 1;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  L3: {
                    StringBuilder discarded$13 = ((gq) this).field_Vb.append(var2);
                    if (-85 == dc.field_b) {
                      if (-1 < ((gq) this).field_Vb.length()) {
                        ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                        ((gq) this).field_Tb = 2;
                        break L3;
                      } else {
                        ((gq) this).field_Tb = 1;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
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
                if (-85 == dc.field_b) {
                  if (-1 < ((gq) this).field_Vb.length()) {
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
                      StringBuilder discarded$14 = ((gq) this).field_Vb.append(var2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L7: {
                    StringBuilder discarded$15 = ((gq) this).field_Vb.append(var2);
                    if (-85 == dc.field_b) {
                      if (-1 < ((gq) this).field_Vb.length()) {
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
                  if (dc.field_b != param0) {
                    return true;
                  } else {
                    ((gq) this).field_Tb = 1;
                    return true;
                  }
                } else {
                  if (!eh.a((char) var2, (byte) 83)) {
                    if (-85 == dc.field_b) {
                      if (-1 >= ((gq) this).field_Vb.length()) {
                        L8: {
                          ((gq) this).field_Tb = 1;
                          if (dc.field_b != param0) {
                            break L8;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L8;
                          }
                        }
                        return true;
                      } else {
                        L9: {
                          ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                          ((gq) this).field_Tb = 2;
                          if (dc.field_b != param0) {
                            break L9;
                          } else {
                            ((gq) this).field_Tb = 1;
                            break L9;
                          }
                        }
                        return true;
                      }
                    } else {
                      L10: {
                        if (dc.field_b != param0) {
                          break L10;
                        } else {
                          ((gq) this).field_Tb = 1;
                          break L10;
                        }
                      }
                      return true;
                    }
                  } else {
                    L11: {
                      StringBuilder discarded$16 = ((gq) this).field_Vb.append(var2);
                      if (-85 == dc.field_b) {
                        if (-1 < ((gq) this).field_Vb.length()) {
                          ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                          ((gq) this).field_Tb = 2;
                          break L11;
                        } else {
                          ((gq) this).field_Tb = 1;
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
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
              } else {
                if (-85 == dc.field_b) {
                  if (-1 >= ((gq) this).field_Vb.length()) {
                    L13: {
                      ((gq) this).field_Tb = 1;
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
                      ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                      ((gq) this).field_Tb = 2;
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
                      StringBuilder discarded$17 = ((gq) this).field_Vb.append(var2);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
                if (ni.b(true, (char) var2)) {
                  L19: {
                    StringBuilder discarded$18 = ((gq) this).field_Vb.append(var2);
                    if (-85 == dc.field_b) {
                      if (-1 < ((gq) this).field_Vb.length()) {
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
                  if (dc.field_b == param0) {
                    ((gq) this).field_Tb = 1;
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if (!eh.a((char) var2, (byte) 83)) {
                    break L16;
                  } else {
                    L20: {
                      StringBuilder discarded$19 = ((gq) this).field_Vb.append(var2);
                      if (-85 == dc.field_b) {
                        if (-1 < ((gq) this).field_Vb.length()) {
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
            if (-85 == dc.field_b) {
              if (-1 >= ((gq) this).field_Vb.length()) {
                L22: {
                  ((gq) this).field_Tb = 1;
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
                  ((gq) this).field_Mb = ((gq) this).field_Vb.toString();
                  ((gq) this).field_Tb = 2;
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
        if (param0) {
          boolean discarded$2 = gq.d((byte) -20);
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          field_Xb = null;
          field_Ub = null;
          return;
        } else {
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          field_Xb = null;
          field_Ub = null;
          return;
        }
    }

    final static boolean d(byte param0) {
        int[] var1 = null;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (bd.field_b != null) {
          if (bd.field_b.field_i) {
            var26 = mk.field_b;
            var18 = var26;
            var12 = var18;
            var10 = var12;
            var5 = var10;
            var1 = var5;
            var27 = bd.field_b.field_k;
            var3 = 0;
            L0: while (true) {
              if (8 <= var3) {
                var28 = pl.field_b;
                var20 = var28;
                var13 = var20;
                var11 = var13;
                var7 = var11;
                var1 = var7;
                var29 = bd.field_b.field_k;
                var9 = 0;
                var3 = var9;
                L1: while (true) {
                  if (-9 >= (var9 ^ -1)) {
                    bd.field_b = null;
                    return true;
                  } else {
                    var7[var9] = ik.a(var28[var9], var29[var9] ^ -1);
                    var9++;
                    continue L1;
                  }
                }
              } else {
                var5[var3] = ud.d(var26[var3], var27[var3]);
                var3++;
                continue L0;
              }
            }
          } else {
            var1_int = -62 / ((param0 - -18) / 47);
            return false;
          }
        } else {
          bd.field_b = mq.a((byte) 107, 4);
          if (bd.field_b.field_i) {
            var22 = mk.field_b;
            var14 = var22;
            var12 = var14;
            var10 = var12;
            var5 = var10;
            var1 = var5;
            var23 = bd.field_b.field_k;
            var3 = 0;
            L2: while (true) {
              if (8 <= var3) {
                var24 = pl.field_b;
                var16 = var24;
                var13 = var16;
                var11 = var13;
                var7 = var11;
                var1 = var7;
                var25 = bd.field_b.field_k;
                var9 = 0;
                var3 = var9;
                L3: while (true) {
                  if (-9 >= (var9 ^ -1)) {
                    bd.field_b = null;
                    return true;
                  } else {
                    var7[var9] = ik.a(var24[var9], var25[var9] ^ -1);
                    var9++;
                    continue L3;
                  }
                }
              } else {
                var5[var3] = ud.d(var22[var3], var23[var3]);
                var3++;
                continue L2;
              }
            }
          } else {
            var1_int = -62 / ((param0 - -18) / 47);
            return false;
          }
        }
    }

    final static boolean b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0;
        int stackOut_8_0;
        int stackOut_3_0;
        int stackOut_2_0;
        if ((param0 ^ -1) <= param1) {
          if (param0 > -1583) {
            L0: {
              if (-1 != param0 % 4) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            if (param0 % 4 != 0) {
              return false;
            } else {
              if (0 == param0 % 100) {
                if (param0 % 400 != 0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return true;
              }
            }
          }
        } else {
          L1: {
            if ((1 + param0) % 4 != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    gq(int param0, int param1, int param2, int param3, String param4, mh param5, mh param6, mh param7) {
        super(0L, param5);
        ((gq) this).field_Tb = 0;
        ((gq) this).field_Pb = new mh(0L, param6, param4);
        ((gq) this).a(((gq) this).field_Pb, 0);
        ((gq) this).field_Qb = new mh(0L, param7);
        ((gq) this).field_Qb.field_X = 16764006;
        ((gq) this).a(((gq) this).field_Qb, 0);
        ((gq) this).field_Qb.field_Cb = "|";
        ((gq) this).field_Vb = new StringBuilder(12);
        int var9 = ((gq) this).field_Pb.g(81);
        ((gq) this).field_Pb.a(np.field_a, 3, 5, var9, (byte) 64);
        ((gq) this).field_Qb.a(np.field_a, np.field_a + 3, 5, var9, (byte) 64);
        int var10 = 10 - -var9;
        int var11 = 3 + np.field_a * 2 + 3;
        int var12 = fp.a(-1, var10, param0, param2);
        int var13 = br.a(var11, param1, param3, 121);
        ((gq) this).a(var11, var13, var12, var10, (byte) 64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Wb = "Reject";
        field_Xb = new mi();
    }
}
