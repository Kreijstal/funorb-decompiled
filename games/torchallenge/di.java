/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends kl {
    private rb field_y;
    private int field_s;
    static ka[] field_t;
    private vb field_G;
    private la field_v;
    private sh field_u;
    private int field_z;
    private int field_l;
    private byte[] field_k;
    private byte[] field_i;
    private tf field_C;
    static vi field_g;
    static int field_A;
    static byte[][] field_E;
    private ha field_j;
    private la field_o;
    static char field_m;
    private boolean field_q;
    private sl field_D;
    private boolean field_h;
    private int field_r;
    static k field_F;
    static String field_B;
    static String field_n;
    private sl field_w;
    private boolean field_x;
    private long field_p;

    final tf b(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            field_g = null;
            break L0;
          }
        }
        if (null != ((di) this).field_C) {
          return ((di) this).field_C;
        } else {
          L1: {
            if (((di) this).field_u != null) {
              break L1;
            } else {
              if (!((di) this).field_G.b((byte) 100)) {
                ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, param0 + 63);
                break L1;
              } else {
                return null;
              }
            }
          }
          if (!((di) this).field_u.field_v) {
            L2: {
              L3: {
                var5 = ((di) this).field_u.e(2);
                var2 = var5;
                if (((di) this).field_u instanceof al) {
                  break L3;
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((di) this).field_C = new tf(var5, ((di) this).field_l, ((di) this).field_i);
                        break L4;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((di) this).field_G.c(-30317);
                      ((di) this).field_C = null;
                      if (!((di) this).field_G.b((byte) 100)) {
                        break L5;
                      } else {
                        ((di) this).field_u = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 90);
                    return null;
                  }
                  if (null != ((di) this).field_o) {
                    al discarded$1 = ((di) this).field_y.a(((di) this).field_z, ((di) this).field_o, (byte) 111, var5);
                    if (var4 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              try {
                L6: {
                  if (var5 == null) {
                    throw new RuntimeException();
                  } else {
                    ((di) this).field_C = new tf(var5, ((di) this).field_l, ((di) this).field_i);
                    if (((di) this).field_s == ((di) this).field_C.field_b) {
                      break L6;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L7: {
                  var3 = decompiledCaughtException;
                  ((di) this).field_C = null;
                  if (!((di) this).field_G.b((byte) 100)) {
                    break L7;
                  } else {
                    ((di) this).field_u = null;
                    if (var4 != 0) {
                      break L7;
                    } else {
                      return null;
                    }
                  }
                }
                ((di) this).field_u = (sh) (Object) ((di) this).field_G.a(true, 255, ((di) this).field_z, (byte) 0, 75);
                return null;
              }
              break L2;
            }
            L8: {
              ((di) this).field_u = null;
              if (((di) this).field_v == null) {
                break L8;
              } else {
                ((di) this).field_k = new byte[((di) this).field_C.field_r];
                break L8;
              }
            }
            return ((di) this).field_C;
          } else {
            return null;
          }
        }
    }

    private final sh a(int param0, int param1, boolean param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_47_0 = 0;
        byte stackIn_47_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        byte stackOut_46_0 = 0;
        byte stackOut_46_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        Object stackOut_60_0 = null;
        L0: {
          var10 = TorChallenge.field_F ? 1 : 0;
          var4 = (Object) (Object) (sh) (Object) ((di) this).field_j.a((byte) 112, (long)param0);
          if (var4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              break L0;
            } else {
              if (((sh) var4).field_s) {
                break L0;
              } else {
                if (((sh) var4).field_v) {
                  ((sh) var4).a(true);
                  var4 = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if (param1 != 0) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      if (((di) this).field_v == null) {
                        break L5;
                      } else {
                        if (((di) this).field_k[param0] != -1) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (!((di) this).field_G.b((byte) 100)) {
                      var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 92);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    } else {
                      return null;
                    }
                  }
                  var4 = (Object) (Object) ((di) this).field_y.a(((di) this).field_v, true, param0);
                  if (var10 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (1 == param1) {
                if (null == ((di) this).field_v) {
                  throw new RuntimeException();
                } else {
                  var4 = (Object) (Object) ((di) this).field_y.a(param0, 3, ((di) this).field_v);
                  break L2;
                }
              } else {
                if (2 != param1) {
                  throw new RuntimeException();
                } else {
                  if (((di) this).field_v == null) {
                    throw new RuntimeException();
                  } else {
                    if (-1 != ((di) this).field_k[param0]) {
                      throw new RuntimeException();
                    } else {
                      if (!((di) this).field_G.a(true)) {
                        var4 = (Object) (Object) ((di) this).field_G.a(false, ((di) this).field_z, param0, (byte) 2, 60);
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
                }
              }
            }
            ((di) this).field_j.a(-111, (da) var4, (long)param0);
            break L1;
          }
        }
        if (!((sh) var4).field_v) {
          var5 = ((sh) var4).e(2);
          if (!(var4 instanceof al)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var5.length <= 2) {
                      break L7;
                    } else {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, -2 + var5.length);
                      var6_int = (int)vc.field_c.getValue();
                      if (((di) this).field_C.field_t[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          if (null == ((di) this).field_C.field_n) {
                            break L8;
                          } else {
                            if (null == ((di) this).field_C.field_n[param0]) {
                              break L8;
                            } else {
                              var7 = ((di) this).field_C.field_n[param0];
                              var8 = qc.a(var5, -2 + var5.length, (byte) -82, 0);
                              var9 = 0;
                              L9: while (true) {
                                if (var9 >= 64) {
                                  break L8;
                                } else {
                                  stackOut_79_0 = ~var7[var9];
                                  stackOut_79_1 = ~var8[var9];
                                  stackIn_95_0 = stackOut_79_0;
                                  stackIn_95_1 = stackOut_79_1;
                                  stackIn_80_0 = stackOut_79_0;
                                  stackIn_80_1 = stackOut_79_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L6;
                                  } else {
                                    if (stackIn_80_0 != stackIn_80_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L9;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((di) this).field_G.field_h = 0;
                        ((di) this).field_G.field_b = 0;
                        decompiledRegionSelector0 = 1;
                        break L6;
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L10: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                ((di) this).field_G.c(-30317);
                ((sh) var4).a(true);
                if (((sh) var4).field_s) {
                  if (!((di) this).field_G.b((byte) 100)) {
                    var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 108);
                    ((di) this).field_j.a(47, (da) var4, (long)param0);
                    break L10;
                  } else {
                    return null;
                  }
                } else {
                  break L10;
                }
              }
              return null;
            }
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  break L12;
                } else {
                  var5[-2 + var5.length] = (byte)(((di) this).field_C.field_d[param0] >>> 8);
                  var5[-1 + var5.length] = (byte)((di) this).field_C.field_d[param0];
                  if (null != ((di) this).field_v) {
                    al discarded$1 = ((di) this).field_y.a(param0, ((di) this).field_v, (byte) 111, var5);
                    stackOut_94_0 = -2;
                    stackOut_94_1 = ~((di) this).field_k[param0];
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
              if (stackIn_95_0 == stackIn_95_1) {
                break L11;
              } else {
                ((di) this).field_k[param0] = (byte) 1;
                break L11;
              }
            }
            L13: {
              if (((sh) var4).field_s) {
                break L13;
              } else {
                ((sh) var4).a(true);
                break L13;
              }
            }
            return (sh) var4;
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (2 < var5.length) {
                      vc.field_c.reset();
                      vc.field_c.update(var5, 0, var5.length + -2);
                      var6_int = (int)vc.field_c.getValue();
                      if (((di) this).field_C.field_t[param0] == var6_int) {
                        L16: {
                          L17: {
                            if (((di) this).field_C.field_n == null) {
                              break L17;
                            } else {
                              if (null == ((di) this).field_C.field_n[param0]) {
                                break L17;
                              } else {
                                var7 = ((di) this).field_C.field_n[param0];
                                var8 = qc.a(var5, var5.length - 2, (byte) -117, 0);
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= 64) {
                                    break L17;
                                  } else {
                                    stackOut_46_0 = var7[var9];
                                    stackOut_46_1 = var8[var9];
                                    stackIn_51_0 = stackOut_46_0;
                                    stackIn_51_1 = stackOut_46_1;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    if (var10 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_47_0 == stackIn_47_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L18;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_50_0 = 65280 & var5[-2 + var5.length] << 8;
                          stackOut_50_1 = var5[var5.length + -1] & 255;
                          stackIn_51_0 = stackOut_50_0;
                          stackIn_51_1 = stackOut_50_1;
                          break L16;
                        }
                        var7_int = stackIn_51_0 + stackIn_51_1;
                        if (~var7_int != ~(((di) this).field_C.field_d[param0] & 65535)) {
                          throw new RuntimeException();
                        } else {
                          L19: {
                            if (((di) this).field_k[param0] == 1) {
                              break L19;
                            } else {
                              L20: {
                                if (((di) this).field_k[param0] != 0) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ((di) this).field_k[param0] = (byte) 1;
                              break L19;
                            }
                          }
                          L21: {
                            if (((sh) var4).field_s) {
                              break L21;
                            } else {
                              ((sh) var4).a(true);
                              break L21;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L14;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L15;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Exception) (Object) decompiledCaughtException;
              ((di) this).field_k[param0] = (byte) -1;
              ((sh) var4).a(true);
              if (((sh) var4).field_s) {
                L22: {
                  if (!((di) this).field_G.b((byte) 100)) {
                    var4 = (Object) (Object) ((di) this).field_G.a(true, ((di) this).field_z, param0, (byte) 2, 79);
                    ((di) this).field_j.a(-100, (da) var4, (long)param0);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            return (sh) (Object) stackIn_61_0;
          }
        } else {
          return null;
        }
    }

    final void d(int param0) {
        if (param0 != 14) {
            int discarded$0 = ((di) this).a(-90, -21);
        }
        if (!(null != ((di) this).field_v)) {
            return;
        }
        ((di) this).field_h = true;
        if (!(((di) this).field_D != null)) {
            ((di) this).field_D = new sl();
        }
    }

    final byte[] a(int param0, byte param1) {
        sh var3 = this.a(param0, 0, false);
        if (var3 == null) {
            return null;
        }
        if (param1 != -72) {
            di.a(true);
        }
        byte[] var4 = var3.e(param1 + 74);
        var3.a(true);
        return var4;
    }

    final void c(int param0) {
        sh var2 = null;
        int var2_int = 0;
        da var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        byte stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_34_0 = 0;
        byte stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackOut_9_0 = 0;
        byte stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_33_0 = 0;
        byte stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_67_0 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (param0 <= -43) {
            break L0;
          } else {
            byte[] discarded$7 = ((di) this).a(92, (byte) -25);
            break L0;
          }
        }
        L1: {
          if (((di) this).field_D == null) {
            break L1;
          } else {
            if (null == ((di) this).b(0)) {
              return;
            } else {
              L2: {
                if (!((di) this).field_q) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = ((di) this).field_D.c((byte) 114);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_9_0 = 0;
                            stackOut_9_1 = ((di) this).field_k[var4];
                            stackIn_19_0 = stackOut_9_0;
                            stackIn_19_1 = stackOut_9_1;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_19_0 <= stackIn_19_1) {
                                  break L5;
                                } else {
                                  stackOut_20_0 = ((di) this).field_C.field_e[((di) this).field_r];
                                  stackIn_34_0 = stackOut_20_0;
                                  stackIn_21_0 = stackOut_20_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_21_0 != 0) {
                                          break L9;
                                        } else {
                                          ((di) this).field_r = ((di) this).field_r + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (250 <= ((di) this).field_y.field_e) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (0 != ((di) this).field_k[((di) this).field_r]) {
                                          break L11;
                                        } else {
                                          sh discarded$8 = this.a(((di) this).field_r, 1, false);
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (0 == ((di) this).field_k[((di) this).field_r]) {
                                          var3 = new da();
                                          var3.field_d = (long)((di) this).field_r;
                                          var2_int = 0;
                                          ((di) this).field_D.a(var3, -36);
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      ((di) this).field_r = ((di) this).field_r + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_18_0 = ((di) this).field_C.field_e.length;
                                    stackOut_18_1 = ((di) this).field_r;
                                    stackIn_19_0 = stackOut_18_0;
                                    stackIn_19_1 = stackOut_18_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_10_0 == stackIn_10_1) {
                                  sh discarded$9 = this.a(var4, 1, false);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((di) this).field_k[var4] != 0) {
                                    break L15;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var3.a(true);
                                break L14;
                              }
                              var3 = ((di) this).field_D.c(-270);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_136_0 = ((di) this).field_C.field_e.length;
                          stackOut_136_1 = ((di) this).field_r;
                          stackIn_134_0 = stackOut_136_0;
                          stackIn_134_1 = stackOut_136_1;
                          if (stackIn_134_0 <= stackIn_134_1) {
                            break L5;
                          } else {
                            stackOut_132_0 = ((di) this).field_C.field_e[((di) this).field_r];
                            stackIn_34_0 = stackOut_132_0;
                            stackIn_133_0 = stackOut_132_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_133_0 = stackIn_133_0;
                              stackIn_130_0 = stackOut_133_0;
                              L17: {
                                if (stackIn_130_0 != 0) {
                                  break L17;
                                } else {
                                  ((di) this).field_r = ((di) this).field_r + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (250 <= ((di) this).field_y.field_e) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (0 != ((di) this).field_k[((di) this).field_r]) {
                                  break L19;
                                } else {
                                  sh discarded$10 = this.a(((di) this).field_r, 1, false);
                                  break L19;
                                }
                              }
                              L20: {
                                if (0 == ((di) this).field_k[((di) this).field_r]) {
                                  var3 = new da();
                                  var3.field_d = (long)((di) this).field_r;
                                  var2_int = 0;
                                  ((di) this).field_D.a(var3, -36);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              ((di) this).field_r = ((di) this).field_r + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_33_0 = var2_int;
                      stackIn_34_0 = stackOut_33_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_34_0 != 0) {
                        ((di) this).field_q = false;
                        ((di) this).field_r = 0;
                        break L21;
                      } else {
                        break L21;
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
              L22: {
                if (((di) this).field_h) {
                  break L22;
                } else {
                  ((di) this).field_D = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L22;
                  }
                }
              }
              var2_int = 1;
              var3 = ((di) this).field_D.c((byte) 123);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_d;
                        stackOut_43_0 = ((di) this).field_k[var4];
                        stackOut_43_1 = 1;
                        stackIn_54_0 = stackOut_43_0;
                        stackIn_54_1 = stackOut_43_1;
                        stackIn_44_0 = stackOut_43_0;
                        stackIn_44_1 = stackOut_43_1;
                        if (var5 != 0) {
                          L27: while (true) {
                            if (stackIn_54_0 >= stackIn_54_1) {
                              break L25;
                            } else {
                              stackOut_55_0 = -1;
                              stackIn_68_0 = stackOut_55_0;
                              stackIn_56_0 = stackOut_55_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                L28: {
                                  L29: {
                                    if (stackIn_56_0 == ~((di) this).field_C.field_e[((di) this).field_r]) {
                                      ((di) this).field_r = ((di) this).field_r + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (!((di) this).field_G.a(true)) {
                                      break L30;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L30;
                                      }
                                    }
                                  }
                                  L31: {
                                    if (((di) this).field_k[((di) this).field_r] == 1) {
                                      break L31;
                                    } else {
                                      sh discarded$11 = this.a(((di) this).field_r, 2, false);
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (((di) this).field_k[((di) this).field_r] != 1) {
                                      var3 = new da();
                                      var3.field_d = (long)((di) this).field_r;
                                      ((di) this).field_D.a(var3, -62);
                                      var2_int = 0;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  ((di) this).field_r = ((di) this).field_r + 1;
                                  if (var5 == 0) {
                                    break L28;
                                  } else {
                                    break L25;
                                  }
                                }
                                stackOut_53_0 = ~((di) this).field_C.field_e.length;
                                stackOut_53_1 = ~((di) this).field_r;
                                stackIn_54_0 = stackOut_53_0;
                                stackIn_54_1 = stackOut_53_1;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L33: {
                            if (stackIn_44_0 != stackIn_44_1) {
                              sh discarded$12 = this.a(var4, 2, false);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              if (((di) this).field_k[var4] != 1) {
                                break L35;
                              } else {
                                var3.a(true);
                                if (var5 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2_int = 0;
                            break L34;
                          }
                          var3 = ((di) this).field_D.c(-270);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L36: while (true) {
                      stackOut_112_0 = ~((di) this).field_C.field_e.length;
                      stackOut_112_1 = ~((di) this).field_r;
                      stackIn_110_0 = stackOut_112_0;
                      stackIn_110_1 = stackOut_112_1;
                      if (stackIn_110_0 >= stackIn_110_1) {
                        break L25;
                      } else {
                        stackOut_108_0 = -1;
                        stackIn_68_0 = stackOut_108_0;
                        stackIn_109_0 = stackOut_108_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          stackOut_109_0 = stackIn_109_0;
                          stackIn_106_0 = stackOut_109_0;
                          L37: {
                            if (stackIn_106_0 == ~((di) this).field_C.field_e[((di) this).field_r]) {
                              ((di) this).field_r = ((di) this).field_r + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (!((di) this).field_G.a(true)) {
                              break L38;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (((di) this).field_k[((di) this).field_r] == 1) {
                              break L39;
                            } else {
                              sh discarded$13 = this.a(((di) this).field_r, 2, false);
                              break L39;
                            }
                          }
                          L40: {
                            if (((di) this).field_k[((di) this).field_r] != 1) {
                              var3 = new da();
                              var3.field_d = (long)((di) this).field_r;
                              ((di) this).field_D.a(var3, -62);
                              var2_int = 0;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          ((di) this).field_r = ((di) this).field_r + 1;
                          if (var5 == 0) {
                            continue L36;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  stackOut_67_0 = var2_int;
                  stackIn_68_0 = stackOut_67_0;
                  break L24;
                }
                if (stackIn_68_0 != 0) {
                  ((di) this).field_r = 0;
                  ((di) this).field_h = false;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L41: {
          if (!((di) this).field_x) {
            break L41;
          } else {
            if (~((di) this).field_p >= ~ol.a(256)) {
              var2 = (sh) (Object) ((di) this).field_j.a((byte) -73);
              L42: while (true) {
                L43: {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L43;
                      } else {
                        L45: {
                          L46: {
                            if (!var2.field_v) {
                              break L46;
                            } else {
                              if (var5 == 0) {
                                break L45;
                              } else {
                                break L46;
                              }
                            }
                          }
                          L47: {
                            if (!var2.field_p) {
                              break L47;
                            } else {
                              if (!var2.field_s) {
                                throw new RuntimeException();
                              } else {
                                var2.a(true);
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                          }
                          var2.field_p = true;
                          break L45;
                        }
                        var2 = (sh) (Object) ((di) this).field_j.a(-27377);
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  ((di) this).field_p = ol.a(256) + 1000L;
                  break L43;
                }
                break L41;
              }
            } else {
              break L41;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
    }

    final void a(byte param0) {
        da var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        if (null == ((di) this).field_D) {
          return;
        } else {
          if (((di) this).b(0) == null) {
            return;
          } else {
            L0: {
              if (param0 < -107) {
                break L0;
              } else {
                ((di) this).field_p = 74L;
                break L0;
              }
            }
            var2 = ((di) this).field_w.c((byte) -61);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_d;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (~((di) this).field_C.field_r >= ~var3) {
                              break L5;
                            } else {
                              if (((di) this).field_C.field_e[var3] == 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.a(true);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((di) this).field_k[var3] != 0) {
                          break L6;
                        } else {
                          sh discarded$4 = this.a(var3, 1, false);
                          break L6;
                        }
                      }
                      L7: {
                        if (((di) this).field_k[var3] != -1) {
                          break L7;
                        } else {
                          sh discarded$5 = this.a(var3, 2, false);
                          break L7;
                        }
                      }
                      if (((di) this).field_k[var3] != 1) {
                        break L3;
                      } else {
                        var2.a(true);
                        break L3;
                      }
                    }
                    var2 = ((di) this).field_w.c(-270);
                    if (var4 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              return;
            }
          }
        }
    }

    final int a(int param0, int param1) {
        sh var3 = (sh) (Object) ((di) this).field_j.a((byte) 91, (long)param1);
        if (param0 != 0) {
            tf discarded$0 = ((di) this).b(124);
        }
        if (var3 != null) {
            return var3.f(100);
        }
        return 0;
    }

    di(int param0, la param1, la param2, vb param3, rb param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((di) this).field_j = new ha(16);
        ((di) this).field_r = 0;
        ((di) this).field_w = new sl();
        ((di) this).field_p = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((di) this).field_v = param1;
                ((di) this).field_z = param0;
                if (null != ((di) this).field_v) {
                  break L2;
                } else {
                  ((di) this).field_q = false;
                  if (!TorChallenge.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((di) this).field_q = true;
              ((di) this).field_D = new sl();
              break L1;
            }
            L3: {
              ((di) this).field_s = param7;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((di) this).field_x = stackIn_7_1 != 0;
              ((di) this).field_o = param2;
              ((di) this).field_i = param6;
              ((di) this).field_G = param3;
              ((di) this).field_y = param4;
              ((di) this).field_l = param5;
              if (null == ((di) this).field_o) {
                break L4;
              } else {
                ((di) this).field_u = (sh) (Object) ((di) this).field_y.a(((di) this).field_o, true, ((di) this).field_z);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("di.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new byte[1000][];
        field_g = new vi();
        field_F = new k(14, 0, 4, 1);
        field_B = " - Not available to this monk.";
        field_n = "achievements to collect";
    }
}
