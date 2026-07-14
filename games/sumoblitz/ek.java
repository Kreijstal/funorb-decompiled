/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends ht {
    static String field_k;
    int field_o;
    int field_p;
    int field_q;
    static volatile int field_l;
    private int field_m;
    private int field_n;

    ek(fr param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        ((ek) this).field_n = -1;
        ((ek) this).field_m = -1;
        ((ek) this).field_p = param2;
        ((ek) this).field_q = param3;
        ((ek) this).field_o = param4;
        ((ek) this).field_d.a(63, (ht) this);
        jaggl.OpenGL.glTexImage3Dub(((ek) this).field_c, 0, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_q, ((ek) this).field_o, 0, be.a(false, ((ek) this).field_a), 5121, (byte[]) null, 0);
        ((ek) this).a(true, 0);
    }

    public static void d(int param0) {
        if (param0 != -21551) {
            return;
        }
        field_k = null;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(((ek) this).field_n, ((ek) this).field_m, ((ek) this).field_c, 0, 0, 0);
        ((ek) this).field_n = -1;
        int var2 = -76 / ((44 - param0) / 58);
        ((ek) this).field_m = -1;
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        qf.field_a = qf.field_a + 1;
        if (tm.field_d == -1) {
          if (0 != (dm.field_e ^ -1)) {
            L0: {
              if (param0 != null) {
                if (!param0.equals((Object) (Object) hp.field_l)) {
                  L1: {
                    if (!up.field_d) {
                      if (qf.field_a >= fn.field_s) {
                        if (fn.field_s + sb.field_c <= qf.field_a) {
                          stackOut_150_0 = 0;
                          stackIn_151_0 = stackOut_150_0;
                          break L1;
                        } else {
                          stackOut_149_0 = 1;
                          stackIn_151_0 = stackOut_149_0;
                          break L1;
                        }
                      } else {
                        stackOut_147_0 = 0;
                        stackIn_151_0 = stackOut_147_0;
                        break L1;
                      }
                    } else {
                      stackOut_145_0 = 0;
                      stackIn_151_0 = stackOut_145_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var2 = stackIn_151_0;
                      if (param0 == null) {
                        break L3;
                      } else {
                        if (up.field_d) {
                          qf.field_a = fn.field_s;
                          break L2;
                        } else {
                          if (var2 == 0) {
                            break L3;
                          } else {
                            qf.field_a = fn.field_s;
                            break L2;
                          }
                        }
                      }
                    }
                    qf.field_a = 0;
                    break L2;
                  }
                  za.field_k = dm.field_e;
                  hq.field_b = tm.field_d;
                  if (param0 != null) {
                    up.field_d = false;
                    break L0;
                  } else {
                    if (var2 == 0) {
                      break L0;
                    } else {
                      up.field_d = true;
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                if (hp.field_l != null) {
                  break L0;
                } else {
                  L4: {
                    if (!up.field_d) {
                      if (qf.field_a >= fn.field_s) {
                        if (fn.field_s + sb.field_c <= qf.field_a) {
                          stackOut_119_0 = 0;
                          stackIn_121_0 = stackOut_119_0;
                          break L4;
                        } else {
                          stackOut_118_0 = 1;
                          stackIn_121_0 = stackOut_118_0;
                          break L4;
                        }
                      } else {
                        stackOut_116_0 = 0;
                        stackIn_121_0 = stackOut_116_0;
                        break L4;
                      }
                    } else {
                      stackOut_114_0 = 0;
                      stackIn_121_0 = stackOut_114_0;
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      var2 = stackIn_121_0;
                      if (param0 == null) {
                        break L6;
                      } else {
                        if (up.field_d) {
                          qf.field_a = fn.field_s;
                          break L5;
                        } else {
                          if (var2 == 0) {
                            break L6;
                          } else {
                            qf.field_a = fn.field_s;
                            break L5;
                          }
                        }
                      }
                    }
                    qf.field_a = 0;
                    break L5;
                  }
                  L7: {
                    za.field_k = dm.field_e;
                    hq.field_b = tm.field_d;
                    if (param0 != null) {
                      up.field_d = false;
                      break L7;
                    } else {
                      if (var2 == 0) {
                        break L7;
                      } else {
                        up.field_d = true;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    hp.field_l = param0;
                    var2 = -62 % ((-74 - param1) / 35);
                    if (!up.field_d) {
                      if (!up.field_d) {
                        break L8;
                      } else {
                        if (qf.field_a != fe.field_T) {
                          break L8;
                        } else {
                          qf.field_a = 0;
                          up.field_d = false;
                          break L8;
                        }
                      }
                    } else {
                      if (!up.field_d) {
                        break L8;
                      } else {
                        if (qf.field_a != fe.field_T) {
                          break L8;
                        } else {
                          qf.field_a = 0;
                          up.field_d = false;
                          break L8;
                        }
                      }
                    }
                  }
                  dm.field_e = -1;
                  tm.field_d = -1;
                  return;
                }
              }
            }
            hp.field_l = param0;
            var2 = -62 % ((-74 - param1) / 35);
            if (!up.field_d) {
              if (qf.field_a >= fn.field_s) {
                L9: {
                  if (!up.field_d) {
                    break L9;
                  } else {
                    if (qf.field_a != fe.field_T) {
                      break L9;
                    } else {
                      qf.field_a = 0;
                      up.field_d = false;
                      break L9;
                    }
                  }
                }
                dm.field_e = -1;
                tm.field_d = -1;
                return;
              } else {
                L10: {
                  if (sl.field_d) {
                    qf.field_a = 0;
                    za.field_k = dm.field_e;
                    hq.field_b = tm.field_d;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (!up.field_d) {
                    break L11;
                  } else {
                    if (qf.field_a != fe.field_T) {
                      break L11;
                    } else {
                      qf.field_a = 0;
                      up.field_d = false;
                      break L11;
                    }
                  }
                }
                dm.field_e = -1;
                tm.field_d = -1;
                return;
              }
            } else {
              L12: {
                if (!up.field_d) {
                  break L12;
                } else {
                  if (qf.field_a != fe.field_T) {
                    break L12;
                  } else {
                    qf.field_a = 0;
                    up.field_d = false;
                    break L12;
                  }
                }
              }
              dm.field_e = -1;
              tm.field_d = -1;
              return;
            }
          } else {
            L13: {
              L14: {
                dm.field_e = pi.field_e;
                tm.field_d = ko.field_p;
                if (param0 != null) {
                  if (!param0.equals((Object) (Object) hp.field_l)) {
                    break L14;
                  } else {
                    break L13;
                  }
                } else {
                  if (hp.field_l != null) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              L15: {
                if (!up.field_d) {
                  if (qf.field_a >= fn.field_s) {
                    if (fn.field_s + sb.field_c <= qf.field_a) {
                      stackOut_89_0 = 0;
                      stackIn_90_0 = stackOut_89_0;
                      break L15;
                    } else {
                      stackOut_88_0 = 1;
                      stackIn_90_0 = stackOut_88_0;
                      break L15;
                    }
                  } else {
                    stackOut_86_0 = 0;
                    stackIn_90_0 = stackOut_86_0;
                    break L15;
                  }
                } else {
                  stackOut_84_0 = 0;
                  stackIn_90_0 = stackOut_84_0;
                  break L15;
                }
              }
              L16: {
                L17: {
                  var2 = stackIn_90_0;
                  if (param0 == null) {
                    break L17;
                  } else {
                    if (up.field_d) {
                      qf.field_a = fn.field_s;
                      break L16;
                    } else {
                      if (var2 == 0) {
                        break L17;
                      } else {
                        qf.field_a = fn.field_s;
                        break L16;
                      }
                    }
                  }
                }
                qf.field_a = 0;
                break L16;
              }
              za.field_k = dm.field_e;
              hq.field_b = tm.field_d;
              if (param0 != null) {
                up.field_d = false;
                break L13;
              } else {
                if (var2 == 0) {
                  break L13;
                } else {
                  up.field_d = true;
                  break L13;
                }
              }
            }
            L18: {
              hp.field_l = param0;
              var2 = -62 % ((-74 - param1) / 35);
              if (!up.field_d) {
                if (!up.field_d) {
                  break L18;
                } else {
                  if (qf.field_a != fe.field_T) {
                    break L18;
                  } else {
                    qf.field_a = 0;
                    up.field_d = false;
                    break L18;
                  }
                }
              } else {
                if (!up.field_d) {
                  break L18;
                } else {
                  if (qf.field_a != fe.field_T) {
                    break L18;
                  } else {
                    qf.field_a = 0;
                    up.field_d = false;
                    break L18;
                  }
                }
              }
            }
            dm.field_e = -1;
            tm.field_d = -1;
            return;
          }
        } else {
          if (param0 == null) {
            if (hp.field_l == null) {
              L19: {
                if (!up.field_d) {
                  if (qf.field_a >= fn.field_s) {
                    if (fn.field_s + sb.field_c > qf.field_a) {
                      stackOut_49_0 = 1;
                      stackIn_51_0 = stackOut_49_0;
                      break L19;
                    } else {
                      stackOut_48_0 = 0;
                      stackIn_51_0 = stackOut_48_0;
                      break L19;
                    }
                  } else {
                    stackOut_46_0 = 0;
                    stackIn_51_0 = stackOut_46_0;
                    break L19;
                  }
                } else {
                  stackOut_44_0 = 0;
                  stackIn_51_0 = stackOut_44_0;
                  break L19;
                }
              }
              L20: {
                var2 = stackIn_51_0;
                if (param0 != null) {
                  if (up.field_d) {
                    qf.field_a = fn.field_s;
                    break L20;
                  } else {
                    if (var2 != 0) {
                      qf.field_a = fn.field_s;
                      break L20;
                    } else {
                      qf.field_a = 0;
                      break L20;
                    }
                  }
                } else {
                  qf.field_a = 0;
                  break L20;
                }
              }
              L21: {
                za.field_k = dm.field_e;
                hq.field_b = tm.field_d;
                if (param0 != null) {
                  up.field_d = false;
                  break L21;
                } else {
                  if (var2 == 0) {
                    break L21;
                  } else {
                    up.field_d = true;
                    break L21;
                  }
                }
              }
              L22: {
                hp.field_l = param0;
                var2 = -62 % ((-74 - param1) / 35);
                if (up.field_d) {
                  break L22;
                } else {
                  if (qf.field_a >= fn.field_s) {
                    break L22;
                  } else {
                    if (sl.field_d) {
                      qf.field_a = 0;
                      za.field_k = dm.field_e;
                      hq.field_b = tm.field_d;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              L23: {
                L24: {
                  if (!up.field_d) {
                    break L24;
                  } else {
                    if (qf.field_a != fe.field_T) {
                      break L24;
                    } else {
                      qf.field_a = 0;
                      up.field_d = false;
                      dm.field_e = -1;
                      tm.field_d = -1;
                      break L23;
                    }
                  }
                }
                dm.field_e = -1;
                tm.field_d = -1;
                break L23;
              }
              return;
            } else {
              L25: {
                hp.field_l = param0;
                var2 = -62 % ((-74 - param1) / 35);
                if (!up.field_d) {
                  if (!up.field_d) {
                    break L25;
                  } else {
                    if (qf.field_a != fe.field_T) {
                      break L25;
                    } else {
                      qf.field_a = 0;
                      up.field_d = false;
                      break L25;
                    }
                  }
                } else {
                  if (!up.field_d) {
                    break L25;
                  } else {
                    if (qf.field_a != fe.field_T) {
                      break L25;
                    } else {
                      qf.field_a = 0;
                      up.field_d = false;
                      break L25;
                    }
                  }
                }
              }
              dm.field_e = -1;
              tm.field_d = -1;
              return;
            }
          } else {
            L26: {
              if (!param0.equals((Object) (Object) hp.field_l)) {
                L27: {
                  if (!up.field_d) {
                    if (qf.field_a >= fn.field_s) {
                      if (fn.field_s + sb.field_c > qf.field_a) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L27;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L27;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L27;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_12_0 = stackOut_5_0;
                    break L27;
                  }
                }
                L28: {
                  var2 = stackIn_12_0;
                  if (param0 != null) {
                    L29: {
                      if (up.field_d) {
                        break L29;
                      } else {
                        if (var2 != 0) {
                          break L29;
                        } else {
                          qf.field_a = 0;
                          break L28;
                        }
                      }
                    }
                    qf.field_a = fn.field_s;
                    break L28;
                  } else {
                    qf.field_a = 0;
                    break L28;
                  }
                }
                za.field_k = dm.field_e;
                hq.field_b = tm.field_d;
                if (param0 != null) {
                  up.field_d = false;
                  break L26;
                } else {
                  if (var2 == 0) {
                    break L26;
                  } else {
                    up.field_d = true;
                    break L26;
                  }
                }
              } else {
                break L26;
              }
            }
            L30: {
              hp.field_l = param0;
              var2 = -62 % ((-74 - param1) / 35);
              if (!up.field_d) {
                if (!up.field_d) {
                  break L30;
                } else {
                  if (qf.field_a != fe.field_T) {
                    break L30;
                  } else {
                    qf.field_a = 0;
                    up.field_d = false;
                    break L30;
                  }
                }
              } else {
                if (!up.field_d) {
                  break L30;
                } else {
                  if (qf.field_a != fe.field_T) {
                    break L30;
                  } else {
                    qf.field_a = 0;
                    up.field_d = false;
                    break L30;
                  }
                }
              }
            }
            dm.field_e = -1;
            tm.field_d = -1;
            return;
          }
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ek) this).field_d.a(param1 ^ 36, (ht) this);
        jaggl.OpenGL.glCopyTexSubImage3D(((ek) this).field_c, 0, param0, param2, param3, param7, param6, param5, param4);
        jaggl.OpenGL.glFlush();
        if (param1 != 80) {
            ((ek) this).field_n = 57;
        }
    }

    ek(fr param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        ((ek) this).field_n = -1;
        ((ek) this).field_m = -1;
        ((ek) this).field_p = param2;
        ((ek) this).field_q = param3;
        ((ek) this).field_o = param4;
        ((ek) this).field_d.a(72, (ht) this);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glTexImage3Dub(((ek) this).field_c, 0, ((ek) this).field_a, ((ek) this).field_p, ((ek) this).field_q, ((ek) this).field_o, 0, param6, 5121, param5, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
        ((ek) this).a(true, 0);
    }

    final static void b(boolean param0, int param1) {
        mf var2 = null;
        var2 = mf.a(rc.field_l[param1], 100, 96);
        if (!param0) {
          ek.b(true, 27);
          var2.c(-1);
          dj discarded$4 = qq.a(18416, var2);
          return;
        } else {
          var2.c(-1);
          dj discarded$5 = qq.a(18416, var2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
    }
}
