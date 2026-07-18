/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi implements uj {
    private fs field_w;
    static String field_d;
    static qr field_o;
    private int field_x;
    private int field_j;
    private pf field_l;
    private dc field_m;
    private int field_t;
    private mn field_c;
    static vr field_a;
    private pf field_u;
    private pf field_k;
    private int field_r;
    private int[] field_f;
    private wf[] field_e;
    private int[] field_q;
    private int[] field_n;
    private int[] field_i;
    private boolean field_h;
    private boolean field_p;
    private int[] field_v;
    private int[][] field_s;
    private boolean field_b;
    private boolean[] field_y;
    private int field_g;

    private final void d(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        co var3 = null;
        int var4 = 0;
        int var5 = 0;
        sd var6 = null;
        int var7 = 0;
        int var8 = 0;
        sd stackIn_10_0 = null;
        Object stackIn_70_0 = null;
        RuntimeException decompiledCaughtException = null;
        sd stackOut_9_0 = null;
        oh stackOut_69_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 26) {
                break L1;
              } else {
                ((hi) this).a((fs) null, (byte) 115);
                break L1;
              }
            }
            var3 = (co) (Object) ((hi) this).field_l.d(0);
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 == null) {
                    break L4;
                  } else {
                    var4 = 0;
                    var5 = 0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      var6 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (null == var6) {
                              break L7;
                            } else {
                              stackOut_9_0 = (sd) var6;
                              stackIn_70_0 = (Object) (Object) stackOut_9_0;
                              stackIn_10_0 = stackOut_9_0;
                              if (var8 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_10_0 != var3.field_n.field_R) {
                                    break L8;
                                  } else {
                                    var5 = 1;
                                    if (var8 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var4++;
                                var6 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var5 != 0) {
                            L9: {
                              if (((hi) this).field_y[var4]) {
                                break L9;
                              } else {
                                L10: {
                                  var2_int = var3.field_i + -var3.field_n.field_x;
                                  if (0 < var2_int) {
                                    break L10;
                                  } else {
                                    q.field_Ab[var3.field_n.field_p] = var3.field_n.field_x + -var3.field_i;
                                    ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - (-var3.field_n.field_N + var3.field_i);
                                    if (((hi) this).field_n[var4] >= 0) {
                                      break L9;
                                    } else {
                                      this.a(var4, -52, var6);
                                      if (var8 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                L11: {
                                  q.field_Ab[var3.field_n.field_p] = 0;
                                  if (~var3.field_n.field_x < ~var3.field_n.field_N) {
                                    ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - (var3.field_n.field_x - var3.field_n.field_N);
                                    if (0 <= ((hi) this).field_n[var4]) {
                                      break L11;
                                    } else {
                                      this.a(var4, 100, var6);
                                      if (var8 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  } else {
                                    break L11;
                                  }
                                }
                                L12: {
                                  if (~var2_int < ~((hi) this).field_i[var4]) {
                                    break L12;
                                  } else {
                                    L13: {
                                      L14: {
                                        L15: {
                                          if (((hi) this).field_m.field_o.field_i) {
                                            break L15;
                                          } else {
                                            ((hi) this).field_i[var4] = ((hi) this).field_i[var4] - var2_int;
                                            if (var8 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        var7 = 0;
                                        L16: while (true) {
                                          if (((hi) this).field_i.length <= var7) {
                                            break L14;
                                          } else {
                                            ((hi) this).field_i[var7] = ((hi) this).field_i[var7] - var2_int;
                                            var7++;
                                            if (var8 != 0) {
                                              break L13;
                                            } else {
                                              if (var8 == 0) {
                                                continue L16;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var3.field_n.field_J = var3.field_n.field_J + var2_int;
                                      bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, var2_int));
                                      break L13;
                                    }
                                    if (var8 == 0) {
                                      break L9;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L17: {
                                  L18: {
                                    L19: {
                                      var3.field_n.field_J = var3.field_n.field_J + ((hi) this).field_i[var4];
                                      var2_int = var2_int - ((hi) this).field_i[var4];
                                      bk.field_a.a((byte) -113, (oh) (Object) new qa(var3.field_n, ((hi) this).field_i[var4]));
                                      if (((hi) this).field_m.field_o.field_i) {
                                        break L19;
                                      } else {
                                        ((hi) this).field_i[var4] = 0;
                                        if (var8 == 0) {
                                          break L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    var7 = 0;
                                    L20: while (true) {
                                      if (var7 >= ((hi) this).field_i.length) {
                                        break L18;
                                      } else {
                                        ((hi) this).field_i[var7] = 0;
                                        var7++;
                                        if (var8 != 0) {
                                          break L17;
                                        } else {
                                          if (var8 == 0) {
                                            continue L20;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L21: {
                                    if (~var2_int >= ~((hi) this).field_n[var4]) {
                                      break L21;
                                    } else {
                                      this.a(var4, 71, var6);
                                      if (var8 == 0) {
                                        break L9;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  ((hi) this).field_n[var4] = ((hi) this).field_n[var4] - var2_int;
                                  break L17;
                                }
                                kq.field_c[var3.field_n.field_p] = kq.field_c[var3.field_n.field_p] + var2_int;
                                break L9;
                              }
                            }
                            stackOut_69_0 = ((hi) this).field_l.a((byte) -71);
                            stackIn_70_0 = (Object) (Object) stackOut_69_0;
                            break L6;
                          } else {
                            throw new RuntimeException("Star to be garrisoned (" + var3.field_n.field_I + ") doesn't appear to be in any of the AI's territories.");
                          }
                        }
                        var3 = (co) (Object) stackIn_70_0;
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.P(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        sd var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        fs stackIn_4_0 = null;
        sd stackIn_22_0 = null;
        fs stackIn_34_0 = null;
        sd stackIn_35_0 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_3_0 = null;
        sd stackOut_21_0 = null;
        fs stackOut_32_0 = null;
        sd stackOut_34_0 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((hi) this).field_n = new int[((hi) this).field_w.field_i.e(0)];
            ((hi) this).field_i = new int[((hi) this).field_w.field_i.e(0)];
            ((hi) this).field_y = new boolean[((hi) this).field_w.field_i.e(0)];
            var4 = ((hi) this).field_m.field_g.field_e;
            var5 = -23 % ((-64 - param0) / 50);
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          if (~var4.length >= ~var6) {
                            break L7;
                          } else {
                            var7 = var4[var6];
                            stackOut_3_0 = var7.field_y;
                            stackIn_34_0 = stackOut_3_0;
                            stackIn_4_0 = stackOut_3_0;
                            if (var9 != 0) {
                              break L6;
                            } else {
                              L8: {
                                L9: {
                                  L10: {
                                    if (stackIn_4_0 != ((hi) this).field_w) {
                                      break L10;
                                    } else {
                                      if (~var7.field_x >= ~var7.field_N) {
                                        break L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  q.field_Ab[var7.field_p] = 0;
                                  if (var9 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                                q.field_Ab[var7.field_p] = var7.field_x - var7.field_N;
                                if (~var7.field_J > ~q.field_Ab[var7.field_p]) {
                                  throw new RuntimeException(var7.field_I + ": available=" + q.field_Ab[var7.field_p] + ", garrison_next=" + var7.field_J);
                                } else {
                                  var3 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                                  var8 = 0;
                                  var2_int = 0;
                                  L11: while (true) {
                                    L12: {
                                      if (~var2_int <= ~((hi) this).field_n.length) {
                                        break L12;
                                      } else {
                                        stackOut_21_0 = var7.field_R;
                                        stackIn_35_0 = stackOut_21_0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (var9 != 0) {
                                          break L5;
                                        } else {
                                          L13: {
                                            if (stackIn_22_0 != var3) {
                                              break L13;
                                            } else {
                                              var8 = 1;
                                              ((hi) this).field_n[var2_int] = ((hi) this).field_n[var2_int] + q.field_Ab[var7.field_p];
                                              if (var9 == 0) {
                                                break L12;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                          var2_int++;
                                          if (var9 == 0) {
                                            continue L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    if (var8 != 0) {
                                      break L8;
                                    } else {
                                      throw new RuntimeException("Star owned by " + ((hi) this).field_w.field_t + " is not in any of its Territories: " + var7.field_I);
                                    }
                                  }
                                }
                              }
                              var6++;
                              if (var9 == 0) {
                                continue L1;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        if (((hi) this).field_m.field_o.field_i) {
                          break L4;
                        } else {
                          stackOut_32_0 = ((hi) this).field_w;
                          stackIn_34_0 = stackOut_32_0;
                          break L6;
                        }
                      }
                      stackOut_34_0 = (sd) (Object) ((pf) (Object) stackIn_34_0.field_i).d(0);
                      stackIn_35_0 = stackOut_34_0;
                      break L5;
                    }
                    var3 = stackIn_35_0;
                    var2_int = 0;
                    L14: while (true) {
                      if (~var2_int <= ~((hi) this).field_i.length) {
                        break L3;
                      } else {
                        ((hi) this).field_i[var2_int] = var3.field_x;
                        var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                        var2_int++;
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (var9 == 0) {
                            continue L14;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var2_int = 0;
                  L15: while (true) {
                    if (~var2_int <= ~((hi) this).field_i.length) {
                      break L3;
                    } else {
                      ((hi) this).field_i[var2_int] = ((hi) this).field_w.field_m.field_x;
                      var2_int++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L15;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.K(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        wf[] var3_ref_wf__ = null;
        int var3 = 0;
        int var4_int = 0;
        wf[] var4 = null;
        int var5 = 0;
        wf var5_ref_wf = null;
        wf var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        wf[] stackIn_7_0 = null;
        wf[] stackIn_19_0 = null;
        ln stackIn_26_0 = null;
        ln stackIn_29_0 = null;
        ln stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        wf[] stackOut_6_0 = null;
        wf[] stackOut_18_0 = null;
        ln stackOut_25_0 = null;
        ln stackOut_28_0 = null;
        ln stackOut_31_0 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 7270) {
                break L1;
              } else {
                this.a((sd) null, -28, (byte) 100);
                break L1;
              }
            }
            var3_ref_wf__ = ((hi) this).field_e;
            var4_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3_ref_wf__.length <= var4_int) {
                    break L4;
                  } else {
                    stackOut_6_0 = (wf[]) var3_ref_wf__;
                    stackIn_19_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          var5_ref_wf = stackIn_7_0[var4_int];
                          if (var5_ref_wf instanceof ac) {
                            break L6;
                          } else {
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var2_int = var5_ref_wf.field_n.field_p;
                          if (kq.field_c[var2_int] < q.field_Ab[var2_int]) {
                            break L7;
                          } else {
                            kq.field_c[var2_int] = kq.field_c[var2_int] - q.field_Ab[var2_int];
                            q.field_Ab[var2_int] = 0;
                            if (var9 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        q.field_Ab[var2_int] = q.field_Ab[var2_int] - kq.field_c[var2_int];
                        kq.field_c[var2_int] = 0;
                        break L5;
                      }
                      var4_int++;
                      if (var9 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_18_0 = ((hi) this).field_e;
                stackIn_19_0 = stackOut_18_0;
                break L3;
              }
              var4 = stackIn_19_0;
              var5 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (var5 >= var4.length) {
                      break L10;
                    } else {
                      var6 = var4[var5];
                      if (var9 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (!(var6 instanceof ac)) {
                            break L11;
                          } else {
                            var3 = 0;
                            stackOut_25_0 = var6.field_n;
                            stackIn_26_0 = stackOut_25_0;
                            L12: while (true) {
                              var2_int = stackIn_26_0.field_p;
                              var7 = 0;
                              L13: while (true) {
                                L14: {
                                  if (2 <= var7) {
                                    break L14;
                                  } else {
                                    stackOut_28_0 = var6.field_n.field_R.j(param0 ^ 23379);
                                    stackIn_26_0 = stackOut_28_0;
                                    stackIn_29_0 = stackOut_28_0;
                                    if (var9 != 0) {
                                      continue L12;
                                    } else {
                                      var8 = stackIn_29_0;
                                      L15: while (true) {
                                        L16: {
                                          if (null == var8) {
                                            break L16;
                                          } else {
                                            stackOut_31_0 = var6.field_n;
                                            stackIn_26_0 = stackOut_31_0;
                                            stackIn_32_0 = stackOut_31_0;
                                            if (var9 != 0) {
                                              continue L12;
                                            } else {
                                              L17: {
                                                if (stackIn_32_0 == var8) {
                                                  break L17;
                                                } else {
                                                  if (0 == q.field_Ab[var8.field_p]) {
                                                    break L17;
                                                  } else {
                                                    L18: {
                                                      if (var3 != 0) {
                                                        break L18;
                                                      } else {
                                                        if (no.field_f[var8.field_p]) {
                                                          break L17;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                    L19: {
                                                      if (kq.field_c[var2_int] >= q.field_Ab[var8.field_p]) {
                                                        break L19;
                                                      } else {
                                                        this.a(kq.field_c[var2_int], (byte) 102, var6.field_n, var8);
                                                        q.field_Ab[var8.field_p] = q.field_Ab[var8.field_p] - kq.field_c[var2_int];
                                                        kq.field_c[var2_int] = 0;
                                                        if (var9 == 0) {
                                                          break L11;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    this.a(q.field_Ab[var8.field_p], (byte) 114, var6.field_n, var8);
                                                    kq.field_c[var2_int] = kq.field_c[var2_int] - q.field_Ab[var8.field_p];
                                                    q.field_Ab[var8.field_p] = 0;
                                                    break L17;
                                                  }
                                                }
                                              }
                                              var8 = var6.field_n.field_R.h(-23410);
                                              if (var9 == 0) {
                                                continue L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                        }
                                        var3 = 1;
                                        var7++;
                                        if (var9 == 0) {
                                          continue L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (kq.field_c[var2_int] <= 0) {
                                  break L11;
                                } else {
                                  throw new RuntimeException(((hi) this).field_w.field_t + " has run out of available fleets, but has not yet met its defender allocation at " + var6.field_n.field_I + ".");
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        if (var9 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.S(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        sd var2 = null;
        RuntimeException var2_ref = null;
        ln var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((hi) this).field_l.a(0);
              if (param0 == 100) {
                break L1;
              } else {
                ((hi) this).a(62);
                break L1;
              }
            }
            var2 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            L2: while (true) {
              L3: {
                L4: {
                  if (null == var2) {
                    break L4;
                  } else {
                    if (var4 != 0) {
                      break L3;
                    } else {
                      var3 = var2.j(param0 ^ 18257);
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (null == var3) {
                              break L7;
                            } else {
                              ((hi) this).field_l.a((byte) -113, (oh) (Object) new co(var3, ((hi) this).field_m.field_o.field_l, no.field_f));
                              var3 = var2.h(-23410);
                              if (var4 != 0) {
                                break L6;
                              } else {
                                if (var4 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var2 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                          break L6;
                        }
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "hi.O(" + param0 + ')');
        }
    }

    public final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sd var6_ref_sd = null;
        int var6 = 0;
        int var7 = 0;
        ac var8 = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Object stackIn_26_0 = null;
        ac stackIn_29_0 = null;
        sd stackIn_32_0 = null;
        sd stackIn_44_0 = null;
        int stackIn_66_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        oh stackOut_25_0 = null;
        ac stackOut_28_0 = null;
        sd stackOut_31_0 = null;
        sd stackOut_43_0 = null;
        byte stackOut_65_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!((hi) this).field_w.field_i.g(-74)) {
              bk.field_a.a(0);
              ed.field_g.a(0);
              vj.field_E.a(0);
              km.field_u = null;
              no.field_b = false;
              mr.field_f = false;
              var2_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= ((hi) this).field_x) {
                      break L3;
                    } else {
                      no.field_f[var2_int] = false;
                      q.field_Ab[var2_int] = 0;
                      kq.field_c[var2_int] = 0;
                      og.field_c[var2_int] = 0;
                      var2_int++;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  this.j(114);
                  this.i(15401);
                  this.d(114);
                  this.h(100);
                  this.e(0);
                  this.c(-30426);
                  this.g(115);
                  this.d((byte) 46);
                  this.g((byte) -70);
                  this.b(true, 0);
                  var2_int = 0;
                  break L2;
                }
                var4 = 0;
                L4: while (true) {
                  L5: {
                    L6: {
                      if (var4 >= ((hi) this).field_n.length) {
                        break L6;
                      } else {
                        var2_int = var2_int + ((hi) this).field_n[var4];
                        stackOut_12_0 = var2_int + ((hi) this).field_i[var4];
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          var2_int = stackIn_13_0;
                          var4++;
                          if (var9 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  }
                  var3 = stackIn_15_0;
                  var3 = var2_int;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if (0 >= var2_int) {
                          break L9;
                        } else {
                          this.b(false, 0);
                          var2_int = 0;
                          stackOut_17_0 = 0;
                          stackIn_66_0 = stackOut_17_0;
                          stackIn_18_0 = stackOut_17_0;
                          if (var9 != 0) {
                            break L8;
                          } else {
                            var4 = stackIn_18_0;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (var4 >= ((hi) this).field_n.length) {
                                    break L12;
                                  } else {
                                    var2_int = var2_int + ((hi) this).field_n[var4];
                                    var2_int = var2_int + ((hi) this).field_i[var4];
                                    var4++;
                                    if (var9 != 0) {
                                      break L11;
                                    } else {
                                      if (var9 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                L13: {
                                  if (~var3 != ~var2_int) {
                                    break L13;
                                  } else {
                                    var4 = 1;
                                    var5 = 0;
                                    stackOut_25_0 = ((hi) this).field_w.field_i.d(0);
                                    stackIn_26_0 = (Object) (Object) stackOut_25_0;
                                    L14: while (true) {
                                      var6_ref_sd = (sd) (Object) stackIn_26_0;
                                      L15: while (true) {
                                        L16: {
                                          if (null == var6_ref_sd) {
                                            break L16;
                                          } else {
                                            var7 = 0;
                                            stackOut_28_0 = (ac) (Object) ((hi) this).field_u.d(0);
                                            stackIn_26_0 = (Object) (Object) stackOut_28_0;
                                            stackIn_29_0 = stackOut_28_0;
                                            if (var9 != 0) {
                                              continue L14;
                                            } else {
                                              var8 = stackIn_29_0;
                                              L17: while (true) {
                                                L18: {
                                                  L19: {
                                                    if (null == var8) {
                                                      break L19;
                                                    } else {
                                                      stackOut_31_0 = (sd) var6_ref_sd;
                                                      stackIn_44_0 = stackOut_31_0;
                                                      stackIn_32_0 = stackOut_31_0;
                                                      if (var9 != 0) {
                                                        break L18;
                                                      } else {
                                                        L20: {
                                                          if (stackIn_32_0 == var8.field_n.field_R) {
                                                            var7++;
                                                            break L20;
                                                          } else {
                                                            break L20;
                                                          }
                                                        }
                                                        var8 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                                                        if (var9 == 0) {
                                                          continue L17;
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    L22: {
                                                      if (var7 <= 0) {
                                                        break L22;
                                                      } else {
                                                        var4 = 0;
                                                        if (var9 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    this.a(var6_ref_sd, var5, (byte) -122);
                                                    break L21;
                                                  }
                                                  var5++;
                                                  stackOut_43_0 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                                  stackIn_44_0 = stackOut_43_0;
                                                  break L18;
                                                }
                                                var6_ref_sd = stackIn_44_0;
                                                if (var9 == 0) {
                                                  continue L15;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L23: {
                                          var2_int = 0;
                                          if (var4 == 0) {
                                            break L23;
                                          } else {
                                            if (((hi) this).field_m.field_o.field_i) {
                                              this.c((byte) 35);
                                              break L23;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        var6 = 0;
                                        L24: while (true) {
                                          L25: {
                                            L26: {
                                              if (~((hi) this).field_n.length >= ~var6) {
                                                break L26;
                                              } else {
                                                var2_int = var2_int + ((hi) this).field_n[var6];
                                                var2_int = var2_int + ((hi) this).field_i[var6];
                                                var6++;
                                                if (var9 != 0) {
                                                  break L25;
                                                } else {
                                                  if (var9 == 0) {
                                                    continue L24;
                                                  } else {
                                                    break L26;
                                                  }
                                                }
                                              }
                                            }
                                            if (var2_int > 0) {
                                              break L25;
                                            } else {
                                              if (var9 == 0) {
                                                continue L7;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          throw new RuntimeException(((hi) this).field_w.field_t + " hasn't allocated any more idle fleets this loop, even though there are DefendTasks.");
                                        }
                                      }
                                    }
                                  }
                                }
                                var3 = var2_int;
                                break L11;
                              }
                              if (var9 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      this.b(7270);
                      this.f((byte) 127);
                      stackOut_65_0 = param0;
                      stackIn_66_0 = stackOut_65_0;
                      break L8;
                    }
                    L27: {
                      if (stackIn_66_0 <= -3) {
                        break L27;
                      } else {
                        ((hi) this).b((byte) 56);
                        break L27;
                      }
                    }
                    L28: {
                      this.e((byte) -44);
                      if (((hi) this).field_m.a(ed.field_g, ((hi) this).field_w, -6, bk.field_a, vj.field_E)) {
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    ((hi) this).field_m.a(ed.field_g, 0, bk.field_a, vj.field_E);
                    break L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.WA(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ln[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ln var5_ref_ln = null;
        ln[] var5_ref_ln__ = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var6_ref_ln__ = null;
        ln var7 = null;
        int var7_int = 0;
        ln var8 = null;
        ln[] var8_array = null;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        Object stackIn_10_0 = null;
        fs stackIn_12_0 = null;
        fs stackIn_12_1 = null;
        fs stackIn_16_0 = null;
        fs stackIn_16_1 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        fs stackIn_37_0 = null;
        fs stackIn_37_1 = null;
        fs stackIn_42_0 = null;
        fs stackIn_42_1 = null;
        int stackIn_50_0 = 0;
        int stackIn_52_0 = 0;
        Object stackIn_55_0 = null;
        int stackIn_56_0 = 0;
        int stackIn_62_0 = 0;
        Object stackOut_9_0 = null;
        fs stackOut_10_0 = null;
        fs stackOut_10_1 = null;
        fs stackOut_15_0 = null;
        fs stackOut_15_1 = null;
        Object stackOut_31_0 = null;
        Object stackOut_34_0 = null;
        fs stackOut_35_0 = null;
        fs stackOut_35_1 = null;
        fs stackOut_41_0 = null;
        fs stackOut_41_1 = null;
        int stackOut_49_0 = 0;
        int stackOut_51_0 = 0;
        Object stackOut_54_0 = null;
        int stackOut_55_0 = 0;
        int stackOut_61_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!((hi) this).field_m.field_o.field_i) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var2_int = 0;
                        var3 = ((hi) this).field_m.field_g.field_e;
                        if (param0 > 4) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        this.i(15);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (~var3.length >= ~var4) {
                            statePc = 23;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5_ref_ln = var3[var4];
                        stackOut_9_0 = this;
                        stackIn_32_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                            statePc = 32;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ((hi) this).field_w;
                        stackOut_10_1 = var5_ref_ln.field_y;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (stackIn_12_0 != stackIn_12_1) {
                            statePc = 22;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var6_ref_ln__ = var5_ref_ln.field_D;
                        var7_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (~var7_int <= ~var6_ref_ln__.length) {
                            statePc = 22;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var8 = var6_ref_ln__[var7_int];
                        stackOut_15_0 = ((hi) this).field_w;
                        stackOut_15_1 = var8.field_y;
                        stackIn_12_0 = stackOut_15_0;
                        stackIn_12_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (var11 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (stackIn_16_0 != stackIn_16_1) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var2_int++;
                        if (var11 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7_int++;
                        if (var11 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var4++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (0 != var2_int) {
                            statePc = 31;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.a(-1, ((hi) this).field_w.field_m.field_q, ((hi) this).field_i[0]);
                        var3_int = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (((hi) this).field_i.length <= var3_int) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        ((hi) this).field_i[var3_int] = 0;
                        var3_int++;
                        if (var11 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var11 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var3 = new ln[var2_int];
                        var4 = 0;
                        stackOut_31_0 = this;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var5_ref_ln__ = ((hi) this).field_m.field_g.field_e;
                        var6 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var6 >= var5_ref_ln__.length) {
                            statePc = 49;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var7 = var5_ref_ln__[var6];
                        stackOut_34_0 = this;
                        stackIn_55_0 = stackOut_34_0;
                        stackIn_35_0 = stackOut_34_0;
                        if (var11 != 0) {
                            statePc = 55;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = ((hi) this).field_w;
                        stackOut_35_1 = var7.field_y;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (stackIn_37_0 == stackIn_37_1) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (var11 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8_array = var7.field_D;
                        var9 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (~var9 <= ~var8_array.length) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        var10 = var8_array[var9];
                        stackOut_41_0 = var10.field_y;
                        stackOut_41_1 = ((hi) this).field_w;
                        stackIn_37_0 = stackOut_41_0;
                        stackIn_37_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var11 != 0) {
                            statePc = 37;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (stackIn_42_0 != stackIn_42_1) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var3[var4] = var7;
                        var4++;
                        if (var11 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var9++;
                        if (var11 == 0) {
                            statePc = 40;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var6++;
                        if (var11 == 0) {
                            statePc = 33;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (stackIn_50_0 >= ((hi) this).field_i[0]) {
                            statePc = 61;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var5_ref_ln__ = var3;
                        stackOut_51_0 = 0;
                        stackIn_62_0 = stackOut_51_0;
                        stackIn_52_0 = stackOut_51_0;
                        if (var11 != 0) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6 = stackIn_52_0;
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (~var6 <= ~var5_ref_ln__.length) {
                            statePc = 60;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var7 = var5_ref_ln__[var6];
                        this.a(-1, var7, 1);
                        ((hi) this).field_i[0] = ((hi) this).field_i[0] - 1;
                        stackOut_54_0 = this;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackOut_55_0 = ((hi) this).field_i[0];
                        stackIn_50_0 = stackOut_55_0;
                        stackIn_56_0 = stackOut_55_0;
                        if (var11 != 0) {
                            statePc = 50;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 == 0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var6++;
                        if (var11 == 0) {
                            statePc = 53;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (var11 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = 0;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var5 = stackIn_62_0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (~var5 <= ~((hi) this).field_i.length) {
                            statePc = 70;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        ((hi) this).field_i[var5] = 0;
                        var5++;
                        if (var11 != 0) {
                            statePc = 70;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var11 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 69: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw r.a((Throwable) (Object) var2, "hi.BA(" + param0 + ')');
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(ac param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        sd var4_ref = null;
        sd var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        ln stackIn_24_0 = null;
        ln stackIn_47_0 = null;
        ln stackIn_79_0 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_23_0 = null;
        ln stackOut_46_0 = null;
        ln stackOut_78_0 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = param0.field_n.field_R;
            var6 = 0;
            var7 = 0;
            var8 = 99 % ((param2 - 37) / 48);
            var4_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_ref == null) {
                    break L3;
                  } else {
                    if (var13 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var4_ref == var5) {
                          var7 = 1;
                          if (var13 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var6++;
                      var4_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                      if (var13 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var7 == 0) {
                  break L2;
                } else {
                  L5: {
                    var9 = (-((hi) this).field_t + 50) * param0.field_i / 250 + param0.field_i;
                    if (!param1) {
                      break L5;
                    } else {
                      L6: {
                        L7: {
                          if (mr.field_f) {
                            var10_ref_ln__ = param0.field_n.field_D;
                            var11 = 0;
                            L8: while (true) {
                              if (var10_ref_ln__.length <= var11) {
                                break L7;
                              } else {
                                var12 = var10_ref_ln__[var11];
                                stackOut_23_0 = (ln) var12;
                                stackIn_79_0 = stackOut_23_0;
                                stackIn_24_0 = stackOut_23_0;
                                if (var13 != 0) {
                                  break L6;
                                } else {
                                  L9: {
                                    if (stackIn_24_0 != km.field_u) {
                                      break L9;
                                    } else {
                                      if (var12.field_y != null) {
                                        L10: {
                                          param0.field_i = param0.field_i - var12.field_x;
                                          if (param0.field_i < 0) {
                                            param0.field_i = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var9 = param0.field_i + (50 + -((hi) this).field_t) * param0.field_i / 250;
                                        if (var13 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var11++;
                                  if (var13 == 0) {
                                    continue L8;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                        L11: {
                          if (((hi) this).field_w.field_u[2] < 5) {
                            break L11;
                          } else {
                            if (mr.field_f) {
                              break L11;
                            } else {
                              var10_ref_ln__ = param0.field_n.field_D;
                              var11 = 0;
                              L12: while (true) {
                                if (var10_ref_ln__.length <= var11) {
                                  break L11;
                                } else {
                                  var12 = var10_ref_ln__[var11];
                                  stackOut_46_0 = (ln) var12;
                                  stackIn_79_0 = stackOut_46_0;
                                  stackIn_47_0 = stackOut_46_0;
                                  if (var13 != 0) {
                                    break L6;
                                  } else {
                                    L13: {
                                      if (stackIn_47_0.field_y == null) {
                                        break L13;
                                      } else {
                                        L14: {
                                          if (((hi) this).field_w != var12.field_y) {
                                            break L14;
                                          } else {
                                            if (var13 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                        if (~(int)((double)var9 * 0.8) < ~var12.field_x) {
                                          break L13;
                                        } else {
                                          if (var12.field_x > 10) {
                                            L15: {
                                              this.a((byte) -82, var12);
                                              param0.field_i = param0.field_i - var12.field_x;
                                              if (param0.field_i < 0) {
                                                param0.field_i = 0;
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            var9 = (50 - ((hi) this).field_t) * param0.field_i / 250 + param0.field_i;
                                            if (var13 == 0) {
                                              break L11;
                                            } else {
                                              break L13;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    var11++;
                                    if (var13 == 0) {
                                      continue L12;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (5 > ((hi) this).field_w.field_u[0]) {
                          break L5;
                        } else {
                          if (!no.field_b) {
                            stackOut_78_0 = param0.field_n;
                            stackIn_79_0 = stackOut_78_0;
                            break L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (stackIn_79_0.field_u) {
                        break L5;
                      } else {
                        L16: {
                          if (~var9 < ~((hi) this).field_n[var6]) {
                            break L16;
                          } else {
                            if (var9 > 20) {
                              break L16;
                            } else {
                              break L5;
                            }
                          }
                        }
                        this.a(param0.field_n, 31308);
                        if (param0.field_i > 1) {
                          param0.field_i = param0.field_i / 2;
                          var9 = param0.field_i - -(param0.field_i * (-((hi) this).field_t + 50) / 250);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (0 != var9) {
                    L17: {
                      if (param1) {
                        break L17;
                      } else {
                        var9 = var9 * 3 / 10;
                        if (var9 != 0) {
                          break L17;
                        } else {
                          var9 = 1;
                          break L17;
                        }
                      }
                    }
                    L18: {
                      L19: {
                        if (~var9 >= ~((hi) this).field_n[var6]) {
                          break L19;
                        } else {
                          L20: {
                            if (((hi) this).field_n[var6] <= 0) {
                              break L20;
                            } else {
                              var9 = var9 - ((hi) this).field_n[var6];
                              kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + ((hi) this).field_n[var6];
                              ((hi) this).field_n[var6] = 0;
                              break L20;
                            }
                          }
                          L21: {
                            L22: {
                              L23: {
                                L24: {
                                  if (~((hi) this).field_i[var6] <= ~var9) {
                                    break L24;
                                  } else {
                                    L25: {
                                      var9 = var9 - ((hi) this).field_i[var6];
                                      var10 = ((hi) this).field_i[var6];
                                      if (((hi) this).field_m.field_o.field_i) {
                                        break L25;
                                      } else {
                                        ((hi) this).field_i[var6] = 0;
                                        if (var13 == 0) {
                                          break L23;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    var11 = 0;
                                    L26: while (true) {
                                      L27: {
                                        if (((hi) this).field_i.length <= var11) {
                                          break L27;
                                        } else {
                                          ((hi) this).field_i[var11] = 0;
                                          var11++;
                                          if (var13 != 0) {
                                            break L23;
                                          } else {
                                            if (var13 == 0) {
                                              continue L26;
                                            } else {
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      if (var13 == 0) {
                                        break L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                }
                                L28: {
                                  var10 = var9;
                                  if (((hi) this).field_m.field_o.field_i) {
                                    break L28;
                                  } else {
                                    ((hi) this).field_i[var6] = ((hi) this).field_i[var6] - var9;
                                    if (var13 == 0) {
                                      break L23;
                                    } else {
                                      break L28;
                                    }
                                  }
                                }
                                var11 = 0;
                                L29: while (true) {
                                  if (((hi) this).field_i.length <= var11) {
                                    break L23;
                                  } else {
                                    ((hi) this).field_i[var11] = ((hi) this).field_i[var11] - var9;
                                    var11++;
                                    if (var13 != 0) {
                                      break L22;
                                    } else {
                                      if (var13 == 0) {
                                        continue L29;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var10 > 0) {
                                this.a(-1, param0.field_n, var10);
                                break L22;
                              } else {
                                break L21;
                              }
                            }
                            og.field_c[param0.field_n.field_p] = og.field_c[param0.field_n.field_p] + var10;
                            break L21;
                          }
                          if (var13 == 0) {
                            break L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ((hi) this).field_n[var6] = ((hi) this).field_n[var6] - var9;
                      kq.field_c[param0.field_n.field_p] = kq.field_c[param0.field_n.field_p] + var9;
                      var9 = 0;
                      break L18;
                    }
                    break L0;
                  } else {
                    param0.b((byte) -62);
                    return;
                  }
                }
              }
              throw new RuntimeException("DefendTask's star does not appear to be in AI's territory: " + param0.field_n.field_I + ".");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var4 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) var4;
            stackOut_133_1 = new StringBuilder().append("hi.AA(");
            stackIn_136_0 = stackOut_133_0;
            stackIn_136_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param0 == null) {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L30;
            } else {
              stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
              stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
              stackOut_134_2 = "{...}";
              stackIn_137_0 = stackOut_134_0;
              stackIn_137_1 = stackOut_134_1;
              stackIn_137_2 = stackOut_134_2;
              break L30;
            }
          }
          throw r.a((Throwable) (Object) stackIn_137_0, stackIn_137_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!((hi) this).field_p) {
              return;
            } else {
              L1: {
                var3_int = ((hi) this).field_q[param0.field_x];
                if (param1 == 7686) {
                  break L1;
                } else {
                  ((hi) this).field_w = null;
                  break L1;
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        L7: {
                          L8: {
                            L9: {
                              L10: {
                                L11: {
                                  var7 = var3_int;
                                  if (var7 == 1) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (var7 != 6) {
                                        break L12;
                                      } else {
                                        if (var8 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    if (var7 == 2) {
                                      break L10;
                                    } else {
                                      if (7 == var7) {
                                        break L10;
                                      } else {
                                        L13: {
                                          if (3 != var7) {
                                            break L13;
                                          } else {
                                            if (var8 == 0) {
                                              break L9;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        if (var7 == 4) {
                                          break L8;
                                        } else {
                                          L14: {
                                            if (5 != var7) {
                                              break L14;
                                            } else {
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (var7 != -1) {
                                              break L15;
                                            } else {
                                              if (var8 == 0) {
                                                break L6;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          if (var7 == -2) {
                                            break L5;
                                          } else {
                                            if (var7 != -3) {
                                              break L3;
                                            } else {
                                              if (var8 == 0) {
                                                break L4;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var4 = 0;
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L10;
                                }
                              }
                              var4 = 1;
                              if (var8 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                            var4 = 2;
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L8;
                            }
                          }
                          var4 = 3;
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                        var4 = 13;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L6;
                        }
                      }
                      var4 = 4;
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    var4 = 5;
                    if (var8 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 6;
                  var6 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r - 2];
                  var5 = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
                  if (~((hi) this).field_w.field_x == ~var5) {
                    break L2;
                  } else {
                    if (param0.field_x == var5) {
                      break L2;
                    } else {
                      if (~(3 * ((hi) this).field_m.field_D[var6]) <= ~(2 * ((hi) this).field_m.field_D[var5])) {
                        break L2;
                      } else {
                        var4 = 5;
                        if (var8 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var4 = -1;
                break L2;
              }
              L16: {
                if (var4 == -1) {
                  break L16;
                } else {
                  ((hi) this).field_c.a(0, (byte) -125, param0, ((hi) this).field_w, var4);
                  break L16;
                }
              }
              L17: {
                if (((hi) this).field_w.field_h[param0.field_x]) {
                  break L17;
                } else {
                  if (0 <= var3_int) {
                    break L17;
                  } else {
                    ((hi) this).field_c.a((byte) -63, ((hi) this).field_w, param0);
                    this.b(true);
                    break L17;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var3;
            stackOut_76_1 = new StringBuilder().append("hi.SA(");
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param0 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L18;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L18;
            }
          }
          throw r.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ac var3 = null;
        kl var3_ref = null;
        int[] var3_array = null;
        ac var4 = null;
        kl var4_ref = null;
        int var5 = 0;
        ac stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        RuntimeException decompiledCaughtException = null;
        ac stackOut_18_0 = null;
        oh stackOut_20_0 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = (ac) (Object) ((hi) this).field_u.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var3.field_l = (var3.field_j << -318601488) * (-((hi) this).field_j + 100) / (var3.field_i * 100);
                    var2_int++;
                    var3 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 >= 93) {
                  break L2;
                } else {
                  return;
                }
              }
              var3_ref = (kl) (Object) ((hi) this).field_k.d(0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var3_ref) {
                      break L6;
                    } else {
                      var3_ref.field_l = (var3_ref.field_j << 1381374448) * ((hi) this).field_j / (var3_ref.field_i * 100);
                      var2_int++;
                      var3_ref = (kl) (Object) ((hi) this).field_k.a((byte) -71);
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  ((hi) this).field_e = new wf[var2_int];
                  break L5;
                }
                var3_array = new int[var2_int];
                var2_int = 0;
                var4 = (ac) (Object) ((hi) this).field_u.d(0);
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var4 == null) {
                        break L9;
                      } else {
                        ((hi) this).field_e[var2_int] = (wf) (Object) var4;
                        var3_array[var2_int] = var4.field_l;
                        var2_int++;
                        stackOut_18_0 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                        stackIn_21_0 = (Object) (Object) stackOut_18_0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var5 != 0) {
                          break L8;
                        } else {
                          var4 = stackIn_19_0;
                          if (var5 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_20_0 = ((hi) this).field_k.d(0);
                    stackIn_21_0 = (Object) (Object) stackOut_20_0;
                    break L8;
                  }
                  var4_ref = (kl) (Object) stackIn_21_0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (null == var4_ref) {
                          break L12;
                        } else {
                          ((hi) this).field_e[var2_int] = (wf) (Object) var4_ref;
                          var3_array[var2_int] = var4_ref.field_l;
                          var2_int++;
                          var4_ref = (kl) (Object) ((hi) this).field_k.a((byte) -71);
                          if (var5 != 0) {
                            break L11;
                          } else {
                            if (var5 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      ak.a(var3_array, -43, (Object[]) (Object) ((hi) this).field_e);
                      break L11;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.I(" + param0 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        sd var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((hi) this).field_s = new int[((hi) this).field_w.field_i.e(0)][4];
              if (param0 >= 104) {
                break L1;
              } else {
                ((hi) this).field_w = null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (((hi) this).field_m.field_o.field_i) {
                    break L4;
                  } else {
                    var2_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                    var3 = 0;
                    L5: while (true) {
                      L6: {
                        if (((hi) this).field_s.length <= var3) {
                          break L6;
                        } else {
                          if (var5 != 0) {
                            break L3;
                          } else {
                            var4 = 0;
                            L7: while (true) {
                              L8: {
                                L9: {
                                  if (var4 >= 4) {
                                    break L9;
                                  } else {
                                    ((hi) this).field_s[var3][var4] = -var2_ref.field_u[var4] + 1 + var2_ref.field_u[var2_ref.field_w[0]];
                                    var4++;
                                    if (var5 != 0) {
                                      break L8;
                                    } else {
                                      if (var5 == 0) {
                                        continue L7;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                var2_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                var3++;
                                break L8;
                              }
                              if (var5 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var2_int = 0;
                L10: while (true) {
                  if (var2_int >= 4) {
                    break L3;
                  } else {
                    var3 = 1 + -((hi) this).field_w.field_m.field_u[var2_int] - -((hi) this).field_w.field_m.field_u[((hi) this).field_w.field_m.field_w[0]];
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if (~var4 <= ~((hi) this).field_s.length) {
                              break L13;
                            } else {
                              ((hi) this).field_s[var4][var2_int] = var3;
                              var4++;
                              if (var5 != 0) {
                                break L12;
                              } else {
                                if (var5 == 0) {
                                  continue L11;
                                } else {
                                  break L13;
                                }
                              }
                            }
                          }
                          var2_int++;
                          break L12;
                        }
                        if (var5 == 0) {
                          continue L10;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.F(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_a = null;
              if (param0 <= -42) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            field_d = null;
            field_o = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "hi.D(" + param0 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        qr stackIn_11_0 = null;
        qr stackIn_12_0 = null;
        qr stackIn_14_0 = null;
        qr stackIn_15_0 = null;
        qr stackIn_17_0 = null;
        qr stackIn_18_0 = null;
        qr stackIn_20_0 = null;
        qr stackIn_21_0 = null;
        qr stackIn_23_0 = null;
        qr stackIn_25_0 = null;
        qr stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        qr stackIn_27_0 = null;
        qr stackIn_28_0 = null;
        qr stackIn_30_0 = null;
        qr stackIn_31_0 = null;
        qr stackIn_33_0 = null;
        qr stackIn_34_0 = null;
        qr stackIn_36_0 = null;
        qr stackIn_37_0 = null;
        qr stackIn_39_0 = null;
        qr stackIn_41_0 = null;
        qr stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        qr stackIn_43_0 = null;
        qr stackIn_44_0 = null;
        qr stackIn_46_0 = null;
        qr stackIn_47_0 = null;
        qr stackIn_49_0 = null;
        qr stackIn_51_0 = null;
        qr stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_10_0 = null;
        qr stackOut_11_0 = null;
        qr stackOut_12_0 = null;
        qr stackOut_14_0 = null;
        qr stackOut_15_0 = null;
        qr stackOut_17_0 = null;
        qr stackOut_18_0 = null;
        qr stackOut_20_0 = null;
        qr stackOut_21_0 = null;
        qr stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        qr stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        qr stackOut_26_0 = null;
        qr stackOut_27_0 = null;
        qr stackOut_28_0 = null;
        qr stackOut_30_0 = null;
        qr stackOut_31_0 = null;
        qr stackOut_33_0 = null;
        qr stackOut_34_0 = null;
        qr stackOut_36_0 = null;
        qr stackOut_37_0 = null;
        qr stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        qr stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        qr stackOut_42_0 = null;
        qr stackOut_43_0 = null;
        qr stackOut_44_0 = null;
        qr stackOut_46_0 = null;
        qr stackOut_47_0 = null;
        qr stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        qr stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              nj.a(param1 ^ -27033);
              if (param1 == -26671) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 <= a.field_j) {
                  break L3;
                } else {
                  nm.field_c.field_z = null;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              nm.field_c.field_z = re.a(vn.field_A, 4371, new String[1]);
              break L2;
            }
            L4: {
              L5: {
                stackOut_10_0 = ia.field_j;
                stackIn_25_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (!param0) {
                  break L5;
                } else {
                  stackOut_11_0 = (qr) (Object) stackIn_11_0;
                  stackIn_25_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (param2) {
                    break L5;
                  } else {
                    stackOut_12_0 = (qr) (Object) stackIn_12_0;
                    stackIn_14_0 = stackOut_12_0;
                    stackOut_14_0 = (qr) (Object) stackIn_14_0;
                    stackIn_25_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (on.field_b) {
                      break L5;
                    } else {
                      stackOut_15_0 = (qr) (Object) stackIn_15_0;
                      stackIn_17_0 = stackOut_15_0;
                      stackOut_17_0 = (qr) (Object) stackIn_17_0;
                      stackIn_25_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (np.field_a != null) {
                        break L5;
                      } else {
                        stackOut_18_0 = (qr) (Object) stackIn_18_0;
                        stackIn_20_0 = stackOut_18_0;
                        stackOut_20_0 = (qr) (Object) stackIn_20_0;
                        stackIn_25_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (he.field_p != null) {
                          break L5;
                        } else {
                          stackOut_21_0 = (qr) (Object) stackIn_21_0;
                          stackIn_23_0 = stackOut_21_0;
                          stackOut_23_0 = (qr) (Object) stackIn_23_0;
                          stackOut_23_1 = 1;
                          stackIn_26_0 = stackOut_23_0;
                          stackIn_26_1 = stackOut_23_1;
                          break L4;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_25_0 = (qr) (Object) stackIn_25_0;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L4;
            }
            L6: {
              L7: {
                ((qr) (Object) stackIn_26_0).a(stackIn_26_1 != 0, -20429);
                stackOut_26_0 = se.field_i;
                stackIn_41_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (!param0) {
                  break L7;
                } else {
                  stackOut_27_0 = (qr) (Object) stackIn_27_0;
                  stackIn_41_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (param2) {
                    break L7;
                  } else {
                    stackOut_28_0 = (qr) (Object) stackIn_28_0;
                    stackIn_30_0 = stackOut_28_0;
                    stackOut_30_0 = (qr) (Object) stackIn_30_0;
                    stackIn_41_0 = stackOut_30_0;
                    stackIn_31_0 = stackOut_30_0;
                    if (on.field_b) {
                      break L7;
                    } else {
                      stackOut_31_0 = (qr) (Object) stackIn_31_0;
                      stackIn_33_0 = stackOut_31_0;
                      stackOut_33_0 = (qr) (Object) stackIn_33_0;
                      stackIn_41_0 = stackOut_33_0;
                      stackIn_34_0 = stackOut_33_0;
                      if (null != np.field_a) {
                        break L7;
                      } else {
                        stackOut_34_0 = (qr) (Object) stackIn_34_0;
                        stackIn_36_0 = stackOut_34_0;
                        stackOut_36_0 = (qr) (Object) stackIn_36_0;
                        stackIn_41_0 = stackOut_36_0;
                        stackIn_37_0 = stackOut_36_0;
                        if (null != he.field_p) {
                          break L7;
                        } else {
                          stackOut_37_0 = (qr) (Object) stackIn_37_0;
                          stackIn_39_0 = stackOut_37_0;
                          stackOut_39_0 = (qr) (Object) stackIn_39_0;
                          stackOut_39_1 = 1;
                          stackIn_42_0 = stackOut_39_0;
                          stackIn_42_1 = stackOut_39_1;
                          break L6;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_41_0 = (qr) (Object) stackIn_41_0;
              stackOut_41_1 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              break L6;
            }
            L8: {
              L9: {
                ((qr) (Object) stackIn_42_0).a(stackIn_42_1 != 0, -20429);
                stackOut_42_0 = so.field_v;
                stackIn_51_0 = stackOut_42_0;
                stackIn_43_0 = stackOut_42_0;
                if (!param0) {
                  break L9;
                } else {
                  stackOut_43_0 = (qr) (Object) stackIn_43_0;
                  stackIn_51_0 = stackOut_43_0;
                  stackIn_44_0 = stackOut_43_0;
                  if (param2) {
                    break L9;
                  } else {
                    stackOut_44_0 = (qr) (Object) stackIn_44_0;
                    stackIn_46_0 = stackOut_44_0;
                    stackOut_46_0 = (qr) (Object) stackIn_46_0;
                    stackIn_51_0 = stackOut_46_0;
                    stackIn_47_0 = stackOut_46_0;
                    if (!on.field_b) {
                      break L9;
                    } else {
                      stackOut_47_0 = (qr) (Object) stackIn_47_0;
                      stackIn_49_0 = stackOut_47_0;
                      stackOut_49_0 = (qr) (Object) stackIn_49_0;
                      stackOut_49_1 = 1;
                      stackIn_52_0 = stackOut_49_0;
                      stackIn_52_1 = stackOut_49_1;
                      break L8;
                    }
                  }
                }
              }
              stackOut_51_0 = (qr) (Object) stackIn_51_0;
              stackOut_51_1 = 0;
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              break L8;
            }
            L10: {
              ((qr) (Object) stackIn_52_0).a(stackIn_52_1 != 0, param1 ^ 10210);
              bc.field_g.field_d.f(false);
              if (0 == vm.field_Ab.field_rb) {
                break L10;
              } else {
                s.field_d = true;
                break L10;
              }
            }
            L11: {
              if (gb.field_m.field_rb == 0) {
                break L11;
              } else {
                L12: {
                  if (hm.field_o) {
                    break L12;
                  } else {
                    if (0 < es.field_m) {
                      break L12;
                    } else {
                      L13: {
                        if (bs.field_b < 2) {
                          break L13;
                        } else {
                          if (di.field_p[12]) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      uc.field_B = true;
                      if (var5 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                }
                gd.a(param3, 1);
                break L11;
              }
            }
            L14: {
              if (rq.field_b.field_rb == 0) {
                break L14;
              } else {
                L15: {
                  if (1 != nl.field_a.length) {
                    break L15;
                  } else {
                    if (nl.field_a[0] == qk.field_x) {
                      break L15;
                    } else {
                      qk.field_x = nl.field_a[0];
                      break L15;
                    }
                  }
                }
                ei.a(param3, qk.field_x, mk.field_d, true, false, 0);
                break L14;
              }
            }
            L16: {
              if (li.field_d.field_rb != 0) {
                on.field_b = false;
                break L16;
              } else {
                break L16;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "hi.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        fs stackIn_8_0 = null;
        fs stackIn_8_1 = null;
        fs stackIn_16_0 = null;
        fs stackIn_16_1 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_6_0 = null;
        fs stackOut_6_1 = null;
        fs stackOut_15_0 = null;
        fs stackOut_15_1 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((hi) this).field_k.a(0);
            if (param0 == -30426) {
              var2 = ((hi) this).field_m.field_g.field_e;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var2.length >= ~var3) {
                      break L3;
                    } else {
                      var4 = var2[var3];
                      if (var8 != 0) {
                        break L2;
                      } else {
                        stackOut_6_0 = var4.field_y;
                        stackOut_6_1 = ((hi) this).field_w;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        L4: while (true) {
                          L5: {
                            if (stackIn_8_0 == stackIn_8_1) {
                              break L5;
                            } else {
                              L6: {
                                if (var4.field_y == null) {
                                  break L6;
                                } else {
                                  if (((hi) this).field_w.field_h[var4.field_y.field_x]) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var5 = var4.field_D;
                              var6 = 0;
                              L7: while (true) {
                                if (var6 >= var5.length) {
                                  break L5;
                                } else {
                                  var7 = var5[var6];
                                  stackOut_15_0 = var7.field_y;
                                  stackOut_15_1 = ((hi) this).field_w;
                                  stackIn_8_0 = stackOut_15_0;
                                  stackIn_8_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var8 != 0) {
                                    continue L4;
                                  } else {
                                    L8: {
                                      if (stackIn_16_0 != stackIn_16_1) {
                                        break L8;
                                      } else {
                                        ((hi) this).field_k.a((byte) -113, (oh) (Object) new kl(var4, ((hi) this).field_w.field_i, ((hi) this).field_s, ((hi) this).field_w, ((hi) this).field_m.field_x, ((hi) this).field_g, ((hi) this).field_m));
                                        if (var8 == 0) {
                                          break L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var6++;
                                    if (var8 == 0) {
                                      continue L7;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var3++;
                          if (var8 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "hi.W(" + param0 + ')');
        }
    }

    private final void b(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        wf[] var3 = null;
        int var4 = 0;
        wf var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = ((hi) this).field_e;
            var4 = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3.length <= var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (!(var5 instanceof ac)) {
                            break L5;
                          } else {
                            this.a((ac) (Object) var5, param0, 95);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (var5 instanceof kl) {
                          this.a((byte) -124, (kl) (Object) var5, param0);
                          break L4;
                        } else {
                          throw new RuntimeException("prioritizedTasks contains invalid task for Star " + var5.field_n.field_I + ".");
                        }
                      }
                      var4++;
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "hi.EA(" + param0 + ',' + param1 + ')');
        }
    }

    public final int a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((hi) this).field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = 8;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.KA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final void a(int param0, byte param1, ln param2, ln param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        fs stackIn_27_0 = null;
        fs stackIn_27_1 = null;
        fs stackIn_58_0 = null;
        fs stackIn_58_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_26_0 = null;
        fs stackOut_26_1 = null;
        fs stackOut_56_0 = null;
        fs stackOut_56_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == param3) {
                break L1;
              } else {
                if (null != param2) {
                  if (param0 == 0) {
                    return;
                  } else {
                    if (param0 < 0) {
                      throw new RuntimeException();
                    } else {
                      if (((hi) this).field_w == param3.field_y) {
                        L2: {
                          if (param2.field_R == param3.field_R) {
                            break L2;
                          } else {
                            if (param3.b(param2, (byte) 10)) {
                              break L2;
                            } else {
                              throw new RuntimeException(((hi) this).field_w.field_t + " is attempting an invalid move from " + param3.field_I + " to " + param2.field_I + ".");
                            }
                          }
                        }
                        var5_ref = (mg) (Object) param3.field_s.c(-128);
                        L3: while (true) {
                          L4: {
                            L5: {
                              L6: {
                                if (var5_ref == null) {
                                  break L6;
                                } else {
                                  stackOut_26_0 = var5_ref.field_G;
                                  stackOut_26_1 = ((hi) this).field_w;
                                  stackIn_58_0 = stackOut_26_0;
                                  stackIn_58_1 = stackOut_26_1;
                                  stackIn_27_0 = stackOut_26_0;
                                  stackIn_27_1 = stackOut_26_1;
                                  if (var6 != 0) {
                                    L7: while (true) {
                                      L8: {
                                        if (stackIn_58_0 != stackIn_58_1) {
                                          break L8;
                                        } else {
                                          if (var5_ref.field_y != param3) {
                                            break L8;
                                          } else {
                                            if (param2 != var5_ref.field_B) {
                                              break L8;
                                            } else {
                                              if (var6 == 0) {
                                                break L5;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var5_ref = (mg) (Object) ed.field_g.a((byte) -71);
                                      if (var6 == 0) {
                                        if (null == var5_ref) {
                                          break L5;
                                        } else {
                                          if (var6 != 0) {
                                            break L4;
                                          } else {
                                            stackOut_56_0 = ((hi) this).field_w;
                                            stackOut_56_1 = var5_ref.field_G;
                                            stackIn_58_0 = stackOut_56_0;
                                            stackIn_58_1 = stackOut_56_1;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        break L5;
                                      }
                                    }
                                  } else {
                                    L9: {
                                      if (stackIn_27_0 != stackIn_27_1) {
                                        break L9;
                                      } else {
                                        if (param2 != var5_ref.field_y) {
                                          break L9;
                                        } else {
                                          if (var6 == 0) {
                                            break L6;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                    var5_ref = (mg) (Object) param3.field_s.b(32);
                                    if (var6 == 0) {
                                      continue L3;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              L10: {
                                if (var5_ref == null) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var5_ref.field_z > param0) {
                                      break L11;
                                    } else {
                                      var5_ref.b((byte) -82);
                                      var5_ref.a(16);
                                      var5_ref.d(true);
                                      var5_ref.field_y.field_J = var5_ref.field_y.field_J + var5_ref.field_z;
                                      param0 = param0 - var5_ref.field_z;
                                      if (var6 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  var5_ref.field_z = var5_ref.field_z - param0;
                                  var5_ref.field_y.field_J = var5_ref.field_y.field_J + param0;
                                  return;
                                }
                              }
                              L12: {
                                if (param1 >= 86) {
                                  break L12;
                                } else {
                                  this.b(true, 49);
                                  break L12;
                                }
                              }
                              if (param0 != 0) {
                                if (~param3.field_J > ~param0) {
                                  throw new RuntimeException("Trying to move " + param0 + " fleets from " + param3.field_I + " to " + param2.field_I + " but garrison_next is only " + param3.field_J + ".");
                                } else {
                                  param3.field_J = param3.field_J - param0;
                                  var5_ref = (mg) (Object) ed.field_g.d(0);
                                  L13: while (true) {
                                    if (null == var5_ref) {
                                      break L5;
                                    } else {
                                      if (var6 != 0) {
                                        break L4;
                                      } else {
                                        stackOut_56_0 = ((hi) this).field_w;
                                        stackOut_56_1 = var5_ref.field_G;
                                        stackIn_58_0 = stackOut_56_0;
                                        stackIn_58_1 = stackOut_56_1;
                                        L14: {
                                          if (stackIn_58_0 != stackIn_58_1) {
                                            break L14;
                                          } else {
                                            if (var5_ref.field_y != param3) {
                                              break L14;
                                            } else {
                                              if (param2 != var5_ref.field_B) {
                                                break L14;
                                              } else {
                                                if (var6 == 0) {
                                                  break L5;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var5_ref = (mg) (Object) ed.field_g.a((byte) -71);
                                        if (var6 == 0) {
                                          continue L13;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                return;
                              }
                            }
                            if (null != var5_ref) {
                              var5_ref.field_z = var5_ref.field_z + param0;
                              break L4;
                            } else {
                              var5_ref = new mg(param3, param2, param0);
                              ed.field_g.a((byte) -113, (oh) (Object) var5_ref);
                              break L0;
                            }
                          }
                          return;
                        }
                      } else {
                        throw new RuntimeException(((hi) this).field_w.field_t + " is attempting to move fleets from a system it does not own: " + param3.field_I + ".");
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var5 = decompiledCaughtException;
            stackOut_76_0 = (RuntimeException) var5;
            stackOut_76_1 = new StringBuilder().append("hi.B(").append(param0).append(',').append(param1).append(',');
            stackIn_79_0 = stackOut_76_0;
            stackIn_79_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param2 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L15;
            } else {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "{...}";
              stackIn_80_0 = stackOut_77_0;
              stackIn_80_1 = stackOut_77_1;
              stackIn_80_2 = stackOut_77_2;
              break L15;
            }
          }
          L16: {
            stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L16;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ')');
        }
    }

    private final int a(boolean param0, ln[] param1, ln param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        sd var10_ref = null;
        int var11 = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var14 = null;
        int var15 = 0;
        fs stackIn_6_0 = null;
        fs stackIn_6_1 = null;
        fs stackIn_17_0 = null;
        fs stackIn_17_1 = null;
        sd stackIn_41_0 = null;
        sd stackIn_49_0 = null;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_4_0 = null;
        fs stackOut_4_1 = null;
        fs stackOut_16_0 = null;
        fs stackOut_16_1 = null;
        sd stackOut_40_0 = null;
        sd stackOut_48_0 = null;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            var11 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var11 <= ~param1.length) {
                    break L3;
                  } else {
                    if (var15 != 0) {
                      break L2;
                    } else {
                      stackOut_4_0 = param1[var11].field_y;
                      stackOut_4_1 = ((hi) this).field_w;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      L4: while (true) {
                        L5: {
                          if (stackIn_6_0 != stackIn_6_1) {
                            break L5;
                          } else {
                            L6: {
                              if (q.field_Ab[param1[var11].field_p] != 0) {
                                break L6;
                              } else {
                                if (var15 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              var7 = 0;
                              if (param0) {
                                var12 = param1[var11].field_D;
                                var13 = 0;
                                L8: while (true) {
                                  if (~var12.length >= ~var13) {
                                    break L7;
                                  } else {
                                    var14 = var12[var13];
                                    stackOut_16_0 = ((hi) this).field_w;
                                    stackOut_16_1 = var14.field_y;
                                    stackIn_6_0 = stackOut_16_0;
                                    stackIn_6_1 = stackOut_16_1;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    if (var15 != 0) {
                                      continue L4;
                                    } else {
                                      L9: {
                                        if (stackIn_17_0 == stackIn_17_1) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var14.field_y == null) {
                                              break L10;
                                            } else {
                                              if (!((hi) this).field_w.field_h[var14.field_y.field_x]) {
                                                break L10;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          var7++;
                                          break L9;
                                        }
                                      }
                                      var13++;
                                      if (var15 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L7;
                              }
                            }
                            L11: {
                              if (!param0) {
                                break L11;
                              } else {
                                if (var7 == 1) {
                                  break L11;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L12: {
                              var8 = q.field_Ab[param1[var11].field_p];
                              var10 = null;
                              if (var8 > param4) {
                                var8 = param4;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var9 = 0;
                            var10_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                            L13: while (true) {
                              L14: {
                                L15: {
                                  if (null == var10_ref) {
                                    break L15;
                                  } else {
                                    stackOut_40_0 = (sd) var10_ref;
                                    stackIn_49_0 = stackOut_40_0;
                                    stackIn_41_0 = stackOut_40_0;
                                    if (var15 != 0) {
                                      break L14;
                                    } else {
                                      L16: {
                                        if (stackIn_41_0 != param1[var11].field_R) {
                                          break L16;
                                        } else {
                                          if (var15 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var9++;
                                      var10_ref = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                      if (var15 == 0) {
                                        continue L13;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                stackOut_48_0 = (sd) var10_ref;
                                stackIn_49_0 = stackOut_48_0;
                                break L14;
                              }
                              if (stackIn_49_0 == null) {
                                throw new RuntimeException("Cannot find territory of star " + ((hi) this).field_w.field_t + " wants to attack from: " + param1[var11].field_I + ".");
                              } else {
                                L17: {
                                  if (((hi) this).field_n[var9] >= var8) {
                                    break L17;
                                  } else {
                                    var8 = ((hi) this).field_n[var9];
                                    break L17;
                                  }
                                }
                                this.a(var8, (byte) 115, param2, param1[var11]);
                                q.field_Ab[param1[var11].field_p] = q.field_Ab[param1[var11].field_p] - var8;
                                var6_int = var6_int + var8;
                                ((hi) this).field_n[var9] = ((hi) this).field_n[var9] - var8;
                                if (var6_int != param4) {
                                  break L5;
                                } else {
                                  if (var15 == 0) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var11++;
                        if (var15 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                if (param3 > 64) {
                  break L2;
                } else {
                  field_a = null;
                  break L2;
                }
              }
              stackOut_64_0 = var6_int;
              stackIn_65_0 = stackOut_64_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var6 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var6;
            stackOut_66_1 = new StringBuilder().append("hi.E(").append(param0).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L18;
            }
          }
          L19: {
            stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',');
            stackIn_73_0 = stackOut_70_0;
            stackIn_73_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_74_0 = stackOut_71_0;
              stackIn_74_1 = stackOut_71_1;
              stackIn_74_2 = stackOut_71_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_65_0;
    }

    public final void a(fs param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var3_int = ((hi) this).field_q[param0.field_x];
                    var7 = var3_int;
                    if (-1 == var7) {
                      var4 = 10;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    } else {
                      L5: {
                        if (var7 != -2) {
                          break L5;
                        } else {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (var7 == -3) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 = 11;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                var4 = 12;
                var6 = ((hi) this).field_m.field_m[-2 + ((hi) this).field_m.field_r];
                var5 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r + -1];
                if (var5 == ((hi) this).field_w.field_x) {
                  break L1;
                } else {
                  if (~var5 == ~((hi) this).field_r) {
                    break L1;
                  } else {
                    if (((hi) this).field_m.field_D[var5] * 2 > ((hi) this).field_m.field_D[var6] * 3) {
                      var4 = 11;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var4 = -1;
              break L1;
            }
            L6: {
              if (var4 != -1) {
                ((hi) this).field_c.a(0, (byte) -109, param0, ((hi) this).field_w, var4);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1 == -42) {
                break L7;
              } else {
                this.e((byte) -14);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("hi.LA(");
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ')');
        }
    }

    private final void a(ln param0, int param1) {
        Object var3 = null;
        qm var4 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (((hi) this).field_w.field_u[0] >= 5) {
              if (!no.field_b) {
                if (((hi) this).field_w == param0.field_y) {
                  if (!param0.field_u) {
                    L1: {
                      vj.field_E.a((byte) -113, (oh) (Object) new qm(0, ((hi) this).field_w, param0));
                      no.field_b = true;
                      qo.field_e = param0;
                      if (param1 == 31308) {
                        break L1;
                      } else {
                        ((hi) this).field_t = -21;
                        break L1;
                      }
                    }
                    break L0;
                  } else {
                    throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net in a system that already has one: " + param0.field_I);
                  }
                } else {
                  throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net in a system it doesn't own: " + param0.field_I);
                }
              } else {
                var3 = null;
                var4 = (qm) (Object) vj.field_E.d(0);
                L2: while (true) {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      if (var4.field_o == 0) {
                        var3 = (Object) (Object) var4;
                        break L3;
                      } else {
                        var4 = (qm) (Object) vj.field_E.a((byte) -71);
                        continue L2;
                      }
                    }
                  }
                  if (null != var3) {
                    throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net it has already used." + " Already deployed at star " + ((qm) var3).field_q.field_I + ", now trying to deploy ot " + param0.field_I);
                  } else {
                    throw new RuntimeException(((hi) this).field_w.field_t + "'s deployedDefensiveNet variable incorrectly set to true.");
                  }
                }
              }
            } else {
              throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Defensive Net it doesn't have at star " + param0.field_I);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var3;
            stackOut_27_1 = new StringBuilder().append("hi.H(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, fs param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9_ref_ln__ = null;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        ln var11_ref_ln = null;
        int var11 = 0;
        int var12 = 0;
        ln[] var13 = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_24_0 = 0;
        fs stackIn_28_0 = null;
        fs stackIn_28_1 = null;
        fs stackIn_34_0 = null;
        fs stackIn_34_1 = null;
        int stackIn_46_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_74_0 = 0;
        fs stackIn_78_0 = null;
        fs stackIn_78_1 = null;
        int stackIn_85_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_94_0 = 0;
        boolean stackIn_98_0 = false;
        int stackIn_109_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_116_0 = 0;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_23_0 = 0;
        fs stackOut_27_0 = null;
        fs stackOut_27_1 = null;
        fs stackOut_33_0 = null;
        fs stackOut_33_1 = null;
        int stackOut_53_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        fs stackOut_76_0 = null;
        fs stackOut_76_1 = null;
        int stackOut_45_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_90_0 = 0;
        boolean stackOut_97_0 = false;
        int stackOut_108_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1.field_x;
              if (((hi) this).field_w == param1) {
                break L1;
              } else {
                if (((hi) this).field_w.field_h[var4_int]) {
                  break L1;
                } else {
                  if (0 == (((hi) this).field_m.field_w & 1 << var4_int)) {
                    if (~((hi) this).field_g == ~var4_int) {
                      stackOut_15_0 = 6;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    } else {
                      L2: {
                        var5 = ((hi) this).field_m.field_v[((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r]];
                        var6 = ((hi) this).field_m.field_v[((hi) this).field_m.field_m[-2 + ((hi) this).field_m.field_r]];
                        if (((hi) this).field_g != -1) {
                          break L2;
                        } else {
                          if (param1 == var5) {
                            stackOut_23_0 = 1;
                            stackIn_24_0 = stackOut_23_0;
                            return stackIn_24_0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var7 = 0;
                      var8 = 0;
                      var9_ref_ln__ = ((hi) this).field_m.field_g.field_e;
                      var10_int = 0;
                      L3: while (true) {
                        L4: {
                          L5: {
                            L6: {
                              if (var9_ref_ln__.length <= var10_int) {
                                break L6;
                              } else {
                                var11_ref_ln = var9_ref_ln__[var10_int];
                                stackOut_27_0 = ((hi) this).field_w;
                                stackOut_27_1 = var11_ref_ln.field_y;
                                stackIn_78_0 = stackOut_27_0;
                                stackIn_78_1 = stackOut_27_1;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                if (var16 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (stackIn_28_0 != stackIn_28_1) {
                                      break L7;
                                    } else {
                                      var12 = 0;
                                      var13 = var11_ref_ln.field_D;
                                      var14 = 0;
                                      L8: while (true) {
                                        L9: {
                                          if (var14 >= var13.length) {
                                            break L9;
                                          } else {
                                            var15 = var13[var14];
                                            stackOut_33_0 = var15.field_y;
                                            stackOut_33_1 = (fs) param1;
                                            stackIn_78_0 = stackOut_33_0;
                                            stackIn_78_1 = stackOut_33_1;
                                            stackIn_34_0 = stackOut_33_0;
                                            stackIn_34_1 = stackOut_33_1;
                                            if (var16 != 0) {
                                              break L5;
                                            } else {
                                              L10: {
                                                if (stackIn_34_0 != stackIn_34_1) {
                                                  break L10;
                                                } else {
                                                  var12 = 1;
                                                  var7 = var7 + var15.field_x;
                                                  break L10;
                                                }
                                              }
                                              var14++;
                                              if (var16 == 0) {
                                                continue L8;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                        if (var12 != 0) {
                                          var8 = var8 + var11_ref_ln.field_x;
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  var10_int++;
                                  if (var16 == 0) {
                                    continue L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var7 = var7 - -(var7 * (50 + -((hi) this).field_j) / 250);
                            if (~var7 >= ~(var8 * 2)) {
                              L11: {
                                if (((hi) this).field_g == -1) {
                                  break L11;
                                } else {
                                  if (param1.field_h[((hi) this).field_g]) {
                                    stackOut_53_0 = 7;
                                    stackIn_54_0 = stackOut_53_0;
                                    return stackIn_54_0;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (((hi) this).field_g != -1) {
                                  break L12;
                                } else {
                                  if (!var5.field_h[var4_int]) {
                                    break L12;
                                  } else {
                                    stackOut_59_0 = 2;
                                    stackIn_60_0 = stackOut_59_0;
                                    return stackIn_60_0;
                                  }
                                }
                              }
                              L13: {
                                if (-1 == ((hi) this).field_g) {
                                  break L13;
                                } else {
                                  if (var5 != param1) {
                                    break L13;
                                  } else {
                                    if (~((hi) this).field_g == ~var5.field_x) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (((hi) this).field_w.field_x != ((hi) this).field_g) {
                                          stackOut_73_0 = -2;
                                          stackIn_74_0 = stackOut_73_0;
                                          break L14;
                                        } else {
                                          stackOut_71_0 = -3;
                                          stackIn_74_0 = stackOut_71_0;
                                          break L14;
                                        }
                                      }
                                      return stackIn_74_0;
                                    }
                                  }
                                }
                              }
                              if (((hi) this).field_g != -1) {
                                break L4;
                              } else {
                                stackOut_76_0 = (fs) var6;
                                stackOut_76_1 = (fs) param1;
                                stackIn_78_0 = stackOut_76_0;
                                stackIn_78_1 = stackOut_76_1;
                                break L5;
                              }
                            } else {
                              stackOut_45_0 = -1;
                              stackIn_46_0 = stackOut_45_0;
                              return stackIn_46_0;
                            }
                          }
                          if (stackIn_78_0 != stackIn_78_1) {
                            break L4;
                          } else {
                            L15: {
                              if (var5 == ((hi) this).field_w) {
                                stackOut_84_0 = -3;
                                stackIn_85_0 = stackOut_84_0;
                                break L15;
                              } else {
                                stackOut_82_0 = -2;
                                stackIn_85_0 = stackOut_82_0;
                                break L15;
                              }
                            }
                            return stackIn_85_0;
                          }
                        }
                        L16: {
                          var9 = ((hi) this).field_m.field_D[var4_int];
                          var9 = var9 + var9 * (50 + -((hi) this).field_j) / 250;
                          if (var7 >= var8) {
                            break L16;
                          } else {
                            if (~(((hi) this).field_m.field_D[((hi) this).field_w.field_x] * 2) >= ~(3 * var9)) {
                              break L16;
                            } else {
                              stackOut_90_0 = 3;
                              stackIn_91_0 = stackOut_90_0;
                              return stackIn_91_0;
                            }
                          }
                        }
                        var10 = oe.field_g[((hi) this).field_w.field_x];
                        var11 = param0;
                        if (param2 == 3) {
                          var12 = 0;
                          L17: while (true) {
                            L18: {
                              L19: {
                                if (((hi) this).field_m.field_g.field_e.length <= var12) {
                                  break L19;
                                } else {
                                  stackOut_97_0 = jf.field_e[var12];
                                  stackIn_109_0 = stackOut_97_0 ? 1 : 0;
                                  stackIn_98_0 = stackOut_97_0;
                                  if (var16 != 0) {
                                    break L18;
                                  } else {
                                    L20: {
                                      if (!stackIn_98_0) {
                                        break L20;
                                      } else {
                                        if (~oe.field_g[var4_int][var12] >= ~var10[var12]) {
                                          var11--;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (var16 == 0) {
                                      continue L17;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              stackOut_108_0 = ~var11;
                              stackIn_109_0 = stackOut_108_0;
                              break L18;
                            }
                            L21: {
                              if (stackIn_109_0 <= -6) {
                                break L21;
                              } else {
                                if (var11 >= param0) {
                                  break L21;
                                } else {
                                  stackOut_113_0 = 4;
                                  stackIn_114_0 = stackOut_113_0;
                                  return stackIn_114_0;
                                }
                              }
                            }
                            stackOut_115_0 = -3;
                            stackIn_116_0 = stackOut_115_0;
                            break L0;
                          }
                        } else {
                          stackOut_93_0 = 120;
                          stackIn_94_0 = stackOut_93_0;
                          return stackIn_94_0;
                        }
                      }
                    }
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var4;
            stackOut_117_1 = new StringBuilder().append("hi.GA(").append(param0).append(',');
            stackIn_120_0 = stackOut_117_0;
            stackIn_120_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param1 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L22;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_121_0 = stackOut_118_0;
              stackIn_121_1 = stackOut_118_1;
              stackIn_121_2 = stackOut_118_2;
              break L22;
            }
          }
          throw r.a((Throwable) (Object) stackIn_121_0, stackIn_121_2 + ',' + param2 + ')');
        }
        return stackIn_116_0;
    }

    private final void a(int param0, int param1, sd param2) {
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        qa var6 = null;
        ln var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln stackIn_4_0 = null;
        Object stackIn_15_0 = null;
        sd stackIn_18_0 = null;
        sd stackIn_26_0 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        Object stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_3_0 = null;
        oh stackOut_14_0 = null;
        sd stackOut_17_0 = null;
        sd stackOut_25_0 = null;
        Object stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        Object stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        Object stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = null;
            var5 = 0;
            var6_int = 57 / ((26 - param1) / 33);
            var7 = param2.j(18229);
            L1: while (true) {
              L2: {
                L3: {
                  if (var7 == null) {
                    break L3;
                  } else {
                    kq.field_c[var7.field_p] = 0;
                    q.field_Ab[var7.field_p] = 0;
                    stackOut_3_0 = (ln) var7;
                    stackIn_15_0 = (Object) (Object) stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      stackIn_4_0.field_J = var7.field_x;
                      var8 = 0;
                      var9 = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var9 >= 4) {
                              break L6;
                            } else {
                              var8 = var8 + var7.field_G[var9];
                              var9++;
                              if (var10 != 0) {
                                break L5;
                              } else {
                                if (var10 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (~var5 <= ~var8) {
                              break L7;
                            } else {
                              var4 = (Object) (Object) var7;
                              var5 = var8;
                              break L7;
                            }
                          }
                          var7 = param2.h(-23410);
                          break L5;
                        }
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                stackOut_14_0 = bk.field_a.d(0);
                stackIn_15_0 = (Object) (Object) stackOut_14_0;
                break L2;
              }
              var6 = (qa) (Object) stackIn_15_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (null == var6) {
                      break L10;
                    } else {
                      stackOut_17_0 = (sd) param2;
                      stackIn_26_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        L11: {
                          if (stackIn_18_0 == var6.field_u.field_R) {
                            var6.b((byte) -79);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var6 = (qa) (Object) bk.field_a.a((byte) -71);
                        if (var10 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  stackOut_25_0 = (sd) param2;
                  stackIn_26_0 = stackOut_25_0;
                  break L9;
                }
                var6_ref = ((sd) (Object) stackIn_26_0).j(18229);
                L12: while (true) {
                  L13: {
                    L14: {
                      if (null == var6_ref) {
                        break L14;
                      } else {
                        if (var10 != 0) {
                          break L13;
                        } else {
                          L15: {
                            if ((Object) (Object) var6_ref == var4) {
                              break L15;
                            } else {
                              this.a(var6_ref.field_x, (byte) 110, (ln) var4, var6_ref);
                              break L15;
                            }
                          }
                          var6_ref = param2.h(-23410);
                          if (var10 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    this.a(-1, (ln) var4, param2.field_x);
                    ((hi) this).field_i[param0] = 0;
                    ((hi) this).field_n[param0] = 0;
                    ((hi) this).field_y[param0] = true;
                    break L13;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = (Object) (Object) decompiledCaughtException;
            stackOut_37_0 = var4;
            stackOut_37_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',');
            stackIn_40_0 = stackOut_37_0;
            stackIn_40_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param2 == null) {
              stackOut_40_0 = stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L16;
            } else {
              stackOut_38_0 = stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_41_0 = stackOut_38_0;
              stackIn_41_1 = stackOut_38_1;
              stackIn_41_2 = stackOut_38_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + ')');
        }
    }

    private final void a(int param0, ln param1, int param2) {
        qa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (~param2 != param0) {
              param1.field_J = param1.field_J + param2;
              var4 = (qa) (Object) bk.field_a.d(0);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var4) {
                      break L3;
                    } else {
                      if (var5 != 0) {
                        break L2;
                      } else {
                        if (var4.field_u != param1) {
                          var4 = (qa) (Object) bk.field_a.a((byte) -71);
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        } else {
                          var4.field_v = var4.field_v + param2;
                          return;
                        }
                      }
                    }
                  }
                  bk.field_a.a((byte) -113, (oh) (Object) new qa(param1, param2));
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4_ref;
            stackOut_14_1 = new StringBuilder().append("hi.M(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public final void a(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        fs[] var4 = null;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((hi) this).field_w.field_i.g(param0 ^ 82)) {
                break L1;
              } else {
                ((hi) this).field_p = false;
                break L1;
              }
            }
            L2: {
              if (!((hi) this).field_p) {
                break L2;
              } else {
                if (((hi) this).field_m.field_o.field_j) {
                  L3: {
                    if (param0 == -63) {
                      break L3;
                    } else {
                      this.a((ac) null, false, -5);
                      break L3;
                    }
                  }
                  ((hi) this).field_r = -1;
                  var2_int = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
                  var3 = ((hi) this).field_m.field_D[var2_int];
                  var4_int = 0;
                  L4: while (true) {
                    L5: {
                      if (var4_int >= ((hi) this).field_m.field_r) {
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            if (~var2_int == ~var4_int) {
                              break L7;
                            } else {
                              L8: {
                                if (~(2 * ((hi) this).field_m.field_D[var4_int]) <= ~var3) {
                                  break L8;
                                } else {
                                  ((hi) this).field_v[var4_int] = 0;
                                  if (var10 == 0) {
                                    break L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              ((hi) this).field_v[var4_int] = ((hi) this).field_v[var4_int] - 1;
                              if (var10 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((hi) this).field_v[var4_int] = 3;
                          break L6;
                        }
                        var4_int++;
                        if (var10 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L9: {
                      L10: {
                        var4 = ((hi) this).field_m.field_x.b(0);
                        if (1 != var4.length) {
                          break L10;
                        } else {
                          ((hi) this).field_g = var4[0].field_x;
                          if (var10 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((hi) this).field_g = -1;
                      break L9;
                    }
                    L11: {
                      this.b(true);
                      if (-1 == ((hi) this).field_r) {
                        break L11;
                      } else {
                        L12: {
                          var5 = ((hi) this).field_m.field_v[((hi) this).field_r];
                          if (((hi) this).field_f[((hi) this).field_r] > 0) {
                            break L12;
                          } else {
                            L13: {
                              L14: {
                                L15: {
                                  L16: {
                                    L17: {
                                      L18: {
                                        var9 = ((hi) this).field_q[((hi) this).field_r];
                                        if (var9 != -1) {
                                          break L18;
                                        } else {
                                          if (var10 == 0) {
                                            break L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (-2 == var9) {
                                        break L16;
                                      } else {
                                        if (var9 != -3) {
                                          break L14;
                                        } else {
                                          if (var10 == 0) {
                                            break L15;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                    var6 = 7;
                                    if (var10 == 0) {
                                      break L13;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  var6 = 8;
                                  if (var10 == 0) {
                                    break L13;
                                  } else {
                                    break L15;
                                  }
                                }
                                var6 = 9;
                                var7 = ((hi) this).field_m.field_m[-1 + ((hi) this).field_m.field_r];
                                var8 = ((hi) this).field_m.field_m[((hi) this).field_m.field_r + -2];
                                if (~var7 == ~((hi) this).field_w.field_x) {
                                  break L13;
                                } else {
                                  if (~((hi) this).field_r != ~var7) {
                                    if (~(((hi) this).field_m.field_D[var8] * 3) > ~(((hi) this).field_m.field_D[var7] * 2)) {
                                      var6 = 8;
                                      if (var10 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var6 = -1;
                              break L13;
                            }
                            if (var6 != -1) {
                              ((hi) this).field_c.a(0, (byte) -109, var5, ((hi) this).field_w, var6);
                              ((hi) this).field_f[((hi) this).field_r] = rg.a(6, 3, (byte) 104);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                        }
                        ((hi) this).field_c.a((byte) -63, ((hi) this).field_w, var5);
                        break L11;
                      }
                    }
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.V(" + param0 + ')');
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 > 0) {
              if (!eo.a(param0, 7433)) {
                L1: {
                  if (param2 == -11) {
                    break L1;
                  } else {
                    field_d = null;
                    break L1;
                  }
                }
                var3_int = -(int)(4294967296L % (long)param0) + -2147483648;
                L2: while (true) {
                  var4 = param1.nextInt();
                  L3: while (true) {
                    if (var4 >= var3_int) {
                      continue L2;
                    } else {
                      if (var5 != 0) {
                        continue L3;
                      } else {
                        stackOut_15_0 = jf.a(param0, var4, -102);
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      }
                    }
                  }
                }
              } else {
                stackOut_5_0 = (int)((long)param0 * ((long)param1.nextInt() & 4294967295L) >> -1847283936);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("hi.T(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    private final int[] b(fs param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        boolean[] var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int[] stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int[] stackOut_34_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < -91) {
                break L1;
              } else {
                ((hi) this).field_e = null;
                break L1;
              }
            }
            var3_array = new int[((hi) this).field_x];
            var4 = new boolean[((hi) this).field_x];
            var5 = ((hi) this).field_m.field_g.field_e;
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var6 <= ~((hi) this).field_x) {
                    break L4;
                  } else {
                    if (var14 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var5[var6].field_y != param0) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L5;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_13_0 = stackOut_10_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_13_0;
                        var4[var6] = var7 != 0;
                        stackOut_13_0 = (int[]) var3_array;
                        stackOut_13_1 = var6;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (var7 == 0) {
                          stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = 2147483647;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          break L6;
                        } else {
                          stackOut_14_0 = (int[]) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 0;
                          stackIn_17_0 = stackOut_14_0;
                          stackIn_17_1 = stackOut_14_1;
                          stackIn_17_2 = stackOut_14_2;
                          break L6;
                        }
                      }
                      stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                      var6++;
                      if (var14 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var6 = 1;
                break L3;
              }
              L7: while (true) {
                stackOut_19_0 = var6;
                stackIn_20_0 = stackOut_19_0;
                L8: while (true) {
                  L9: {
                    if (stackIn_20_0 == 0) {
                      break L9;
                    } else {
                      var6 = 0;
                      var7 = 0;
                      L10: while (true) {
                        stackOut_22_0 = ((hi) this).field_x;
                        stackOut_22_1 = var7;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        L11: while (true) {
                          L12: {
                            if (stackIn_23_0 <= stackIn_23_1) {
                              break L12;
                            } else {
                              stackOut_24_0 = var4[var7];
                              stackIn_20_0 = stackOut_24_0 ? 1 : 0;
                              stackIn_25_0 = stackOut_24_0;
                              if (var14 != 0) {
                                continue L8;
                              } else {
                                L13: {
                                  if (!stackIn_25_0) {
                                    break L13;
                                  } else {
                                    var4[var7] = false;
                                    var8 = var5[var7];
                                    var9 = 1 + var3_array[var7];
                                    var10 = var8.field_D;
                                    var11 = 0;
                                    L14: while (true) {
                                      if (var11 >= var10.length) {
                                        break L13;
                                      } else {
                                        var12 = var10[var11];
                                        var13 = var12.field_p;
                                        stackOut_28_0 = var9;
                                        stackOut_28_1 = var3_array[var13];
                                        stackIn_23_0 = stackOut_28_0;
                                        stackIn_23_1 = stackOut_28_1;
                                        stackIn_29_0 = stackOut_28_0;
                                        stackIn_29_1 = stackOut_28_1;
                                        if (var14 != 0) {
                                          continue L11;
                                        } else {
                                          L15: {
                                            if (stackIn_29_0 >= stackIn_29_1) {
                                              break L15;
                                            } else {
                                              var3_array[var13] = var9;
                                              var6 = 1;
                                              var4[var13] = true;
                                              break L15;
                                            }
                                          }
                                          var11++;
                                          if (var14 == 0) {
                                            continue L14;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var7++;
                                if (var14 == 0) {
                                  continue L10;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          if (var14 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_34_0 = (int[]) var3_array;
                  stackIn_35_0 = stackOut_34_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("hi.N(");
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L16;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L16;
            }
          }
          throw r.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + param1 + ')');
        }
        return stackIn_35_0;
    }

    public final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        fs[] var3 = null;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 63 % ((-36 - param0) / 38);
            var3 = ((hi) this).field_m.field_v;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3.length <= var4) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((hi) this).field_w == var5) {
                          break L4;
                        } else {
                          var6 = vc.a((byte) -39, 2) + 14;
                          ((hi) this).field_c.a(0, (byte) -27, var5, ((hi) this).field_w, var6);
                          break L4;
                        }
                      }
                      var4++;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "hi.TA(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ac var6 = null;
        ln[] var6_array = null;
        qm var6_ref = null;
        int var7 = 0;
        ln var7_ref_ln = null;
        lo var8 = null;
        ln var8_ref = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (5 > ((hi) this).field_w.field_u[1]) {
              return;
            } else {
              L1: {
                var2 = null;
                var4 = -92 / ((82 - param0) / 44);
                var3 = 2147483647;
                var5 = 2147483647;
                if (!((hi) this).field_m.field_o.field_i) {
                  var6 = (ac) (Object) ((hi) this).field_u.d(0);
                  L2: while (true) {
                    if (null == var6) {
                      break L1;
                    } else {
                      var7_ref_ln = var6.field_n;
                      stackOut_42_0 = ~var7_ref_ln.field_L;
                      stackOut_42_1 = -1;
                      stackIn_43_0 = stackOut_42_0;
                      stackIn_43_1 = stackOut_42_1;
                      L3: while (true) {
                        L4: {
                          if (stackIn_43_0 != stackIn_43_1) {
                            var6 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                            if (var12 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var8_int = 0;
                        var9 = 0;
                        var10 = 0;
                        L5: while (true) {
                          L6: {
                            if (var10 >= 4) {
                              break L6;
                            } else {
                              var9 = var9 + var7_ref_ln.field_G[var10];
                              stackOut_48_0 = var7_ref_ln.field_R.field_u[var10];
                              stackOut_48_1 = var7_ref_ln.field_G[var10];
                              stackIn_43_0 = stackOut_48_0;
                              stackIn_43_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (var12 != 0) {
                                continue L3;
                              } else {
                                L7: {
                                  if (stackIn_49_0 >= stackIn_49_1) {
                                    break L7;
                                  } else {
                                    var8_int = 1;
                                    if (var12 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                var10++;
                                if (var12 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L8: {
                            if (var8_int == 0) {
                              L9: {
                                if (null == var2) {
                                  break L9;
                                } else {
                                  if (~var9 > ~var3) {
                                    break L9;
                                  } else {
                                    if (~var3 != ~var9) {
                                      break L8;
                                    } else {
                                      if (var6.field_i >= var5) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = var6.field_i;
                              var2 = (Object) (Object) var7_ref_ln;
                              var3 = var9;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var6 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                          if (var12 == 0) {
                            continue L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var6 = (ac) (Object) ((hi) this).field_u.d(0);
                  var8 = ((hi) this).field_w.field_m;
                  L10: while (true) {
                    L11: {
                      if (null == var6) {
                        break L11;
                      } else {
                        var7_ref_ln = var6.field_n;
                        if (var12 != 0) {
                          break L1;
                        } else {
                          stackOut_8_0 = ~var7_ref_ln.field_L;
                          stackOut_8_1 = -1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          L12: while (true) {
                            L13: {
                              if (stackIn_10_0 != stackIn_10_1) {
                                var6 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                                if (var12 == 0) {
                                  continue L10;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var9 = 0;
                            var10 = 0;
                            var11 = 0;
                            L14: while (true) {
                              L15: {
                                if (var11 >= 4) {
                                  break L15;
                                } else {
                                  var10 = var10 + var7_ref_ln.field_G[var11];
                                  stackOut_15_0 = ~var8.field_u[var11];
                                  stackOut_15_1 = ~var7_ref_ln.field_G[var11];
                                  stackIn_10_0 = stackOut_15_0;
                                  stackIn_10_1 = stackOut_15_1;
                                  stackIn_16_0 = stackOut_15_0;
                                  stackIn_16_1 = stackOut_15_1;
                                  if (var12 != 0) {
                                    continue L12;
                                  } else {
                                    L16: {
                                      if (stackIn_16_0 > stackIn_16_1) {
                                        var9 = 1;
                                        if (var12 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        break L16;
                                      }
                                    }
                                    var11++;
                                    if (var12 == 0) {
                                      continue L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (var9 != 0) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (null == var2) {
                                      break L18;
                                    } else {
                                      if (~var10 > ~var3) {
                                        break L18;
                                      } else {
                                        if (var10 != var3) {
                                          break L17;
                                        } else {
                                          if (var5 > var6.field_i) {
                                            break L18;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var3 = var10;
                                  var5 = var6.field_i;
                                  var2 = (Object) (Object) var7_ref_ln;
                                  break L17;
                                }
                              }
                              var6 = (ac) (Object) ((hi) this).field_u.a((byte) -71);
                              if (var12 == 0) {
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
              }
              var6_array = ((hi) this).field_m.field_g.field_e;
              var7 = 0;
              L19: while (true) {
                stackOut_70_0 = ~var6_array.length;
                stackOut_70_1 = ~var7;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                L20: while (true) {
                  L21: {
                    L22: {
                      if (stackIn_71_0 >= stackIn_71_1) {
                        break L22;
                      } else {
                        var8_ref = var6_array[var7];
                        if (var12 != 0) {
                          break L21;
                        } else {
                          L23: {
                            if (var8_ref.field_y != ((hi) this).field_w) {
                              break L23;
                            } else {
                              if (no.field_f[var8_ref.field_p]) {
                                break L23;
                              } else {
                                L24: {
                                  if (var8_ref.field_L == 0) {
                                    break L24;
                                  } else {
                                    if (var12 == 0) {
                                      break L23;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                L25: {
                                  L26: {
                                    var9 = 0;
                                    var10 = 0;
                                    if (((hi) this).field_m.field_o.field_i) {
                                      break L26;
                                    } else {
                                      var11 = 0;
                                      L27: while (true) {
                                        L28: {
                                          if (var11 >= 4) {
                                            break L28;
                                          } else {
                                            var10 = var10 + var8_ref.field_G[var11];
                                            stackOut_88_0 = var8_ref.field_G[var11];
                                            stackOut_88_1 = var8_ref.field_R.field_u[var11];
                                            stackIn_71_0 = stackOut_88_0;
                                            stackIn_71_1 = stackOut_88_1;
                                            stackIn_89_0 = stackOut_88_0;
                                            stackIn_89_1 = stackOut_88_1;
                                            if (var12 != 0) {
                                              continue L20;
                                            } else {
                                              L29: {
                                                if (stackIn_89_0 <= stackIn_89_1) {
                                                  break L29;
                                                } else {
                                                  var9 = 1;
                                                  if (var12 == 0) {
                                                    break L28;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                              var11++;
                                              if (var12 == 0) {
                                                continue L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        if (var12 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  var11 = 0;
                                  L30: while (true) {
                                    if (var11 >= 4) {
                                      break L25;
                                    } else {
                                      var10 = var10 + var8_ref.field_G[var11];
                                      stackOut_97_0 = ~var8_ref.field_G[var11];
                                      stackOut_97_1 = ~((hi) this).field_w.field_m.field_u[var11];
                                      stackIn_71_0 = stackOut_97_0;
                                      stackIn_71_1 = stackOut_97_1;
                                      stackIn_98_0 = stackOut_97_0;
                                      stackIn_98_1 = stackOut_97_1;
                                      if (var12 != 0) {
                                        continue L20;
                                      } else {
                                        L31: {
                                          if (stackIn_98_0 < stackIn_98_1) {
                                            var9 = 1;
                                            if (var12 == 0) {
                                              break L25;
                                            } else {
                                              break L31;
                                            }
                                          } else {
                                            break L31;
                                          }
                                        }
                                        var11++;
                                        if (var12 == 0) {
                                          continue L30;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var9 == 0) {
                                  L32: {
                                    if (var2 == null) {
                                      break L32;
                                    } else {
                                      if (~var3 < ~var10) {
                                        break L32;
                                      } else {
                                        if (~var10 != ~var3) {
                                          break L23;
                                        } else {
                                          if (var5 <= 0) {
                                            break L23;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var5 = 0;
                                  var3 = var10;
                                  var2 = (Object) (Object) var8_ref;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                            }
                          }
                          var7++;
                          if (var12 == 0) {
                            continue L19;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                    if (null == var2) {
                      break L21;
                    } else {
                      var6_ref = new qm(1, ((hi) this).field_w, (ln) var2);
                      vj.field_E.a((byte) -113, (oh) (Object) var6_ref);
                      break L21;
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw r.a((Throwable) var2, "hi.Q(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        sd var2 = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((hi) this).field_u.a(param0);
            var2 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
            var3 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var2) {
                    break L3;
                  } else {
                    if (var5 != 0) {
                      break L2;
                    } else {
                      var4 = var2.j(18229);
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var4 == null) {
                              break L6;
                            } else {
                              if (var5 != 0) {
                                break L5;
                              } else {
                                L7: {
                                  if (no.field_f[var4.field_p]) {
                                    ((hi) this).field_u.a((byte) -113, (oh) (Object) new ac(var4, ((hi) this).field_s[var3], ((hi) this).field_w.field_h, ((hi) this).field_m.field_x));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var4 = var2.h(-23410);
                                if (var5 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var3++;
                          var2 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                          break L5;
                        }
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "hi.HA(" + param0 + ')');
        }
    }

    private final void a(sd param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ln var5 = null;
        ln[] var5_array = null;
        ln[] var6_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var7_ref_ln = null;
        ln var8_ref_ln = null;
        ln[] var8_ref_ln__ = null;
        int var8 = 0;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        Object stackIn_7_0 = null;
        int stackIn_18_0 = 0;
        Object stackIn_22_0 = null;
        int stackIn_30_0 = 0;
        ln stackIn_33_0 = null;
        ln stackIn_43_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_64_0 = null;
        int stackIn_70_0 = 0;
        Object stackIn_72_0 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        Object stackOut_6_0 = null;
        int stackOut_17_0 = 0;
        Object stackOut_21_0 = null;
        int stackOut_29_0 = 0;
        ln stackOut_32_0 = null;
        ln stackOut_42_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        Object stackOut_71_0 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = param0.j(18229);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      var6_ref_ln__ = var5.field_D;
                      stackOut_3_0 = 0;
                      stackIn_18_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        var7 = stackIn_4_0;
                        L5: while (true) {
                          L6: {
                            if (~var7 <= ~var6_ref_ln__.length) {
                              break L6;
                            } else {
                              var8_ref_ln = var6_ref_ln__[var7];
                              stackOut_6_0 = this;
                              stackIn_22_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var11 != 0) {
                                break L2;
                              } else {
                                L7: {
                                  if (((hi) this).field_w != var8_ref_ln.field_y) {
                                    var4_int++;
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  } else {
                                    break L7;
                                  }
                                }
                                var7++;
                                if (var11 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5 = param0.h(-23410);
                          if (var11 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_17_0 = -1;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                }
                if (stackIn_18_0 == ~var4_int) {
                  ((hi) this).field_n[param1] = 0;
                  stackOut_21_0 = this;
                  stackIn_22_0 = stackOut_21_0;
                  break L2;
                } else {
                  var5_array = new ln[var4_int];
                  var6 = 0;
                  var7_ref_ln = param0.j(18229);
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (null == var7_ref_ln) {
                          break L10;
                        } else {
                          var8_ref_ln__ = var7_ref_ln.field_D;
                          stackOut_29_0 = 0;
                          stackIn_45_0 = stackOut_29_0;
                          stackIn_30_0 = stackOut_29_0;
                          if (var11 != 0) {
                            break L9;
                          } else {
                            var9 = stackIn_30_0;
                            L11: while (true) {
                              L12: {
                                L13: {
                                  if (~var9 <= ~var8_ref_ln__.length) {
                                    break L13;
                                  } else {
                                    var10 = var8_ref_ln__[var9];
                                    stackOut_32_0 = (ln) var10;
                                    stackIn_43_0 = stackOut_32_0;
                                    stackIn_33_0 = stackOut_32_0;
                                    if (var11 != 0) {
                                      break L12;
                                    } else {
                                      L14: {
                                        if (stackIn_33_0.field_y != ((hi) this).field_w) {
                                          var5_array[var6] = var7_ref_ln;
                                          var6++;
                                          if (var11 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                      var9++;
                                      if (var11 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                                stackOut_42_0 = param0.h(-23410);
                                stackIn_43_0 = stackOut_42_0;
                                break L12;
                              }
                              var7_ref_ln = stackIn_43_0;
                              if (var11 == 0) {
                                continue L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                      }
                      stackOut_44_0 = ((hi) this).field_n[param1] / var4_int;
                      stackIn_45_0 = stackOut_44_0;
                      break L9;
                    }
                    var7 = stackIn_45_0;
                    ((hi) this).field_e = new wf[var4_int];
                    if (param2 <= -111) {
                      var9 = 0;
                      L15: while (true) {
                        L16: {
                          L17: {
                            L18: {
                              L19: {
                                if (var9 >= var5_array.length) {
                                  break L19;
                                } else {
                                  ((hi) this).field_e[var9] = (wf) (Object) new ac(var5_array[var9], new int[4], ((hi) this).field_w.field_h, ((hi) this).field_m.field_x);
                                  stackOut_49_0 = ~(((hi) this).field_n[param1] % var4_int);
                                  stackOut_49_1 = -1;
                                  stackIn_61_0 = stackOut_49_0;
                                  stackIn_61_1 = stackOut_49_1;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  if (var11 != 0) {
                                    break L18;
                                  } else {
                                    L20: {
                                      if (stackIn_50_0 == stackIn_50_1) {
                                        stackOut_55_0 = 0;
                                        stackIn_56_0 = stackOut_55_0;
                                        break L20;
                                      } else {
                                        stackOut_53_0 = 1;
                                        stackIn_56_0 = stackOut_53_0;
                                        break L20;
                                      }
                                    }
                                    var8 = stackIn_56_0;
                                    kq.field_c[var5_array[var9].field_p] = var7 - -var8;
                                    ((hi) this).field_n[param1] = ((hi) this).field_n[param1] - (var8 + var7);
                                    var4_int--;
                                    var9++;
                                    if (var11 == 0) {
                                      continue L15;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              this.b(7270);
                              if (!((hi) this).field_m.field_o.field_i) {
                                var4_int = var5_array.length;
                                stackOut_60_0 = ((hi) this).field_i[param1];
                                stackOut_60_1 = var4_int;
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                break L18;
                              } else {
                                break L17;
                              }
                            }
                            var7 = stackIn_61_0 / stackIn_61_1;
                            var9 = 0;
                            L21: while (true) {
                              if (~var9 <= ~var5_array.length) {
                                break L17;
                              } else {
                                stackOut_63_0 = this;
                                stackIn_72_0 = stackOut_63_0;
                                stackIn_64_0 = stackOut_63_0;
                                if (var11 != 0) {
                                  break L16;
                                } else {
                                  L22: {
                                    if (((hi) this).field_i[param1] % var4_int != 0) {
                                      stackOut_69_0 = 1;
                                      stackIn_70_0 = stackOut_69_0;
                                      break L22;
                                    } else {
                                      stackOut_67_0 = 0;
                                      stackIn_70_0 = stackOut_67_0;
                                      break L22;
                                    }
                                  }
                                  var8 = stackIn_70_0;
                                  this.a(-1, var5_array[var9], var8 + var7);
                                  ((hi) this).field_i[param1] = ((hi) this).field_i[param1] - (var7 - -var8);
                                  var4_int--;
                                  var9++;
                                  if (var11 == 0) {
                                    continue L21;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_71_0 = this;
                          stackIn_72_0 = stackOut_71_0;
                          break L16;
                        }
                        ((hi) this).field_e = new wf[]{};
                        break L0;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              L23: {
                if (!((hi) this).field_m.field_o.field_i) {
                  this.a(-1, param0.field_q, ((hi) this).field_i[param1]);
                  ((hi) this).field_i[param1] = 0;
                  break L23;
                } else {
                  break L23;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var4 = decompiledCaughtException;
            stackOut_74_0 = (RuntimeException) var4;
            stackOut_74_1 = new StringBuilder().append("hi.A(");
            stackIn_77_0 = stackOut_74_0;
            stackIn_77_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param0 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L24;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_78_0 = stackOut_75_0;
              stackIn_78_1 = stackOut_75_1;
              stackIn_78_2 = stackOut_75_2;
              break L24;
            }
          }
          throw r.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[][] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        dc stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        dc stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[][] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        dc stackOut_14_0 = null;
        dc stackOut_46_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              oe.field_g = new int[((hi) this).field_m.field_r][];
              ((hi) this).field_r = -1;
              if (param0) {
                break L1;
              } else {
                this.a((byte) 68, (kl) null, false);
                break L1;
              }
            }
            jf.field_e = new boolean[((hi) this).field_m.field_g.field_e.length];
            var2_int = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var2_int >= oe.field_g.length) {
                    break L4;
                  } else {
                    stackOut_6_0 = oe.field_g;
                    stackOut_6_1 = var2_int;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_11_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0[stackIn_7_1] = this.b(((hi) this).field_m.field_v[var2_int], -97);
                      var2_int++;
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = oe.field_g;
                stackOut_10_1 = ((hi) this).field_w.field_x;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              }
              var2_array = stackIn_11_0[stackIn_11_1];
              var3 = 0;
              var4 = 0;
              L5: while (true) {
                stackOut_12_0 = var4;
                stackOut_12_1 = ((hi) this).field_m.field_g.field_e.length;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                L6: while (true) {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          if (stackIn_13_0 >= stackIn_13_1) {
                            break L10;
                          } else {
                            stackOut_14_0 = ((hi) this).field_m;
                            stackIn_47_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var7 != 0) {
                              L11: while (true) {
                                if (~stackIn_47_0.field_r >= ~var4) {
                                  break L8;
                                } else {
                                  ((hi) this).field_q[var4] = this.a(var3, ((hi) this).field_m.field_v[var4], 3);
                                  var4++;
                                  if (var7 != 0) {
                                    break L7;
                                  } else {
                                    if (var7 == 0) {
                                      stackOut_46_0 = ((hi) this).field_m;
                                      stackIn_47_0 = stackOut_46_0;
                                      continue L11;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            } else {
                              L12: {
                                L13: {
                                  if (stackIn_15_0.field_g.field_e[var4].field_y != ((hi) this).field_w) {
                                    break L13;
                                  } else {
                                    jf.field_e[var4] = false;
                                    if (var7 == 0) {
                                      break L12;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var5 = 1;
                                var6 = 0;
                                L14: while (true) {
                                  L15: {
                                    if (~var6 <= ~((hi) this).field_m.field_r) {
                                      break L15;
                                    } else {
                                      stackOut_23_0 = ~((hi) this).field_w.field_x;
                                      stackOut_23_1 = ~var6;
                                      stackIn_13_0 = stackOut_23_0;
                                      stackIn_13_1 = stackOut_23_1;
                                      stackIn_24_0 = stackOut_23_0;
                                      stackIn_24_1 = stackOut_23_1;
                                      if (var7 != 0) {
                                        continue L6;
                                      } else {
                                        L16: {
                                          if (stackIn_24_0 == stackIn_24_1) {
                                            break L16;
                                          } else {
                                            L17: {
                                              if (((hi) this).field_w.field_h[var6]) {
                                                break L17;
                                              } else {
                                                if (var7 == 0) {
                                                  break L16;
                                                } else {
                                                  break L17;
                                                }
                                              }
                                            }
                                            L18: {
                                              if (~oe.field_g[var6][var4] >= ~var2_array[var4]) {
                                                break L18;
                                              } else {
                                                if (var7 == 0) {
                                                  break L16;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                            }
                                            var5 = 0;
                                            if (var7 == 0) {
                                              break L15;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        var6++;
                                        if (var7 == 0) {
                                          continue L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                  }
                                  jf.field_e[var4] = var5 != 0;
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    var3++;
                                    break L12;
                                  }
                                }
                              }
                              var4++;
                              if (var7 == 0) {
                                continue L5;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        L19: while (true) {
                          stackOut_46_0 = ((hi) this).field_m;
                          stackIn_47_0 = stackOut_46_0;
                          if (~stackIn_47_0.field_r >= ~var4) {
                            break L8;
                          } else {
                            ((hi) this).field_q[var4] = this.a(var3, ((hi) this).field_m.field_v[var4], 3);
                            var4++;
                            if (var7 != 0) {
                              break L7;
                            } else {
                              if (var7 == 0) {
                                continue L19;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      break L8;
                    }
                    var4 = 0;
                    break L7;
                  }
                  L20: while (true) {
                    L21: {
                      L22: {
                        if (var4 >= ((hi) this).field_m.field_r) {
                          break L22;
                        } else {
                          var5 = ((hi) this).field_m.field_m[var4];
                          if (var7 != 0) {
                            break L21;
                          } else {
                            L23: {
                              if (((hi) this).field_q[var5] < 0) {
                                ((hi) this).field_r = var5;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var4++;
                            if (var7 == 0) {
                              continue L20;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      break L21;
                    }
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.R(" + param0 + ')');
        }
    }

    final static bi[] a(int param0, byte param1) {
        bi[] var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        bi[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        bi[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var2 = new bi[9];
            if (param1 == -16) {
              var2[4] = gr.a((byte) -52, param0, 64);
              stackOut_3_0 = (bi[]) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bi[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "hi.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final void i(int param0) {
        RuntimeException runtimeException = null;
        ln[] var2 = null;
        int var3 = 0;
        ln var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = ((hi) this).field_m.field_g.field_e;
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2.length <= var3) {
                    break L3;
                  } else {
                    var4 = var2[var3];
                    no.field_f[var4.field_p] = false;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          L6: {
                            if (var4.field_y == ((hi) this).field_w) {
                              break L6;
                            } else {
                              if (var8 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var5 = var4.field_D;
                          var6 = 0;
                          L7: while (true) {
                            if (~var5.length >= ~var6) {
                              break L5;
                            } else {
                              var7 = var5[var6];
                              if (var8 != 0) {
                                break L4;
                              } else {
                                L8: {
                                  if (null == var7.field_y) {
                                    break L8;
                                  } else {
                                    if (var7.field_y == ((hi) this).field_w) {
                                      break L8;
                                    } else {
                                      if (((hi) this).field_w.field_h[var7.field_y.field_x]) {
                                        break L8;
                                      } else {
                                        no.field_f[var4.field_p] = true;
                                        if (var8 == 0) {
                                          break L5;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                }
                                var6++;
                                if (var8 == 0) {
                                  continue L7;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var3++;
                        break L4;
                      }
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 15401) {
                  break L2;
                } else {
                  ((hi) this).field_c = null;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "hi.C(" + param0 + ')');
        }
    }

    public final void a(boolean param0, int param1) {
        try {
            ((hi) this).field_p = param0;
            if (param1 != -6861) {
                this.c((byte) 46);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "hi.BB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        co var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_23_0 = 0;
        ln stackIn_26_0 = null;
        ln stackIn_29_0 = null;
        ln stackIn_55_0 = null;
        int stackIn_57_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_22_0 = 0;
        ln stackOut_25_0 = null;
        ln stackOut_28_0 = null;
        oh stackOut_54_0 = null;
        int stackOut_56_0 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (co) (Object) ((hi) this).field_l.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    var2_int = var3.field_n.field_p;
                    stackOut_3_0 = 0;
                    stackOut_3_1 = kq.field_c[var2_int];
                    stackIn_17_0 = stackOut_3_0;
                    stackIn_17_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      if (stackIn_4_0 <= stackIn_4_1) {
                        L4: {
                          L5: {
                            if (~kq.field_c[var2_int] > ~q.field_Ab[var2_int]) {
                              break L5;
                            } else {
                              kq.field_c[var2_int] = kq.field_c[var2_int] - q.field_Ab[var2_int];
                              q.field_Ab[var2_int] = 0;
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          q.field_Ab[var2_int] = q.field_Ab[var2_int] - kq.field_c[var2_int];
                          kq.field_c[var2_int] = 0;
                          break L4;
                        }
                        var3 = (co) (Object) ((hi) this).field_l.a((byte) -71);
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        throw new RuntimeException(((hi) this).field_m.field_g.field_e[var2_int].field_I + " has " + kq.field_c[var2_int] + " fleets assigned to garrison it!");
                      }
                    }
                  }
                }
                stackOut_16_0 = param0;
                stackOut_16_1 = -40;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L2;
              }
              L6: {
                if (stackIn_17_0 < stackIn_17_1) {
                  break L6;
                } else {
                  ((hi) this).field_i = null;
                  break L6;
                }
              }
              var3 = (co) (Object) ((hi) this).field_l.d(0);
              L7: while (true) {
                L8: {
                  L9: {
                    if (var3 == null) {
                      break L9;
                    } else {
                      var2_int = var3.field_n.field_p;
                      var4 = 0;
                      stackOut_22_0 = 0;
                      stackIn_57_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var7 != 0) {
                        break L8;
                      } else {
                        var5 = stackIn_23_0;
                        L10: while (true) {
                          L11: {
                            L12: {
                              if (var5 >= 2) {
                                break L12;
                              } else {
                                stackOut_25_0 = var3.field_n.field_R.j(18229);
                                stackIn_55_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var7 != 0) {
                                  break L11;
                                } else {
                                  var6 = stackIn_26_0;
                                  L13: while (true) {
                                    L14: {
                                      if (var6 == null) {
                                        break L14;
                                      } else {
                                        stackOut_28_0 = (ln) var6;
                                        stackIn_55_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (var7 != 0) {
                                          break L11;
                                        } else {
                                          L15: {
                                            if (stackIn_29_0 == var3.field_n) {
                                              break L15;
                                            } else {
                                              if (q.field_Ab[var6.field_p] == 0) {
                                                break L15;
                                              } else {
                                                L16: {
                                                  if (var4 != 0) {
                                                    break L16;
                                                  } else {
                                                    if (!no.field_f[var6.field_p]) {
                                                      break L16;
                                                    } else {
                                                      if (var7 == 0) {
                                                        break L15;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                }
                                                L17: {
                                                  if (q.field_Ab[var6.field_p] < kq.field_c[var2_int]) {
                                                    break L17;
                                                  } else {
                                                    this.a(kq.field_c[var2_int], (byte) 102, var3.field_n, var6);
                                                    q.field_Ab[var6.field_p] = q.field_Ab[var6.field_p] - kq.field_c[var2_int];
                                                    kq.field_c[var2_int] = 0;
                                                    if (var7 == 0) {
                                                      break L12;
                                                    } else {
                                                      break L17;
                                                    }
                                                  }
                                                }
                                                this.a(q.field_Ab[var6.field_p], (byte) 103, var3.field_n, var6);
                                                kq.field_c[var2_int] = kq.field_c[var2_int] - q.field_Ab[var6.field_p];
                                                q.field_Ab[var6.field_p] = 0;
                                                break L15;
                                              }
                                            }
                                          }
                                          var6 = var3.field_n.field_R.h(-23410);
                                          if (var7 == 0) {
                                            continue L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                    var4 = 1;
                                    var5++;
                                    if (var7 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_54_0 = ((hi) this).field_l.a((byte) -71);
                            stackIn_55_0 = (ln) (Object) stackOut_54_0;
                            break L11;
                          }
                          var3 = (co) (Object) stackIn_55_0;
                          if (var7 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  stackOut_56_0 = 0;
                  stackIn_57_0 = stackOut_56_0;
                  break L8;
                }
                var4 = stackIn_57_0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if (~kq.field_c.length >= ~var4) {
                        break L20;
                      } else {
                        kq.field_c[var4] = 0;
                        var4++;
                        if (var7 != 0) {
                          break L19;
                        } else {
                          if (var7 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    break L19;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.L(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        RuntimeException var2 = null;
        sd var2_ref = null;
        sd var3 = null;
        sd var4_ref_sd = null;
        int var4 = 0;
        int var5 = 0;
        Object var5_ref = null;
        Object var6 = null;
        Object var7 = null;
        int var8 = 0;
        int var9_int = 0;
        ln[] var9 = null;
        ln var10_ref_ln = null;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        ln[] var14_ref_ln__ = null;
        int var14 = 0;
        int var15 = 0;
        ln var16_ref_ln = null;
        int var16 = 0;
        ln[] var16_ref_ln__ = null;
        int var17 = 0;
        ln var18 = null;
        int var19 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_93_0 = null;
        sd stackIn_101_0 = null;
        sd stackIn_101_1 = null;
        fs stackIn_103_0 = null;
        fs stackIn_103_1 = null;
        sd stackIn_123_0 = null;
        sd stackIn_123_1 = null;
        fs stackIn_167_0 = null;
        fs stackIn_167_1 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_92_0 = null;
        sd stackOut_99_0 = null;
        sd stackOut_99_1 = null;
        fs stackOut_102_0 = null;
        fs stackOut_102_1 = null;
        sd stackOut_122_0 = null;
        sd stackOut_122_1 = null;
        fs stackOut_166_0 = null;
        fs stackOut_166_1 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((hi) this).field_w.field_u[3] < 5) {
              return;
            } else {
              L1: {
                if (50 <= ((hi) this).field_t) {
                  break L1;
                } else {
                  if (((hi) this).field_j >= 50) {
                    break L1;
                  } else {
                    if (((hi) this).field_w.field_i.e(0) > 1) {
                      L2: {
                        L3: {
                          var3 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                          var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                          if (var4_ref_sd.g(-98) > var3.g(107)) {
                            break L3;
                          } else {
                            var2_ref = var4_ref_sd;
                            if (var19 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var2_ref = var3;
                        var3 = var4_ref_sd;
                        break L2;
                      }
                      var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                      L4: while (true) {
                        L5: {
                          if (var4_ref_sd == null) {
                            break L5;
                          } else {
                            L6: {
                              if (~var4_ref_sd.g(-115) >= ~var3.g(-111)) {
                                break L6;
                              } else {
                                var2_ref = var3;
                                var3 = var4_ref_sd;
                                break L6;
                              }
                            }
                            var4_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                            if (var19 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref = null;
                        var6 = null;
                        var7 = null;
                        var9_int = 0;
                        var10_ref_ln = var3.j(18229);
                        L7: while (true) {
                          L8: {
                            if (var10_ref_ln == null) {
                              break L8;
                            } else {
                              if (no.field_f[var10_ref_ln.field_p]) {
                                L9: {
                                  L10: {
                                    var8 = var10_ref_ln.field_J;
                                    if (var10_ref_ln.field_u) {
                                      break L10;
                                    } else {
                                      if (var10_ref_ln == qo.field_e) {
                                        break L10;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var8 = var8 * 2;
                                  break L9;
                                }
                                L11: {
                                  if (var9_int >= var8) {
                                    break L11;
                                  } else {
                                    var7 = (Object) (Object) var10_ref_ln;
                                    var9_int = var8;
                                    break L11;
                                  }
                                }
                                var10_ref_ln = var3.h(-23410);
                                continue L7;
                              } else {
                                var5_ref = (Object) (Object) var10_ref_ln;
                                break L8;
                              }
                            }
                          }
                          L12: {
                            if (null != var5_ref) {
                              break L12;
                            } else {
                              var5_ref = var7;
                              break L12;
                            }
                          }
                          var9_int = -1;
                          var10_ref_ln = var2_ref.j(18229);
                          L13: while (true) {
                            L14: {
                              if (var10_ref_ln == null) {
                                break L14;
                              } else {
                                if (no.field_f[var10_ref_ln.field_p]) {
                                  L15: {
                                    L16: {
                                      var8 = var10_ref_ln.field_J;
                                      if (var10_ref_ln.field_u) {
                                        break L16;
                                      } else {
                                        if (qo.field_e != var10_ref_ln) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var8 = var8 * 2;
                                    break L15;
                                  }
                                  L17: {
                                    if (~var8 < ~var9_int) {
                                      var7 = (Object) (Object) var10_ref_ln;
                                      var9_int = var8;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  var10_ref_ln = var2_ref.h(-23410);
                                  continue L13;
                                } else {
                                  var6 = (Object) (Object) var10_ref_ln;
                                  break L14;
                                }
                              }
                            }
                            L18: {
                              if (var6 == null) {
                                var6 = var7;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var5_ref == null) {
                                break L19;
                              } else {
                                if (var6 == null) {
                                  break L19;
                                } else {
                                  vj.field_E.a((byte) -113, (oh) (Object) new qm(3, ((hi) this).field_w, (ln) var5_ref, (ln) var6));
                                  return;
                                }
                              }
                            }
                            throw new RuntimeException("TaskAI has more than one territory but can't find a star in each to link with a Tannhauser");
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_ref = (sd) (Object) ((hi) this).field_w.field_i.d(0);
              var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
              L20: while (true) {
                L21: {
                  L22: {
                    if (null == var3) {
                      break L22;
                    } else {
                      stackOut_70_0 = var3.g(-48);
                      stackIn_77_0 = stackOut_70_0;
                      stackIn_71_0 = stackOut_70_0;
                      if (var19 != 0) {
                        break L21;
                      } else {
                        L23: {
                          if (stackIn_71_0 <= var2_ref.g(84)) {
                            break L23;
                          } else {
                            var2_ref = var3;
                            break L23;
                          }
                        }
                        var3 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                        if (var19 == 0) {
                          continue L20;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  stackOut_76_0 = 0;
                  stackIn_77_0 = stackOut_76_0;
                  break L21;
                }
                var5 = stackIn_77_0;
                var6 = null;
                var7 = (Object) (Object) var2_ref.j(18229);
                L24: while (true) {
                  L25: {
                    L26: {
                      if (var7 == null) {
                        break L26;
                      } else {
                        var4 = ((ln) var7).field_x;
                        stackOut_79_0 = var7;
                        stackIn_93_0 = stackOut_79_0;
                        stackIn_80_0 = stackOut_79_0;
                        if (var19 != 0) {
                          break L25;
                        } else {
                          L27: {
                            L28: {
                              if (((ln) (Object) stackIn_80_0).field_u) {
                                break L28;
                              } else {
                                if ((Object) (Object) qo.field_e == var7) {
                                  break L28;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            var4 = var4 * 2;
                            break L27;
                          }
                          L29: {
                            if (~var4 >= ~var5) {
                              break L29;
                            } else {
                              var6 = var7;
                              var5 = var4;
                              break L29;
                            }
                          }
                          var7 = (Object) (Object) var2_ref.h(-23410);
                          if (var19 == 0) {
                            continue L24;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    stackOut_92_0 = var6;
                    stackIn_93_0 = stackOut_92_0;
                    break L25;
                  }
                  if (stackIn_93_0 == null) {
                    throw new RuntimeException("TaskAI can't find any stars in territory from which to launch a Tannhauser");
                  } else {
                    var7 = null;
                    var8 = 0;
                    var9 = ((hi) this).field_m.field_g.field_e;
                    var10 = -10 / ((param0 - 13) / 50);
                    var11 = 0;
                    L30: while (true) {
                      L31: {
                        L32: {
                          L33: {
                            if (~var11 <= ~var9.length) {
                              break L33;
                            } else {
                              var12 = var9[var11];
                              if (var19 != 0) {
                                break L32;
                              } else {
                                stackOut_99_0 = var12.field_R;
                                stackOut_99_1 = ((ln) var6).field_R;
                                stackIn_101_0 = stackOut_99_0;
                                stackIn_101_1 = stackOut_99_1;
                                L34: while (true) {
                                  L35: {
                                    if (stackIn_101_0 == stackIn_101_1) {
                                      break L35;
                                    } else {
                                      stackOut_102_0 = var12.field_y;
                                      stackOut_102_1 = ((hi) this).field_w;
                                      stackIn_103_0 = stackOut_102_0;
                                      stackIn_103_1 = stackOut_102_1;
                                      L36: while (true) {
                                        L37: {
                                          if (stackIn_103_0 == stackIn_103_1) {
                                            break L37;
                                          } else {
                                            if (null == var12.field_y) {
                                              break L37;
                                            } else {
                                              if (!((hi) this).field_w.field_h[var12.field_y.field_x]) {
                                                break L37;
                                              } else {
                                                if (var19 == 0) {
                                                  break L35;
                                                } else {
                                                  break L37;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L38: {
                                          if (var12.field_y != ((hi) this).field_w) {
                                            break L38;
                                          } else {
                                            if (((hi) this).field_j < 90) {
                                              break L38;
                                            } else {
                                              if (var19 == 0) {
                                                break L35;
                                              } else {
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        var13 = 0;
                                        var14_ref_ln__ = var12.field_D;
                                        var15 = 0;
                                        L39: while (true) {
                                          L40: {
                                            if (~var15 <= ~var14_ref_ln__.length) {
                                              break L40;
                                            } else {
                                              var16_ref_ln = var14_ref_ln__[var15];
                                              stackOut_122_0 = ((ln) var6).field_R;
                                              stackOut_122_1 = var16_ref_ln.field_R;
                                              stackIn_101_0 = stackOut_122_0;
                                              stackIn_101_1 = stackOut_122_1;
                                              stackIn_123_0 = stackOut_122_0;
                                              stackIn_123_1 = stackOut_122_1;
                                              if (var19 != 0) {
                                                continue L34;
                                              } else {
                                                L41: {
                                                  if (stackIn_123_0 != stackIn_123_1) {
                                                    break L41;
                                                  } else {
                                                    var13 = 1;
                                                    if (var19 == 0) {
                                                      break L40;
                                                    } else {
                                                      break L41;
                                                    }
                                                  }
                                                }
                                                var15++;
                                                if (var19 == 0) {
                                                  continue L39;
                                                } else {
                                                  break L40;
                                                }
                                              }
                                            }
                                          }
                                          if (var13 != 0) {
                                            break L35;
                                          } else {
                                            var14 = 0;
                                            var15 = 0;
                                            var16 = 0;
                                            L42: while (true) {
                                              L43: {
                                                L44: {
                                                  if (var16 >= 4) {
                                                    break L44;
                                                  } else {
                                                    var14 = var14 + (-var2_ref.field_u[var16] + var2_ref.field_u[var2_ref.field_w[0]] + 1) * var12.field_G[var16];
                                                    var16++;
                                                    if (var19 != 0) {
                                                      break L43;
                                                    } else {
                                                      if (var19 == 0) {
                                                        continue L42;
                                                      } else {
                                                        break L44;
                                                      }
                                                    }
                                                  }
                                                }
                                                L45: {
                                                  if (!((hi) this).field_b) {
                                                    break L45;
                                                  } else {
                                                    if (36 == var12.field_p) {
                                                      var14 = var14 + ((hi) this).field_j / 2;
                                                      break L45;
                                                    } else {
                                                      break L45;
                                                    }
                                                  }
                                                }
                                                var15 = var12.field_x;
                                                break L43;
                                              }
                                              L46: {
                                                if (!((hi) this).field_h) {
                                                  break L46;
                                                } else {
                                                  if (var12.field_L == 2) {
                                                    L47: {
                                                      L48: {
                                                        if (!((hi) this).field_m.field_o.field_i) {
                                                          break L48;
                                                        } else {
                                                          var16 = ((hi) this).field_w.field_m.field_r;
                                                          if (var19 == 0) {
                                                            break L47;
                                                          } else {
                                                            break L48;
                                                          }
                                                        }
                                                      }
                                                      var16 = ((ln) var6).field_R.field_r;
                                                      break L47;
                                                    }
                                                    L49: {
                                                      if (~(-5 * var12.field_G[0]) >= ~var16) {
                                                        break L49;
                                                      } else {
                                                        var14 -= 100;
                                                        break L49;
                                                      }
                                                    }
                                                    if (var12.field_y == null) {
                                                      break L46;
                                                    } else {
                                                      if (var12.field_y.field_x == ((hi) this).field_g) {
                                                        var14 += 100;
                                                        break L46;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  } else {
                                                    break L46;
                                                  }
                                                }
                                              }
                                              L50: {
                                                if (!var12.field_u) {
                                                  break L50;
                                                } else {
                                                  var15 = var15 * 2;
                                                  break L50;
                                                }
                                              }
                                              var16_ref_ln__ = var12.field_D;
                                              var17 = 0;
                                              L51: while (true) {
                                                L52: {
                                                  if (var16_ref_ln__.length <= var17) {
                                                    break L52;
                                                  } else {
                                                    var18 = var16_ref_ln__[var17];
                                                    stackOut_166_0 = var18.field_y;
                                                    stackOut_166_1 = ((hi) this).field_w;
                                                    stackIn_103_0 = stackOut_166_0;
                                                    stackIn_103_1 = stackOut_166_1;
                                                    stackIn_167_0 = stackOut_166_0;
                                                    stackIn_167_1 = stackOut_166_1;
                                                    if (var19 != 0) {
                                                      continue L36;
                                                    } else {
                                                      L53: {
                                                        if (stackIn_167_0 == stackIn_167_1) {
                                                          break L53;
                                                        } else {
                                                          if (var18.field_y == null) {
                                                            break L53;
                                                          } else {
                                                            var15 = var15 + var18.field_x;
                                                            if (!((hi) this).field_m.field_o.field_l) {
                                                              var15++;
                                                              break L53;
                                                            } else {
                                                              break L53;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      var17++;
                                                      if (var19 == 0) {
                                                        continue L51;
                                                      } else {
                                                        break L52;
                                                      }
                                                    }
                                                  }
                                                }
                                                L54: {
                                                  if (1 <= var15) {
                                                    break L54;
                                                  } else {
                                                    var15 = 1;
                                                    break L54;
                                                  }
                                                }
                                                var16 = (var14 << -1855936592) / var15;
                                                if (~var8 <= ~var16) {
                                                  break L35;
                                                } else {
                                                  var7 = (Object) (Object) var12;
                                                  var8 = var16;
                                                  break L35;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var11++;
                                  if (var19 == 0) {
                                    continue L30;
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                          if (null != var7) {
                            break L32;
                          } else {
                            break L31;
                          }
                        }
                        vj.field_E.a((byte) -113, (oh) (Object) new qm(3, ((hi) this).field_w, (ln) var6, (ln) var7));
                        break L31;
                      }
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "hi.DA(" + param0 + ')');
        }
    }

    private final void a(byte param0, ln param1) {
        Object var3 = null;
        qm var4 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        Object stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        Object stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        Object stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (5 > ((hi) this).field_w.field_u[2]) {
              throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Stellar Bomb it doesn't have at star " + param1.field_I);
            } else {
              if (mr.field_f) {
                var3 = null;
                var4 = (qm) (Object) vj.field_E.d(param0 ^ -82);
                L1: while (true) {
                  L2: {
                    if (null == var4) {
                      break L2;
                    } else {
                      if (2 == var4.field_o) {
                        var3 = (Object) (Object) var4;
                        break L2;
                      } else {
                        var4 = (qm) (Object) vj.field_E.a((byte) -71);
                        continue L1;
                      }
                    }
                  }
                  if (null == var3) {
                    throw new RuntimeException(((hi) this).field_w.field_t + "'s deployedStellarBomb variable incorrectly set to true.");
                  } else {
                    if (((qm) var3).field_q == km.field_u) {
                      throw new RuntimeException(((hi) this).field_w.field_t + " is trying to deploy a Stellar Bomb it has already used." + " Already deployed at star " + ((qm) var3).field_q.field_I + ", now trying to deploy at " + param1.field_I);
                    } else {
                      throw new RuntimeException(((hi) this).field_w.field_t + ": TaskAI.deployStellarBomb: targetStellarBomb is not the star the ProjectUse points at." + " targetStellarBomb: " + km.field_u.field_I + ", bomb.s1: " + (Object) (Object) ((qm) var3).field_q);
                    }
                  }
                }
              } else {
                if (((hi) this).field_w != param1.field_y) {
                  if (param0 == -82) {
                    vj.field_E.a((byte) -113, (oh) (Object) new qm(2, ((hi) this).field_w, param1));
                    mr.field_f = true;
                    km.field_u = param1;
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  throw new RuntimeException(((hi) this).field_w.field_t + " is trying to Stellar Bomb itself at star " + param1.field_I);
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_31_0 = var3;
            stackOut_31_1 = new StringBuilder().append("hi.CA(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L3;
            } else {
              stackOut_32_0 = stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ')');
        }
    }

    private final void a(byte param0, kl param1, boolean param2) {
        RuntimeException var4 = null;
        ln[] var4_array = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        sd var9_ref_sd = null;
        int var10 = 0;
        int var11 = 0;
        ln[] var11_ref_ln__ = null;
        int var12_int = 0;
        ln[] var12 = null;
        int var13 = 0;
        ln var13_ref_ln = null;
        ln var14 = null;
        ln[] var14_array = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        ln var16_ref_ln = null;
        ln[] var17 = null;
        int var18 = 0;
        ln var19 = null;
        int var20 = 0;
        sd var21 = null;
        int var22 = 0;
        fs stackIn_4_0 = null;
        sd stackIn_11_0 = null;
        sd stackIn_14_0 = null;
        fs stackIn_24_0 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        ln stackIn_69_0 = null;
        ln stackIn_76_0 = null;
        int stackIn_83_0 = 0;
        fs stackIn_110_0 = null;
        fs stackIn_137_0 = null;
        fs stackIn_163_0 = null;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_169_1 = 0;
        int stackIn_177_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_178_1 = 0;
        Object stackIn_194_0 = null;
        int stackIn_195_0 = 0;
        Object stackIn_199_0 = null;
        sd stackIn_203_0 = null;
        sd stackIn_208_0 = null;
        int stackIn_260_0 = 0;
        RuntimeException stackIn_268_0 = null;
        StringBuilder stackIn_268_1 = null;
        RuntimeException stackIn_270_0 = null;
        StringBuilder stackIn_270_1 = null;
        RuntimeException stackIn_271_0 = null;
        StringBuilder stackIn_271_1 = null;
        String stackIn_271_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_3_0 = null;
        sd stackOut_10_0 = null;
        sd stackOut_13_0 = null;
        fs stackOut_23_0 = null;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        ln stackOut_68_0 = null;
        ln stackOut_75_0 = null;
        int stackOut_82_0 = 0;
        int stackOut_80_0 = 0;
        fs stackOut_109_0 = null;
        fs stackOut_136_0 = null;
        Object stackOut_162_0 = null;
        int stackOut_165_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_168_1 = 0;
        int stackOut_176_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_177_1 = 0;
        Object stackOut_193_0 = null;
        int stackOut_194_0 = 0;
        Object stackOut_198_0 = null;
        sd stackOut_202_0 = null;
        sd stackOut_207_0 = null;
        int stackOut_259_0 = 0;
        RuntimeException stackOut_267_0 = null;
        StringBuilder stackOut_267_1 = null;
        RuntimeException stackOut_270_0 = null;
        StringBuilder stackOut_270_1 = null;
        String stackOut_270_2 = null;
        RuntimeException stackOut_268_0 = null;
        StringBuilder stackOut_268_1 = null;
        String stackOut_268_2 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_array = param1.field_n.field_D;
            var5 = new int[var4_array.length];
            var6 = 0;
            var7 = 0;
            var8_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_array.length <= var8_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = var4_array[var8_int].field_y;
                    stackIn_24_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var22 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 == ((hi) this).field_w) {
                            break L5;
                          } else {
                            var5[var8_int] = -1;
                            if (var22 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var7 = 0;
                        var6 = 0;
                        stackOut_10_0 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                        stackIn_11_0 = stackOut_10_0;
                        L6: while (true) {
                          var9_ref_sd = stackIn_11_0;
                          L7: while (true) {
                            L8: {
                              if (null == var9_ref_sd) {
                                break L8;
                              } else {
                                stackOut_13_0 = var4_array[var8_int].field_R;
                                stackIn_11_0 = stackOut_13_0;
                                stackIn_14_0 = stackOut_13_0;
                                if (var22 != 0) {
                                  continue L6;
                                } else {
                                  L9: {
                                    if (stackIn_14_0 != var9_ref_sd) {
                                      break L9;
                                    } else {
                                      var7 = 1;
                                      if (var22 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  var6++;
                                  var9_ref_sd = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                  if (var22 == 0) {
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if (var7 == 0) {
                              throw new RuntimeException("Can't find the Territory of a star owned by the AI: " + var4_array[var8_int].field_I);
                            } else {
                              var5[var8_int] = var6;
                              break L4;
                            }
                          }
                        }
                      }
                      var8_int++;
                      if (var22 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_23_0 = ((hi) this).field_w;
                stackIn_24_0 = stackOut_23_0;
                break L2;
              }
              var8 = new int[((pf) (Object) stackIn_24_0.field_i).e(0)];
              var9 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (~var9 <= ~var4_array.length) {
                      break L12;
                    } else {
                      stackOut_26_0 = 0;
                      stackOut_26_1 = ~var5[var9];
                      stackIn_34_0 = stackOut_26_0;
                      stackIn_34_1 = stackOut_26_1;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      if (var22 != 0) {
                        break L11;
                      } else {
                        L13: {
                          if (stackIn_27_0 == stackIn_27_1) {
                            break L13;
                          } else {
                            var8[var5[var9]] = var8[var5[var9]] + q.field_Ab[var4_array[var9].field_p];
                            break L13;
                          }
                        }
                        var9++;
                        if (var22 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  var9 = 0;
                  stackOut_33_0 = 100;
                  stackOut_33_1 = (-53 - param0) / 41;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L11;
                }
                var11 = stackIn_34_0 % stackIn_34_1;
                var10 = 0;
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        if (var10 >= var8.length) {
                          break L17;
                        } else {
                          stackOut_36_0 = ~((hi) this).field_n[var10];
                          stackOut_36_1 = ~var8[var10];
                          stackIn_47_0 = stackOut_36_0;
                          stackIn_47_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (var22 != 0) {
                            L18: while (true) {
                              if (stackIn_47_0 >= stackIn_47_1) {
                                break L16;
                              } else {
                                stackOut_48_0 = -1;
                                stackOut_48_1 = ~var8[var10];
                                stackIn_57_0 = stackOut_48_0;
                                stackIn_57_1 = stackOut_48_1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  stackOut_49_0 = stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  L19: {
                                    if (stackIn_51_0 <= stackIn_51_1) {
                                      break L19;
                                    } else {
                                      var9 = var9 + ((hi) this).field_i[var10];
                                      break L19;
                                    }
                                  }
                                  var10++;
                                  if (var22 == 0) {
                                    stackOut_46_0 = ~var8.length;
                                    stackOut_46_1 = ~var10;
                                    stackIn_47_0 = stackOut_46_0;
                                    stackIn_47_1 = stackOut_46_1;
                                    continue L18;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          } else {
                            L20: {
                              if (stackIn_37_0 <= stackIn_37_1) {
                                break L20;
                              } else {
                                var8[var10] = ((hi) this).field_n[var10];
                                break L20;
                              }
                            }
                            var9 = var9 + var8[var10];
                            var10++;
                            if (var22 == 0) {
                              continue L14;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                      L21: {
                        if (!((hi) this).field_m.field_o.field_i) {
                          break L21;
                        } else {
                          var9 = var9 + ((hi) this).field_i[0];
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var10 = 0;
                      L22: while (true) {
                        stackOut_46_0 = ~var8.length;
                        stackOut_46_1 = ~var10;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        if (stackIn_47_0 >= stackIn_47_1) {
                          break L16;
                        } else {
                          stackOut_48_0 = -1;
                          stackOut_48_1 = ~var8[var10];
                          stackIn_57_0 = stackOut_48_0;
                          stackIn_57_1 = stackOut_48_1;
                          stackIn_49_0 = stackOut_48_0;
                          stackIn_49_1 = stackOut_48_1;
                          if (var22 != 0) {
                            break L15;
                          } else {
                            stackOut_49_0 = stackIn_49_0;
                            stackOut_49_1 = stackIn_49_1;
                            stackIn_51_0 = stackOut_49_0;
                            stackIn_51_1 = stackOut_49_1;
                            L23: {
                              if (stackIn_51_0 <= stackIn_51_1) {
                                break L23;
                              } else {
                                var9 = var9 + ((hi) this).field_i[var10];
                                break L23;
                              }
                            }
                            var10++;
                            if (var22 == 0) {
                              continue L22;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    stackOut_56_0 = param1.field_i * (-((hi) this).field_t + 50) / 250;
                    stackOut_56_1 = param1.field_i;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    break L15;
                  }
                  L24: {
                    L25: {
                      L26: {
                        var10 = stackIn_57_0 + stackIn_57_1;
                        if (!param2) {
                          break L26;
                        } else {
                          L27: {
                            if (param1.field_n == km.field_u) {
                              L28: {
                                L29: {
                                  param1.field_i = param1.field_n.field_x / 2;
                                  if (null != param1.field_n.field_y) {
                                    var11_ref_ln__ = var4_array;
                                    var12_int = 0;
                                    L30: while (true) {
                                      if (var11_ref_ln__.length <= var12_int) {
                                        break L29;
                                      } else {
                                        var13_ref_ln = var11_ref_ln__[var12_int];
                                        stackOut_68_0 = (ln) var13_ref_ln;
                                        stackIn_76_0 = stackOut_68_0;
                                        stackIn_69_0 = stackOut_68_0;
                                        if (var22 != 0) {
                                          break L28;
                                        } else {
                                          L31: {
                                            if (stackIn_69_0.field_y != param1.field_n.field_y) {
                                              break L31;
                                            } else {
                                              param1.field_i = param1.field_i + var13_ref_ln.field_x;
                                              break L31;
                                            }
                                          }
                                          var12_int++;
                                          if (var22 == 0) {
                                            continue L30;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L29;
                                  }
                                }
                                stackOut_75_0 = param1.field_n;
                                stackIn_76_0 = stackOut_75_0;
                                break L28;
                              }
                              if (!stackIn_76_0.field_u) {
                                break L27;
                              } else {
                                param1.field_i = 2 * param1.field_i;
                                break L27;
                              }
                            } else {
                              break L27;
                            }
                          }
                          L32: {
                            var10 = param1.field_i - -(param1.field_i * (-((hi) this).field_t + 50) / 250);
                            if (var9 < var10) {
                              stackOut_82_0 = 0;
                              stackIn_83_0 = stackOut_82_0;
                              break L32;
                            } else {
                              stackOut_80_0 = 1;
                              stackIn_83_0 = stackOut_80_0;
                              break L32;
                            }
                          }
                          L33: {
                            var11 = stackIn_83_0;
                            if (var11 != 0) {
                              break L33;
                            } else {
                              if (mr.field_f) {
                                break L33;
                              } else {
                                if (((hi) this).field_w.field_u[2] < 5) {
                                  break L33;
                                } else {
                                  if (param1.field_n.field_x >= 5) {
                                    L34: {
                                      var12_int = param1.field_i;
                                      if (param1.field_n.field_u) {
                                        var12_int = var12_int / 2;
                                        break L34;
                                      } else {
                                        break L34;
                                      }
                                    }
                                    L35: {
                                      var12_int = var12_int - param1.field_n.field_x / 2;
                                      if (param1.field_n.field_u) {
                                        var12_int = var12_int * 2;
                                        break L35;
                                      } else {
                                        break L35;
                                      }
                                    }
                                    var13 = var12_int - -(var12_int * (50 + -((hi) this).field_t) / 250);
                                    if (var13 <= var9) {
                                      L36: {
                                        this.a((byte) -82, param1.field_n);
                                        var11 = 1;
                                        param1.field_i = param1.field_n.field_x / 2;
                                        if (null == param1.field_n.field_y) {
                                          break L36;
                                        } else {
                                          var14_array = var4_array;
                                          var15 = 0;
                                          L37: while (true) {
                                            if (var14_array.length <= var15) {
                                              break L36;
                                            } else {
                                              var16_ref_ln = var14_array[var15];
                                              stackOut_109_0 = param1.field_n.field_y;
                                              stackIn_163_0 = stackOut_109_0;
                                              stackIn_110_0 = stackOut_109_0;
                                              if (var22 != 0) {
                                                break L25;
                                              } else {
                                                L38: {
                                                  if (stackIn_110_0 != var16_ref_ln.field_y) {
                                                    break L38;
                                                  } else {
                                                    param1.field_i = param1.field_i + var16_ref_ln.field_x;
                                                    break L38;
                                                  }
                                                }
                                                var15++;
                                                if (var22 == 0) {
                                                  continue L37;
                                                } else {
                                                  break L36;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L39: {
                                        if (param1.field_n.field_u) {
                                          param1.field_i = 2 * param1.field_i;
                                          break L39;
                                        } else {
                                          break L39;
                                        }
                                      }
                                      var10 = param1.field_i + param1.field_i * (50 - ((hi) this).field_t) / 250;
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  } else {
                                    break L33;
                                  }
                                }
                              }
                            }
                          }
                          L40: {
                            if (var11 == 0) {
                              break L40;
                            } else {
                              if (mr.field_f) {
                                break L40;
                              } else {
                                if (((hi) this).field_w.field_u[2] < 5) {
                                  break L40;
                                } else {
                                  if (param1.field_n.field_x >= 25) {
                                    L41: {
                                      this.a((byte) -82, param1.field_n);
                                      param1.field_i = param1.field_n.field_x / 2;
                                      if (null == param1.field_n.field_y) {
                                        break L41;
                                      } else {
                                        var12 = var4_array;
                                        var13 = 0;
                                        L42: while (true) {
                                          if (var12.length <= var13) {
                                            break L41;
                                          } else {
                                            var14 = var12[var13];
                                            stackOut_136_0 = param1.field_n.field_y;
                                            stackIn_163_0 = stackOut_136_0;
                                            stackIn_137_0 = stackOut_136_0;
                                            if (var22 != 0) {
                                              break L25;
                                            } else {
                                              L43: {
                                                if (stackIn_137_0 != var14.field_y) {
                                                  break L43;
                                                } else {
                                                  param1.field_i = param1.field_i + var14.field_x;
                                                  break L43;
                                                }
                                              }
                                              var13++;
                                              if (var22 == 0) {
                                                continue L42;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L44: {
                                      if (!param1.field_n.field_u) {
                                        break L44;
                                      } else {
                                        param1.field_i = param1.field_i * 2;
                                        break L44;
                                      }
                                    }
                                    var10 = (-((hi) this).field_t + 50) * param1.field_i / 250 + param1.field_i;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L26;
                          } else {
                            param1.field_p = true;
                            break L26;
                          }
                        }
                      }
                      if (param1.field_p) {
                        L45: {
                          if (param2) {
                            break L45;
                          } else {
                            if (var9 == 0) {
                              return;
                            } else {
                              var10 = var10 * 3 / 10;
                              if (var10 != 0) {
                                break L45;
                              } else {
                                var10 = 1;
                                break L45;
                              }
                            }
                          }
                        }
                        var11 = 0;
                        stackOut_162_0 = var4_array.clone();
                        stackIn_163_0 = (fs) (Object) stackOut_162_0;
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                    var12 = (ln[]) (Object) stackIn_163_0;
                    var13 = 1;
                    L46: while (true) {
                      L47: {
                        L48: {
                          L49: {
                            if (var13 == 0) {
                              break L49;
                            } else {
                              var13 = 0;
                              stackOut_165_0 = 0;
                              stackIn_177_0 = stackOut_165_0;
                              stackIn_166_0 = stackOut_165_0;
                              if (var22 != 0) {
                                break L48;
                              } else {
                                var15 = stackIn_166_0;
                                L50: while (true) {
                                  L51: {
                                    if (~var15 <= ~(-1 + var12.length)) {
                                      break L51;
                                    } else {
                                      stackOut_168_0 = q.field_Ab[var12[var15].field_p];
                                      stackOut_168_1 = q.field_Ab[var12[var15 + 1].field_p];
                                      stackIn_178_0 = stackOut_168_0;
                                      stackIn_178_1 = stackOut_168_1;
                                      stackIn_169_0 = stackOut_168_0;
                                      stackIn_169_1 = stackOut_168_1;
                                      if (var22 != 0) {
                                        break L47;
                                      } else {
                                        L52: {
                                          if (stackIn_169_0 > stackIn_169_1) {
                                            var14 = var12[var15];
                                            var12[var15] = var12[var15 + 1];
                                            var13 = 1;
                                            var12[1 + var15] = var14;
                                            break L52;
                                          } else {
                                            break L52;
                                          }
                                        }
                                        var15++;
                                        if (var22 == 0) {
                                          continue L50;
                                        } else {
                                          break L51;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    continue L46;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                          }
                          var11 = this.a(true, var12, param1.field_n, 102, var10);
                          stackOut_176_0 = ~var10;
                          stackIn_177_0 = stackOut_176_0;
                          break L48;
                        }
                        stackOut_177_0 = stackIn_177_0;
                        stackOut_177_1 = ~var11;
                        stackIn_178_0 = stackOut_177_0;
                        stackIn_178_1 = stackOut_177_1;
                        break L47;
                      }
                      L53: {
                        if (stackIn_178_0 >= stackIn_178_1) {
                          break L53;
                        } else {
                          var11 = var11 + this.a(false, var12, param1.field_n, 84, -var11 + var10);
                          break L53;
                        }
                      }
                      L54: {
                        L55: {
                          var10 = var10 - var11;
                          if (var10 > 0) {
                            L56: {
                              if (((hi) this).field_m.field_o.field_i) {
                                break L56;
                              } else {
                                var15_ref_int__ = new int[((hi) this).field_i.length];
                                var16 = 0;
                                L57: while (true) {
                                  L58: {
                                    L59: {
                                      if (var15_ref_int__.length <= var16) {
                                        break L59;
                                      } else {
                                        var15_ref_int__[var16] = var16;
                                        var16++;
                                        if (var22 != 0) {
                                          break L58;
                                        } else {
                                          if (var22 == 0) {
                                            continue L57;
                                          } else {
                                            break L59;
                                          }
                                        }
                                      }
                                    }
                                    nm.a(var15_ref_int__, (int[]) ((hi) this).field_i.clone(), (byte) 47);
                                    break L58;
                                  }
                                  var16 = 0;
                                  L60: while (true) {
                                    L61: {
                                      if (var16 >= ((hi) this).field_i.length) {
                                        break L61;
                                      } else {
                                        stackOut_193_0 = this;
                                        stackIn_194_0 = stackOut_193_0;
                                        L62: while (true) {
                                          stackOut_194_0 = ((hi) this).field_i[var15_ref_int__[var16]];
                                          stackIn_260_0 = stackOut_194_0;
                                          stackIn_195_0 = stackOut_194_0;
                                          if (var22 != 0) {
                                            break L54;
                                          } else {
                                            L63: {
                                              if (stackIn_195_0 == 0) {
                                                break L63;
                                              } else {
                                                var17 = var4_array;
                                                var18 = 0;
                                                L64: while (true) {
                                                  L65: {
                                                    if (~var18 <= ~var17.length) {
                                                      break L65;
                                                    } else {
                                                      var19 = var17[var18];
                                                      stackOut_198_0 = this;
                                                      stackIn_194_0 = stackOut_198_0;
                                                      stackIn_199_0 = stackOut_198_0;
                                                      if (var22 != 0) {
                                                        continue L62;
                                                      } else {
                                                        L66: {
                                                          if (((hi) this).field_w != var19.field_y) {
                                                            break L66;
                                                          } else {
                                                            var20 = 0;
                                                            var21 = (sd) (Object) ((hi) this).field_w.field_i.d(0);
                                                            L67: while (true) {
                                                              L68: {
                                                                L69: {
                                                                  if (var21 == null) {
                                                                    break L69;
                                                                  } else {
                                                                    stackOut_202_0 = (sd) var21;
                                                                    stackIn_208_0 = stackOut_202_0;
                                                                    stackIn_203_0 = stackOut_202_0;
                                                                    if (var22 != 0) {
                                                                      break L68;
                                                                    } else {
                                                                      if (stackIn_203_0 == var19.field_R) {
                                                                        break L69;
                                                                      } else {
                                                                        var20++;
                                                                        var21 = (sd) (Object) ((hi) this).field_w.field_i.a((byte) -71);
                                                                        if (var22 == 0) {
                                                                          continue L67;
                                                                        } else {
                                                                          break L69;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                stackOut_207_0 = (sd) var21;
                                                                stackIn_208_0 = stackOut_207_0;
                                                                break L68;
                                                              }
                                                              if (stackIn_208_0 == null) {
                                                                throw new RuntimeException("Cannot find Territory that " + ((hi) this).field_w.field_t + "'s star belongs to: " + var19.field_I);
                                                              } else {
                                                                L70: {
                                                                  if (~var20 == ~var15_ref_int__[var16]) {
                                                                    break L70;
                                                                  } else {
                                                                    if (var22 == 0) {
                                                                      break L66;
                                                                    } else {
                                                                      break L70;
                                                                    }
                                                                  }
                                                                }
                                                                L71: {
                                                                  if (~((hi) this).field_i[var20] >= ~var10) {
                                                                    break L71;
                                                                  } else {
                                                                    this.a(-1, var19, var10);
                                                                    this.a(var10, (byte) 116, param1.field_n, var19);
                                                                    ((hi) this).field_i[var20] = ((hi) this).field_i[var20] - var10;
                                                                    var10 = 0;
                                                                    if (var22 == 0) {
                                                                      break L65;
                                                                    } else {
                                                                      break L71;
                                                                    }
                                                                  }
                                                                }
                                                                this.a(-1, var19, ((hi) this).field_i[var20]);
                                                                this.a(((hi) this).field_i[var20], (byte) 100, param1.field_n, var19);
                                                                var10 = var10 - ((hi) this).field_i[var20];
                                                                ((hi) this).field_i[var20] = 0;
                                                                if (var22 == 0) {
                                                                  break L65;
                                                                } else {
                                                                  break L66;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        var18++;
                                                        if (var22 == 0) {
                                                          continue L64;
                                                        } else {
                                                          break L65;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (0 == var10) {
                                                    break L61;
                                                  } else {
                                                    break L63;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            if (var22 == 0) {
                                              continue L60;
                                            } else {
                                              break L61;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (var22 == 0) {
                                      break L55;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                            }
                            L72: {
                              if (~var10 >= ~((hi) this).field_i[0]) {
                                break L72;
                              } else {
                                if (param2) {
                                  throw new RuntimeException(((hi) this).field_w.field_t + " has decided to attack a system, but appears not to have sufficient fleets to carry through.");
                                } else {
                                  break L72;
                                }
                              }
                            }
                            L73: {
                              var15 = var10;
                              if (~var10 >= ~((hi) this).field_i[0]) {
                                break L73;
                              } else {
                                var15 = ((hi) this).field_i[0];
                                break L73;
                              }
                            }
                            var16 = 0;
                            L74: while (true) {
                              L75: {
                                L76: {
                                  if (~var12.length >= ~var16) {
                                    break L76;
                                  } else {
                                    if (var22 != 0) {
                                      break L75;
                                    } else {
                                      L77: {
                                        if (var12[var16].field_y == ((hi) this).field_w) {
                                          this.a(-1, var12[var16], var15);
                                          this.a(var15, (byte) 93, param1.field_n, var12[var16]);
                                          if (var22 == 0) {
                                            break L76;
                                          } else {
                                            break L77;
                                          }
                                        } else {
                                          break L77;
                                        }
                                      }
                                      var16++;
                                      if (var22 == 0) {
                                        continue L74;
                                      } else {
                                        break L76;
                                      }
                                    }
                                  }
                                }
                                var10 = var10 - var15;
                                break L75;
                              }
                              var16 = 0;
                              L78: while (true) {
                                L79: {
                                  if (((hi) this).field_i.length <= var16) {
                                    break L79;
                                  } else {
                                    ((hi) this).field_i[var16] = ((hi) this).field_i[var16] - var15;
                                    var16++;
                                    if (var22 != 0) {
                                      break L55;
                                    } else {
                                      if (var22 == 0) {
                                        continue L78;
                                      } else {
                                        break L79;
                                      }
                                    }
                                  }
                                }
                                var11 = var11 + var15;
                                break L55;
                              }
                            }
                          } else {
                            break L55;
                          }
                        }
                        stackOut_259_0 = ~var10;
                        stackIn_260_0 = stackOut_259_0;
                        break L54;
                      }
                      if (stackIn_260_0 >= -1) {
                        break L24;
                      } else {
                        if (!param2) {
                          break L24;
                        } else {
                          throw new RuntimeException("After full attack movement, " + ((hi) this).field_w.field_t + " still hasn't sent enough fleets to " + param1.field_n.field_I);
                        }
                      }
                    }
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L80: {
            var4 = decompiledCaughtException;
            stackOut_267_0 = (RuntimeException) var4;
            stackOut_267_1 = new StringBuilder().append("hi.FA(").append(param0).append(',');
            stackIn_270_0 = stackOut_267_0;
            stackIn_270_1 = stackOut_267_1;
            stackIn_268_0 = stackOut_267_0;
            stackIn_268_1 = stackOut_267_1;
            if (param1 == null) {
              stackOut_270_0 = (RuntimeException) (Object) stackIn_270_0;
              stackOut_270_1 = (StringBuilder) (Object) stackIn_270_1;
              stackOut_270_2 = "null";
              stackIn_271_0 = stackOut_270_0;
              stackIn_271_1 = stackOut_270_1;
              stackIn_271_2 = stackOut_270_2;
              break L80;
            } else {
              stackOut_268_0 = (RuntimeException) (Object) stackIn_268_0;
              stackOut_268_1 = (StringBuilder) (Object) stackIn_268_1;
              stackOut_268_2 = "{...}";
              stackIn_271_0 = stackOut_268_0;
              stackIn_271_1 = stackOut_268_1;
              stackIn_271_2 = stackOut_268_2;
              break L80;
            }
          }
          throw r.a((Throwable) (Object) stackIn_271_0, stackIn_271_2 + ',' + param2 + ')');
        }
    }

    hi(fs param0, dc param1, mn param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        ((hi) this).field_l = new pf();
        ((hi) this).field_u = new pf();
        ((hi) this).field_k = new pf();
        ((hi) this).field_h = false;
        ((hi) this).field_b = false;
        try {
          L0: {
            L1: {
              ((hi) this).field_c = param2;
              ((hi) this).field_m = param1;
              ((hi) this).field_w = param0;
              ((hi) this).field_x = ((hi) this).field_m.field_g.field_e.length;
              sf.a((byte) 124, ((hi) this).field_x);
              ((hi) this).field_p = true;
              ((hi) this).field_j = vc.a((byte) -39, 75) - -25;
              ((hi) this).field_t = vc.a((byte) -39, 75) - -25;
              ((hi) this).field_v = new int[((hi) this).field_m.field_r];
              ((hi) this).field_q = new int[((hi) this).field_m.field_r];
              ((hi) this).field_f = new int[((hi) this).field_m.field_r];
              if (((hi) this).field_m.field_x instanceof ui) {
                ((hi) this).field_b = true;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!(((hi) this).field_m.field_x instanceof hp)) {
                break L2;
              } else {
                ((hi) this).field_h = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("hi.<init>(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Click to show the Victory window.";
        field_a = new vr(true, true, true, true, false, true, true, 0);
    }
}
