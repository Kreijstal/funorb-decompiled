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
        field_j = null;
        field_z = null;
        if (param0 > -78) {
            field_z = null;
        }
        field_e = null;
    }

    final sg b(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (null == ((am) this).field_x) {
          L0: {
            if (((am) this).field_i == null) {
              if (!((am) this).field_r.a(-88)) {
                ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -88, (byte) 0);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((am) this).field_i.field_u) {
            if (param0 < -62) {
              L1: {
                var5 = ((am) this).field_i.d(false);
                var2 = var5;
                if (!(((am) this).field_i instanceof ql)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((am) this).field_x = new sg(var5, ((am) this).field_y, ((am) this).field_w);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      ((am) this).field_r.b(14702);
                      ((am) this).field_x = null;
                      if (!((am) this).field_r.a(-6)) {
                        break L3;
                      } else {
                        ((am) this).field_i = null;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) 90, (byte) 0);
                    return null;
                  }
                  if (((am) this).field_f != null) {
                    ql discarded$1 = ((am) this).field_q.a(((am) this).field_u, var5, 2, ((am) this).field_f);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  try {
                    L4: {
                      if (var5 != null) {
                        ((am) this).field_x = new sg(var5, ((am) this).field_y, ((am) this).field_w);
                        if (~((am) this).field_x.field_l != ~((am) this).field_v) {
                          throw new RuntimeException();
                        } else {
                          break L4;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3 = decompiledCaughtException;
                      ((am) this).field_x = null;
                      if (!((am) this).field_r.a(122)) {
                        break L5;
                      } else {
                        ((am) this).field_i = null;
                        if (var4 != 0) {
                          break L5;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((am) this).field_i = (rw) (Object) ((am) this).field_r.a(255, true, ((am) this).field_u, (byte) -81, (byte) 0);
                    return null;
                  }
                  break L1;
                }
              }
              L6: {
                ((am) this).field_i = null;
                if (((am) this).field_h == null) {
                  break L6;
                } else {
                  ((am) this).field_p = new byte[((am) this).field_x.field_d];
                  break L6;
                }
              }
              return ((am) this).field_x;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return ((am) this).field_x;
        }
    }

    final void b(int param0) {
        ms var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (((am) this).field_n != null) {
          L0: {
            if (param0 <= -18) {
              break L0;
            } else {
              ((am) this).c((byte) 124);
              break L0;
            }
          }
          if (((am) this).b((byte) -120) == null) {
            return;
          } else {
            var2 = ((am) this).field_s.b(-72);
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  var3 = (int)var2.field_h;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        L5: {
                          if (var3 < 0) {
                            break L5;
                          } else {
                            if (((am) this).field_x.field_d <= var3) {
                              break L5;
                            } else {
                              if (((am) this).field_x.field_m[var3] == 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var2.b(false);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      L6: {
                        if (((am) this).field_p[var3] != 0) {
                          break L6;
                        } else {
                          rw discarded$4 = this.a(var3, 1, 30561);
                          break L6;
                        }
                      }
                      L7: {
                        if (-1 == ((am) this).field_p[var3]) {
                          rw discarded$5 = this.a(var3, 2, 30561);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (((am) this).field_p[var3] != 1) {
                        break L3;
                      } else {
                        var2.b(false);
                        break L3;
                      }
                    }
                    var2 = ((am) this).field_s.d((byte) 18);
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
        } else {
          return;
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
        byte stackIn_45_0 = 0;
        byte stackIn_45_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        Object stackIn_94_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        Object stackOut_93_0 = null;
        byte stackOut_44_0 = 0;
        byte stackOut_44_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        L0: {
          var10 = Sumoblitz.field_L ? 1 : 0;
          var4 = (Object) (Object) (rw) (Object) ((am) this).field_k.a(120, (long)param0);
          if (var4 == null) {
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
                      return null;
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
                          return null;
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
            ((am) this).field_k.a((ms) var4, -1, (long)param0);
            break L1;
          }
        }
        if (!((rw) var4).field_u) {
          var5 = ((rw) var4).d(false);
          if (var4 instanceof ql) {
            try {
              L7: {
                L8: {
                  if (var5 == null) {
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
                                    stackOut_79_0 = ~var7_ref_byte__[var9];
                                    stackOut_79_1 = ~var8[var9];
                                    stackIn_84_0 = stackOut_79_0;
                                    stackIn_84_1 = stackOut_79_1;
                                    stackIn_80_0 = stackOut_79_0;
                                    stackIn_80_1 = stackOut_79_1;
                                    if (var10 != 0) {
                                      break L9;
                                    } else {
                                      if (stackIn_80_0 == stackIn_80_1) {
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
                          stackOut_83_0 = var5[-1 + var5.length] & 255;
                          stackOut_83_1 = 65280 & var5[-2 + var5.length] << 8;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          break L9;
                        }
                        var7 = stackIn_84_0 + stackIn_84_1;
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
                          stackOut_93_0 = var4;
                          stackIn_94_0 = stackOut_93_0;
                          break L7;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L15: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((am) this).field_p[param0] = (byte) -1;
                ((rw) var4).b(false);
                if (((rw) var4).field_t) {
                  if (!((am) this).field_r.a(10)) {
                    var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) 78, (byte) 2);
                    ((am) this).field_k.a((ms) var4, -1, (long)param0);
                    break L15;
                  } else {
                    return null;
                  }
                } else {
                  break L15;
                }
              }
              return null;
            }
            return (rw) (Object) stackIn_94_0;
          } else {
            try {
              L16: {
                L17: {
                  if (var5 == null) {
                    break L17;
                  } else {
                    if (var5.length > 2) {
                      pt.field_c.reset();
                      pt.field_c.update(var5, 0, var5.length - 2);
                      var6_int = (int)pt.field_c.getValue();
                      if (((am) this).field_x.field_b[param0] != var6_int) {
                        throw new RuntimeException();
                      } else {
                        L18: {
                          if (null == ((am) this).field_x.field_a) {
                            break L18;
                          } else {
                            if (((am) this).field_x.field_a[param0] == null) {
                              break L18;
                            } else {
                              var7_ref_byte__ = ((am) this).field_x.field_a[param0];
                              var8 = gn.a(var5, (byte) -110, 0, -2 + var5.length);
                              var9 = 0;
                              L19: while (true) {
                                if (64 <= var9) {
                                  break L18;
                                } else {
                                  stackOut_44_0 = var8[var9];
                                  stackOut_44_1 = var7_ref_byte__[var9];
                                  stackIn_60_0 = stackOut_44_0;
                                  stackIn_60_1 = stackOut_44_1;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L16;
                                  } else {
                                    if (stackIn_45_0 != stackIn_45_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L19;
                                      } else {
                                        break L18;
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
                        break L16;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L20: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((am) this).field_r.b(14702);
                ((rw) var4).b(false);
                if (((rw) var4).field_t) {
                  if (!((am) this).field_r.a(126)) {
                    var4 = (Object) (Object) ((am) this).field_r.a(((am) this).field_u, true, param0, (byte) -69, (byte) 2);
                    ((am) this).field_k.a((ms) var4, -1, (long)param0);
                    break L20;
                  } else {
                    break L20;
                  }
                } else {
                  break L20;
                }
              }
              return null;
            }
            L21: {
              L22: {
                if (decompiledRegionSelector0 == 0) {
                  break L22;
                } else {
                  var5[var5.length - 2] = (byte)(((am) this).field_x.field_c[param0] >>> 8);
                  var5[-1 + var5.length] = (byte)((am) this).field_x.field_c[param0];
                  if (null != ((am) this).field_h) {
                    ql discarded$1 = ((am) this).field_q.a(param0, var5, 2, ((am) this).field_h);
                    stackOut_59_0 = ~((am) this).field_p[param0];
                    stackOut_59_1 = -2;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L22;
                  } else {
                    break L21;
                  }
                }
              }
              if (stackIn_60_0 != stackIn_60_1) {
                ((am) this).field_p[param0] = (byte) 1;
                break L21;
              } else {
                break L21;
              }
            }
            L23: {
              if (!((rw) var4).field_t) {
                ((rw) var4).b(false);
                break L23;
              } else {
                break L23;
              }
            }
            return (rw) var4;
          }
        } else {
          return null;
        }
    }

    final byte[] a(int param0, boolean param1) {
        rw var3 = this.a(param0, 0, 30561);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.d(param1);
        var3.b(param1);
        return var4;
    }

    final void c(byte param0) {
        if (((am) this).field_h == null) {
            return;
        }
        ((am) this).field_o = true;
        if (((am) this).field_n == null) {
            ((am) this).field_n = new jn();
        }
        int var2 = -71 / ((param0 - -2) / 46);
    }

    final int a(int param0, int param1) {
        rw var3 = (rw) (Object) ((am) this).field_k.a(param1 + 120, (long)param0);
        if (!(var3 == null)) {
            return var3.a(-1);
        }
        if (param1 != 0) {
            ((am) this).field_o = true;
            return 0;
        }
        return 0;
    }

    final void c(int param0) {
        int var2_int = 0;
        rw var2 = null;
        ms var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_127_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_128_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_126_0 = 0;
        int stackOut_126_1 = 0;
        int stackOut_127_0 = 0;
        int stackOut_127_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        L0: {
          L1: {
            var5 = Sumoblitz.field_L ? 1 : 0;
            if (null != ((am) this).field_n) {
              if (null == ((am) this).b((byte) -102)) {
                return;
              } else {
                L2: {
                  if (((am) this).field_l) {
                    break L2;
                  } else {
                    L3: {
                      if (((am) this).field_o) {
                        break L3;
                      } else {
                        ((am) this).field_n = null;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((am) this).field_n.b(89);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_h;
                            stackOut_11_0 = -2;
                            stackOut_11_1 = ~((am) this).field_p[var4];
                            stackIn_22_0 = stackOut_11_0;
                            stackIn_22_1 = stackOut_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_22_0 >= stackIn_22_1) {
                                  break L5;
                                } else {
                                  stackOut_23_0 = ~((am) this).field_x.field_m[((am) this).field_g];
                                  stackOut_23_1 = -1;
                                  stackIn_66_0 = stackOut_23_0;
                                  stackIn_66_1 = stackOut_23_1;
                                  stackIn_24_0 = stackOut_23_0;
                                  stackIn_24_1 = stackOut_23_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_24_0 == stackIn_24_1) {
                                          ((am) this).field_g = ((am) this).field_g + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        } else {
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        if (((am) this).field_r.b(true)) {
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
                                        if (((am) this).field_p[((am) this).field_g] != 1) {
                                          rw discarded$7 = this.a(((am) this).field_g, 2, 30561);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((am) this).field_p[((am) this).field_g] == 1) {
                                          break L12;
                                        } else {
                                          var3 = new ms();
                                          var3.field_h = (long)((am) this).field_g;
                                          var2_int = 0;
                                          ((am) this).field_n.a(var3, (byte) 39);
                                          break L12;
                                        }
                                      }
                                      ((am) this).field_g = ((am) this).field_g + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_21_0 = ~((am) this).field_x.field_m.length;
                                    stackOut_21_1 = ~((am) this).field_g;
                                    stackIn_22_0 = stackOut_21_0;
                                    stackIn_22_1 = stackOut_21_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_12_0 != stackIn_12_1) {
                                  rw discarded$8 = this.a(var4, 2, 30561);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((am) this).field_p[var4] != 1) {
                                    break L15;
                                  } else {
                                    var3.b(false);
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L14;
                              }
                              var3 = ((am) this).field_n.d((byte) 18);
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_130_0 = ~((am) this).field_x.field_m.length;
                          stackOut_130_1 = ~((am) this).field_g;
                          stackIn_128_0 = stackOut_130_0;
                          stackIn_128_1 = stackOut_130_1;
                          if (stackIn_128_0 >= stackIn_128_1) {
                            break L5;
                          } else {
                            stackOut_126_0 = ~((am) this).field_x.field_m[((am) this).field_g];
                            stackOut_126_1 = -1;
                            stackIn_66_0 = stackOut_126_0;
                            stackIn_66_1 = stackOut_126_1;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_127_0 = stackIn_127_0;
                              stackOut_127_1 = stackIn_127_1;
                              stackIn_124_0 = stackOut_127_0;
                              stackIn_124_1 = stackOut_127_1;
                              L17: {
                                if (stackIn_124_0 == stackIn_124_1) {
                                  ((am) this).field_g = ((am) this).field_g + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                } else {
                                  break L17;
                                }
                              }
                              L18: {
                                if (((am) this).field_r.b(true)) {
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
                                if (((am) this).field_p[((am) this).field_g] != 1) {
                                  rw discarded$9 = this.a(((am) this).field_g, 2, 30561);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (((am) this).field_p[((am) this).field_g] == 1) {
                                  break L20;
                                } else {
                                  var3 = new ms();
                                  var3.field_h = (long)((am) this).field_g;
                                  var2_int = 0;
                                  ((am) this).field_n.a(var3, (byte) 39);
                                  break L20;
                                }
                              }
                              ((am) this).field_g = ((am) this).field_g + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L21: {
                        if (var2_int == 0) {
                          break L21;
                        } else {
                          ((am) this).field_g = 0;
                          ((am) this).field_o = false;
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
                var2_int = 1;
                var3 = ((am) this).field_n.b(122);
                L22: while (true) {
                  L23: {
                    L24: {
                      if (var3 == null) {
                        break L24;
                      } else {
                        var4 = (int)var3.field_h;
                        stackOut_41_0 = -1;
                        stackOut_41_1 = ~((am) this).field_p[var4];
                        stackIn_50_0 = stackOut_41_0;
                        stackIn_50_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L25: while (true) {
                            if (stackIn_50_0 >= stackIn_50_1) {
                              break L23;
                            } else {
                              stackOut_51_0 = -1;
                              stackOut_51_1 = ~((am) this).field_x.field_m[((am) this).field_g];
                              stackIn_66_0 = stackOut_51_0;
                              stackIn_66_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L26: {
                                  L27: {
                                    if (stackIn_52_0 == stackIn_52_1) {
                                      ((am) this).field_g = ((am) this).field_g + 1;
                                      if (var5 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    } else {
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (250 <= ((am) this).field_q.field_e) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L23;
                                      } else {
                                        break L28;
                                      }
                                    } else {
                                      break L28;
                                    }
                                  }
                                  L29: {
                                    if (((am) this).field_p[((am) this).field_g] != 0) {
                                      break L29;
                                    } else {
                                      rw discarded$10 = this.a(((am) this).field_g, 1, 30561);
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (0 != ((am) this).field_p[((am) this).field_g]) {
                                      break L30;
                                    } else {
                                      var3 = new ms();
                                      var3.field_h = (long)((am) this).field_g;
                                      ((am) this).field_n.a(var3, (byte) 39);
                                      var2_int = 0;
                                      break L30;
                                    }
                                  }
                                  ((am) this).field_g = ((am) this).field_g + 1;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L23;
                                  }
                                }
                                stackOut_49_0 = ((am) this).field_g;
                                stackOut_49_1 = ((am) this).field_x.field_m.length;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                continue L25;
                              }
                            }
                          }
                        } else {
                          L31: {
                            if (stackIn_42_0 != stackIn_42_1) {
                              break L31;
                            } else {
                              rw discarded$11 = this.a(var4, 1, 30561);
                              break L31;
                            }
                          }
                          L32: {
                            L33: {
                              if (0 != ((am) this).field_p[var4]) {
                                break L33;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var3.b(false);
                            break L32;
                          }
                          var3 = ((am) this).field_n.d((byte) 18);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L34: while (true) {
                      stackOut_106_0 = ((am) this).field_g;
                      stackOut_106_1 = ((am) this).field_x.field_m.length;
                      stackIn_104_0 = stackOut_106_0;
                      stackIn_104_1 = stackOut_106_1;
                      if (stackIn_104_0 >= stackIn_104_1) {
                        break L23;
                      } else {
                        stackOut_102_0 = -1;
                        stackOut_102_1 = ~((am) this).field_x.field_m[((am) this).field_g];
                        stackIn_66_0 = stackOut_102_0;
                        stackIn_66_1 = stackOut_102_1;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_103_0 = stackIn_103_0;
                          stackOut_103_1 = stackIn_103_1;
                          stackIn_100_0 = stackOut_103_0;
                          stackIn_100_1 = stackOut_103_1;
                          L35: {
                            if (stackIn_100_0 == stackIn_100_1) {
                              ((am) this).field_g = ((am) this).field_g + 1;
                              if (var5 == 0) {
                                continue L34;
                              } else {
                                break L35;
                              }
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (250 <= ((am) this).field_q.field_e) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L23;
                              } else {
                                break L36;
                              }
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (((am) this).field_p[((am) this).field_g] != 0) {
                              break L37;
                            } else {
                              rw discarded$12 = this.a(((am) this).field_g, 1, 30561);
                              break L37;
                            }
                          }
                          L38: {
                            if (0 != ((am) this).field_p[((am) this).field_g]) {
                              break L38;
                            } else {
                              var3 = new ms();
                              var3.field_h = (long)((am) this).field_g;
                              ((am) this).field_n.a(var3, (byte) 39);
                              var2_int = 0;
                              break L38;
                            }
                          }
                          ((am) this).field_g = ((am) this).field_g + 1;
                          if (var5 == 0) {
                            continue L34;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    break L1;
                  } else {
                    ((am) this).field_g = 0;
                    ((am) this).field_l = false;
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          stackOut_65_0 = param0;
          stackOut_65_1 = -29;
          stackIn_66_0 = stackOut_65_0;
          stackIn_66_1 = stackOut_65_1;
          break L0;
        }
        L39: {
          if (stackIn_66_0 <= stackIn_66_1) {
            break L39;
          } else {
            int discarded$13 = ((am) this).a(30, -8);
            break L39;
          }
        }
        L40: {
          if (!((am) this).field_m) {
            break L40;
          } else {
            if (~wq.a(-91) <= ~((am) this).field_t) {
              var2 = (rw) (Object) ((am) this).field_k.a(84);
              L41: while (true) {
                L42: {
                  L43: {
                    if (var2 == null) {
                      break L43;
                    } else {
                      if (var5 != 0) {
                        break L42;
                      } else {
                        L44: {
                          if (var2.field_u) {
                            break L44;
                          } else {
                            L45: {
                              if (!var2.field_s) {
                                break L45;
                              } else {
                                if (var2.field_t) {
                                  var2.b(false);
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
                            var2.field_s = true;
                            break L44;
                          }
                        }
                        var2 = (rw) (Object) ((am) this).field_k.a(true);
                        if (var5 == 0) {
                          continue L41;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  ((am) this).field_t = 1000L + wq.a(-42);
                  break L42;
                }
                break L40;
              }
            } else {
              break L40;
            }
          }
        }
    }

    final static int a(int param0, byte[] param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            stackOut_2_1 = new StringBuilder().append("am.A(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
        return stackIn_1_0;
    }

    am(int param0, wl param1, wl param2, gd param3, ti param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((am) this).field_m = stackIn_7_1 != 0;
              ((am) this).field_y = param5;
              ((am) this).field_v = param7;
              ((am) this).field_r = param3;
              ((am) this).field_w = param6;
              ((am) this).field_q = param4;
              ((am) this).field_f = param2;
              if (((am) this).field_f == null) {
                break L4;
              } else {
                ((am) this).field_i = (rw) (Object) ((am) this).field_q.a(((am) this).field_f, 91, ((am) this).field_u);
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
            stackOut_10_1 = new StringBuilder().append("am.<init>(").append(param0).append(44);
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
          throw qo.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
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
