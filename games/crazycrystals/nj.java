/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static ko field_c;
    String field_b;
    String[] field_o;
    int field_f;
    static int field_k;
    f field_a;
    private int field_d;
    nj field_n;
    dl field_l;
    boolean field_i;
    private int field_j;
    int field_g;
    static int field_e;
    private int field_h;
    private int field_m;

    final void b(int param0) {
        this.a(-25, 158);
        if (param0 > -33) {
            ((nj) this).field_m = -49;
        }
    }

    public static void a(int param0) {
        if (param0 != 12) {
            return;
        }
        field_c = null;
    }

    private final void a(int param0, int param1) {
        wm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7_ref_String = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        var3 = jf.a(72 + (param1 - -4), 486, 0, 534, param1 + 4);
        var4 = -126 % ((71 - param0) / 38);
        if (var3 == null) {
          return;
        } else {
          L0: {
            if (((nj) this).field_a != null) {
              ((nj) this).field_a.a(24, 35, 24, false, 24 + (param1 - -4), 486);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((nj) this).field_l != null) {
              param1 -= 2;
              ((nj) this).field_l.a(486, 12 + (param1 - -4));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            L3: {
              var3.a((byte) -85);
              if (((nj) this).field_i) {
                L4: {
                  var5 = go.field_l.a(((nj) this).field_b);
                  var6 = ((nj) this).field_b.lastIndexOf(' ');
                  if (0 > var6) {
                    break L4;
                  } else {
                    if (96 >= var5) {
                      break L4;
                    } else {
                      var7_ref_String = ((nj) this).field_b.substring(0, var6);
                      var8 = ((nj) this).field_b.substring(var6 - -1);
                      var9 = go.field_l.a(var7_ref_String);
                      var10 = go.field_l.a(var8);
                      ih.a((byte) -20, var9, var7_ref_String, param1 - -4 - -31);
                      ih.a((byte) -20, var10, var8, 36 + param1 - -4 + 15);
                      break L4;
                    }
                  }
                }
                ih.a((byte) -20, var5, ((nj) this).field_b, 36 + (param1 - -4 + 5));
                L5: {
                  if (null != ((nj) this).field_l) {
                    param1 -= 12;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var7 = 0;
                L6: while (true) {
                  if (((nj) this).field_o.length <= var7) {
                    break L3;
                  } else {
                    an.field_q.a(((nj) this).field_o[var7], 486, 4 + (4 + param1 + 72) + (12 - -(var7 * 12)), 8438015, -1);
                    var7++;
                    if (var11 != 0) {
                      break L2;
                    } else {
                      if (var11 == 0) {
                        continue L6;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  L8: {
                    L9: {
                      var5 = go.field_l.a(((nj) this).field_b);
                      var6 = ((nj) this).field_b.lastIndexOf(' ');
                      if (var6 < 0) {
                        break L9;
                      } else {
                        if ((go.field_l.a(((nj) this).field_b) ^ -1) < -97) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      var7_ref_String = ((nj) this).field_b;
                      var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                      if ((((nj) this).field_d | ((nj) this).field_j) != -1) {
                        break L10;
                      } else {
                        if (-1 == (8 & ((nj) this).field_m)) {
                          var7_ref_String = var7_ref_String + 95;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ih.a((byte) -20, var5, var7_ref_String, 41 + (param1 - -4));
                    if (var11 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                  L11: {
                    var7_ref_String = ((nj) this).field_b.substring(0, var6);
                    var8 = var7_ref_String;
                    var7_ref_String = var8;
                    var8 = var7_ref_String;
                    var8 = ((nj) this).field_b.substring(1 + var6);
                    var9 = go.field_l.a(var7_ref_String);
                    if (var6 >= ((nj) this).field_h) {
                      break L11;
                    } else {
                      L12: {
                        var10 = go.field_l.a(var8);
                        var8 = var8.substring(0, -var6 + (((nj) this).field_h - 1));
                        if ((((nj) this).field_j | ((nj) this).field_d) != 0) {
                          break L12;
                        } else {
                          if ((((nj) this).field_m & 8) != 0) {
                            break L12;
                          } else {
                            var8 = var8 + 95;
                            var7_ref_String = var8;
                            var7_ref_String = var8;
                            break L12;
                          }
                        }
                      }
                      ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 - -36));
                      ih.a((byte) -20, var10, var8, 15 + (param1 + 4 - -36));
                      break L11;
                    }
                  }
                  L13: {
                    var7_ref_String = var7_ref_String.substring(0, ((nj) this).field_h);
                    if ((((nj) this).field_d | ((nj) this).field_j) != 0) {
                      break L13;
                    } else {
                      if ((8 & ((nj) this).field_m) == 0) {
                        var7_ref_String = var7_ref_String + 95;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ih.a((byte) -20, var9, var7_ref_String, -1 + (param1 + 36));
                  break L7;
                }
                L14: {
                  if (((nj) this).field_l == null) {
                    break L14;
                  } else {
                    param1 -= 12;
                    break L14;
                  }
                }
                var7 = 0;
                L15: while (true) {
                  L16: {
                    if (var7 >= ((nj) this).field_d) {
                      break L16;
                    } else {
                      an.field_q.a(((nj) this).field_o[var7], 486, var7 * 12 + (72 + param1 + 4) - -4 + 12, 8438015, -1);
                      var7++;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          continue L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                  L17: {
                    var7_ref_String = ((nj) this).field_o[((nj) this).field_d].substring(0, ((nj) this).field_j);
                    if (0 == (((nj) this).field_d | ((nj) this).field_j)) {
                      break L17;
                    } else {
                      if (0 == ((nj) this).field_g) {
                        break L17;
                      } else {
                        if ((8 & ((nj) this).field_m) != 0) {
                          break L17;
                        } else {
                          var7_ref_String = var7_ref_String + 95;
                          break L17;
                        }
                      }
                    }
                  }
                  an.field_q.a(var7_ref_String, 486, 12 * ((nj) this).field_d + (param1 + 92), 8438015, -1);
                  if (var11 == 0) {
                    break L3;
                  } else {
                    L18: {
                      L19: {
                        var5 = go.field_l.a(((nj) this).field_b);
                        var6 = ((nj) this).field_b.lastIndexOf(' ');
                        if (0 > var6) {
                          break L19;
                        } else {
                          if (96 >= var5) {
                            break L19;
                          } else {
                            var7_ref_String = ((nj) this).field_b.substring(0, var6);
                            var8 = ((nj) this).field_b.substring(var6 - -1);
                            var9 = go.field_l.a(var7_ref_String);
                            var10 = go.field_l.a(var8);
                            ih.a((byte) -20, var9, var7_ref_String, param1 - -4 - -31);
                            ih.a((byte) -20, var10, var8, 36 + param1 - -4 + 15);
                            if (var11 == 0) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      ih.a((byte) -20, var5, ((nj) this).field_b, 36 + (param1 - -4 + 5));
                      break L18;
                    }
                    L20: {
                      if (null != ((nj) this).field_l) {
                        param1 -= 12;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    var7 = 0;
                    L21: while (true) {
                      if (((nj) this).field_o.length <= var7) {
                        break L3;
                      } else {
                        an.field_q.a(((nj) this).field_o[var7], 486, 4 + (4 + param1 + 72) + (12 - -(var7 * 12)), 8438015, -1);
                        var7++;
                        if (var11 == 0) {
                          continue L21;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (((nj) this).field_n == null) {
              break L2;
            } else {
              L22: {
                if (((nj) this).field_i) {
                  break L22;
                } else {
                  if (0 == ((nj) this).field_g) {
                    break L22;
                  } else {
                    break L2;
                  }
                }
              }
              ((nj) this).field_n.a(121, ((nj) this).field_o.length * 12 + 12 + (4 + param1) + 58);
              break L2;
            }
          }
          return;
        }
    }

    final static double[] a(int param0, int param1, int param2) {
        if (param0 < 39) {
            field_e = -61;
        }
        int var3 = (tm.field_d[0].length - 2 * param2) * 48;
        int var4 = 48 * (tm.field_d.length + -(2 * param1));
        int var5 = var3 >= var4 ? var3 : var4;
        double var6 = (double)(param2 * 48) + (double)var3 * 0.5;
        double var8 = (double)(48 * param1) + (double)var4 * 0.5;
        double var10 = 24.0;
        if (!((var5 ^ -1) >= -481)) {
            var10 = 480.0 * var10 / (double)var5;
            var6 = var10 * var6 / 24.0;
            var8 = var8 * var10 / 24.0;
        }
        return new double[]{var6, var8, var10};
    }

    private final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          var3 = CrazyCrystals.field_B;
          ((nj) this).field_m = 1 + ((nj) this).field_m & 15;
          if (param0 == 71) {
            break L0;
          } else {
            ((nj) this).field_a = null;
            break L0;
          }
        }
        if ((((nj) this).field_g ^ -1) >= -1) {
          if (((nj) this).field_n == null) {
            return false;
          } else {
            ((nj) this).field_f = ((nj) this).field_f - ((nj) this).field_n.field_f;
            var2 = ((nj) this).field_n.a((byte) 71) ? 1 : 0;
            ((nj) this).field_f = ((nj) this).field_f + ((nj) this).field_n.field_f;
            return var2 != 0;
          }
        } else {
          L1: {
            ((nj) this).field_g = ((nj) this).field_g - 1;
            if (-1 != (((nj) this).field_g ^ -1)) {
              break L1;
            } else {
              L2: {
                if ((((nj) this).field_h ^ -1) > (((nj) this).field_b.length() ^ -1)) {
                  break L2;
                } else {
                  if ((((nj) this).field_o.length ^ -1) >= (((nj) this).field_d ^ -1)) {
                    break L1;
                  } else {
                    L3: {
                      if (((nj) this).field_j >= ((nj) this).field_o[((nj) this).field_d].length()) {
                        break L3;
                      } else {
                        L4: {
                          L5: {
                            if (((nj) this).field_o[((nj) this).field_d].charAt(((nj) this).field_j) != 60) {
                              break L5;
                            } else {
                              ((nj) this).field_j = ((nj) this).field_o[((nj) this).field_d].indexOf('>', ((nj) this).field_j + 1) + 1;
                              if (var3 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((nj) this).field_j = ((nj) this).field_j + 1;
                          break L4;
                        }
                        ((nj) this).field_g = 2;
                        ((nj) this).field_f = ((nj) this).field_f + 1;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (((nj) this).field_o.length + -1 > ((nj) this).field_d) {
                      ((nj) this).field_j = 0;
                      ((nj) this).field_d = ((nj) this).field_d + 1;
                      ((nj) this).field_g = 2;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
              L6: {
                ((nj) this).field_h = ((nj) this).field_h + 1;
                stackOut_15_0 = this;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (((nj) this).field_h != ((nj) this).field_b.length()) {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 4;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L6;
                } else {
                  stackOut_16_0 = this;
                  stackOut_16_1 = 30;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L6;
                }
              }
              ((nj) this).field_g = stackIn_18_1;
              break L1;
            }
          }
          return true;
        }
    }

    final nj b(byte param0) {
        L0: {
          if (0 >= ((nj) this).field_g) {
            break L0;
          } else {
            if (((nj) this).field_i) {
              break L0;
            } else {
              L1: {
                ((nj) this).field_i = true;
                if (null == ((nj) this).field_n) {
                  break L1;
                } else {
                  nj discarded$2 = ((nj) this).field_n.b((byte) -112);
                  break L1;
                }
              }
              return (nj) this;
            }
          }
        }
        L2: {
          if (param0 <= -91) {
            break L2;
          } else {
            ((nj) this).field_i = true;
            break L2;
          }
        }
        if (null != ((nj) this).field_n) {
          ((nj) this).field_n = ((nj) this).field_n.b((byte) -105);
          if (null == ((nj) this).field_n) {
            return null;
          } else {
            return (nj) this;
          }
        } else {
          return null;
        }
    }

    final nj c(int param0) {
        Object var3 = null;
        L0: {
          if (null != ((nj) this).field_a) {
            var3 = null;
            ((nj) this).field_a.b(57, 0, (f[][]) null, 0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -28530) {
          if (!this.a((byte) 71)) {
            ((nj) this).field_f = ((nj) this).field_f - 1;
            if (((nj) this).field_f == 0) {
              return null;
            } else {
              return (nj) this;
            }
          } else {
            return (nj) this;
          }
        } else {
          return null;
        }
    }

    nj(f param0, String param1, String[] param2) {
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        ((nj) this).field_b = param1;
        ((nj) this).field_a = param0;
        ((nj) this).field_o = param2;
    }

    nj(dl param0, String param1, String param2) {
        ((nj) this).field_f = 300;
        ((nj) this).field_d = 0;
        ((nj) this).field_j = 0;
        ((nj) this).field_g = 30;
        ((nj) this).field_h = 0;
        ((nj) this).field_m = 0;
        ((nj) this).field_l = param0;
        ((nj) this).field_b = param1;
        ((nj) this).field_o = rn.a(param2, (byte) 74);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
