/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ii {
    static boolean field_e;
    static ul field_a;
    static String field_b;
    static ja field_c;
    static long field_d;

    final static void a(int param0, byte param1, int param2, String param3, long param4) {
        v.field_a = param3;
        da.field_c = param4;
        vh.field_Hb = true;
        fh.field_n = param0;
        mi.field_Gb = param2;
        if (param1 > -108) {
            int discarded$0 = ii.b((byte) -126);
        }
    }

    abstract long a(byte param0);

    public static void c(int param0) {
        if (param0 != -26028) {
            Object var2 = null;
            String discarded$0 = ii.a((String) null, (byte) -103, -24);
            field_c = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract int a(long param0, boolean param1);

    abstract void b(int param0);

    final static void a(int param0) {
        int var2 = 0;
        nc var3 = null;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ap.field_s) {
            return;
        }
        ap.field_s = true;
        nc[] var6 = mj.field_Hb;
        nc[] var1 = var6;
        for (var2 = 0; (var6.length ^ -1) < (var2 ^ -1); var2++) {
            var3 = var6[var2];
            if (!(var3 == null)) {
                var3.c(1);
            }
        }
        if (param0 <= 62) {
            Object var5 = null;
            String discarded$0 = ii.a((String) null, (byte) 19, -44);
            return;
        }
    }

    final static String a(String param0, byte param1, int param2) {
        int var4 = 0;
        ga var6 = null;
        ga var8 = null;
        ga var10 = null;
        ga var11 = null;
        CharSequence var13 = null;
        var13 = (CharSequence) (Object) param0;
        if (!em.a(var13, (byte) -38)) {
          return u.field_f;
        } else {
          if ((ge.field_zb ^ -1) == -3) {
            if (sf.a(1, param0)) {
              return hf.field_b;
            } else {
              if (!kj.a((byte) -94, param0)) {
                if (param1 == 116) {
                  if (100 <= dc.field_Fb) {
                    if (0 >= vl.field_h) {
                      return eh.field_g;
                    } else {
                      if (200 <= dc.field_Fb) {
                        return eh.field_g;
                      } else {
                        if (!hp.a(param0, param1 + 904)) {
                          var11 = ma.field_a;
                          var11.b((byte) -35, param2);
                          var11.field_j = var11.field_j + 1;
                          var4 = var11.field_j;
                          var11.a(124, 0);
                          var11.a(param0, (byte) 105);
                          var11.e(21, -var4 + var11.field_j);
                          return null;
                        } else {
                          return vl.a(wf.field_r, new String[1], param1 + -114);
                        }
                      }
                    }
                  } else {
                    if (200 <= dc.field_Fb) {
                      return eh.field_g;
                    } else {
                      if (!hp.a(param0, param1 + 904)) {
                        var10 = ma.field_a;
                        var10.b((byte) -35, param2);
                        var10.field_j = var10.field_j + 1;
                        var4 = var10.field_j;
                        var10.a(124, 0);
                        var10.a(param0, (byte) 105);
                        var10.e(21, -var4 + var10.field_j);
                        return null;
                      } else {
                        return vl.a(wf.field_r, new String[1], param1 + -114);
                      }
                    }
                  }
                } else {
                  int discarded$1 = ii.b((byte) -55);
                  if (100 <= dc.field_Fb) {
                    if (0 >= vl.field_h) {
                      return eh.field_g;
                    } else {
                      if (200 <= dc.field_Fb) {
                        return eh.field_g;
                      } else {
                        if (!hp.a(param0, param1 + 904)) {
                          var8 = ma.field_a;
                          var8.b((byte) -35, param2);
                          var8.field_j = var8.field_j + 1;
                          var4 = var8.field_j;
                          var8.a(124, 0);
                          var8.a(param0, (byte) 105);
                          var8.e(21, -var4 + var8.field_j);
                          return null;
                        } else {
                          return vl.a(wf.field_r, new String[1], param1 + -114);
                        }
                      }
                    }
                  } else {
                    if (200 <= dc.field_Fb) {
                      return eh.field_g;
                    } else {
                      if (!hp.a(param0, param1 + 904)) {
                        var6 = ma.field_a;
                        var6.b((byte) -35, param2);
                        var6.field_j = var6.field_j + 1;
                        var4 = var6.field_j;
                        var6.a(124, 0);
                        var6.a(param0, (byte) 105);
                        var6.e(21, -var4 + var6.field_j);
                        return null;
                      } else {
                        return vl.a(wf.field_r, new String[1], param1 + -114);
                      }
                    }
                  }
                }
              } else {
                return vl.a(jf.field_b, new String[1], 2);
              }
            }
          } else {
            return le.field_G;
          }
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_36_0 = 0;
        int stackIn_112_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_111_0 = 0;
        L0: {
          var3 = ZombieDawnMulti.field_E ? 1 : 0;
          if (-1 != hl.field_a) {
            break L0;
          } else {
            if ((tn.field_z ^ -1) == 0) {
              hl.field_a = bd.field_g;
              tn.field_z = bo.field_d;
              break L0;
            } else {
              L1: {
                l.field_a = l.field_a + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) kg.field_k)) {
                    break L1;
                  } else {
                    L2: {
                      kg.field_k = param1;
                      if (cb.field_l) {
                        break L2;
                      } else {
                        if (um.field_h <= l.field_a) {
                          break L2;
                        } else {
                          if (!wc.field_J) {
                            break L2;
                          } else {
                            l.field_a = 0;
                            bl.field_c = tn.field_z;
                            tf.field_Db = hl.field_a;
                            break L2;
                          }
                        }
                      }
                    }
                    L3: {
                      if (param0 == -16898) {
                        break L3;
                      } else {
                        int discarded$13 = ii.b((byte) -126);
                        break L3;
                      }
                    }
                    L4: {
                      if (!cb.field_l) {
                        tn.field_z = -1;
                        hl.field_a = -1;
                        break L4;
                      } else {
                        if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                          tn.field_z = -1;
                          hl.field_a = -1;
                          break L4;
                        } else {
                          l.field_a = 0;
                          cb.field_l = false;
                          tn.field_z = -1;
                          hl.field_a = -1;
                          break L4;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  if (null == kg.field_k) {
                    break L1;
                  } else {
                    L5: {
                      kg.field_k = param1;
                      if (cb.field_l) {
                        break L5;
                      } else {
                        if (um.field_h <= l.field_a) {
                          break L5;
                        } else {
                          if (!wc.field_J) {
                            break L5;
                          } else {
                            l.field_a = 0;
                            bl.field_c = tn.field_z;
                            tf.field_Db = hl.field_a;
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if (param0 == -16898) {
                        break L6;
                      } else {
                        int discarded$14 = ii.b((byte) -126);
                        break L6;
                      }
                    }
                    L7: {
                      if (!cb.field_l) {
                        tn.field_z = -1;
                        hl.field_a = -1;
                        break L7;
                      } else {
                        if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                          tn.field_z = -1;
                          hl.field_a = -1;
                          break L7;
                        } else {
                          l.field_a = 0;
                          cb.field_l = false;
                          tn.field_z = -1;
                          hl.field_a = -1;
                          break L7;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L8: {
                L9: {
                  if (cb.field_l) {
                    break L9;
                  } else {
                    if ((l.field_a ^ -1) > (um.field_h ^ -1)) {
                      break L9;
                    } else {
                      if (l.field_a >= br.field_a + um.field_h) {
                        break L9;
                      } else {
                        stackOut_34_0 = 1;
                        stackIn_36_0 = stackOut_34_0;
                        break L8;
                      }
                    }
                  }
                }
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L8;
              }
              L10: {
                var2 = stackIn_36_0;
                if (param1 == null) {
                  l.field_a = 0;
                  break L10;
                } else {
                  if (cb.field_l) {
                    l.field_a = um.field_h;
                    break L10;
                  } else {
                    if (var2 != 0) {
                      l.field_a = um.field_h;
                      break L10;
                    } else {
                      l.field_a = 0;
                      break L10;
                    }
                  }
                }
              }
              L11: {
                tf.field_Db = hl.field_a;
                bl.field_c = tn.field_z;
                if (param1 == null) {
                  if (var2 == 0) {
                    break L11;
                  } else {
                    cb.field_l = true;
                    break L11;
                  }
                } else {
                  cb.field_l = false;
                  break L11;
                }
              }
              L12: {
                kg.field_k = param1;
                if (cb.field_l) {
                  break L12;
                } else {
                  if (um.field_h <= l.field_a) {
                    break L12;
                  } else {
                    if (!wc.field_J) {
                      break L12;
                    } else {
                      l.field_a = 0;
                      bl.field_c = tn.field_z;
                      tf.field_Db = hl.field_a;
                      break L12;
                    }
                  }
                }
              }
              L13: {
                if (param0 == -16898) {
                  break L13;
                } else {
                  int discarded$15 = ii.b((byte) -126);
                  break L13;
                }
              }
              L14: {
                if (!cb.field_l) {
                  tn.field_z = -1;
                  hl.field_a = -1;
                  break L14;
                } else {
                  if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                    tn.field_z = -1;
                    hl.field_a = -1;
                    break L14;
                  } else {
                    l.field_a = 0;
                    cb.field_l = false;
                    tn.field_z = -1;
                    hl.field_a = -1;
                    break L14;
                  }
                }
              }
              return;
            }
          }
        }
        L15: {
          l.field_a = l.field_a + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) kg.field_k)) {
              break L15;
            } else {
              L16: {
                kg.field_k = param1;
                if (cb.field_l) {
                  break L16;
                } else {
                  if (um.field_h <= l.field_a) {
                    break L16;
                  } else {
                    if (!wc.field_J) {
                      break L16;
                    } else {
                      l.field_a = 0;
                      bl.field_c = tn.field_z;
                      tf.field_Db = hl.field_a;
                      if (param0 == -16898) {
                        L17: {
                          if (!cb.field_l) {
                            break L17;
                          } else {
                            if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                              break L17;
                            } else {
                              l.field_a = 0;
                              cb.field_l = false;
                              tn.field_z = -1;
                              hl.field_a = -1;
                              return;
                            }
                          }
                        }
                        tn.field_z = -1;
                        hl.field_a = -1;
                        return;
                      } else {
                        L18: {
                          int discarded$16 = ii.b((byte) -126);
                          if (!cb.field_l) {
                            break L18;
                          } else {
                            if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                              break L18;
                            } else {
                              l.field_a = 0;
                              cb.field_l = false;
                              break L18;
                            }
                          }
                        }
                        tn.field_z = -1;
                        hl.field_a = -1;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == -16898) {
                L19: {
                  if (!cb.field_l) {
                    break L19;
                  } else {
                    if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                      break L19;
                    } else {
                      l.field_a = 0;
                      cb.field_l = false;
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    }
                  }
                }
                tn.field_z = -1;
                hl.field_a = -1;
                return;
              } else {
                L20: {
                  int discarded$17 = ii.b((byte) -126);
                  if (!cb.field_l) {
                    break L20;
                  } else {
                    if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                      break L20;
                    } else {
                      l.field_a = 0;
                      cb.field_l = false;
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    }
                  }
                }
                tn.field_z = -1;
                hl.field_a = -1;
                return;
              }
            }
          } else {
            if (null == kg.field_k) {
              break L15;
            } else {
              L21: {
                kg.field_k = param1;
                if (cb.field_l) {
                  break L21;
                } else {
                  if (um.field_h <= l.field_a) {
                    break L21;
                  } else {
                    if (!wc.field_J) {
                      break L21;
                    } else {
                      l.field_a = 0;
                      bl.field_c = tn.field_z;
                      tf.field_Db = hl.field_a;
                      if (param0 == -16898) {
                        L22: {
                          if (!cb.field_l) {
                            break L22;
                          } else {
                            if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                              break L22;
                            } else {
                              l.field_a = 0;
                              cb.field_l = false;
                              tn.field_z = -1;
                              hl.field_a = -1;
                              return;
                            }
                          }
                        }
                        tn.field_z = -1;
                        hl.field_a = -1;
                        return;
                      } else {
                        L23: {
                          int discarded$18 = ii.b((byte) -126);
                          if (!cb.field_l) {
                            break L23;
                          } else {
                            if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                              break L23;
                            } else {
                              l.field_a = 0;
                              cb.field_l = false;
                              break L23;
                            }
                          }
                        }
                        tn.field_z = -1;
                        hl.field_a = -1;
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 == -16898) {
                L24: {
                  if (!cb.field_l) {
                    break L24;
                  } else {
                    if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                      break L24;
                    } else {
                      l.field_a = 0;
                      cb.field_l = false;
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    }
                  }
                }
                tn.field_z = -1;
                hl.field_a = -1;
                return;
              } else {
                L25: {
                  int discarded$19 = ii.b((byte) -126);
                  if (!cb.field_l) {
                    break L25;
                  } else {
                    if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                      break L25;
                    } else {
                      l.field_a = 0;
                      cb.field_l = false;
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    }
                  }
                }
                tn.field_z = -1;
                hl.field_a = -1;
                return;
              }
            }
          }
        }
        L26: {
          L27: {
            if (cb.field_l) {
              break L27;
            } else {
              if ((l.field_a ^ -1) > (um.field_h ^ -1)) {
                break L27;
              } else {
                if (l.field_a >= br.field_a + um.field_h) {
                  break L27;
                } else {
                  stackOut_110_0 = 1;
                  stackIn_112_0 = stackOut_110_0;
                  break L26;
                }
              }
            }
          }
          stackOut_111_0 = 0;
          stackIn_112_0 = stackOut_111_0;
          break L26;
        }
        L28: {
          var2 = stackIn_112_0;
          if (param1 == null) {
            l.field_a = 0;
            break L28;
          } else {
            if (cb.field_l) {
              l.field_a = um.field_h;
              break L28;
            } else {
              if (var2 != 0) {
                L29: {
                  l.field_a = um.field_h;
                  tf.field_Db = hl.field_a;
                  bl.field_c = tn.field_z;
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L29;
                    } else {
                      cb.field_l = true;
                      break L29;
                    }
                  } else {
                    cb.field_l = false;
                    break L29;
                  }
                }
                L30: {
                  kg.field_k = param1;
                  if (cb.field_l) {
                    break L30;
                  } else {
                    if (um.field_h <= l.field_a) {
                      break L30;
                    } else {
                      if (!wc.field_J) {
                        break L30;
                      } else {
                        l.field_a = 0;
                        bl.field_c = tn.field_z;
                        tf.field_Db = hl.field_a;
                        break L30;
                      }
                    }
                  }
                }
                L31: {
                  if (param0 == -16898) {
                    break L31;
                  } else {
                    int discarded$20 = ii.b((byte) -126);
                    break L31;
                  }
                }
                L32: {
                  if (!cb.field_l) {
                    break L32;
                  } else {
                    if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                      break L32;
                    } else {
                      l.field_a = 0;
                      cb.field_l = false;
                      break L32;
                    }
                  }
                }
                tn.field_z = -1;
                hl.field_a = -1;
                return;
              } else {
                l.field_a = 0;
                break L28;
              }
            }
          }
        }
        tf.field_Db = hl.field_a;
        bl.field_c = tn.field_z;
        if (param1 == null) {
          if (var2 == 0) {
            L33: {
              kg.field_k = param1;
              if (cb.field_l) {
                break L33;
              } else {
                if (um.field_h <= l.field_a) {
                  break L33;
                } else {
                  if (!wc.field_J) {
                    break L33;
                  } else {
                    l.field_a = 0;
                    bl.field_c = tn.field_z;
                    tf.field_Db = hl.field_a;
                    if (param0 == -16898) {
                      L34: {
                        if (!cb.field_l) {
                          break L34;
                        } else {
                          if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                            break L34;
                          } else {
                            l.field_a = 0;
                            cb.field_l = false;
                            tn.field_z = -1;
                            hl.field_a = -1;
                            return;
                          }
                        }
                      }
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    } else {
                      L35: {
                        int discarded$21 = ii.b((byte) -126);
                        if (!cb.field_l) {
                          break L35;
                        } else {
                          if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                            break L35;
                          } else {
                            l.field_a = 0;
                            cb.field_l = false;
                            break L35;
                          }
                        }
                      }
                      tn.field_z = -1;
                      hl.field_a = -1;
                      return;
                    }
                  }
                }
              }
            }
            if (param0 == -16898) {
              L36: {
                if (!cb.field_l) {
                  break L36;
                } else {
                  if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                    break L36;
                  } else {
                    l.field_a = 0;
                    cb.field_l = false;
                    tn.field_z = -1;
                    hl.field_a = -1;
                    return;
                  }
                }
              }
              tn.field_z = -1;
              hl.field_a = -1;
              return;
            } else {
              L37: {
                int discarded$22 = ii.b((byte) -126);
                if (!cb.field_l) {
                  break L37;
                } else {
                  if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                    break L37;
                  } else {
                    l.field_a = 0;
                    cb.field_l = false;
                    tn.field_z = -1;
                    hl.field_a = -1;
                    return;
                  }
                }
              }
              tn.field_z = -1;
              hl.field_a = -1;
              return;
            }
          } else {
            L38: {
              cb.field_l = true;
              kg.field_k = param1;
              if (cb.field_l) {
                break L38;
              } else {
                if (um.field_h <= l.field_a) {
                  break L38;
                } else {
                  if (!wc.field_J) {
                    break L38;
                  } else {
                    L39: {
                      l.field_a = 0;
                      bl.field_c = tn.field_z;
                      tf.field_Db = hl.field_a;
                      if (param0 == -16898) {
                        break L39;
                      } else {
                        int discarded$23 = ii.b((byte) -126);
                        break L39;
                      }
                    }
                    L40: {
                      if (!cb.field_l) {
                        break L40;
                      } else {
                        if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                          break L40;
                        } else {
                          l.field_a = 0;
                          cb.field_l = false;
                          break L40;
                        }
                      }
                    }
                    tn.field_z = -1;
                    hl.field_a = -1;
                    return;
                  }
                }
              }
            }
            if (param0 == -16898) {
              L41: {
                if (!cb.field_l) {
                  break L41;
                } else {
                  if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                    break L41;
                  } else {
                    l.field_a = 0;
                    cb.field_l = false;
                    tn.field_z = -1;
                    hl.field_a = -1;
                    return;
                  }
                }
              }
              tn.field_z = -1;
              hl.field_a = -1;
              return;
            } else {
              L42: {
                int discarded$24 = ii.b((byte) -126);
                if (!cb.field_l) {
                  break L42;
                } else {
                  if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                    break L42;
                  } else {
                    l.field_a = 0;
                    cb.field_l = false;
                    break L42;
                  }
                }
              }
              tn.field_z = -1;
              hl.field_a = -1;
              return;
            }
          }
        } else {
          L43: {
            cb.field_l = false;
            kg.field_k = param1;
            if (cb.field_l) {
              break L43;
            } else {
              if (um.field_h <= l.field_a) {
                break L43;
              } else {
                if (!wc.field_J) {
                  break L43;
                } else {
                  l.field_a = 0;
                  bl.field_c = tn.field_z;
                  tf.field_Db = hl.field_a;
                  break L43;
                }
              }
            }
          }
          L44: {
            if (param0 == -16898) {
              break L44;
            } else {
              int discarded$25 = ii.b((byte) -126);
              break L44;
            }
          }
          L45: {
            if (!cb.field_l) {
              break L45;
            } else {
              if ((ti.field_I ^ -1) != (l.field_a ^ -1)) {
                break L45;
              } else {
                l.field_a = 0;
                cb.field_l = false;
                break L45;
              }
            }
          }
          tn.field_z = -1;
          hl.field_a = -1;
          return;
        }
    }

    final static int b(byte param0) {
        int var1 = 96 / ((param0 - -12) / 33);
        return pl.field_F;
    }

    final int b(long param0, boolean param1) {
        long var4 = ((ii) this).a((byte) -64);
        if (param1) {
            field_b = null;
            if (0L >= var4) {
                return ((ii) this).a(param0, true);
            }
            vd.a(false, var4);
            return ((ii) this).a(param0, true);
        }
        if (0L < var4) {
            vd.a(false, var4);
            return ((ii) this).a(param0, true);
        }
        return ((ii) this).a(param0, true);
    }

    final static void a(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(126, 1);
        var2.a(-24, 0);
        if (param1 != -1) {
            ii.a(64, (byte) 88, -76, (String) null, 34L);
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<br><br>";
    }
}
