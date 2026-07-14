/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt extends rf {
    private ap field_k;
    private int field_l;
    private int field_q;
    hk field_s;
    private hk field_y;
    hk field_p;
    private int[] field_o;
    private int field_u;
    private int[] field_i;
    private ap field_r;
    static int field_x;
    private int field_j;
    private ap field_v;
    static int field_t;
    private boolean field_m;
    private boolean field_w;
    hk field_n;

    final rf a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (((jt) this).field_l <= 0) {
            break L0;
          } else {
            if (null != ((jt) this).field_v) {
              ((jt) this).field_n.a(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (((jt) this).field_l >= 1048576) {
            if (-1 >= ((jt) this).field_j) {
              break L1;
            } else {
              if (((jt) this).field_k == null) {
                break L1;
              } else {
                ((jt) this).field_y.a(param0);
                break L1;
              }
            }
          } else {
            if (-1 <= ((jt) this).field_j) {
              break L1;
            } else {
              if (((jt) this).field_k == null) {
                break L1;
              } else {
                ((jt) this).field_y.a(param0);
                break L1;
              }
            }
          }
        }
        L2: {
          if (!((jt) this).field_m) {
            break L2;
          } else {
            L3: {
              if (0 >= ((jt) this).field_u) {
                break L3;
              } else {
                if (!((jt) this).field_n.f(32119)) {
                  ((jt) this).field_u = -((jt) this).field_u;
                  ((jt) this).field_m = false;
                  ((jt) this).field_v = null;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((jt) this).field_u >= 0) {
              break L2;
            } else {
              if (((jt) this).field_p.f(32119)) {
                break L2;
              } else {
                ((jt) this).field_u = -((jt) this).field_u;
                ((jt) this).field_r = null;
                ((jt) this).field_m = false;
                break L2;
              }
            }
          }
        }
        L4: {
          if (((jt) this).field_u == 0) {
            break L4;
          } else {
            ((jt) this).field_l = ((jt) this).field_l + param0 * ((jt) this).field_u;
            if (((jt) this).field_l < 1048576) {
              if (((jt) this).field_l <= 0) {
                ((jt) this).field_l = 0;
                if (!((jt) this).field_m) {
                  ((jt) this).field_u = 0;
                  if (!((jt) this).field_w) {
                    L5: {
                      if (null != ((jt) this).field_v) {
                        ((jt) this).field_n.d(-127);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((jt) this).field_v = null;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              ((jt) this).field_l = 1048576;
              if (!((jt) this).field_m) {
                ((jt) this).field_u = 0;
                if (((jt) this).field_w) {
                  break L4;
                } else {
                  L6: {
                    if (null == ((jt) this).field_r) {
                      break L6;
                    } else {
                      ((jt) this).field_p.d(-127);
                      break L6;
                    }
                  }
                  ((jt) this).field_r = null;
                  break L4;
                }
              } else {
                break L4;
              }
            }
          }
        }
    }

    private final void a(int param0, hk param1, int param2, int param3) {
        ((jt) this).field_s = param1;
        param1.a((byte) -124, param2, -1);
        param1.a(param0, -107);
        if (param3 != 30121) {
            hk var6 = (hk) null;
            this.a((hk) null, 88, (hk) null);
        }
    }

    private final void a(hk param0, int param1, hk param2) {
        if (param1 != 9649) {
            rf discarded$0 = ((jt) this).b();
        }
        ((jt) this).field_p = param0;
        ((jt) this).field_n = param2;
        ((jt) this).field_s = ((jt) this).field_n;
        ((jt) this).field_l = 1048576;
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
        int stackIn_32_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_62_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (((jt) this).field_q <= 0) {
          ((jt) this).a(param2);
          return;
        } else {
          L0: {
            if (((jt) this).field_m) {
              L1: {
                if (-1 <= (((jt) this).field_u ^ -1)) {
                  break L1;
                } else {
                  if (((jt) this).field_n.f(32119)) {
                    break L1;
                  } else {
                    ((jt) this).field_m = false;
                    ((jt) this).field_u = -((jt) this).field_u;
                    ((jt) this).field_v = null;
                    break L0;
                  }
                }
              }
              if (0 <= ((jt) this).field_u) {
                break L0;
              } else {
                if (!((jt) this).field_p.f(32119)) {
                  ((jt) this).field_r = null;
                  ((jt) this).field_m = false;
                  ((jt) this).field_u = -((jt) this).field_u;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            var4 = ((jt) this).field_q * (((jt) this).field_l >> 2035520588) / 256;
            var5 = ((jt) this).field_q - var4;
            if (((jt) this).field_u == 0) {
              break L2;
            } else {
              ((jt) this).field_l = ((jt) this).field_l + ((jt) this).field_u * param2;
              if (-1048577 < (((jt) this).field_l ^ -1)) {
                if (((jt) this).field_l <= 0) {
                  ((jt) this).field_l = 0;
                  if (((jt) this).field_m) {
                    break L2;
                  } else {
                    ((jt) this).field_u = 0;
                    if (((jt) this).field_w) {
                      break L2;
                    } else {
                      L3: {
                        if (null != ((jt) this).field_v) {
                          ((jt) this).field_n.d(-128);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((jt) this).field_v = null;
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              } else {
                ((jt) this).field_l = 1048576;
                if (((jt) this).field_m) {
                  break L2;
                } else {
                  ((jt) this).field_u = 0;
                  if (!((jt) this).field_w) {
                    L4: {
                      if (null != ((jt) this).field_r) {
                        ((jt) this).field_p.d(-127);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((jt) this).field_r = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L5: {
            if (tk.field_r) {
              stackOut_31_0 = param2 << 1482037729;
              stackIn_32_0 = stackOut_31_0;
              break L5;
            } else {
              stackOut_30_0 = param2;
              stackIn_32_0 = stackOut_30_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_32_0;
            if (-257 < (((jt) this).field_j ^ -1)) {
              L7: {
                if (((jt) this).field_v != null) {
                  break L7;
                } else {
                  if (null != ((jt) this).field_r) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              if (var4 == -257) {
                ((jt) this).field_n.b(param0, param1, param2);
                break L6;
              } else {
                if (-257 != var5) {
                  L8: {
                    L9: {
                      if (null == ((jt) this).field_i) {
                        break L9;
                      } else {
                        if (((jt) this).field_i.length < var6) {
                          break L9;
                        } else {
                          au.a(((jt) this).field_i, 0, var6);
                          au.a(((jt) this).field_o, 0, var6);
                          break L8;
                        }
                      }
                    }
                    ((jt) this).field_i = new int[var6];
                    ((jt) this).field_o = new int[var6];
                    break L8;
                  }
                  L10: {
                    ((jt) this).field_n.b(((jt) this).field_i, 0, param2);
                    ((jt) this).field_p.b(((jt) this).field_o, 0, param2);
                    if (tk.field_r) {
                      param1 = param1 << 1;
                      stackOut_46_0 = param1 << 1;
                      stackIn_47_0 = stackOut_46_0;
                      break L10;
                    } else {
                      stackOut_45_0 = param1;
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
                      param0[var8 + var7] = param0[var8 + var7] + (var4 * ((jt) this).field_i[var8] - -(var5 * ((jt) this).field_o[var8]) >> 472394152);
                      var8++;
                      continue L11;
                    }
                  }
                } else {
                  ((jt) this).field_p.b(param0, param1, param2);
                  break L6;
                }
              }
            } else {
              break L6;
            }
          }
          L12: {
            if (((jt) this).field_k == null) {
              break L12;
            } else {
              if (0 != ((jt) this).field_j) {
                L13: {
                  L14: {
                    if (((jt) this).field_i == null) {
                      break L14;
                    } else {
                      if (var6 <= ((jt) this).field_i.length) {
                        au.a(((jt) this).field_i, 0, var6);
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ((jt) this).field_o = new int[var6];
                  ((jt) this).field_i = new int[var6];
                  break L13;
                }
                L15: {
                  ((jt) this).field_y.b(((jt) this).field_i, 0, param2);
                  if (tk.field_r) {
                    param1 = param1 << 1;
                    stackOut_61_0 = param1 << 1;
                    stackIn_62_0 = stackOut_61_0;
                    break L15;
                  } else {
                    stackOut_60_0 = param1;
                    stackIn_62_0 = stackOut_60_0;
                    break L15;
                  }
                }
                var7 = stackIn_62_0;
                var8 = ((jt) this).field_j * ((jt) this).field_q / 256;
                var9 = ((jt) this).field_q + -var8;
                var10 = 0;
                L16: while (true) {
                  if (var10 >= var6) {
                    break L12;
                  } else {
                    param0[var7 + var10] = ((jt) this).field_i[var10] * var8 + param0[var7 + var10] * var9 >> 1813645320;
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
        }
    }

    final static void a(String param0, String param1, long param2, java.applet.Applet param3, int param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param3.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param0 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param2 < (long)param4) {
                  var7 = var9 + "; Discard;";
                  break L0;
                } else {
                  var7 = var9 + "; Expires=" + bt.a(false, 1000L * param2 + kh.a(-83)) + "; Max-Age=" + param2;
                  break L0;
                }
              }
              fe.a(param3, -7012, "document.cookie=\"" + var7 + "\"");
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized int d() {
        return 2;
    }

    final synchronized void a(byte param0, int param1, boolean param2, int param3, ap param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_30_0 = 0;
        hk stackIn_38_0 = null;
        hk stackIn_39_0 = null;
        hk stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        hk stackIn_47_0 = null;
        hk stackIn_48_0 = null;
        hk stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        hk stackOut_46_0 = null;
        hk stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        hk stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        hk stackOut_37_0 = null;
        hk stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        hk stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          if (!((jt) this).field_m) {
            break L0;
          } else {
            if (!param2) {
              break L0;
            } else {
              L1: {
                if (-1 > (((jt) this).field_u ^ -1)) {
                  L2: {
                    if (null != ((jt) this).field_v) {
                      ((jt) this).field_n.d(-127);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((jt) this).field_v = param4;
                  if (param4 == null) {
                    break L1;
                  } else {
                    ((jt) this).field_n.a(false, -2029711608, param4);
                    this.a(param5, ((jt) this).field_n, param3, 30121);
                    break L1;
                  }
                } else {
                  L3: {
                    if (null != ((jt) this).field_r) {
                      ((jt) this).field_p.d(-126);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ((jt) this).field_r = param4;
                  if (param4 == null) {
                    break L1;
                  } else {
                    ((jt) this).field_p.a(false, -2029711608, param4);
                    this.a(param5, ((jt) this).field_p, param3, 30121);
                    break L1;
                  }
                }
              }
              return;
            }
          }
        }
        if (param0 < -22) {
          L4: {
            stackOut_16_0 = this;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (!param2) {
              stackOut_18_0 = this;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L4;
            } else {
              stackOut_17_0 = this;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L4;
            }
          }
          ((jt) this).field_m = stackIn_19_1 != 0;
          if (param4 == ((jt) this).field_v) {
            ((jt) this).field_u = param1;
            this.a(param5, ((jt) this).field_n, param3, 30121);
            return;
          } else {
            if (((jt) this).field_r == param4) {
              ((jt) this).field_u = -param1;
              this.a(param5, ((jt) this).field_p, param3, 30121);
              return;
            } else {
              L5: {
                if (((jt) this).field_v != null) {
                  if (((jt) this).field_r == null) {
                    var7 = 0;
                    break L5;
                  } else {
                    L6: {
                      if (-524289 >= (((jt) this).field_l ^ -1)) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L6;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L6;
                      }
                    }
                    var7 = stackIn_30_0;
                    break L5;
                  }
                } else {
                  var7 = 1;
                  break L5;
                }
              }
              L7: {
                if (var7 != 0) {
                  L8: {
                    if (((jt) this).field_v != null) {
                      ((jt) this).field_n.d(-128);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    ((jt) this).field_v = param4;
                    if (param4 == null) {
                      break L9;
                    } else {
                      L10: {
                        stackOut_46_0 = ((jt) this).field_n;
                        stackIn_48_0 = stackOut_46_0;
                        stackIn_47_0 = stackOut_46_0;
                        if (param2) {
                          stackOut_48_0 = (hk) (Object) stackIn_48_0;
                          stackOut_48_1 = 0;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          break L10;
                        } else {
                          stackOut_47_0 = (hk) (Object) stackIn_47_0;
                          stackOut_47_1 = 1;
                          stackIn_49_0 = stackOut_47_0;
                          stackIn_49_1 = stackOut_47_1;
                          break L10;
                        }
                      }
                      ((hk) (Object) stackIn_49_0).a(stackIn_49_1 != 0, -2029711608, param4);
                      this.a(param5, ((jt) this).field_n, param3, 30121);
                      break L9;
                    }
                  }
                  ((jt) this).field_u = param1;
                  break L7;
                } else {
                  L11: {
                    if (null != ((jt) this).field_r) {
                      ((jt) this).field_p.d(-128);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((jt) this).field_r = param4;
                    if (param4 == null) {
                      break L12;
                    } else {
                      L13: {
                        stackOut_37_0 = ((jt) this).field_p;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_38_0 = stackOut_37_0;
                        if (param2) {
                          stackOut_39_0 = (hk) (Object) stackIn_39_0;
                          stackOut_39_1 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          break L13;
                        } else {
                          stackOut_38_0 = (hk) (Object) stackIn_38_0;
                          stackOut_38_1 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          break L13;
                        }
                      }
                      ((hk) (Object) stackIn_40_0).a(stackIn_40_1 != 0, -2029711608, param4);
                      this.a(param5, ((jt) this).field_p, param3, 30121);
                      break L12;
                    }
                  }
                  ((jt) this).field_u = -param1;
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != 125) {
            ((jt) this).field_i = (int[]) null;
        }
        ((jt) this).field_q = param1;
    }

    final rf b() {
        return null;
    }

    jt(hk param0, hk param1) {
        ((jt) this).field_q = 256;
        ((jt) this).field_j = 0;
        ((jt) this).field_w = false;
        this.a(param1, 9649, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0;
    }
}
