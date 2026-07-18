/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bn {
    private int field_o;
    private int field_a;
    private int field_c;
    private int field_s;
    private int field_t;
    static int field_n;
    private int field_l;
    private int field_u;
    private int field_r;
    static nl field_j;
    private int field_e;
    static String field_i;
    static String[] field_m;
    static cn field_h;
    private int field_p;
    private int field_w;
    static cn field_f;
    private float field_y;
    private boolean field_d;
    private int field_v;
    private int field_b;
    static String field_q;
    private bm field_g;
    private int field_x;
    private int field_k;

    final void a(int param0) {
        ((bn) this).field_g.a(((bn) this).field_e, ((bn) this).field_t, (byte) -107);
        if (param0 != 6733) {
            Object var3 = null;
            c discarded$0 = bn.a(-69, (java.awt.Component) null, -15, 123);
        }
    }

    final void e(int param0) {
        if (param0 == 6731) {
          if (cm.field_R == null) {
            L0: {
              if (pb.field_G <= 0) {
                ((bn) this).field_d = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (((bn) this).field_d) {
              int fieldTemp$2 = ((bn) this).field_c - 1;
              ((bn) this).field_c = ((bn) this).field_c - 1;
              if (0 < fieldTemp$2) {
                return;
              } else {
                ((bn) this).field_c = ((bn) this).field_k;
                if (((bn) this).field_b > sj.field_bb) {
                  ((bn) this).field_d = false;
                  return;
                } else {
                  this.c(103);
                  return;
                }
              }
            } else {
              if (((bn) this).field_x <= up.field_d) {
                if (((bn) this).field_x <= 0) {
                  if (((bn) this).field_o == up.field_d) {
                    if (eg.field_d != ((bn) this).field_v) {
                      ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                    return;
                  }
                } else {
                  aj.field_Gb = 0;
                  if (((bn) this).field_o == up.field_d) {
                    if (eg.field_d != ((bn) this).field_v) {
                      ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                    return;
                  }
                }
              } else {
                aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                if (((bn) this).field_o == up.field_d) {
                  if (eg.field_d != ((bn) this).field_v) {
                    ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          this.c(-81);
          if (cm.field_R == null) {
            L1: {
              if (pb.field_G <= 0) {
                ((bn) this).field_d = false;
                break L1;
              } else {
                break L1;
              }
            }
            if (((bn) this).field_d) {
              int fieldTemp$3 = ((bn) this).field_c - 1;
              ((bn) this).field_c = ((bn) this).field_c - 1;
              if (0 < fieldTemp$3) {
                return;
              } else {
                ((bn) this).field_c = ((bn) this).field_k;
                if (((bn) this).field_b > sj.field_bb) {
                  ((bn) this).field_d = false;
                  return;
                } else {
                  this.c(103);
                  return;
                }
              }
            } else {
              L2: {
                if (((bn) this).field_x <= up.field_d) {
                  if (((bn) this).field_x > 0) {
                    aj.field_Gb = 0;
                    break L2;
                  } else {
                    L3: {
                      if (((bn) this).field_o != up.field_d) {
                        ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                        break L3;
                      } else {
                        if (eg.field_d == ((bn) this).field_v) {
                          break L3;
                        } else {
                          ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                  break L2;
                }
              }
              if (((bn) this).field_o == up.field_d) {
                if (eg.field_d == ((bn) this).field_v) {
                  return;
                } else {
                  ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                  return;
                }
              } else {
                ((bn) this).field_g.a(((bn) this).field_v, ((bn) this).field_o, (byte) -118);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        var2 = -125 / ((param0 - 24) / 43);
        if (((bn) this).field_b <= sj.field_bb) {
          if (pb.field_G <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        ((bn) this).field_a = param0;
        ((bn) this).field_x = param2;
        if (!param1) {
            field_j = null;
        }
    }

    final static c a(int param0, java.awt.Component param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            c var5 = null;
            kf var5_ref = null;
            Object var6 = null;
            c stackIn_3_0 = null;
            kf stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            c stackOut_2_0 = null;
            kf stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              try {
                L0: {
                  var4 = Class.forName("ij");
                  var5 = (c) var4.newInstance();
                  var5.a((byte) -48, param1, param3, param2);
                  if (param0 == -1) {
                    break L0;
                  } else {
                    var6 = null;
                    c discarded$2 = bn.a(92, (java.awt.Component) null, 26, -40);
                    break L0;
                  }
                }
                stackOut_2_0 = (c) var5;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new kf();
                ((c) (Object) var5_ref).a((byte) 72, param1, param3, param2);
                stackOut_4_0 = (kf) var5_ref;
                stackIn_5_0 = stackOut_4_0;
                return (c) (Object) stackIn_5_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var4_ref2;
                stackOut_6_1 = new StringBuilder().append("bn.C(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L1;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L1;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        var2 = ((bn) this).field_x;
        var4 = -124 / ((param0 - -40) / 32);
        var3 = ((bn) this).field_a;
        if (!((bn) this).b(71)) {
          ((bn) this).field_d = false;
          return;
        } else {
          L0: {
            if (((bn) this).field_p < var2) {
              var2 = ((bn) this).field_p;
              break L0;
            } else {
              if (var2 < ((bn) this).field_s) {
                var2 = ((bn) this).field_s;
                break L0;
              } else {
                L1: {
                  if (((bn) this).field_r < var3) {
                    var3 = ((bn) this).field_r;
                    break L1;
                  } else {
                    if (((bn) this).field_l <= var3) {
                      break L1;
                    } else {
                      L2: {
                        var3 = ((bn) this).field_l;
                        if (0.0f >= ((bn) this).field_y) {
                          break L2;
                        } else {
                          var5 = (int)(((bn) this).field_y * (float)var3 + 0.5f);
                          if (var2 >= var5) {
                            if (var5 >= var2) {
                              break L2;
                            } else {
                              var2 = var5;
                              break L2;
                            }
                          } else {
                            var3 = (int)((float)var2 / ((bn) this).field_y);
                            break L2;
                          }
                        }
                      }
                      L3: {
                        if (var2 != up.field_d) {
                          ((bn) this).field_g.a(var3, var2, (byte) -109);
                          break L3;
                        } else {
                          if (eg.field_d != var3) {
                            ((bn) this).field_g.a(var3, var2, (byte) -109);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (0 >= ((bn) this).field_x) {
                          break L4;
                        } else {
                          aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                          break L4;
                        }
                      }
                      return;
                    }
                  }
                }
                L5: {
                  if (0.0f >= ((bn) this).field_y) {
                    break L5;
                  } else {
                    var5 = (int)(((bn) this).field_y * (float)var3 + 0.5f);
                    if (var2 >= var5) {
                      if (var5 >= var2) {
                        break L5;
                      } else {
                        var2 = var5;
                        break L5;
                      }
                    } else {
                      L6: {
                        var3 = (int)((float)var2 / ((bn) this).field_y);
                        if (var2 != up.field_d) {
                          ((bn) this).field_g.a(var3, var2, (byte) -109);
                          break L6;
                        } else {
                          if (eg.field_d != var3) {
                            ((bn) this).field_g.a(var3, var2, (byte) -109);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (0 >= ((bn) this).field_x) {
                          break L7;
                        } else {
                          aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                          break L7;
                        }
                      }
                      return;
                    }
                  }
                }
                if (var2 == up.field_d) {
                  if (eg.field_d == var3) {
                    L8: {
                      if (0 >= ((bn) this).field_x) {
                        break L8;
                      } else {
                        aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                        break L8;
                      }
                    }
                    return;
                  } else {
                    L9: {
                      ((bn) this).field_g.a(var3, var2, (byte) -109);
                      if (0 >= ((bn) this).field_x) {
                        break L9;
                      } else {
                        aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    ((bn) this).field_g.a(var3, var2, (byte) -109);
                    if (0 >= ((bn) this).field_x) {
                      break L10;
                    } else {
                      aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                      break L10;
                    }
                  }
                  return;
                }
              }
            }
          }
          L11: {
            if (((bn) this).field_r < var3) {
              var3 = ((bn) this).field_r;
              break L11;
            } else {
              if (((bn) this).field_l <= var3) {
                break L11;
              } else {
                var3 = ((bn) this).field_l;
                if (0.0f < ((bn) this).field_y) {
                  L12: {
                    var5 = (int)(((bn) this).field_y * (float)var3 + 0.5f);
                    if (var2 >= var5) {
                      if (var5 >= var2) {
                        break L12;
                      } else {
                        var2 = var5;
                        break L12;
                      }
                    } else {
                      var3 = (int)((float)var2 / ((bn) this).field_y);
                      break L12;
                    }
                  }
                  L13: {
                    if (var2 != up.field_d) {
                      ((bn) this).field_g.a(var3, var2, (byte) -109);
                      break L13;
                    } else {
                      if (eg.field_d != var3) {
                        ((bn) this).field_g.a(var3, var2, (byte) -109);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (0 >= ((bn) this).field_x) {
                    return;
                  } else {
                    aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                    return;
                  }
                } else {
                  L14: {
                    if (var2 != up.field_d) {
                      ((bn) this).field_g.a(var3, var2, (byte) -109);
                      break L14;
                    } else {
                      if (eg.field_d != var3) {
                        ((bn) this).field_g.a(var3, var2, (byte) -109);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (0 >= ((bn) this).field_x) {
                      break L15;
                    } else {
                      aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                      break L15;
                    }
                  }
                  return;
                }
              }
            }
          }
          if (0.0f < ((bn) this).field_y) {
            var5 = (int)(((bn) this).field_y * (float)var3 + 0.5f);
            if (var2 >= var5) {
              L16: {
                if (var5 >= var2) {
                  break L16;
                } else {
                  var2 = var5;
                  break L16;
                }
              }
              if (var2 != up.field_d) {
                ((bn) this).field_g.a(var3, var2, (byte) -109);
                if (0 < ((bn) this).field_x) {
                  aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (eg.field_d != var3) {
                  ((bn) this).field_g.a(var3, var2, (byte) -109);
                  if (0 >= ((bn) this).field_x) {
                    return;
                  } else {
                    aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                    return;
                  }
                } else {
                  if (0 >= ((bn) this).field_x) {
                    return;
                  } else {
                    aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                    return;
                  }
                }
              }
            } else {
              var3 = (int)((float)var2 / ((bn) this).field_y);
              if (var2 == up.field_d) {
                if (eg.field_d == var3) {
                  if (0 < ((bn) this).field_x) {
                    aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L17: {
                    ((bn) this).field_g.a(var3, var2, (byte) -109);
                    if (0 >= ((bn) this).field_x) {
                      break L17;
                    } else {
                      aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                      break L17;
                    }
                  }
                  return;
                }
              } else {
                L18: {
                  ((bn) this).field_g.a(var3, var2, (byte) -109);
                  if (0 >= ((bn) this).field_x) {
                    break L18;
                  } else {
                    aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                    break L18;
                  }
                }
                return;
              }
            }
          } else {
            if (var2 != up.field_d) {
              ((bn) this).field_g.a(var3, var2, (byte) -109);
              if (0 < ((bn) this).field_x) {
                aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                return;
              } else {
                return;
              }
            } else {
              if (eg.field_d != var3) {
                ((bn) this).field_g.a(var3, var2, (byte) -109);
                if (0 < ((bn) this).field_x) {
                  aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (0 < ((bn) this).field_x) {
                  aj.field_Gb = (-up.field_d + ((bn) this).field_x) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_i = null;
        field_f = null;
        field_m = null;
        field_h = null;
        field_q = null;
        field_j = null;
    }

    private bn() throws Throwable {
        throw new Error();
    }

    final ek d(int param0) {
        ek var2 = null;
        ((bn) this).field_e = eg.field_d;
        ((bn) this).field_t = up.field_d;
        ((bn) this).field_g.a(((bn) this).field_w, ((bn) this).field_u, (byte) -86);
        if (param0 >= 32) {
          ve.field_a = false;
          var2 = gh.a(0, -66, 0, ((bn) this).field_w, i.field_A, ((bn) this).field_u);
          if (var2 == null) {
            ((bn) this).a(6733);
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 2;
        field_i = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_m = new String[]{"Trap", "<%highlight>This room contains a Trap!</col> The statistics of a room are displayed in the bottom-right, opposite your raider's. These statistics are slightly different from those of a raider: <%attack>, <%defence>, <%snare> and <%detect>. A <%trap>, such as <%lastroom>, will usually have high <%snare> and <%detect>, with low or no <%attack> or <%defence>."};
        field_q = "INSTRUCTIONS";
    }
}
