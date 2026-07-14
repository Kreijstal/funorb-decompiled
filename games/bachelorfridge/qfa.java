/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfa extends cga {
    lu field_v;
    int field_u;
    static String field_w;
    byte field_s;
    static String field_t;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          var2 = param1.length();
          if (-21 > (var2 ^ -1)) {
            var2 = 20;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 20) {
          var11 = new char[var2];
          var9 = var11;
          var8 = var9;
          var7 = var8;
          var3 = var7;
          var4 = 0;
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (65 > var5) {
              if (var5 < 97) {
                if (var5 >= 48) {
                  if (var5 > 57) {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var11);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                }
              } else {
                if (var5 > 122) {
                  L1: {
                    L2: {
                      if (var5 < 48) {
                        break L2;
                      } else {
                        if (var5 <= 57) {
                          var3[var4] = (char)var5;
                          var4++;
                          var4++;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    break L1;
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var11);
                }
              }
            } else {
              if (var5 > 90) {
                L3: {
                  L4: {
                    L5: {
                      if (var5 < 97) {
                        break L5;
                      } else {
                        if (var5 <= 122) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 48) {
                        break L6;
                      } else {
                        if (var5 <= 57) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    break L3;
                  }
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  break L3;
                }
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var11);
              } else {
                var3[var4] = (char)(97 + (-65 + var5));
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var11);
              }
            }
          } else {
            return new String(var11);
          }
        } else {
          qfa.i(-118);
          var12 = new char[var2];
          var10 = var12;
          var8 = var10;
          var7 = var8;
          var3 = var7;
          var4 = 0;
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (65 > var5) {
              if (var5 < 97) {
                if (var5 >= 48) {
                  if (var5 > 57) {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var12);
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var12);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              } else {
                if (var5 > 122) {
                  if (var5 >= 48) {
                    if (var5 <= 57) {
                      var3[var4] = (char)var5;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var12);
                    } else {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var12);
                    }
                  } else {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var12);
                  }
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              }
            } else {
              if (var5 > 90) {
                if (var5 >= 97) {
                  if (var5 > 122) {
                    if (var5 >= 48) {
                      if (var5 <= 57) {
                        var3[var4] = (char)var5;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var12);
                      } else {
                        var3[var4] = (char)95;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var12);
                      }
                    } else {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var12);
                    }
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var12);
                  }
                } else {
                  L7: {
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 <= 57) {
                          var3[var4] = (char)var5;
                          var4++;
                          var4++;
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    var4++;
                    break L7;
                  }
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var12);
                }
              } else {
                var3[var4] = (char)(97 + (-65 + var5));
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var12);
              }
            }
          } else {
            return new String(var12);
          }
        }
    }

    final int e(int param0) {
        if (((qfa) this).field_v != null) {
          if (param0 != -6298) {
            field_w = null;
            return ((qfa) this).field_v.field_g * 100 / (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length);
          } else {
            return ((qfa) this).field_v.field_g * 100 / (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length);
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qc.field_b.field_Z = param5;
        if (2 != gk.field_d) {
          qq.field_k.field_Z = ro.field_k;
          var9 = 495;
          var10 = 5;
          aja.field_p.a(param4, 31407, -10 + var9, 5, var10);
          jba.field_A.a(param4, 31407, aja.field_p.field_sb - ts.field_r.field_sb, 0, 0);
          var10 = var10 + (param4 - -param0);
          ts.field_r.a(param4, 31407, ts.field_r.field_sb, jba.field_A.field_sb, 0);
          ub.field_k.a(param1, 31407, ub.field_k.e(-1), 5, var10);
          var11 = qq.field_k.e(-1);
          qq.field_k.a(param1, 31407, var11, -var11 + (var9 - 5), var10);
          var12 = param1 + (var10 - -5);
          qc.field_b.a(param8, 31407, var9, 0, 0);
          tga.field_m.a(var12, 31407, var9, 0, param8);
          if (param3 <= -114) {
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + param8;
            bi.field_h.a(var12, 31407, var9, param2 + -(var9 / 2), -(var12 / 2) + param6);
            return;
          } else {
            field_w = null;
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + param8;
            bi.field_h.a(var12, 31407, var9, param2 + -(var9 / 2), -(var12 / 2) + param6);
            return;
          }
        } else {
          qq.field_k.field_Z = ru.field_l;
          var9 = 495;
          var10 = 5;
          aja.field_p.a(param4, 31407, -10 + var9, 5, var10);
          jba.field_A.a(param4, 31407, aja.field_p.field_sb - ts.field_r.field_sb, 0, 0);
          var10 = var10 + (param4 - -param0);
          ts.field_r.a(param4, 31407, ts.field_r.field_sb, jba.field_A.field_sb, 0);
          ub.field_k.a(param1, 31407, ub.field_k.e(-1), 5, var10);
          var11 = qq.field_k.e(-1);
          qq.field_k.a(param1, 31407, var11, -var11 + (var9 - 5), var10);
          var12 = param1 + (var10 - -5);
          qc.field_b.a(param8, 31407, var9, 0, 0);
          tga.field_m.a(var12, 31407, var9, 0, param8);
          if (param3 <= -114) {
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + param8;
            bi.field_h.a(var12, 31407, var9, param2 + -(var9 / 2), -(var12 / 2) + param6);
            return;
          } else {
            field_w = null;
            tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
            var12 = var12 + param8;
            bi.field_h.a(var12, 31407, var9, param2 + -(var9 / 2), -(var12 / 2) + param6);
            return;
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                if (param1 >= -18) {
                    field_t = null;
                }
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (var3 >= 0) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(ow.a(var5, (byte) -107, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qfa() {
    }

    final static String a(int param0, String param1, int param2) {
        Object var4 = null;
        if (param0 == 3) {
          return lda.field_d;
        } else {
          if (param2 < -75) {
            if (param0 == -7) {
              return ed.field_c;
            } else {
              if (-8 != param0) {
                if (-9 == param0) {
                  return hr.field_e;
                } else {
                  if (-10 != param0) {
                    if (-11 == param0) {
                      return wm.field_l;
                    } else {
                      if (-12 != param0) {
                        if (param0 != 14) {
                          return null;
                        } else {
                          return lga.a(true, new String[1], vfa.field_r);
                        }
                      } else {
                        return nla.field_e;
                      }
                    }
                  } else {
                    return bm.field_m;
                  }
                }
              } else {
                return vc.field_b;
              }
            }
          } else {
            var4 = null;
            qfa.a(1, -126, -56, (byte) -48, -64, (String) null, -14, 77, -120);
            if (param0 == -7) {
              return ed.field_c;
            } else {
              if (-8 != param0) {
                if (-9 == param0) {
                  return hr.field_e;
                } else {
                  if (-10 != param0) {
                    if (-11 == param0) {
                      return wm.field_l;
                    } else {
                      if (-12 != param0) {
                        if (param0 != 14) {
                          return null;
                        } else {
                          return lga.a(true, new String[1], vfa.field_r);
                        }
                      } else {
                        return nla.field_e;
                      }
                    }
                  } else {
                    return bm.field_m;
                  }
                }
              } else {
                return vc.field_b;
              }
            }
          }
        }
    }

    public static void g(int param0) {
        field_w = null;
        if (param0 != 97) {
            return;
        }
        field_t = null;
    }

    final static void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        bga var4_ref_bga = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        fm var9 = null;
        pf var10 = null;
        byte[] var14 = null;
        var6 = BachelorFridge.field_y;
        var10 = ig.field_m;
        var2 = var10.b(16711935);
        if (param0 < -44) {
          if (0 == var2) {
            var9 = (fm) (Object) us.field_e.b((byte) 90);
            if (var9 == null) {
              vc.a((byte) -118);
              return;
            } else {
              L0: {
                var4 = var10.b(16711935);
                if (0 == var4) {
                  var5 = null;
                  break L0;
                } else {
                  var14 = new byte[var4];
                  var10.a(var14, var4, 128, 0);
                  break L0;
                }
              }
              var10.field_g = var10.field_g + 4;
              if (!var10.j(4)) {
                vc.a((byte) -124);
                return;
              } else {
                var9.a(false);
                return;
              }
            }
          } else {
            if (-2 == (var2 ^ -1)) {
              var3 = var10.f(-108);
              var4_ref_bga = (bga) (Object) on.field_r.b((byte) 90);
              L1: while (true) {
                if (var4_ref_bga == null) {
                  if (var4_ref_bga == null) {
                    vc.a((byte) -80);
                    return;
                  } else {
                    var4_ref_bga.a(false);
                    return;
                  }
                } else {
                  if (var4_ref_bga.field_i != var3) {
                    var4_ref_bga = (bga) (Object) on.field_r.c(0);
                    continue L1;
                  } else {
                    if (var4_ref_bga == null) {
                      vc.a((byte) -80);
                      return;
                    } else {
                      var4_ref_bga.a(false);
                      return;
                    }
                  }
                }
              }
            } else {
              cv.a(1, "A1: " + nia.d((byte) -108), (Throwable) null);
              vc.a((byte) -115);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static void i(int param0) {
        pf var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 != 8) {
          field_t = null;
          var1 = sja.field_fb;
          L0: while (true) {
            if (!tg.c(-43)) {
              return;
            } else {
              var1.c(8, (byte) 119);
              var1.field_g = var1.field_g + 1;
              var2 = var1.field_g + 1;
              sia.a(var1, 108);
              sja.field_fb.b((byte) -68, var1.field_g - var2);
              continue L0;
            }
          }
        } else {
          var1 = sja.field_fb;
          L1: while (true) {
            if (!tg.c(-43)) {
              return;
            } else {
              var1.c(8, (byte) 119);
              var1.field_g = var1.field_g + 1;
              var2 = var1.field_g + 1;
              sia.a(var1, 108);
              sja.field_fb.b((byte) -68, var1.field_g - var2);
              continue L1;
            }
          }
        }
    }

    final static void f(int param0) {
        qi.field_b = new ue();
        kka.field_l.e((wj) (Object) qi.field_b, 33);
        int var1 = -78 / ((param0 - 45) / 53);
    }

    final byte[] d(byte param0) {
        if (!((qfa) this).field_n) {
          if (-((qfa) this).field_s + ((qfa) this).field_v.field_h.length <= ((qfa) this).field_v.field_g) {
            if (param0 != -65) {
              qfa.i(1);
              return ((qfa) this).field_v.field_h;
            } else {
              return ((qfa) this).field_v.field_h;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          throw new RuntimeException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "***Ignored!***";
        field_t = "Player";
    }
}
