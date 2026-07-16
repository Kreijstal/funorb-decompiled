/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ow {
    private qh field_q;
    static ut[] field_m;
    static int field_E;
    private int field_D;
    private kc field_v;
    private bi field_l;
    static String field_p;
    private int field_h;
    static ae field_u;
    private byte[] field_x;
    private eb field_w;
    private byte[] field_r;
    static int field_s;
    static double field_C;
    private qh field_k;
    private vv field_B;
    private int field_j;
    static String[] field_o;
    private kl field_z;
    private tf field_t;
    private boolean field_g;
    private boolean field_n;
    private int field_i;
    private tf field_F;
    private long field_y;
    private boolean field_A;

    final int a(int param0, int param1) {
        vv var3 = null;
        var3 = (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
        if (var3 == null) {
          if (param0 != 6999) {
            byte[] discarded$2 = ((wm) this).b(-39, 41);
            return 0;
          } else {
            return 0;
          }
        } else {
          return var3.a(0);
        }
    }

    final void d(int param0) {
        gn var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param0 == 18137) {
          if (null != ((wm) this).field_t) {
            if (((wm) this).a(param0 + -42991) == null) {
              return;
            } else {
              var2 = ((wm) this).field_F.g(24009);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_a;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if ((var3 ^ -1) > -1) {
                              break L4;
                            } else {
                              if (((wm) this).field_z.field_d <= var3) {
                                break L4;
                              } else {
                                if (((wm) this).field_z.field_i[var3] != 0) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.c((byte) -109);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((wm) this).field_r[var3] == 0) {
                            vv discarded$2 = this.a(1, var3, (byte) -30);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-1 != ((wm) this).field_r[var3]) {
                            break L6;
                          } else {
                            vv discarded$3 = this.a(2, var3, (byte) -30);
                            break L6;
                          }
                        }
                        if (-2 == (((wm) this).field_r[var3] ^ -1)) {
                          var2.c((byte) -109);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var2 = ((wm) this).field_F.c(33);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean c(byte param0) {
        int var1 = 0;
        if (vg.field_Wb) {
          var1 = -4 / ((-84 - param0) / 34);
          if (0 == ov.field_b) {
            return true;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void c(int param0) {
        if (param0 != 1) {
            field_u = null;
        }
    }

    final void b(byte param0) {
        if (!(((wm) this).field_k != null)) {
            return;
        }
        ((wm) this).field_g = true;
        if (!(((wm) this).field_t != null)) {
            ((wm) this).field_t = new tf();
        }
        if (param0 < 28) {
            ((wm) this).field_n = true;
        }
    }

    final kl a(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = Kickabout.field_G;
        if (((wm) this).field_z != null) {
          return ((wm) this).field_z;
        } else {
          L0: {
            if (null == ((wm) this).field_B) {
              if (!((wm) this).field_l.a(25533)) {
                ((wm) this).field_B = (vv) (Object) ((wm) this).field_l.a(255, ((wm) this).field_h, (byte) 0, (byte) 89, true);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((wm) this).field_B.field_p) {
            L1: {
              var5 = ((wm) this).field_B.b(12802);
              var2 = var5;
              if (((wm) this).field_B instanceof hi) {
                break L1;
              } else {
                if (var5 != null) {
                  ((wm) this).field_z = new kl(var5, ((wm) this).field_D, ((wm) this).field_x);
                  if (((wm) this).field_q != null) {
                    hi discarded$1 = ((wm) this).field_w.a(((wm) this).field_h, ((wm) this).field_q, var5, (byte) 11);
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 == -24854) {
                          break L2;
                        } else {
                          ((wm) this).b(113);
                          break L2;
                        }
                      }
                      L3: {
                        if (null != ((wm) this).field_k) {
                          ((wm) this).field_r = new byte[((wm) this).field_z.field_d];
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((wm) this).field_B = null;
                      return ((wm) this).field_z;
                    }
                  } else {
                    L4: {
                      if (param0 == -24854) {
                        break L4;
                      } else {
                        ((wm) this).b(113);
                        break L4;
                      }
                    }
                    L5: {
                      if (null != ((wm) this).field_k) {
                        ((wm) this).field_r = new byte[((wm) this).field_z.field_d];
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((wm) this).field_B = null;
                    return ((wm) this).field_z;
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
            if (var5 != null) {
              ((wm) this).field_z = new kl(var5, ((wm) this).field_D, ((wm) this).field_x);
              if (((wm) this).field_z.field_p != ((wm) this).field_j) {
                throw new RuntimeException();
              } else {
                L6: {
                  if (param0 == -24854) {
                    break L6;
                  } else {
                    ((wm) this).b(113);
                    break L6;
                  }
                }
                L7: {
                  if (null != ((wm) this).field_k) {
                    ((wm) this).field_r = new byte[((wm) this).field_z.field_d];
                    break L7;
                  } else {
                    break L7;
                  }
                }
                ((wm) this).field_B = null;
                return ((wm) this).field_z;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_99_0 = 0;
        int stackOut_17_0 = 0;
        byte stackOut_7_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_93_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        L0: {
          L1: {
            var5 = Kickabout.field_G;
            if (((wm) this).field_t != null) {
              if (null != ((wm) this).a(-24854)) {
                L2: {
                  if (!((wm) this).field_n) {
                    break L2;
                  } else {
                    var2 = 1;
                    var3 = ((wm) this).field_t.g(24009);
                    L3: while (true) {
                      L4: {
                        L5: {
                          L6: {
                            if (var3 == null) {
                              L7: while (true) {
                                if (((wm) this).field_z.field_i.length <= ((wm) this).field_i) {
                                  break L5;
                                } else {
                                  stackOut_17_0 = ((wm) this).field_z.field_i[((wm) this).field_i];
                                  stackIn_31_0 = stackOut_17_0;
                                  stackIn_18_0 = stackOut_17_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    if (stackIn_18_0 != 0) {
                                      break L6;
                                    } else {
                                      ((wm) this).field_i = ((wm) this).field_i + 1;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                            } else {
                              var4 = (int)var3.field_a;
                              stackOut_7_0 = ((wm) this).field_r[var4];
                              stackIn_99_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var5 != 0) {
                                L8: while (true) {
                                  if (stackIn_99_0 <= ((wm) this).field_i) {
                                    break L5;
                                  } else {
                                    stackOut_97_0 = ((wm) this).field_z.field_i[((wm) this).field_i];
                                    stackIn_31_0 = stackOut_97_0;
                                    stackIn_98_0 = stackOut_97_0;
                                    if (var5 != 0) {
                                      break L4;
                                    } else {
                                      stackOut_98_0 = stackIn_98_0;
                                      stackIn_95_0 = stackOut_98_0;
                                      if (stackIn_95_0 != 0) {
                                        break L6;
                                      } else {
                                        ((wm) this).field_i = ((wm) this).field_i + 1;
                                        stackOut_101_0 = ((wm) this).field_z.field_i.length;
                                        stackIn_99_0 = stackOut_101_0;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L9: {
                                  if (stackIn_8_0 != 0) {
                                    break L9;
                                  } else {
                                    vv discarded$4 = this.a(1, var4, (byte) -30);
                                    break L9;
                                  }
                                }
                                L10: {
                                  L11: {
                                    if (-1 == (((wm) this).field_r[var4] ^ -1)) {
                                      break L11;
                                    } else {
                                      var3.c((byte) -109);
                                      if (var5 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var2 = 0;
                                  break L10;
                                }
                                var3 = ((wm) this).field_t.c(33);
                                continue L3;
                              }
                            }
                          }
                          L12: {
                            if (((wm) this).field_w.field_e >= 250) {
                              var2 = 0;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L12;
                              }
                            } else {
                              break L12;
                            }
                          }
                          L13: {
                            if (0 != ((wm) this).field_r[((wm) this).field_i]) {
                              break L13;
                            } else {
                              vv discarded$5 = this.a(1, ((wm) this).field_i, (byte) -30);
                              break L13;
                            }
                          }
                          L14: {
                            if (0 == ((wm) this).field_r[((wm) this).field_i]) {
                              var3 = new gn();
                              var3.field_a = (long)((wm) this).field_i;
                              var2 = 0;
                              ((wm) this).field_t.a(var3, 3);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          ((wm) this).field_i = ((wm) this).field_i + 1;
                          break L5;
                        }
                        stackOut_30_0 = var2;
                        stackIn_31_0 = stackOut_30_0;
                        break L4;
                      }
                      L15: {
                        if (stackIn_31_0 == 0) {
                          break L15;
                        } else {
                          ((wm) this).field_i = 0;
                          ((wm) this).field_n = false;
                          break L15;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L16: {
                  if (!((wm) this).field_g) {
                    break L16;
                  } else {
                    var2 = 1;
                    var3 = ((wm) this).field_t.g(24009);
                    L17: while (true) {
                      L18: {
                        L19: {
                          if (var3 == null) {
                            L20: while (true) {
                              if (((wm) this).field_i >= ((wm) this).field_z.field_i.length) {
                                break L18;
                              } else {
                                stackOut_47_0 = -1;
                                stackOut_47_1 = ((wm) this).field_z.field_i[((wm) this).field_i] ^ -1;
                                stackIn_66_0 = stackOut_47_0;
                                stackIn_66_1 = stackOut_47_1;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                if (var5 != 0) {
                                  break L0;
                                } else {
                                  if (stackIn_48_0 != stackIn_48_1) {
                                    break L19;
                                  } else {
                                    ((wm) this).field_i = ((wm) this).field_i + 1;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          } else {
                            var4 = (int)var3.field_a;
                            stackOut_37_0 = -2;
                            stackOut_37_1 = ((wm) this).field_r[var4] ^ -1;
                            stackIn_91_0 = stackOut_37_0;
                            stackIn_91_1 = stackOut_37_1;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            if (var5 != 0) {
                              L21: while (true) {
                                if (stackIn_91_0 >= stackIn_91_1) {
                                  break L18;
                                } else {
                                  stackOut_89_0 = -1;
                                  stackOut_89_1 = ((wm) this).field_z.field_i[((wm) this).field_i] ^ -1;
                                  stackIn_66_0 = stackOut_89_0;
                                  stackIn_66_1 = stackOut_89_1;
                                  stackIn_90_0 = stackOut_89_0;
                                  stackIn_90_1 = stackOut_89_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    stackOut_90_0 = stackIn_90_0;
                                    stackOut_90_1 = stackIn_90_1;
                                    stackIn_87_0 = stackOut_90_0;
                                    stackIn_87_1 = stackOut_90_1;
                                    if (stackIn_87_0 != stackIn_87_1) {
                                      break L19;
                                    } else {
                                      ((wm) this).field_i = ((wm) this).field_i + 1;
                                      stackOut_93_0 = ((wm) this).field_i;
                                      stackOut_93_1 = ((wm) this).field_z.field_i.length;
                                      stackIn_91_0 = stackOut_93_0;
                                      stackIn_91_1 = stackOut_93_1;
                                      continue L21;
                                    }
                                  }
                                }
                              }
                            } else {
                              L22: {
                                if (stackIn_38_0 == stackIn_38_1) {
                                  break L22;
                                } else {
                                  vv discarded$6 = this.a(2, var4, (byte) -30);
                                  break L22;
                                }
                              }
                              L23: {
                                L24: {
                                  if (1 != ((wm) this).field_r[var4]) {
                                    break L24;
                                  } else {
                                    var3.c((byte) -109);
                                    if (var5 == 0) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                var2 = 0;
                                break L23;
                              }
                              var3 = ((wm) this).field_t.c(33);
                              continue L17;
                            }
                          }
                        }
                        L25: {
                          if (((wm) this).field_l.d(10770)) {
                            var2 = 0;
                            if (var5 == 0) {
                              break L18;
                            } else {
                              break L25;
                            }
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          if ((((wm) this).field_r[((wm) this).field_i] ^ -1) == -2) {
                            break L26;
                          } else {
                            vv discarded$7 = this.a(2, ((wm) this).field_i, (byte) -30);
                            break L26;
                          }
                        }
                        L27: {
                          if (((wm) this).field_r[((wm) this).field_i] != 1) {
                            var3 = new gn();
                            var3.field_a = (long)((wm) this).field_i;
                            var2 = 0;
                            ((wm) this).field_t.a(var3, 3);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        ((wm) this).field_i = ((wm) this).field_i + 1;
                        break L18;
                      }
                      L28: {
                        if (var2 != 0) {
                          ((wm) this).field_g = false;
                          ((wm) this).field_i = 0;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                ((wm) this).field_t = null;
                break L1;
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
          stackOut_65_0 = 15;
          stackOut_65_1 = (-84 - param0) / 37;
          stackIn_66_0 = stackOut_65_0;
          stackIn_66_1 = stackOut_65_1;
          break L0;
        }
        var2 = stackIn_66_0 % stackIn_66_1;
        if (((wm) this).field_A) {
          if ((nj.a(-58) ^ -1L) <= (((wm) this).field_y ^ -1L)) {
            var3_ref = (vv) (Object) ((wm) this).field_v.b(0);
            L29: while (true) {
              if (var3_ref != null) {
                if (var5 == 0) {
                  L30: {
                    if (var3_ref.field_p) {
                      break L30;
                    } else {
                      L31: {
                        if (!var3_ref.field_n) {
                          break L31;
                        } else {
                          if (!var3_ref.field_q) {
                            throw new RuntimeException();
                          } else {
                            var3_ref.c((byte) -109);
                            if (var5 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                      }
                      var3_ref.field_n = true;
                      break L30;
                    }
                  }
                  var3_ref = (vv) (Object) ((wm) this).field_v.a(-1);
                  continue L29;
                } else {
                  return;
                }
              } else {
                ((wm) this).field_y = 1000L + nj.a(116);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
            return;
        }
        field_m = null;
        field_u = null;
        field_o = null;
    }

    private final vv a(int param0, int param1, byte param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_49_0 = 0;
        byte stackIn_49_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackIn_63_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        byte stackOut_48_0 = 0;
        byte stackOut_48_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        Object stackOut_62_0 = null;
        L0: {
          var10 = Kickabout.field_G;
          var4 = (Object) (Object) (vv) (Object) ((wm) this).field_v.a(true, (long)param1);
          if (var4 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (((vv) var4).field_q) {
                break L0;
              } else {
                if (!((vv) var4).field_p) {
                  break L0;
                } else {
                  ((vv) var4).c((byte) -109);
                  var4 = null;
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 == null) {
            L2: {
              L3: {
                if (param0 == 0) {
                  break L3;
                } else {
                  if (param0 == 1) {
                    if (null != ((wm) this).field_k) {
                      var4 = (Object) (Object) ((wm) this).field_w.a(param2 + 8977, param1, ((wm) this).field_k);
                      break L3;
                    } else {
                      throw new RuntimeException();
                    }
                  } else {
                    if (param0 == -3) {
                      if (((wm) this).field_k == null) {
                        throw new RuntimeException();
                      } else {
                        if (0 != ((wm) this).field_r[param1]) {
                          throw new RuntimeException();
                        } else {
                          if (!((wm) this).field_l.d(10770)) {
                            var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, false);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              return null;
                            }
                          } else {
                            return null;
                          }
                        }
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              L4: {
                L5: {
                  if (null == ((wm) this).field_k) {
                    break L5;
                  } else {
                    if (-1 != ((wm) this).field_r[param1]) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (!((wm) this).field_l.a(25533)) {
                  var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                  break L4;
                } else {
                  return null;
                }
              }
              var4 = (Object) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_k, param1);
              break L2;
            }
            ((wm) this).field_v.a((gn) var4, -73, (long)param1);
            break L1;
          } else {
            break L1;
          }
        }
        if (!((vv) var4).field_p) {
          if (param2 == -30) {
            var5 = ((vv) var4).b(12802);
            if (!(var4 instanceof hi)) {
              L6: {
                if (var5 == null) {
                  break L6;
                } else {
                  if (var5.length <= 2) {
                    break L6;
                  } else {
                    dg.field_b.reset();
                    dg.field_b.update(var5, 0, var5.length - 2);
                    var6 = (int)dg.field_b.getValue();
                    if (var6 == ((wm) this).field_z.field_c[param1]) {
                      if (null != ((wm) this).field_z.field_k) {
                        if (null != ((wm) this).field_z.field_k[param1]) {
                          var7 = ((wm) this).field_z.field_k[param1];
                          var8 = jj.a(-2 + var5.length, var5, (byte) 80, 0);
                          var9 = 0;
                          L7: while (true) {
                            if ((var9 ^ -1) > -65) {
                              stackOut_108_0 = var7[var9] ^ -1;
                              stackOut_108_1 = var8[var9] ^ -1;
                              stackIn_116_0 = stackOut_108_0;
                              stackIn_116_1 = stackOut_108_1;
                              stackIn_109_0 = stackOut_108_0;
                              stackIn_109_1 = stackOut_108_1;
                              if (var10 == 0) {
                                if (stackIn_116_0 != stackIn_116_1) {
                                  throw new RuntimeException();
                                } else {
                                  var9++;
                                  continue L7;
                                }
                              } else {
                                L8: {
                                  if (stackIn_109_0 != stackIn_109_1) {
                                    ((wm) this).field_r[param1] = (byte) 1;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (!((vv) var4).field_q) {
                                    ((vv) var4).c((byte) -109);
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                return (vv) var4;
                              }
                            } else {
                              L10: {
                                ((wm) this).field_l.field_o = 0;
                                ((wm) this).field_l.field_l = 0;
                                var5[-2 + var5.length] = (byte)(((wm) this).field_z.field_f[param1] >>> -1666623448);
                                var5[-1 + var5.length] = (byte)((wm) this).field_z.field_f[param1];
                                if (null == ((wm) this).field_k) {
                                  break L10;
                                } else {
                                  hi discarded$3 = ((wm) this).field_w.a(param1, ((wm) this).field_k, var5, (byte) 66);
                                  stackOut_100_0 = ((wm) this).field_r[param1] ^ -1;
                                  stackOut_100_1 = -2;
                                  stackIn_101_0 = stackOut_100_0;
                                  stackIn_101_1 = stackOut_100_1;
                                  if (stackIn_101_0 != stackIn_101_1) {
                                    ((wm) this).field_r[param1] = (byte) 1;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (!((vv) var4).field_q) {
                                  ((vv) var4).c((byte) -109);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              return (vv) var4;
                            }
                          }
                        } else {
                          L12: {
                            ((wm) this).field_l.field_o = 0;
                            ((wm) this).field_l.field_l = 0;
                            var5[-2 + var5.length] = (byte)(((wm) this).field_z.field_f[param1] >>> -1666623448);
                            var5[-1 + var5.length] = (byte)((wm) this).field_z.field_f[param1];
                            if (null == ((wm) this).field_k) {
                              break L12;
                            } else {
                              hi discarded$4 = ((wm) this).field_w.a(param1, ((wm) this).field_k, var5, (byte) 66);
                              stackOut_89_0 = ((wm) this).field_r[param1] ^ -1;
                              stackOut_89_1 = -2;
                              stackIn_90_0 = stackOut_89_0;
                              stackIn_90_1 = stackOut_89_1;
                              if (stackIn_90_0 != stackIn_90_1) {
                                ((wm) this).field_r[param1] = (byte) 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (!((vv) var4).field_q) {
                              ((vv) var4).c((byte) -109);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          return (vv) var4;
                        }
                      } else {
                        L14: {
                          ((wm) this).field_l.field_o = 0;
                          ((wm) this).field_l.field_l = 0;
                          var5[-2 + var5.length] = (byte)(((wm) this).field_z.field_f[param1] >>> -1666623448);
                          var5[-1 + var5.length] = (byte)((wm) this).field_z.field_f[param1];
                          if (null == ((wm) this).field_k) {
                            break L14;
                          } else {
                            hi discarded$5 = ((wm) this).field_w.a(param1, ((wm) this).field_k, var5, (byte) 66);
                            stackOut_79_0 = ((wm) this).field_r[param1] ^ -1;
                            stackOut_79_1 = -2;
                            stackIn_80_0 = stackOut_79_0;
                            stackIn_80_1 = stackOut_79_1;
                            if (stackIn_80_0 != stackIn_80_1) {
                              ((wm) this).field_r[param1] = (byte) 1;
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (!((vv) var4).field_q) {
                            ((vv) var4).c((byte) -109);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        return (vv) var4;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
              throw new RuntimeException();
            } else {
              try {
                L16: {
                  L17: {
                    if (var5 == null) {
                      break L17;
                    } else {
                      if (-3 > (var5.length ^ -1)) {
                        dg.field_b.reset();
                        dg.field_b.update(var5, 0, -2 + var5.length);
                        var6 = (int)dg.field_b.getValue();
                        if (((wm) this).field_z.field_c[param1] == var6) {
                          L18: {
                            L19: {
                              if (null == ((wm) this).field_z.field_k) {
                                break L19;
                              } else {
                                if (((wm) this).field_z.field_k[param1] == null) {
                                  break L19;
                                } else {
                                  var7 = ((wm) this).field_z.field_k[param1];
                                  var8 = jj.a(var5.length - 2, var5, (byte) 69, 0);
                                  var9 = 0;
                                  L20: while (true) {
                                    if (-65 >= (var9 ^ -1)) {
                                      break L19;
                                    } else {
                                      stackOut_48_0 = var8[var9];
                                      stackOut_48_1 = var7[var9];
                                      stackIn_54_0 = stackOut_48_0;
                                      stackIn_54_1 = stackOut_48_1;
                                      stackIn_49_0 = stackOut_48_0;
                                      stackIn_49_1 = stackOut_48_1;
                                      if (var10 != 0) {
                                        break L18;
                                      } else {
                                        if (stackIn_49_0 != stackIn_49_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L20;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_53_0 = var5[var5.length - 1] & 255;
                            stackOut_53_1 = (var5[var5.length - 2] & 255) << 922689160;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            break L18;
                          }
                          var7_int = stackIn_54_0 + stackIn_54_1;
                          if (var7_int == (((wm) this).field_z.field_f[param1] & 65535)) {
                            L21: {
                              if (-2 != (((wm) this).field_r[param1] ^ -1)) {
                                L22: {
                                  if (((wm) this).field_r[param1] == 0) {
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                ((wm) this).field_r[param1] = (byte) 1;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L23: {
                              if (((vv) var4).field_q) {
                                break L23;
                              } else {
                                ((vv) var4).c((byte) -109);
                                break L23;
                              }
                            }
                            stackOut_62_0 = var4;
                            stackIn_63_0 = stackOut_62_0;
                            break L16;
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L17;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
                ((wm) this).field_r[param1] = (byte)-1;
                ((vv) var4).c((byte) -109);
                if (((vv) var4).field_q) {
                  if (((wm) this).field_l.a(25533)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((wm) this).field_l.a(((wm) this).field_h, param1, (byte) 2, (byte) 89, true);
                    ((wm) this).field_v.a((gn) var4, -50, (long)param1);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (vv) (Object) stackIn_63_0;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static ut a(byte param0, ut param1, int param2) {
        ut var3 = new ut(param2, param1.field_v);
        iw.a(-59, var3);
        param1.c(0, 0);
        pt.a(on.field_g, -22914, on.field_g >> -472384991, on.field_f, 0);
        if (param0 >= -20) {
            boolean discarded$0 = wm.c((byte) 52);
        }
        param1.c(-param1.field_o + on.field_g, 0);
        ta.e(122);
        ta.e(125);
        return var3;
    }

    final byte[] b(int param0, int param1) {
        vv var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, param0, (byte) -30);
        if (var3 == null) {
          return null;
        } else {
          L0: {
            var4 = var3.b(12802);
            if (param1 == 4) {
              break L0;
            } else {
              kl discarded$2 = ((wm) this).a(21);
              break L0;
            }
          }
          var3.c((byte) -109);
          return var4;
        }
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((wm) this).field_v = new kc(16);
            ((wm) this).field_i = 0;
            ((wm) this).field_F = new tf();
            ((wm) this).field_y = 0L;
            ((wm) this).field_h = param0;
            ((wm) this).field_k = param1;
            if (((wm) this).field_k == null) {
              break L1;
            } else {
              ((wm) this).field_n = true;
              ((wm) this).field_t = new tf();
              if (Kickabout.field_G == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((wm) this).field_n = false;
          break L0;
        }
        L2: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((wm) this).field_A = stackIn_6_1 != 0;
          ((wm) this).field_j = param7;
          ((wm) this).field_D = param5;
          ((wm) this).field_w = param4;
          ((wm) this).field_x = param6;
          ((wm) this).field_l = param3;
          ((wm) this).field_q = param2;
          if (null == ((wm) this).field_q) {
            break L3;
          } else {
            ((wm) this).field_B = (vv) (Object) ((wm) this).field_w.a(-913, ((wm) this).field_q, ((wm) this).field_h);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Rating";
        field_s = 1;
    }
}
