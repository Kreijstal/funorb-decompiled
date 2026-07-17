/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ck extends le {
    private fn field_j;
    static vn field_i;
    private fn field_r;
    private int field_q;
    int field_o;
    private int field_p;
    private int field_m;
    static int field_n;
    private oj[] field_s;
    private vo field_l;
    private boolean field_h;
    private int field_k;

    final void a(wk param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        oj[] var10 = null;
        int var11 = 0;
        oj var12 = null;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var13 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.a(((ck) this).field_k, (byte) -91);
              var4 = param0.a(((ck) this).field_p, 0);
              if (param1 == 110) {
                break L1;
              } else {
                ck.d(-107);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != ((ck) this).field_j) {
                  break L3;
                } else {
                  if (((ck) this).field_r != null) {
                    break L3;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = pj.a(var4, param1 ^ 34, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            L4: {
              var5 = stackIn_7_0;
              if (((ck) this).field_j == null) {
                break L4;
              } else {
                if (((ck) this).field_j.l()) {
                  ((ck) this).field_j = null;
                  break L4;
                } else {
                  ((ck) this).field_j.h(var5);
                  break L4;
                }
              }
            }
            L5: {
              if (null == ((ck) this).field_r) {
                break L5;
              } else {
                if (((ck) this).field_r.l()) {
                  ((ck) this).field_r = null;
                  break L5;
                } else {
                  ((ck) this).field_r.h(var5);
                  break L5;
                }
              }
            }
            L6: {
              if (((ck) this).field_o == 1) {
                var6 = ((ck) this).field_m / 2;
                if (var6 > ((ck) this).field_m - ((ck) this).field_q) {
                  om.a(-1, var4, var3_int, 1, -((ck) this).field_q + ((ck) this).field_m, ((ck) this).field_m - ((ck) this).field_q, ((ck) this).field_q, ((ck) this).field_q * 3 / 4);
                  break L6;
                } else {
                  om.a(-1, var4, var3_int, 1, 255, var6, ((ck) this).field_q, ((ck) this).field_q * 3 / 4);
                  break L6;
                }
              } else {
                L7: {
                  var6 = (int)(15.0f * (float)((ck) this).field_q / (float)((ck) this).field_m);
                  var7 = (int)((float)((ck) this).field_q * 128.0f / (float)((ck) this).field_m);
                  if (var7 > 96) {
                    stackOut_18_0 = 384 - 3 * var7;
                    stackIn_19_0 = stackOut_18_0;
                    break L7;
                  } else {
                    stackOut_17_0 = var7;
                    stackIn_19_0 = stackOut_17_0;
                    break L7;
                  }
                }
                L8: {
                  var8 = stackIn_19_0;
                  var9 = -var7 + 128 >> 1;
                  if (var9 > 32) {
                    var9 = 32;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var10 = ((ck) this).field_s;
                var11 = 0;
                L9: while (true) {
                  if (var11 >= var10.length) {
                    break L6;
                  } else {
                    var12 = var10[var11];
                    var12.a(tc.field_z[var6], var8, var4, var9, -124, var3_int);
                    var11++;
                    continue L9;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var3;
            stackOut_29_1 = new StringBuilder().append("ck.A(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param1 + 41);
        }
    }

    final static boolean c() {
        return null != cn.field_b ? true : mp.field_c;
    }

    final static boolean a(byte param0, int param1) {
        try {
            if (param1 <= fj.field_g.field_j) {
                return true;
            }
            if (null == sn.field_c) {
                return false;
            }
            int var2_int = sn.field_c.b((byte) -109);
            if (var2_int > 0) {
                if (-fj.field_g.field_j + param1 < var2_int) {
                    var2_int = -fj.field_g.field_j + param1;
                }
                sn.field_c.a(fj.field_g.field_j, var2_int, fj.field_g.field_h, 0);
                pi.field_i = pd.a(-22826);
                fj.field_g.field_j = fj.field_g.field_j + var2_int;
                if (!(fj.field_g.field_j >= param1)) {
                    return false;
                }
                fj.field_g.field_j = 0;
                return true;
            }
            {
                int var3 = -18 / ((-59 - param0) / 40);
                if (var2_int >= 0) {
                    if (gd.a(-124) <= 30000L) {
                        return false;
                    }
                }
                p.a(1);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ck.a((byte) 69, 71);
        }
        field_i = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3_int = 0;
        le var3 = null;
        le var4 = null;
        fb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        oj[] var9 = null;
        oj var10 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        L0: {
          var8 = ZombieDawn.field_J;
          var9 = ((ck) this).field_s;
          var3_int = 0;
          if (param0 == -11367) {
            break L0;
          } else {
            ((ck) this).field_q = -5;
            break L0;
          }
        }
        L1: while (true) {
          if (var9.length <= var3_int) {
            L2: {
              if (((ck) this).field_r == null) {
                break L2;
              } else {
                if (!((ck) this).field_r.l()) {
                  break L2;
                } else {
                  ((ck) this).field_r = null;
                  break L2;
                }
              }
            }
            L3: {
              stackOut_7_0 = this;
              stackOut_7_1 = ((ck) this).field_q;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if (((ck) this).field_o != 1) {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = 6;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 3;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L3;
              }
            }
            L4: {
              ((ck) this).field_q = stackIn_10_1 + stackIn_10_2;
              if (((ck) this).field_q > ((ck) this).field_m) {
                L5: {
                  if (((ck) this).field_h) {
                    dj.field_e.b(true);
                    ck.a(-7, 6836);
                    break L5;
                  } else {
                    ck.a(-5, 6836);
                    break L5;
                  }
                }
                ((ck) this).b(param0 ^ 18347);
                break L4;
              } else {
                break L4;
              }
            }
            var2 = ((ck) this).field_q * ((ck) this).field_q;
            var3 = ((ck) this).field_l.b((byte) 26);
            L6: while (true) {
              if (!(var3 instanceof s)) {
                return;
              } else {
                L7: {
                  var4 = var3.field_b;
                  if (((s) (Object) var3).field_i < var2) {
                    var3.b(-27598);
                    var5 = ((s) (Object) var3).field_h;
                    if (!(var5 instanceof kd)) {
                      if (var5 instanceof ah) {
                        ((ah) (Object) var5).c(((ck) this).field_k, 45, ((ck) this).field_p);
                        break L7;
                      } else {
                        if (!(var5 instanceof id)) {
                          break L7;
                        } else {
                          if (!((id) (Object) var5).a(true, false)) {
                            break L7;
                          } else {
                            L8: {
                              var6 = var5.a(true) / 24;
                              var7 = var5.f(237239984) / 24;
                              if (var5.f(237239984) % 24 != 0) {
                                break L8;
                              } else {
                                var7--;
                                break L8;
                              }
                            }
                            L9: {
                              dj.field_e.field_H.field_A.field_f[var7][var6] = eg.a(dj.field_e.field_H.field_A.field_f[var7][var6], -33554433);
                              dj.field_e.field_H.field_A.field_f[var7 - 1][var6] = eg.a(dj.field_e.field_H.field_A.field_f[var7 - 1][var6], -33554433);
                              dj.field_e.field_H.field_A.a(true, param0 + 25732, var7, false, var6);
                              dj.field_e.field_H.field_A.a(true, 14365, var7 + -1, false, var6);
                              ((ck) this).field_h = true;
                              if (null != ((ck) this).field_r) {
                                pc.a((byte) 13, ((ck) this).field_r);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            ((ck) this).field_r = kh.a(pb.a(so.field_a, 2, 1) + 64, false);
                            break L7;
                          }
                        }
                      }
                    } else {
                      if (((ck) this).field_o == 1) {
                        ((kd) (Object) var5).c(401408, ((ck) this).field_p, ((ck) this).field_k);
                        break L7;
                      } else {
                        ((kd) (Object) var5).z(0);
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                var3 = var4;
                continue L6;
              }
            }
          } else {
            var10 = var9[var3_int];
            var10.a(((ck) this).field_p, 18463, ((ck) this).field_k);
            var3_int++;
            continue L1;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (param1 == 6836) {
            break L0;
          } else {
            ck.d(20);
            break L0;
          }
        }
        L1: {
          if (param0 != -2) {
            break L1;
          } else {
            nm.field_b = false;
            break L1;
          }
        }
        L2: {
          L3: {
            if (param0 != -8) {
              break L3;
            } else {
              if (h.field_d) {
                break L3;
              } else {
                L4: {
                  L5: {
                    if (vk.field_c != 7) {
                      break L5;
                    } else {
                      if (vf.field_f == 3) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (vk.field_c != 7) {
                      break L6;
                    } else {
                      if (vf.field_f == 4) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (vk.field_c != 6) {
                      break L7;
                    } else {
                      if (0 == vf.field_f) {
                        break L4;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (vk.field_c != 6) {
                      break L8;
                    } else {
                      if (vf.field_f == 1) {
                        break L4;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (vk.field_c != 6) {
                    break L3;
                  } else {
                    if (vf.field_f == 5) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                bo.a(97, -2);
                h.field_d = true;
                break L2;
              }
            }
          }
          L9: {
            if (param0 != -11) {
              break L9;
            } else {
              if (ul.field_f) {
                break L9;
              } else {
                bo.a(47, -3);
                ul.field_f = true;
                break L2;
              }
            }
          }
          L10: {
            if (0 == vk.field_c) {
              if (vf.field_f == 0) {
                L11: {
                  if (sm.field_a != -1) {
                    break L11;
                  } else {
                    if (-1 != param0) {
                      break L11;
                    } else {
                      bo.a(param1 ^ 6880, 0);
                      break L2;
                    }
                  }
                }
                L12: {
                  if (0 != sm.field_a) {
                    break L12;
                  } else {
                    if (param0 != -3) {
                      break L12;
                    } else {
                      bo.a(param1 ^ -6864, sm.field_a - -1);
                      break L2;
                    }
                  }
                }
                L13: {
                  if (sm.field_a != 1) {
                    break L13;
                  } else {
                    if (param0 == -4) {
                      bo.a(-82, 1 + sm.field_a);
                      break L2;
                    } else {
                      break L13;
                    }
                  }
                }
                if (sm.field_a != 2) {
                  break L10;
                } else {
                  if (param0 == -4) {
                    bo.a(100, sm.field_a + 1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                if (vf.field_f != 1) {
                  if (vf.field_f == 2) {
                    L14: {
                      if (sm.field_a != -1) {
                        break L14;
                      } else {
                        if (param0 == -1) {
                          bo.a(param1 ^ 6831, 0);
                          break L2;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      if (0 != sm.field_a) {
                        break L15;
                      } else {
                        if (param0 == 4) {
                          bo.a(-72, 1);
                          break L2;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (sm.field_a != 1) {
                        break L16;
                      } else {
                        if (-7 != param0) {
                          break L16;
                        } else {
                          bo.a(-72, 2);
                          break L2;
                        }
                      }
                    }
                    if (sm.field_a != 1) {
                      break L10;
                    } else {
                      if (param0 == -5) {
                        bo.a(-62, 3);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    if (3 == vf.field_f) {
                      if (param0 == 0) {
                        bo.a(param1 ^ 6862, 0);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      if (vf.field_f == 4) {
                        L17: {
                          if (sm.field_a != -1) {
                            break L17;
                          } else {
                            if (param0 != -1) {
                              break L17;
                            } else {
                              bo.a(-107, 0);
                              break L2;
                            }
                          }
                        }
                        if (param0 == 3) {
                          bo.a(-91, 1);
                          break L2;
                        } else {
                          if (param0 == 5) {
                            bo.a(83, 2);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (vf.field_f == 5) {
                          L18: {
                            if (-1 != sm.field_a) {
                              break L18;
                            } else {
                              if (param0 == -1) {
                                bo.a(param1 ^ 6807, 0);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            if (sm.field_a != 0) {
                              break L19;
                            } else {
                              if (param0 != -7) {
                                break L19;
                              } else {
                                bo.a(25, 1);
                                break L19;
                              }
                            }
                          }
                          if (0 != sm.field_a) {
                            break L10;
                          } else {
                            if (param0 == -5) {
                              bo.a(106, 2);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  L20: {
                    if (sm.field_a != -1) {
                      break L20;
                    } else {
                      if (-1 != param0) {
                        break L20;
                      } else {
                        bo.a(-110, 0);
                        break L2;
                      }
                    }
                  }
                  L21: {
                    if (sm.field_a != 0) {
                      break L21;
                    } else {
                      if (-4 == param0) {
                        bo.a(-65, 1 + sm.field_a);
                        break L2;
                      } else {
                        break L21;
                      }
                    }
                  }
                  if (sm.field_a != 1) {
                    break L10;
                  } else {
                    if (param0 != -4) {
                      break L10;
                    } else {
                      bo.a(-64, 1 + sm.field_a);
                      break L2;
                    }
                  }
                }
              }
            } else {
              if (vk.field_c != 1) {
                if (vk.field_c != 2) {
                  if (vk.field_c != 4) {
                    if (vk.field_c != 5) {
                      if (vk.field_c != 6) {
                        if (7 == vk.field_c) {
                          if (vf.field_f == 0) {
                            L22: {
                              if (-1 != param0) {
                                break L22;
                              } else {
                                fn discarded$1 = kh.a(89, false);
                                bo.a(-72, 0);
                                break L22;
                              }
                            }
                            L23: {
                              if (param0 != -12) {
                                break L23;
                              } else {
                                if (sm.field_a == 0) {
                                  bo.a(65, 1);
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                            }
                            if (param0 != 13) {
                              break L10;
                            } else {
                              bo.a(-113, 2);
                              break L2;
                            }
                          } else {
                            if (vf.field_f != 2) {
                              if (vf.field_f != 3) {
                                if (vf.field_f != 5) {
                                  break L10;
                                } else {
                                  if (-1 == param0) {
                                    bo.a(param1 ^ 6831, 0);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                if (param0 != -1) {
                                  break L10;
                                } else {
                                  bo.a(param1 + -6724, 0);
                                  break L2;
                                }
                              }
                            } else {
                              if (-1 != param0) {
                                break L10;
                              } else {
                                bo.a(-67, 0);
                                break L2;
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        if (vf.field_f != 0) {
                          if (2 == vf.field_f) {
                            if (param0 != 10) {
                              break L10;
                            } else {
                              if (sm.field_a != -1) {
                                break L10;
                              } else {
                                bo.a(78, 0);
                                break L2;
                              }
                            }
                          } else {
                            if (vf.field_f == 3) {
                              L24: {
                                if (param0 != -1) {
                                  break L24;
                                } else {
                                  bo.a(32, 0);
                                  break L24;
                                }
                              }
                              L25: {
                                if (param0 != -10) {
                                  break L25;
                                } else {
                                  if (!ha.field_e) {
                                    bo.a(-107, 1);
                                    ha.field_e = true;
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              if (param0 != -13) {
                                break L10;
                              } else {
                                if (!uo.field_d) {
                                  bo.a(-72, 2);
                                  uo.field_d = true;
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              if (5 == vf.field_f) {
                                if (-1 == param0) {
                                  bo.a(-111, 0);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                        } else {
                          L26: {
                            if (param0 == -1) {
                              bo.a(param1 + -6762, 0);
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          if (param0 != -9) {
                            break L10;
                          } else {
                            if (0 == sm.field_a) {
                              bo.a(120, 1);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      if (vf.field_f != 0) {
                        if (vf.field_f != 1) {
                          if (2 != vf.field_f) {
                            if (vf.field_f != 4) {
                              break L10;
                            } else {
                              if (param0 == -1) {
                                bo.a(-88, 0);
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                          } else {
                            if (param0 != -1) {
                              if (param0 != 13) {
                                break L10;
                              } else {
                                if (sm.field_a == 0) {
                                  bo.a(-92, 1);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              bo.a(param1 + -6738, 0);
                              break L2;
                            }
                          }
                        } else {
                          if (-1 == param0) {
                            bo.a(-70, 0);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        if (-1 != param0) {
                          L27: {
                            if (15 != param0) {
                              break L27;
                            } else {
                              if (sm.field_a == 0) {
                                bo.a(-100, 1);
                                break L2;
                              } else {
                                break L27;
                              }
                            }
                          }
                          if (param0 != 15) {
                            break L10;
                          } else {
                            if (sm.field_a != 1) {
                              break L10;
                            } else {
                              bo.a(105, 2);
                              break L2;
                            }
                          }
                        } else {
                          bo.a(param1 ^ 6880, 0);
                          break L2;
                        }
                      }
                    }
                  } else {
                    if (vf.field_f != 0) {
                      if (vf.field_f == 1) {
                        if (param0 == 12) {
                          bo.a(param1 + -6749, 0);
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        if (vf.field_f == 2) {
                          if (param0 == 9) {
                            bo.a(param1 + -6910, 0);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (vf.field_f != 3) {
                            if (vf.field_f != 4) {
                              if (vf.field_f != 5) {
                                break L10;
                              } else {
                                if (-1 != param0) {
                                  break L10;
                                } else {
                                  bo.a(53, 0);
                                  break L2;
                                }
                              }
                            } else {
                              if (param0 != 9) {
                                break L10;
                              } else {
                                bo.a(57, 0);
                                break L2;
                              }
                            }
                          } else {
                            L28: {
                              if (param0 != -1) {
                                break L28;
                              } else {
                                bo.a(-79, 0);
                                break L28;
                              }
                            }
                            if (param0 == 14) {
                              bo.a(105, 1);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      L29: {
                        if (param0 != -1) {
                          break L29;
                        } else {
                          bo.a(param1 ^ 6886, 0);
                          break L29;
                        }
                      }
                      if (param0 != 12) {
                        break L10;
                      } else {
                        if (sm.field_a != 0) {
                          break L10;
                        } else {
                          bo.a(-61, 1);
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  if (vf.field_f == 5) {
                    L30: {
                      if (param0 != -1) {
                        break L30;
                      } else {
                        bo.a(-77, 0);
                        break L30;
                      }
                    }
                    L31: {
                      if (param0 != 3) {
                        break L31;
                      } else {
                        if (0 != sm.field_a) {
                          break L31;
                        } else {
                          bo.a(93, 1);
                          break L31;
                        }
                      }
                    }
                    if (param0 != 4) {
                      break L10;
                    } else {
                      if (1 != sm.field_a) {
                        break L10;
                      } else {
                        bo.a(-75, 2);
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              } else {
                L32: {
                  if (vf.field_f == 0) {
                    L33: {
                      if (param0 == -1) {
                        bo.a(param1 ^ -6794, 0);
                        break L33;
                      } else {
                        break L33;
                      }
                    }
                    if (param0 != -6) {
                      break L32;
                    } else {
                      bo.a(param1 ^ -6907, 1);
                      break L32;
                    }
                  } else {
                    break L32;
                  }
                }
                L34: {
                  if (vf.field_f != 1) {
                    break L34;
                  } else {
                    if (-1 != sm.field_a) {
                      break L34;
                    } else {
                      if (2 == param0) {
                        bo.a(-94, 0);
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                  }
                }
                L35: {
                  if (vf.field_f != 2) {
                    break L35;
                  } else {
                    L36: {
                      if (-1 != param0) {
                        break L36;
                      } else {
                        bo.a(92, 0);
                        break L36;
                      }
                    }
                    if (sm.field_a != 0) {
                      break L35;
                    } else {
                      if (param0 == -4) {
                        bo.a(112, 1);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                  }
                }
                L37: {
                  if (vf.field_f != 4) {
                    break L37;
                  } else {
                    L38: {
                      if (1 != param0) {
                        break L38;
                      } else {
                        bo.a(120, 0);
                        break L38;
                      }
                    }
                    if (param0 != 7) {
                      break L37;
                    } else {
                      bo.a(63, 1);
                      break L37;
                    }
                  }
                }
                if (vf.field_f == 5) {
                  if (param0 == -1) {
                    bo.a(100, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
            }
          }
          break L2;
        }
    }

    ck(int param0, int param1, int param2) {
        int var4 = 0;
        int var5_int = 0;
        le var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        L0: {
          ((ck) this).field_m = 180;
          ((ck) this).field_r = null;
          ((ck) this).field_j = null;
          ((ck) this).field_h = false;
          if (dj.field_e.field_H.a(param0, param1, 106)) {
            break L0;
          } else {
            param1 = param1 - (-4 + param1 % 24);
            break L0;
          }
        }
        L1: {
          ((ck) this).field_k = param0;
          ((ck) this).field_o = param2;
          ((ck) this).field_p = param1;
          var4 = ((ck) this).field_o;
          if (var4 == 0) {
            ((ck) this).field_m = 180;
            break L1;
          } else {
            if (var4 == 3) {
              ((ck) this).field_m = 180;
              break L1;
            } else {
              if (var4 == 2) {
                ((ck) this).field_m = 40;
                break L1;
              } else {
                if (1 != var4) {
                  break L1;
                } else {
                  ((ck) this).field_m = 130;
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (((ck) this).field_m == 40) {
            var4 = 12;
            ((ck) this).field_q = 0;
            ((ck) this).field_s = new oj[75 / var4];
            var5_int = 0;
            L3: while (true) {
              if (((ck) this).field_s.length <= var5_int) {
                break L2;
              } else {
                ((ck) this).field_s[var5_int] = new oj(tk.field_d[var4 * var5_int] * 6.0f, 6.0f * tk.field_g[var5_int * var4]);
                var5_int++;
                continue L3;
              }
            }
          } else {
            ((ck) this).field_q = 0;
            ((ck) this).field_s = new oj[75];
            var4 = 0;
            L4: while (true) {
              if (((ck) this).field_s.length <= var4) {
                break L2;
              } else {
                ((ck) this).field_s[var4] = new oj(6.0f * tk.field_d[var4], 6.0f * tk.field_g[var4]);
                var4++;
                continue L4;
              }
            }
          }
        }
        ((ck) this).field_l = new vo();
        var4 = ((ck) this).field_m * ((ck) this).field_m;
        var5 = dj.field_e.field_R.b((byte) 26);
        L5: while (true) {
          if (!(var5 instanceof fb)) {
            L6: {
              if (((ck) this).field_o == 2) {
                break L6;
              } else {
                ((ck) this).field_j = kh.a(0, false);
                break L6;
              }
            }
            return;
          } else {
            L7: {
              L8: {
                L9: {
                  if (!(var5 instanceof kd)) {
                    break L9;
                  } else {
                    if (9 != ((kd) (Object) var5).field_F) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (var5 instanceof id) {
                  break L8;
                } else {
                  if (!(var5 instanceof ah)) {
                    break L7;
                  } else {
                    if (((ah) (Object) var5).field_F == 2) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              L10: {
                var6 = ((fb) (Object) var5).a(true);
                var7 = ((fb) (Object) var5).f(237239984);
                var8 = -var6 + ((ck) this).field_k;
                var9 = ((ck) this).field_p + -var7;
                var10 = var8 * var8 + var9 * var9;
                if (var10 >= var4) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L10;
                } else {
                  stackOut_26_0 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  break L10;
                }
              }
              L11: {
                var11 = stackIn_28_0;
                if (!(var5 instanceof id)) {
                  if (-2 == ((ck) this).field_o) {
                    break L11;
                  } else {
                    L12: {
                      stackOut_37_0 = var11;
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_38_0 = stackOut_37_0;
                      if (0 == dj.field_e.field_H.a(var7, ((ck) this).field_p, var6, ((ck) this).field_k, 124)) {
                        stackOut_39_0 = stackIn_39_0;
                        stackOut_39_1 = 0;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        break L12;
                      } else {
                        stackOut_38_0 = stackIn_38_0;
                        stackOut_38_1 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L12;
                      }
                    }
                    var11 = stackIn_40_0 & stackIn_40_1;
                    break L11;
                  }
                } else {
                  L13: {
                    L14: {
                      stackOut_29_0 = var11;
                      stackIn_33_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (dj.field_e.field_H.a(-24 + var7 - 26, ((ck) this).field_p, var6, ((ck) this).field_k, 110) != -1) {
                        break L14;
                      } else {
                        stackOut_30_0 = stackIn_30_0;
                        stackIn_33_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (dj.field_e.field_H.a(-24 + var7 - 26, ((ck) this).field_p, 24 + var6, ((ck) this).field_k, 125) != 0) {
                          break L14;
                        } else {
                          stackOut_31_0 = stackIn_31_0;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_32_0 = stackOut_31_0;
                          if (0 != dj.field_e.field_H.a(var7 - -2, ((ck) this).field_p, var6, ((ck) this).field_k, 109)) {
                            break L14;
                          } else {
                            stackOut_32_0 = stackIn_32_0;
                            stackIn_34_0 = stackOut_32_0;
                            stackIn_33_0 = stackOut_32_0;
                            if (dj.field_e.field_H.a(2 + var7, ((ck) this).field_p, var6 + 24, ((ck) this).field_k, 111) == -1) {
                              stackOut_34_0 = stackIn_34_0;
                              stackOut_34_1 = 0;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = 1;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L13;
                  }
                  var11 = stackIn_35_0 & stackIn_35_1;
                  break L11;
                }
              }
              if (var11 == 0) {
                break L7;
              } else {
                ((ck) this).field_l.a(0, (le) (Object) new s((fb) (Object) var5, var10));
                break L7;
              }
            }
            var5 = var5.field_b;
            continue L5;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = -1;
    }
}
