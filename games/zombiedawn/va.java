/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_b;
    private int field_d;
    int field_i;
    private int field_a;
    int field_h;
    int field_e;
    int field_g;
    private boolean field_c;
    private int field_f;

    final void a(byte param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              fieldTemp$3 = this.field_b + 1;
              this.field_b = this.field_b + 1;
              if ((fieldTemp$3 ^ -1) >= (this.field_f ^ -1)) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (!this.field_c) {
                        break L4;
                      } else {
                        fieldTemp$4 = this.field_g + 1;
                        this.field_g = this.field_g + 1;
                        if ((fieldTemp$4 ^ -1) < (this.field_a ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (this.field_c) {
                      break L2;
                    } else {
                      fieldTemp$5 = this.field_g - 1;
                      this.field_g = this.field_g - 1;
                      if (fieldTemp$5 >= this.field_a) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_g = this.field_d;
                  break L2;
                }
                this.field_b = 0;
                break L1;
              }
            }
            L5: {
              if (param0 >= 122) {
                break L5;
              } else {
                va.b((byte) -48);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "va.D(" + param0 + ')');
        }
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_2_0 = null;
        java.awt.Container stackIn_5_0 = null;
        java.applet.Applet stackIn_7_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == sj.field_a) {
              if (param0 < -107) {
                stackIn_7_0 = hc.a(0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (java.awt.Container) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = sj.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "va.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Container) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return (java.awt.Container) ((Object) stackIn_7_0);
          }
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        byte[] stackIn_2_0 = null;
        byte[] stackIn_14_0 = null;
        byte[] stackIn_34_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        de var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        try {
          L0: {
            if (param0 < -106) {
              L1: {
                var2 = new de(param1);
                var3 = var2.d((byte) -118);
                var4 = var2.c(-38);
                if (var4 < 0) {
                  break L1;
                } else {
                  L2: {
                    if (m.field_z == 0) {
                      break L2;
                    } else {
                      if ((var4 ^ -1) >= (m.field_z ^ -1)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (-1 != (var3 ^ -1)) {
                    L3: {
                      var5 = var2.c(-69);
                      if (-1 < (var5 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          if (0 == m.field_z) {
                            break L4;
                          } else {
                            if ((var5 ^ -1) >= (m.field_z ^ -1)) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            var6 = new byte[var5];
                            if (1 == var3) {
                              break L6;
                            } else {
                              var7 = cn.field_d;
                              synchronized (var7) {
                                L7: {
                                  cn.field_d.a(var6, var2, -8);
                                  break L7;
                                }
                              }
                              if (ZombieDawn.field_J == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          lj.a(var6, var5, param1, var4, 9);
                          break L5;
                        }
                        stackIn_34_0 = (byte[]) (var6);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    throw new RuntimeException();
                  } else {
                    var5_ref_byte__ = new byte[var4];
                    var2.a(var4, 0, var5_ref_byte__, 11240);
                    stackIn_14_0 = (byte[]) (var5_ref_byte__);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2_ref);

            stackIn_38_1 = new StringBuilder().append("va.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_34_0;
          }
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_15_0 = 0;
        oh stackIn_68_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        am var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        oh var5_ref = null;
        oh var6 = null;
        String var6_ref = null;
        oh var7 = null;
        String var7_ref = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 1545) {
                break L1;
              } else {
                va.a((byte) -53, (byte[]) null);
                break L1;
              }
            }
            var1 = fj.field_g;
            var2 = var1.d((byte) -126);
            if ((var2 ^ -1) != -1) {
              if (-2 == (var2 ^ -1)) {
                L2: {
                  if (sf.field_j == null) {
                    sf.field_j = new pf(128);
                    ne.field_b = 0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var3 = var1.a(true);
                  if (!((String) (var3)).equals("")) {
                    break L3;
                  } else {
                    var3 = null;
                    break L3;
                  }
                }
                L4: {
                  var4_ref_String = var1.a(true);
                  var5 = var1.a(true);
                  var6 = hg.a(99, var4_ref_String);
                  if (var6 == null) {
                    var6 = hg.a(103, var5);
                    if (var6 == null) {
                      break L4;
                    } else {
                      sf.field_j.a(1, (long)fm.a((CharSequence) ((Object) var4_ref_String), param0 ^ -1662).hashCode(), var6);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null == var6) {
                    var6 = new oh();
                    sf.field_j.a(1, (long)fm.a((CharSequence) ((Object) var4_ref_String), -56).hashCode(), var6);
                    fieldTemp$0 = ne.field_b;
                    ne.field_b = ne.field_b + 1;
                    var6.field_kb = fieldTemp$0;
                    eb.field_d.a(0, var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (null == var3) {
                    break L6;
                  } else {
                    var3 = ((String) (var3)).intern();
                    break L6;
                  }
                }
                var6.field_lb = var4_ref_String;
                var6.field_ib = (String) (var3);
                var6.b(param0 + -29143);
                var7 = (oh) ((Object) eb.field_d.b((byte) 26));
                L7: while (true) {
                  L8: {
                    L9: {
                      L10: {
                        if (null == var7) {
                          break L10;
                        } else {
                          stackIn_68_0 = (oh) (var6);

                          if (var8 != 0) {
                            break L9;
                          } else {
                            if (!eh.a(stackIn_68_0, var7, (byte) 20)) {
                              break L10;
                            } else {
                              var7 = (oh) ((Object) eb.field_d.a(false));
                              if (var8 == 0) {
                                continue L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        if (null != var7) {
                          break L11;
                        } else {
                          eb.field_d.a(0, var6);
                          if (var8 == 0) {
                            break L8;
                          } else {
                            break L11;
                          }
                        }
                      }
                      stackIn_68_0 = (oh) (var7);
                      break L9;
                    }
                    we.a(stackIn_68_0, param0 ^ 1545, var6);
                    break L8;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (-3 != (var2 ^ -1)) {
                  if (-4 != (var2 ^ -1)) {
                    if (-5 != (var2 ^ -1)) {
                      ae.a((Throwable) null, 10331, "F1: " + cb.f(3));
                      p.a(param0 + -1544);
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      w.field_b = 1;
                      var3 = var1.a(true);
                      oo.field_T = ((String) (var3)).intern();
                      var4 = var1.d((byte) -128);
                      rd.a(20348, var4);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    L12: {
                      if (w.field_b == 2) {
                        w.field_b = 1;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  L13: {
                    if (-2 == (w.field_b ^ -1)) {
                      w.field_b = 2;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              L14: {
                if (nk.field_a == null) {
                  nk.field_a = new pf(128);
                  ih.field_J = 0;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var1.d((byte) -119) != 1) {
                  stackIn_15_0 = 0;
                  break L15;
                } else {
                  stackIn_15_0 = 1;
                  break L15;
                }
              }
              L16: {
                var3_int = stackIn_15_0;
                var4_ref_String = var1.a(true);
                if (var3_int != 0) {
                  var1.a(true);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                var5_ref = pa.a(var4_ref_String, (byte) -66);
                var6_ref = var1.a(true);
                var7_ref = fm.a((CharSequence) ((Object) var4_ref_String), -115);
                if (var7_ref == null) {
                  var7_ref = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (var5_ref != null) {
                  break L18;
                } else {
                  var5_ref = pa.a(var6_ref, (byte) -66);
                  if (var5_ref != null) {
                    nk.field_a.a(param0 ^ 1544, (long)var7_ref.hashCode(), var5_ref);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (var5_ref == null) {
                  var5_ref = new oh();
                  nk.field_a.a(param0 ^ 1544, (long)var7_ref.hashCode(), var5_ref);
                  fieldTemp$1 = ih.field_J;
                  ih.field_J = ih.field_J + 1;
                  var5_ref.field_kb = fieldTemp$1;
                  tp.field_m.a(param0 ^ 1545, var5_ref);
                  break L19;
                } else {
                  break L19;
                }
              }
              var5_ref.field_lb = var4_ref_String;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "va.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final static int a(boolean param0) {
        boolean stackIn_16_0 = false;
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (param0) {
                break L1;
              } else {
                va.b((byte) -42);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (!on.b(-114)) {
                    break L4;
                  } else {
                    i.field_W.a(21657);
                    stackIn_16_0 = i.field_W.d(-127);

                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_16_0) {
                          var1_int = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (-14 == (kg.field_i ^ -1)) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
                i.field_W.a((byte) -55, r.b(6199969, ha.field_b, ei.field_K), r.b(6199969, nc.field_j, hp.field_D));
                stackIn_16_0 = i.field_W.d(-124);
                break L3;
              }
              L6: {
                if (stackIn_16_0) {
                  var1_int = 1;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                L8: {
                  L9: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L9;
                    } else {
                      if (-1 >= (i.field_W.field_d ^ -1)) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L7;
                  } else {
                    if (pg.field_p != 2) {
                      cn.a((byte) 126);
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                L10: {
                  var3 = qk.field_Kb[i.field_W.field_d];
                  if ((var3 ^ -1) == -3) {
                    break L10;
                  } else {
                    if (var3 == 5) {
                      break L10;
                    } else {
                      break L7;
                    }
                  }
                }
                cn.a((byte) 80);
                break L7;
              }
              L11: {
                if (var3 != 0) {
                  break L11;
                } else {
                  if (2 != pg.field_p) {
                    break L11;
                  } else {
                    var4 = -ge.field_f + pd.a(-22826);
                    var6 = (int)((10999L - var4) / 1000L);
                    if (-1 > (var6 ^ -1)) {
                      break L11;
                    } else {
                      ti.a(5, 87, true);
                      var3 = 2;
                      break L11;
                    }
                  }
                }
              }
              stackIn_46_0 = var3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "va.C(" + param0 + ')');
        }
        return stackIn_46_0;
    }

    va(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_a = param2;
            this.field_d = param1;
            this.field_e = param0;
            this.field_i = param5;
            this.field_c = this.field_a > this.field_d ? true : false;
            this.field_g = this.field_d;
            this.field_f = param3;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "va.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
