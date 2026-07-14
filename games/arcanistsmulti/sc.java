/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ej {
    private qb field_Y;
    static String field_S;
    static aj field_W;
    private int field_X;
    private pd field_J;
    private String field_ab;
    static String field_Z;
    static int[] field_U;
    static boolean field_V;
    static String field_T;
    static String field_bb;

    final void a(byte param0, int param1, int param2, int param3) {
        String var5 = null;
        eh var6 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qb var16 = null;
        String var17 = null;
        Object var18 = null;
        qb var19 = null;
        qb var20 = null;
        qb var21 = null;
        Object var22 = null;
        qb var23 = null;
        qb var24 = null;
        qb var29 = null;
        qb var30 = null;
        Object var31 = null;
        qb var32 = null;
        qb var33 = null;
        qb var34 = null;
        ac var35 = null;
        ac var36 = null;
        ac var37 = null;
        var18 = null;
        var22 = null;
        var31 = null;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        var6 = ((sc) this).field_J.a(-92);
        if (da.field_f != var6) {
          L0: {
            if (ug.field_c != var6) {
              var5 = ((sc) this).field_J.c(26146);
              if (var5 == null) {
                var5 = ((sc) this).field_ab;
                break L0;
              } else {
                break L0;
              }
            } else {
              var5 = ea.field_D;
              break L0;
            }
          }
          L1: {
            if (!var5.equals((Object) (Object) ((sc) this).field_g)) {
              ((sc) this).field_g = var5;
              ((sc) this).g((byte) 63);
              break L1;
            } else {
              break L1;
            }
          }
          this.a((byte) -58, param1, param2, param3);
          if (param0 > -52) {
            L2: {
              ((sc) this).field_Y = null;
              var6 = ((sc) this).field_J.a(-103);
              var37 = (ac) (Object) ((sc) this).field_r;
              var9 = ((sc) this).field_n + param1;
              var10 = var37.a(param3, -13372, (qm) this) - -(var37.a((qm) this, -126).a((byte) -58) >> 989263425);
              if (da.field_f == var6) {
                break L2;
              } else {
                if (ug.field_c == var6) {
                  break L2;
                } else {
                  if (var6 != ra.field_k) {
                    if (nn.field_s == var6) {
                      var33 = qk.field_lb[1];
                      var33.b(var9, var10 + -(var33.field_y >> 173809409), 256);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    var32 = qk.field_lb[2];
                    var32.b(var9, var10 + -(var32.field_y >> 1648690241), 256);
                    return;
                  }
                }
              }
            }
            var34 = qk.field_lb[0];
            var11 = var34.field_n << -1745026975;
            var12 = var34.field_w << 1688508545;
            if (null != ((sc) this).field_Y) {
              if (var11 <= ((sc) this).field_Y.field_q) {
                if (((sc) this).field_Y.field_y < var12) {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var34.b(112, 144, var34.field_n << 2097852004, var34.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var34.field_n >> -1820432991) + var9, var10 + -var34.field_w, 256);
                  return;
                } else {
                  fk.a(((sc) this).field_Y, -23095);
                  de.b();
                  var34.b(112, 144, var34.field_n << 2097852004, var34.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var34.field_n >> -1820432991) + var9, var10 + -var34.field_w, 256);
                  return;
                }
              } else {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var34.b(112, 144, var34.field_n << 2097852004, var34.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var34.field_n >> -1820432991) + var9, var10 + -var34.field_w, 256);
                return;
              }
            } else {
              ((sc) this).field_Y = new qb(var11, var12);
              fk.a(((sc) this).field_Y, -23095);
              var34.b(112, 144, var34.field_n << 2097852004, var34.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
              oo.c(-15405);
              ((sc) this).field_Y.b(-(var34.field_n >> -1820432991) + var9, var10 + -var34.field_w, 256);
              return;
            }
          } else {
            var6 = ((sc) this).field_J.a(-103);
            var36 = (ac) (Object) ((sc) this).field_r;
            var9 = ((sc) this).field_n + param1;
            var10 = var36.a(param3, -13372, (qm) this) - -(var36.a((qm) this, -126).a((byte) -58) >> 989263425);
            if (da.field_f != var6) {
              if (ug.field_c != var6) {
                if (var6 != ra.field_k) {
                  if (nn.field_s == var6) {
                    var30 = qk.field_lb[1];
                    var30.b(var9, var10 + -(var30.field_y >> 173809409), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var29 = qk.field_lb[2];
                  var29.b(var9, var10 + -(var29.field_y >> 1648690241), 256);
                  return;
                }
              } else {
                var24 = qk.field_lb[0];
                var16 = var24;
                var11 = var24.field_n << -1745026975;
                var12 = var24.field_w << 1688508545;
                if (null != ((sc) this).field_Y) {
                  if (var11 <= ((sc) this).field_Y.field_q) {
                    if (((sc) this).field_Y.field_y >= var12) {
                      fk.a(((sc) this).field_Y, -23095);
                      de.b();
                      var24.b(112, 144, var24.field_n << 2097852004, var24.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                      oo.c(-15405);
                      ((sc) this).field_Y.b(-(var24.field_n >> -1820432991) + var9, var10 + -var24.field_w, 256);
                      return;
                    } else {
                      ((sc) this).field_Y = new qb(var11, var12);
                      fk.a(((sc) this).field_Y, -23095);
                      var24.b(112, 144, var24.field_n << 2097852004, var24.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                      oo.c(-15405);
                      ((sc) this).field_Y.b(-(var24.field_n >> -1820432991) + var9, var10 + -var24.field_w, 256);
                      return;
                    }
                  } else {
                    ((sc) this).field_Y = new qb(var11, var12);
                    fk.a(((sc) this).field_Y, -23095);
                    var24.b(112, 144, var24.field_n << 2097852004, var24.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var24.field_n >> -1820432991) + var9, var10 + -var24.field_w, 256);
                    return;
                  }
                } else {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var24.b(112, 144, var24.field_n << 2097852004, var24.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var24.field_n >> -1820432991) + var9, var10 + -var24.field_w, 256);
                  return;
                }
              }
            } else {
              var23 = qk.field_lb[0];
              var11 = var23.field_n << -1745026975;
              var12 = var23.field_w << 1688508545;
              if (null != ((sc) this).field_Y) {
                if (var11 <= ((sc) this).field_Y.field_q) {
                  if (((sc) this).field_Y.field_y < var12) {
                    ((sc) this).field_Y = new qb(var11, var12);
                    fk.a(((sc) this).field_Y, -23095);
                    var23.b(112, 144, var23.field_n << 2097852004, var23.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var23.field_n >> -1820432991) + var9, var10 + -var23.field_w, 256);
                    return;
                  } else {
                    fk.a(((sc) this).field_Y, -23095);
                    de.b();
                    var23.b(112, 144, var23.field_n << 2097852004, var23.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                    oo.c(-15405);
                    ((sc) this).field_Y.b(-(var23.field_n >> -1820432991) + var9, var10 + -var23.field_w, 256);
                    return;
                  }
                } else {
                  ((sc) this).field_Y = new qb(var11, var12);
                  fk.a(((sc) this).field_Y, -23095);
                  var23.b(112, 144, var23.field_n << 2097852004, var23.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                  oo.c(-15405);
                  ((sc) this).field_Y.b(-(var23.field_n >> -1820432991) + var9, var10 + -var23.field_w, 256);
                  return;
                }
              } else {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var23.b(112, 144, var23.field_n << 2097852004, var23.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var23.field_n >> -1820432991) + var9, var10 + -var23.field_w, 256);
                return;
              }
            }
          }
        } else {
          L3: {
            var17 = ea.field_D;
            if (!var17.equals((Object) (Object) ((sc) this).field_g)) {
              ((sc) this).field_g = var17;
              ((sc) this).g((byte) 63);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            this.a((byte) -58, param1, param2, param3);
            if (param0 <= -52) {
              break L4;
            } else {
              ((sc) this).field_Y = null;
              break L4;
            }
          }
          L5: {
            var6 = ((sc) this).field_J.a(-103);
            var35 = (ac) (Object) ((sc) this).field_r;
            var9 = ((sc) this).field_n + param1;
            var10 = var35.a(param3, -13372, (qm) this) - -(var35.a((qm) this, -126).a((byte) -58) >> 989263425);
            if (da.field_f == var6) {
              break L5;
            } else {
              if (ug.field_c == var6) {
                break L5;
              } else {
                if (var6 != ra.field_k) {
                  if (nn.field_s != var6) {
                    return;
                  } else {
                    var20 = qk.field_lb[1];
                    var20.b(var9, var10 + -(var20.field_y >> 173809409), 256);
                    return;
                  }
                } else {
                  var19 = qk.field_lb[2];
                  var19.b(var9, var10 + -(var19.field_y >> 1648690241), 256);
                  return;
                }
              }
            }
          }
          var21 = qk.field_lb[0];
          var11 = var21.field_n << -1745026975;
          var12 = var21.field_w << 1688508545;
          if (null != ((sc) this).field_Y) {
            if (var11 <= ((sc) this).field_Y.field_q) {
              if (((sc) this).field_Y.field_y < var12) {
                ((sc) this).field_Y = new qb(var11, var12);
                fk.a(((sc) this).field_Y, -23095);
                var21.b(112, 144, var21.field_n << 2097852004, var21.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var21.field_n >> -1820432991) + var9, var10 + -var21.field_w, 256);
                return;
              } else {
                fk.a(((sc) this).field_Y, -23095);
                de.b();
                var21.b(112, 144, var21.field_n << 2097852004, var21.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
                oo.c(-15405);
                ((sc) this).field_Y.b(-(var21.field_n >> -1820432991) + var9, var10 + -var21.field_w, 256);
                return;
              }
            } else {
              ((sc) this).field_Y = new qb(var11, var12);
              fk.a(((sc) this).field_Y, -23095);
              var21.b(112, 144, var21.field_n << 2097852004, var21.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
              oo.c(-15405);
              ((sc) this).field_Y.b(-(var21.field_n >> -1820432991) + var9, var10 + -var21.field_w, 256);
              return;
            }
          } else {
            ((sc) this).field_Y = new qb(var11, var12);
            fk.a(((sc) this).field_Y, -23095);
            var21.b(112, 144, var21.field_n << 2097852004, var21.field_w << 178682916, -((sc) this).field_X << -1879041910, 4096);
            oo.c(-15405);
            ((sc) this).field_Y.b(-(var21.field_n >> -1820432991) + var9, var10 + -var21.field_w, 256);
            return;
          }
        }
    }

    private final static void c(boolean param0) {
        if (!param0) {
            return;
        }
        q.a(pg.field_c, false, be.field_l, mf.field_d, am.field_c);
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        Object var4 = null;
        j.a(param2, (String) null, param0, param1);
    }

    final static String a(byte param0, byte[] param1) {
        if (param0 < 85) {
            return null;
        }
        return ba.a(0, param1.length, (byte) -127, param1);
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 14130) {
          var2 = 0;
          var3 = gi.field_a;
          if ((var3 ^ -1) <= -6) {
            if (-106 >= (var3 ^ -1)) {
              if (120 > var3) {
                L0: {
                  var3 = -var3 + 120;
                  var2 = -(8192 * var3 * var3 / 3300) + 8192;
                  var4 = 1;
                  var5 = 0;
                  if (3 != param0) {
                    break L0;
                  } else {
                    var4 = -1;
                    break L0;
                  }
                }
                L1: {
                  if (param0 == 1) {
                    var5 = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (4 != param0) {
                    break L2;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L2;
                  }
                }
                L3: {
                  if ((param0 ^ -1) != -6) {
                    break L3;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L3;
                  }
                }
                L4: {
                  if (param0 != -7) {
                    break L4;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L4;
                  }
                }
                if (7 != param0) {
                  if (8 == param0) {
                    L5: {
                      var4 = -1;
                      var5 = -1;
                      if (-12 == (param0 ^ -1)) {
                        var4 = -1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if ((param0 ^ -1) == -13) {
                        var4 = -1;
                        var5 = -1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if ((param0 ^ -1) != -14) {
                        break L7;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      if (param0 != -15) {
                        break L8;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L8;
                      }
                    }
                    L9: {
                      if (-16 != param0) {
                        break L9;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L9;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  } else {
                    L10: {
                      if (-12 == (param0 ^ -1)) {
                        var4 = -1;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if ((param0 ^ -1) == -13) {
                        var4 = -1;
                        var5 = -1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if ((param0 ^ -1) != -14) {
                        break L12;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L12;
                      }
                    }
                    L13: {
                      if (param0 != -15) {
                        break L13;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L13;
                      }
                    }
                    L14: {
                      if (-16 != param0) {
                        break L14;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L14;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  }
                } else {
                  L15: {
                    var4 = -1;
                    var5 = -1;
                    if (-12 == param0) {
                      var4 = -1;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((param0 ^ -1) == -13) {
                      var4 = -1;
                      var5 = -1;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if ((param0 ^ -1) != -14) {
                      break L17;
                    } else {
                      var5 = -1;
                      var4 = 1;
                      break L17;
                    }
                  }
                  L18: {
                    if (param0 != -15) {
                      break L18;
                    } else {
                      var4 = -1;
                      var5 = 1;
                      break L18;
                    }
                  }
                  L19: {
                    if (-16 != param0) {
                      break L19;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      break L19;
                    }
                  }
                  tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                  return;
                }
              } else {
                L20: {
                  var4 = 1;
                  var5 = 0;
                  if (3 != param0) {
                    break L20;
                  } else {
                    var4 = -1;
                    break L20;
                  }
                }
                L21: {
                  if (param0 == 1) {
                    var5 = 1;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (4 != param0) {
                    break L22;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L22;
                  }
                }
                L23: {
                  if ((param0 ^ -1) != -6) {
                    break L23;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L23;
                  }
                }
                L24: {
                  if (param0 != -7) {
                    break L24;
                  } else {
                    var4 = 1;
                    var5 = -1;
                    break L24;
                  }
                }
                if (7 != param0) {
                  if (8 == param0) {
                    L25: {
                      var4 = -1;
                      var5 = -1;
                      if (-12 == (param0 ^ -1)) {
                        var4 = -1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if ((param0 ^ -1) == -13) {
                        var4 = -1;
                        var5 = -1;
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if ((param0 ^ -1) != -14) {
                        break L27;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L27;
                      }
                    }
                    L28: {
                      if (param0 != -15) {
                        break L28;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L28;
                      }
                    }
                    L29: {
                      if (-16 != param0) {
                        break L29;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L29;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  } else {
                    L30: {
                      if (-12 == (param0 ^ -1)) {
                        var4 = -1;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                    L31: {
                      if ((param0 ^ -1) == -13) {
                        var4 = -1;
                        var5 = -1;
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    L32: {
                      if ((param0 ^ -1) != -14) {
                        break L32;
                      } else {
                        var5 = -1;
                        var4 = 1;
                        break L32;
                      }
                    }
                    L33: {
                      if (param0 != -15) {
                        break L33;
                      } else {
                        var4 = -1;
                        var5 = 1;
                        break L33;
                      }
                    }
                    L34: {
                      if (-16 != param0) {
                        break L34;
                      } else {
                        var5 = 1;
                        var4 = 1;
                        break L34;
                      }
                    }
                    tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                    return;
                  }
                } else {
                  L35: {
                    var4 = -1;
                    var5 = -1;
                    if (-12 == param0) {
                      var4 = -1;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if ((param0 ^ -1) == -13) {
                      var4 = -1;
                      var5 = -1;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  L37: {
                    if ((param0 ^ -1) != -14) {
                      break L37;
                    } else {
                      var5 = -1;
                      var4 = 1;
                      break L37;
                    }
                  }
                  L38: {
                    if (param0 != -15) {
                      break L38;
                    } else {
                      var4 = -1;
                      var5 = 1;
                      break L38;
                    }
                  }
                  L39: {
                    if (-16 != param0) {
                      break L39;
                    } else {
                      var5 = 1;
                      var4 = 1;
                      break L39;
                    }
                  }
                  tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                  return;
                }
              }
            } else {
              L40: {
                var2 = (-40960 + 16384 * var3) / 220;
                var4 = 1;
                var5 = 0;
                if (3 != param0) {
                  break L40;
                } else {
                  var4 = -1;
                  break L40;
                }
              }
              L41: {
                if (param0 == 1) {
                  var5 = 1;
                  break L41;
                } else {
                  break L41;
                }
              }
              L42: {
                if (4 != param0) {
                  break L42;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L42;
                }
              }
              L43: {
                if ((param0 ^ -1) != -6) {
                  break L43;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L43;
                }
              }
              L44: {
                if (param0 != -7) {
                  break L44;
                } else {
                  var4 = 1;
                  var5 = -1;
                  break L44;
                }
              }
              if (7 == param0) {
                L45: {
                  var4 = -1;
                  var5 = -1;
                  if (-12 == param0) {
                    var4 = -1;
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  if ((param0 ^ -1) == -13) {
                    var4 = -1;
                    var5 = -1;
                    break L46;
                  } else {
                    break L46;
                  }
                }
                L47: {
                  if ((param0 ^ -1) != -14) {
                    break L47;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L47;
                  }
                }
                L48: {
                  if (param0 != -15) {
                    break L48;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L48;
                  }
                }
                L49: {
                  if (-16 != param0) {
                    break L49;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L49;
                  }
                }
                tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                return;
              } else {
                L50: {
                  if (8 != param0) {
                    break L50;
                  } else {
                    var4 = -1;
                    var5 = -1;
                    break L50;
                  }
                }
                L51: {
                  if (-12 == (param0 ^ -1)) {
                    var4 = -1;
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  if ((param0 ^ -1) == -13) {
                    var4 = -1;
                    var5 = -1;
                    break L52;
                  } else {
                    break L52;
                  }
                }
                L53: {
                  if ((param0 ^ -1) != -14) {
                    break L53;
                  } else {
                    var5 = -1;
                    var4 = 1;
                    break L53;
                  }
                }
                L54: {
                  if (param0 != -15) {
                    break L54;
                  } else {
                    var4 = -1;
                    var5 = 1;
                    break L54;
                  }
                }
                L55: {
                  if (-16 != param0) {
                    break L55;
                  } else {
                    var5 = 1;
                    var4 = 1;
                    break L55;
                  }
                }
                tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
                return;
              }
            }
          } else {
            L56: {
              var2 = 8192 * (var3 * var3) / 1100;
              var4 = 1;
              var5 = 0;
              if (3 != param0) {
                break L56;
              } else {
                var4 = -1;
                break L56;
              }
            }
            L57: {
              if (param0 == 1) {
                var5 = 1;
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              if (4 != param0) {
                break L58;
              } else {
                var5 = 1;
                var4 = 1;
                break L58;
              }
            }
            L59: {
              if ((param0 ^ -1) != -6) {
                break L59;
              } else {
                var4 = -1;
                var5 = 1;
                break L59;
              }
            }
            L60: {
              if (param0 != -7) {
                break L60;
              } else {
                var4 = 1;
                var5 = -1;
                break L60;
              }
            }
            if (7 == param0) {
              L61: {
                var4 = -1;
                var5 = -1;
                if (-12 == param0) {
                  var4 = -1;
                  break L61;
                } else {
                  break L61;
                }
              }
              L62: {
                if ((param0 ^ -1) == -13) {
                  var4 = -1;
                  var5 = -1;
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                if ((param0 ^ -1) != -14) {
                  break L63;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L63;
                }
              }
              L64: {
                if (param0 != -15) {
                  break L64;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L64;
                }
              }
              L65: {
                if (-16 != param0) {
                  break L65;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L65;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            } else {
              L66: {
                if (8 != param0) {
                  break L66;
                } else {
                  var4 = -1;
                  var5 = -1;
                  break L66;
                }
              }
              L67: {
                if (-12 == (param0 ^ -1)) {
                  var4 = -1;
                  break L67;
                } else {
                  break L67;
                }
              }
              L68: {
                if ((param0 ^ -1) == -13) {
                  var4 = -1;
                  var5 = -1;
                  break L68;
                } else {
                  break L68;
                }
              }
              L69: {
                if ((param0 ^ -1) != -14) {
                  break L69;
                } else {
                  var5 = -1;
                  var4 = 1;
                  break L69;
                }
              }
              L70: {
                if (param0 != -15) {
                  break L70;
                } else {
                  var4 = -1;
                  var5 = 1;
                  break L70;
                }
              }
              L71: {
                if (-16 != param0) {
                  break L71;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L71;
                }
              }
              tn.field_Gb = ri.a(var2 * var5, (byte) 66, var4 * var2);
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void g(int param0) {
        Object var2 = null;
        field_Z = null;
        field_U = null;
        field_S = null;
        field_T = null;
        if (param0 != 15428) {
          var2 = null;
          String discarded$2 = sc.a((byte) -71, (byte[]) null);
          field_W = null;
          field_bb = null;
          return;
        } else {
          field_W = null;
          field_bb = null;
          return;
        }
    }

    final String b(boolean param0) {
        if (!param0) {
            return null;
        }
        field_Z = null;
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        ((sc) this).field_X = ((sc) this).field_X + 1;
        this.a(param0, param1, param2 + 0, param3);
        if (param2 != 170) {
            sc.g(-45);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 == 2) {
          if (null != pn.field_c) {
            if (pn.field_c.field_n != param2 / 2) {
              if (mn.field_r == si.field_g) {
                pn.field_c = null;
                System.gc();
                if (null == pn.field_c) {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  ql.a(param2, param1, 0);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0 + 0);
                  return;
                } else {
                  uh.a(pn.field_c, param0 + 0);
                  return;
                }
              } else {
                if (null == pn.field_c) {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  ql.a(param2, param1, 0);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0 + 0);
                  return;
                } else {
                  uh.a(pn.field_c, param0 + 0);
                  return;
                }
              }
            } else {
              if (param1 / 2 != pn.field_c.field_w) {
                L0: {
                  if (mn.field_r == si.field_g) {
                    pn.field_c = null;
                    System.gc();
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (null == pn.field_c) {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  ql.a(param2, param1, 0);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0 + 0);
                  return;
                } else {
                  uh.a(pn.field_c, param0 + 0);
                  return;
                }
              } else {
                if (null == pn.field_c) {
                  pn.field_c = new qb(param2 / 2, param1 / 2);
                  pn.field_c.a();
                  ql.a(param2, param1, 0);
                  ce.field_m.a(true);
                  uh.a(pn.field_c, param0 + 0);
                  return;
                } else {
                  uh.a(pn.field_c, param0 + 0);
                  return;
                }
              }
            }
          } else {
            if (null == pn.field_c) {
              pn.field_c = new qb(param2 / 2, param1 / 2);
              pn.field_c.a();
              ql.a(param2, param1, 0);
              ce.field_m.a(true);
              uh.a(pn.field_c, param0 + 0);
              return;
            } else {
              uh.a(pn.field_c, param0 + 0);
              return;
            }
          }
        } else {
          return;
        }
    }

    sc(pd param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (pf) (Object) cc.b((byte) -65));
        ((sc) this).field_J = param0;
        ((sc) this).field_ab = param1;
        ((sc) this).a(param5, param3, param4, param2, -83);
    }

    final static fk a(kd param0, byte param1) {
        fk var2 = null;
        var2 = new fk(param0, (pg) (Object) param0);
        qn.field_mb.b((pg) (Object) var2, -1);
        pc.field_e.b((sg) (Object) param0);
        if (param1 != 68) {
          return null;
        } else {
          return var2;
        }
    }

    final boolean a(int param0, qm param1) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final static void i(byte param0) {
        sc.c(true);
        if (param0 >= -13) {
            sc.c(true);
        }
    }

    final static int h(byte param0) {
        if (param0 != -34) {
            sc.g(-11);
            return qc.field_a;
        }
        return qc.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "Amid the witches' huts and rotten trees, Arcanists battle to control the arcane sources of magic within the swamp. Keep hidden, as the high concentration of power draws storms in from afar.";
        field_W = new aj(0, 2, 2, 1);
        field_U = new int[17];
        field_Z = "Waiting for graphics";
        field_T = "You cannot cast tower spells while flying";
        field_bb = "<%0> is already on your ignore list.";
    }
}
