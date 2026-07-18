/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am extends rb {
    private te field_k;
    private sg field_x;
    static hr[] field_j;
    private ti field_q;
    static int[] field_z;
    static vf field_e;
    private int field_y;
    private int field_u;
    private wl field_f;
    private gd field_r;
    private wl field_h;
    private byte[] field_p;
    private byte[] field_w;
    private rw field_i;
    private int field_v;
    private boolean field_l;
    private int field_g;
    private jn field_s;
    private boolean field_o;
    private jn field_n;
    private long field_t;
    private boolean field_m;

    public static void d(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_z = null;
              if (param0 <= -78) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "am.G(" + param0 + ')');
        }
    }

    final sg b(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        sg stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_51_0 = null;
        sg stackIn_60_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_36_0 = null;
        sg stackOut_59_0 = null;
        Object stackOut_19_0 = null;
        sg stackOut_2_0 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (null == ((am) this).field_x) {
              L1: {
                if (((am) this).field_i == null) {
                  if (((am) this).field_r.a(-88)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (sg) (Object) stackIn_11_0;
                  } else {
                    ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -88, (byte) 0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (((am) this).field_i.field_u) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (sg) (Object) stackIn_17_0;
              } else {
                if (param0 < -62) {
                  L2: {
                    var2_array = ((am) this).field_i.d(false);
                    if (!(((am) this).field_i instanceof ql)) {
                      try {
                        L3: {
                          if (var2_array == null) {
                            throw new RuntimeException();
                          } else {
                            ((am) this).field_x = new sg(var2_array, ((am) this).field_y, ((am) this).field_w);
                            break L3;
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          L5: {
                            var3 = decompiledCaughtException;
                            ((am) this).field_r.b(14702);
                            ((am) this).field_x = null;
                            if (!((am) this).field_r.a(-6)) {
                              break L5;
                            } else {
                              ((am) this).field_i = null;
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) 90, (byte) 0);
                          break L4;
                        }
                        stackOut_50_0 = null;
                        stackIn_51_0 = stackOut_50_0;
                        return (sg) (Object) stackIn_51_0;
                      }
                      if (((am) this).field_f != null) {
                        ql discarded$1 = ((am) this).field_q.a(((am) this).field_u, var2_array, 2, ((am) this).field_f);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      try {
                        L6: {
                          if (null != var2_array) {
                            ((am) this).field_x = new sg(var2_array, ((am) this).field_y, ((am) this).field_w);
                            if (~((am) this).field_x.field_l != ~((am) this).field_v) {
                              throw new RuntimeException();
                            } else {
                              break L6;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L7: {
                          L8: {
                            var3 = decompiledCaughtException;
                            ((am) this).field_x = null;
                            if (!((am) this).field_r.a(122)) {
                              break L8;
                            } else {
                              ((am) this).field_i = null;
                              if (var4 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -81, (byte) 0);
                          break L7;
                        }
                        stackOut_36_0 = null;
                        stackIn_37_0 = stackOut_36_0;
                        return (sg) (Object) stackIn_37_0;
                      }
                      break L2;
                    }
                  }
                  L9: {
                    ((am) this).field_i = null;
                    if (((am) this).field_h == null) {
                      break L9;
                    } else {
                      ((am) this).field_p = new byte[((am) this).field_x.field_d];
                      break L9;
                    }
                  }
                  stackOut_59_0 = ((am) this).field_x;
                  stackIn_60_0 = stackOut_59_0;
                  break L0;
                } else {
                  stackOut_19_0 = null;
                  stackIn_20_0 = stackOut_19_0;
                  return (sg) (Object) stackIn_20_0;
                }
              }
            } else {
              stackOut_2_0 = ((am) this).field_x;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "am.D(" + param0 + ')');
        }
        return stackIn_60_0;
    }

    final void b(int param0) {
        RuntimeException runtimeException = null;
        ms var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (((am) this).field_n != null) {
              L1: {
                if (param0 <= -18) {
                  break L1;
                } else {
                  ((am) this).c((byte) 124);
                  break L1;
                }
              }
              if (((am) this).b((byte) -120) == null) {
                return;
              } else {
                var2 = ((am) this).field_s.b(-72);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2) {
                        break L4;
                      } else {
                        var3 = (int)var2.field_h;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (((am) this).field_x.field_d <= var3) {
                                    break L7;
                                  } else {
                                    if (((am) this).field_x.field_m[var3] == 0) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2.b(false);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((am) this).field_p[var3] != 0) {
                                break L8;
                              } else {
                                rw discarded$3 = this.a(var3, 1, 30561);
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 == ((am) this).field_p[var3]) {
                                rw discarded$4 = this.a(var3, 2, 30561);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((am) this).field_p[var3] != 1) {
                              break L5;
                            } else {
                              var2.b(false);
                              break L5;
                            }
                          }
                          var2 = ((am) this).field_s.d((byte) 18);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qo.a((Throwable) (Object) runtimeException, "am.F(" + param0 + ')');
        }
    }

    private final rw a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_58_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        Object stackIn_96_0 = null;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        Object stackIn_109_0 = null;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        Object stackIn_149_0 = null;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        Object stackOut_148_0 = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        Object stackOut_95_0 = null;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        Object stackOut_108_0 = null;
        Object stackOut_57_0 = null;
        Object stackOut_155_0 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (rw) (Object) ((am) this).field_k.a(120, (long)param0);
              if (null == var4) {
                break L0;
              } else {
                if (param1 != 0) {
                  break L0;
                } else {
                  if (((rw) var4).field_t) {
                    break L0;
                  } else {
                    if (!((rw) var4).field_u) {
                      break L0;
                    } else {
                      ((rw) var4).b(false);
                      var4 = null;
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
                          if (null == ((am) this).field_h) {
                            break L5;
                          } else {
                            if (((am) this).field_p[param0] != -1) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (!((am) this).field_r.a(119)) {
                          var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) -87, (byte) 2);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_25_0 = null;
                          stackIn_26_0 = stackOut_25_0;
                          return (rw) (Object) stackIn_26_0;
                        }
                      }
                      var4 = (Object) (Object) ((am) this).field_q.a(((am) this).field_h, -128, param0);
                      if (var10 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L6: {
                    if (1 == param1) {
                      break L6;
                    } else {
                      if (2 == param1) {
                        if (((am) this).field_h == null) {
                          throw new RuntimeException();
                        } else {
                          if (((am) this).field_p[param0] == -1) {
                            if (!((am) this).field_r.b(true)) {
                              var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, false, param0, (byte) -126, (byte) 2);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L6;
                              }
                            } else {
                              stackOut_45_0 = null;
                              stackIn_46_0 = stackOut_45_0;
                              return (rw) (Object) stackIn_46_0;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  if (null == ((am) this).field_h) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((am) this).field_q.a(param0, -82, ((am) this).field_h);
                    break L2;
                  }
                }
                ((am) this).field_k.a((ms) var4, param2 ^ -30562, (long)param0);
                break L1;
              }
            }
            if (!((rw) var4).field_u) {
              L7: {
                var5 = ((rw) var4).d(false);
                if (param2 == 30561) {
                  break L7;
                } else {
                  ((am) this).field_p = null;
                  break L7;
                }
              }
              if (var4 instanceof ql) {
                L8: {
                  if (null == var5) {
                    break L8;
                  } else {
                    if (var5.length > 2) {
                      pt.field_c.reset();
                      pt.field_c.update(var5, 0, -2 + var5.length);
                      var6_int = (int)pt.field_c.getValue();
                      if (((am) this).field_x.field_b[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L9: {
                          L10: {
                            if (((am) this).field_x.field_a == null) {
                              break L10;
                            } else {
                              if (((am) this).field_x.field_a[param0] != null) {
                                var7_ref_byte__ = ((am) this).field_x.field_a[param0];
                                var8 = gn.a(var5, (byte) -109, 0, var5.length + -2);
                                var9 = 0;
                                L11: while (true) {
                                  if (var9 >= 64) {
                                    break L10;
                                  } else {
                                    stackOut_128_0 = ~var7_ref_byte__[var9];
                                    stackOut_128_1 = ~var8[var9];
                                    stackIn_136_0 = stackOut_128_0;
                                    stackIn_136_1 = stackOut_128_1;
                                    stackIn_129_0 = stackOut_128_0;
                                    stackIn_129_1 = stackOut_128_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_129_0 == stackIn_129_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L11;
                                        } else {
                                          break L10;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                          }
                          stackOut_135_0 = var5[-1 + var5.length] & 255;
                          stackOut_135_1 = 65280 & var5[-2 + var5.length] << 1213445768;
                          stackIn_136_0 = stackOut_135_0;
                          stackIn_136_1 = stackOut_135_1;
                          break L9;
                        }
                        var7 = stackIn_136_0 + stackIn_136_1;
                        if (var7 != (65535 & ((am) this).field_x.field_c[param0])) {
                          throw new RuntimeException();
                        } else {
                          L12: {
                            if (1 == ((am) this).field_p[param0]) {
                              break L12;
                            } else {
                              L13: {
                                if (((am) this).field_p[param0] == 0) {
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((am) this).field_p[param0] = (byte) 1;
                              break L12;
                            }
                          }
                          L14: {
                            if (((rw) var4).field_t) {
                              break L14;
                            } else {
                              ((rw) var4).b(false);
                              break L14;
                            }
                          }
                          stackOut_148_0 = var4;
                          stackIn_149_0 = stackOut_148_0;
                          return (rw) (Object) stackIn_149_0;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L15: {
                    L16: {
                      if (null == var5) {
                        break L16;
                      } else {
                        if (var5.length > 2) {
                          pt.field_c.reset();
                          pt.field_c.update(var5, 0, var5.length - 2);
                          var6_int = (int)pt.field_c.getValue();
                          if (((am) this).field_x.field_b[param0] != var6_int) {
                            throw new RuntimeException();
                          } else {
                            L17: {
                              if (null == ((am) this).field_x.field_a) {
                                break L17;
                              } else {
                                if (((am) this).field_x.field_a[param0] == null) {
                                  break L17;
                                } else {
                                  var7_ref_byte__ = ((am) this).field_x.field_a[param0];
                                  var8 = gn.a(var5, (byte) -110, 0, -2 + var5.length);
                                  var9 = 0;
                                  L18: while (true) {
                                    if (64 <= var9) {
                                      break L17;
                                    } else {
                                      stackOut_79_0 = var8[var9];
                                      stackOut_79_1 = var7_ref_byte__[var9];
                                      stackIn_101_0 = stackOut_79_0;
                                      stackIn_101_1 = stackOut_79_1;
                                      stackIn_80_0 = stackOut_79_0;
                                      stackIn_80_1 = stackOut_79_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L15;
                                      } else {
                                        if (stackIn_80_0 != stackIn_80_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ((am) this).field_r.field_d = 0;
                            ((am) this).field_r.field_j = 0;
                            decompiledRegionSelector0 = 1;
                            break L15;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L19: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((am) this).field_r.b(14702);
                    ((rw) var4).b(false);
                    if (((rw) var4).field_t) {
                      if (!((am) this).field_r.a(param2 + -30435)) {
                        var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) -69, (byte) 2);
                        ((am) this).field_k.a((ms) var4, -1, (long)param0);
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  stackOut_95_0 = null;
                  stackIn_96_0 = stackOut_95_0;
                  return (rw) (Object) stackIn_96_0;
                }
                L20: {
                  L21: {
                    if (decompiledRegionSelector0 == 0) {
                      break L21;
                    } else {
                      var5[var5.length - 2] = (byte)(((am) this).field_x.field_c[param0] >>> 368142120);
                      var5[-1 + var5.length] = (byte)((am) this).field_x.field_c[param0];
                      if (null != ((am) this).field_h) {
                        ql discarded$1 = ((am) this).field_q.a(param0, var5, 2, ((am) this).field_h);
                        stackOut_100_0 = ~((am) this).field_p[param0];
                        stackOut_100_1 = -2;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  if (stackIn_101_0 != stackIn_101_1) {
                    ((am) this).field_p[param0] = (byte) 1;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L22: {
                  if (!((rw) var4).field_t) {
                    ((rw) var4).b(false);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                stackOut_108_0 = var4;
                stackIn_109_0 = stackOut_108_0;
                return (rw) (Object) stackIn_109_0;
              }
            } else {
              stackOut_57_0 = null;
              stackIn_58_0 = stackOut_57_0;
              return (rw) (Object) stackIn_58_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L23: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((am) this).field_p[param0] = (byte) -1;
              ((rw) var4).b(false);
              if (((rw) var4).field_t) {
                if (((am) this).field_r.a(param2 + -30551)) {
                  break L23;
                } else {
                  var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) 78, (byte) 2);
                  ((am) this).field_k.a((ms) var4, -1, (long)param0);
                  break L23;
                }
              } else {
                break L23;
              }
            }
            stackOut_155_0 = null;
            stackIn_156_0 = stackOut_155_0;
            return (rw) (Object) stackIn_156_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw qo.a((Throwable) var4, "am.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        rw var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_5_0 = null;
        try {
          L0: {
            var3 = this.a(param0, 0, 30561);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.d(param1);
              var3.b(param1);
              stackOut_5_0 = (byte[]) var4;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3_ref, "am.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((am) this).field_h != null) {
              L1: {
                ((am) this).field_o = true;
                if (((am) this).field_n != null) {
                  break L1;
                } else {
                  ((am) this).field_n = new jn();
                  break L1;
                }
              }
              var2_int = -71 / ((param0 - -2) / 46);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "am.H(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        rw var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var3 = (rw) (Object) ((am) this).field_k.a(param1 + 120, (long)param0);
            if (var3 != null) {
              stackOut_3_0 = var3.a(-1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param1 == 0) {
                  break L1;
                } else {
                  ((am) this).field_o = true;
                  break L1;
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3_ref, "am.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        rw var2_ref = null;
        ms var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_95_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null != ((am) this).field_n) {
                  if (null == ((am) this).b((byte) -102)) {
                    return;
                  } else {
                    L3: {
                      if (((am) this).field_l) {
                        break L3;
                      } else {
                        L4: {
                          if (((am) this).field_o) {
                            break L4;
                          } else {
                            ((am) this).field_n = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((am) this).field_n.b(89);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_h;
                                stackOut_17_0 = -2;
                                stackOut_17_1 = ~((am) this).field_p[var4];
                                stackIn_30_0 = stackOut_17_0;
                                stackIn_30_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_30_0 >= stackIn_30_1) {
                                      break L6;
                                    } else {
                                      stackOut_31_0 = ~((am) this).field_x.field_m[((am) this).field_g];
                                      stackOut_31_1 = -1;
                                      stackIn_95_0 = stackOut_31_0;
                                      stackIn_95_1 = stackOut_31_1;
                                      stackIn_32_0 = stackOut_31_0;
                                      stackIn_32_1 = stackOut_31_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = stackIn_32_1;
                                        stackIn_34_0 = stackOut_32_0;
                                        stackIn_34_1 = stackOut_32_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_34_0 == stackIn_34_1) {
                                              ((am) this).field_g = ((am) this).field_g + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (((am) this).field_r.b(true)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((am) this).field_p[((am) this).field_g] != 1) {
                                              rw discarded$5 = this.a(((am) this).field_g, 2, 30561);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((am) this).field_p[((am) this).field_g] == 1) {
                                              break L13;
                                            } else {
                                              var3 = new ms();
                                              var3.field_h = (long)((am) this).field_g;
                                              var2_int = 0;
                                              ((am) this).field_n.a(var3, (byte) 39);
                                              break L13;
                                            }
                                          }
                                          ((am) this).field_g = ((am) this).field_g + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_29_0 = ~((am) this).field_x.field_m.length;
                                        stackOut_29_1 = ~((am) this).field_g;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_18_0 != stackIn_18_1) {
                                      rw discarded$6 = this.a(var4, 2, 30561);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((am) this).field_p[var4] != 1) {
                                        break L16;
                                      } else {
                                        var3.b(false);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((am) this).field_n.d((byte) 18);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_29_0 = ~((am) this).field_x.field_m.length;
                              stackOut_29_1 = ~((am) this).field_g;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              if (stackIn_30_0 >= stackIn_30_1) {
                                break L6;
                              } else {
                                stackOut_31_0 = ~((am) this).field_x.field_m[((am) this).field_g];
                                stackOut_31_1 = -1;
                                stackIn_95_0 = stackOut_31_0;
                                stackIn_95_1 = stackOut_31_1;
                                stackIn_32_0 = stackOut_31_0;
                                stackIn_32_1 = stackOut_31_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_32_0 = stackIn_32_0;
                                  stackOut_32_1 = stackIn_32_1;
                                  stackIn_34_0 = stackOut_32_0;
                                  stackIn_34_1 = stackOut_32_1;
                                  L18: {
                                    if (stackIn_34_0 == stackIn_34_1) {
                                      ((am) this).field_g = ((am) this).field_g + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (((am) this).field_r.b(true)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((am) this).field_p[((am) this).field_g] != 1) {
                                      rw discarded$5 = this.a(((am) this).field_g, 2, 30561);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((am) this).field_p[((am) this).field_g] == 1) {
                                      break L21;
                                    } else {
                                      var3 = new ms();
                                      var3.field_h = (long)((am) this).field_g;
                                      var2_int = 0;
                                      ((am) this).field_n.a(var3, (byte) 39);
                                      break L21;
                                    }
                                  }
                                  ((am) this).field_g = ((am) this).field_g + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2_int == 0) {
                              break L22;
                            } else {
                              ((am) this).field_g = 0;
                              ((am) this).field_o = false;
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((am) this).field_n.b(122);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (null == var3) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_h;
                            stackOut_58_0 = -1;
                            stackOut_58_1 = ~((am) this).field_p[var4];
                            stackIn_70_0 = stackOut_58_0;
                            stackIn_70_1 = stackOut_58_1;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_70_0 >= stackIn_70_1) {
                                  break L24;
                                } else {
                                  stackOut_71_0 = -1;
                                  stackOut_71_1 = ~((am) this).field_x.field_m[((am) this).field_g];
                                  stackIn_95_0 = stackOut_71_0;
                                  stackIn_95_1 = stackOut_71_1;
                                  stackIn_72_0 = stackOut_71_0;
                                  stackIn_72_1 = stackOut_71_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_72_0 = stackIn_72_0;
                                    stackOut_72_1 = stackIn_72_1;
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_74_1 = stackOut_72_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_74_0 == stackIn_74_1) {
                                          ((am) this).field_g = ((am) this).field_g + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (250 <= ((am) this).field_q.field_e) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (((am) this).field_p[((am) this).field_g] != 0) {
                                          break L30;
                                        } else {
                                          rw discarded$7 = this.a(((am) this).field_g, 1, 30561);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (0 != ((am) this).field_p[((am) this).field_g]) {
                                          break L31;
                                        } else {
                                          var3 = new ms();
                                          var3.field_h = (long)((am) this).field_g;
                                          ((am) this).field_n.a(var3, (byte) 39);
                                          var2_int = 0;
                                          break L31;
                                        }
                                      }
                                      ((am) this).field_g = ((am) this).field_g + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_69_0 = ((am) this).field_g;
                                    stackOut_69_1 = ((am) this).field_x.field_m.length;
                                    stackIn_70_0 = stackOut_69_0;
                                    stackIn_70_1 = stackOut_69_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_59_0 != stackIn_59_1) {
                                  break L32;
                                } else {
                                  rw discarded$8 = this.a(var4, 1, 30561);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (0 != ((am) this).field_p[var4]) {
                                    break L34;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var3.b(false);
                                break L33;
                              }
                              var3 = ((am) this).field_n.d((byte) 18);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_69_0 = ((am) this).field_g;
                          stackOut_69_1 = ((am) this).field_x.field_m.length;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          if (stackIn_70_0 >= stackIn_70_1) {
                            break L24;
                          } else {
                            stackOut_71_0 = -1;
                            stackOut_71_1 = ~((am) this).field_x.field_m[((am) this).field_g];
                            stackIn_95_0 = stackOut_71_0;
                            stackIn_95_1 = stackOut_71_1;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_72_0 = stackIn_72_0;
                              stackOut_72_1 = stackIn_72_1;
                              stackIn_74_0 = stackOut_72_0;
                              stackIn_74_1 = stackOut_72_1;
                              L36: {
                                if (stackIn_74_0 == stackIn_74_1) {
                                  ((am) this).field_g = ((am) this).field_g + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (250 <= ((am) this).field_q.field_e) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (((am) this).field_p[((am) this).field_g] != 0) {
                                  break L38;
                                } else {
                                  rw discarded$7 = this.a(((am) this).field_g, 1, 30561);
                                  break L38;
                                }
                              }
                              L39: {
                                if (0 != ((am) this).field_p[((am) this).field_g]) {
                                  break L39;
                                } else {
                                  var3 = new ms();
                                  var3.field_h = (long)((am) this).field_g;
                                  ((am) this).field_n.a(var3, (byte) 39);
                                  var2_int = 0;
                                  break L39;
                                }
                              }
                              ((am) this).field_g = ((am) this).field_g + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((am) this).field_g = 0;
                        ((am) this).field_l = false;
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_94_0 = param0;
              stackOut_94_1 = -29;
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              break L1;
            }
            L40: {
              if (stackIn_95_0 <= stackIn_95_1) {
                break L40;
              } else {
                int discarded$9 = ((am) this).a(30, -8);
                break L40;
              }
            }
            L41: {
              if (!((am) this).field_m) {
                break L41;
              } else {
                if (~wq.a(-91) <= ~((am) this).field_t) {
                  var2_ref = (rw) (Object) ((am) this).field_k.a(84);
                  L42: while (true) {
                    L43: {
                      if (null == var2_ref) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L41;
                        } else {
                          L44: {
                            if (var2_ref.field_u) {
                              break L44;
                            } else {
                              L45: {
                                if (!var2_ref.field_s) {
                                  break L45;
                                } else {
                                  if (var2_ref.field_t) {
                                    var2_ref.b(false);
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                              var2_ref.field_s = true;
                              break L44;
                            }
                          }
                          var2_ref = (rw) (Object) ((am) this).field_k.a(true);
                          if (var5 == 0) {
                            continue L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((am) this).field_t = 1000L + wq.a(-42);
                    break L41;
                  }
                } else {
                  break L41;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "am.E(" + param0 + ')');
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -87 % ((-27 - param2) / 41);
            stackOut_0_0 = rd.a(param1, 0, param0, 1001);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("am.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    am(int param0, wl param1, wl param2, gd param3, ti param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        ((am) this).field_k = new te(16);
        ((am) this).field_g = 0;
        ((am) this).field_s = new jn();
        ((am) this).field_t = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((am) this).field_h = param1;
                ((am) this).field_u = param0;
                if (((am) this).field_h != null) {
                  break L2;
                } else {
                  ((am) this).field_l = false;
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((am) this).field_l = true;
              ((am) this).field_n = new jn();
              break L1;
            }
            L3: {
              ((am) this).field_m = param8;
              ((am) this).field_y = param5;
              ((am) this).field_v = param7;
              ((am) this).field_r = param3;
              ((am) this).field_w = param6;
              ((am) this).field_q = param4;
              ((am) this).field_f = param2;
              if (((am) this).field_f == null) {
                break L3;
              } else {
                ((am) this).field_i = (rw) (Object) ((am) this).field_q.a(((am) this).field_f, 91, ((am) this).field_u);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var10;
            stackOut_9_1 = new StringBuilder().append("am.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param5).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param6 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_e = new vf();
    }
}
