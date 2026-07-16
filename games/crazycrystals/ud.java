/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends en {
    private th field_V;
    private int field_W;
    private int field_ab;
    private int field_T;
    static boolean field_U;
    static int[] field_bb;
    static int field_Z;
    static hm[] field_S;
    private qm field_X;
    private int field_R;
    private fp field_Q;
    private int field_Y;

    private final void a(int param0, qm param1) {
        if (null == ((ud) this).field_V) {
          if (param1 != null) {
            param1.a(param1.field_f, 6, ((ud) this).field_R + 6, param1.field_g, (byte) -52);
            ((ud) this).field_V = new th(param1);
            ((ud) this).b((qm) (Object) ((ud) this).field_V, param0 + 26550);
            if (param0 == -26498) {
              ((ud) this).field_X = null;
              return;
            } else {
              ((ud) this).k(103);
              ((ud) this).field_X = null;
              return;
            }
          } else {
            ((ud) this).field_V = new th();
            ((ud) this).b((qm) (Object) ((ud) this).field_V, param0 + 26550);
            if (param0 == -26498) {
              ((ud) this).field_X = null;
              return;
            } else {
              ((ud) this).k(103);
              ((ud) this).field_X = null;
              return;
            }
          }
        } else {
          ((ud) this).field_V.a(false);
          if (param1 != null) {
            param1.a(param1.field_f, 6, ((ud) this).field_R + 6, param1.field_g, (byte) -52);
            ((ud) this).field_V = new th(param1);
            ((ud) this).b((qm) (Object) ((ud) this).field_V, param0 + 26550);
            if (param0 == -26498) {
              ((ud) this).field_X = null;
              return;
            } else {
              ((ud) this).k(103);
              ((ud) this).field_X = null;
              return;
            }
          } else {
            ((ud) this).field_V = new th();
            ((ud) this).b((qm) (Object) ((ud) this).field_V, param0 + 26550);
            if (param0 == -26498) {
              ((ud) this).field_X = null;
              return;
            } else {
              ((ud) this).k(103);
              ((ud) this).field_X = null;
              return;
            }
          }
        }
    }

    final boolean e(byte param0) {
        if (param0 != 79) {
            ((ud) this).field_Q = null;
            ((ud) this).j(-1);
            return super.e((byte) 79);
        }
        ((ud) this).j(-1);
        return super.e((byte) 79);
    }

    final void j(int param0) {
        if (null != ((ud) this).field_Q) {
            if (!(mi.field_D == ((ud) this).field_Q)) {
                ((ud) this).a(12 - -((ud) this).field_R + ((ud) this).field_X.field_f, (byte) -94, 12 + ((ud) this).field_X.field_g);
                this.a(-26498, ((ud) this).field_X);
            }
            ((ud) this).field_V.field_z = 256;
            ((ud) this).field_Q = null;
        }
        super.j(param0);
    }

    void a(qm param0, byte param1) {
        ((ud) this).field_X = param0;
        if (ok.field_b == ((ud) this).field_Q) {
            ((ud) this).a(((ud) this).field_ab, ((ud) this).field_R + 12 + ((ud) this).field_X.field_f, (byte) -93, 12 + ((ud) this).field_X.field_g);
            ((ud) this).field_Y = 0;
            if (param1 == -50) {
                return;
            }
            ((ud) this).field_V = null;
            return;
        }
        if (((ud) this).field_Q == jh.field_f) {
            if (param1 == -50) {
                return;
            }
            ((ud) this).field_V = null;
            return;
        }
        ((ud) this).field_Q = jh.field_f;
        ((ud) this).field_Y = 0;
        if (param1 != -50) {
            ((ud) this).field_V = null;
            return;
        }
    }

    final void k(int param0) {
        if (!(((ud) this).field_Q != jh.field_f)) {
            return;
        }
        ((ud) this).field_Y = 0;
        ((ud) this).field_Q = mi.field_D;
        this.a(-26498, ((ud) this).field_X);
        ((ud) this).field_V.field_z = 0;
        if (param0 != 42) {
            ((ud) this).field_Y = 16;
            ((ud) this).field_X = null;
            return;
        }
        ((ud) this).field_X = null;
    }

    boolean a(int param0, int param1, qm param2, char param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (((ud) this).field_V == null) {
            return false;
        }
        if (!(98 != param0)) {
            boolean discarded$0 = ((ud) this).field_V.a(true, param2);
        }
        if (99 == param0) {
            boolean discarded$1 = ((ud) this).field_V.a(true, param2);
            return false;
        }
        return false;
    }

    public static void h(byte param0) {
        if (param0 > -6) {
            Object var2 = null;
            int discarded$0 = ud.a((CharSequence) null, -109, (byte) -70, false);
            field_bb = null;
            field_S = null;
            return;
        }
        field_bb = null;
        field_S = null;
    }

    boolean g(byte param0) {
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == 8) {
          if (((ud) this).field_Q != null) {
            if (((ud) this).field_Q == jh.field_f) {
              int fieldTemp$4 = ((ud) this).field_Y + 1;
              ((ud) this).field_Y = ((ud) this).field_Y + 1;
              if ((((ud) this).field_T ^ -1) == (fieldTemp$4 ^ -1)) {
                ((ud) this).field_Q = ok.field_b;
                ((ud) this).a(((ud) this).field_ab, ((ud) this).field_X.field_f + (12 + ((ud) this).field_R), (byte) -93, ((ud) this).field_X.field_g + 12);
                ((ud) this).field_Y = 0;
                ((ud) this).field_V.field_z = 0;
                return super.g((byte) 8);
              } else {
                ((ud) this).field_V.field_z = 256 - (((ud) this).field_Y << -984802936) / ((ud) this).field_T;
                return super.g((byte) 8);
              }
            } else {
              if (mi.field_D != ((ud) this).field_Q) {
                return super.g((byte) 8);
              } else {
                int fieldTemp$5 = ((ud) this).field_Y + 1;
                ((ud) this).field_Y = ((ud) this).field_Y + 1;
                if (fieldTemp$5 == ((ud) this).field_W) {
                  ((ud) this).field_V.field_z = 256;
                  ((ud) this).field_Q = null;
                  return super.g((byte) 8);
                } else {
                  ((ud) this).field_V.field_z = (((ud) this).field_Y << -898946712) / ((ud) this).field_W;
                  return super.g((byte) 8);
                }
              }
            }
          } else {
            return super.g((byte) 8);
          }
        } else {
          return true;
        }
    }

    ud(ol param0, qm param1, int param2, int param3, int param4) {
        super(param0, 12 + param1.field_g, param1.field_f + 12 - -param2);
        ((ud) this).field_R = param2;
        ((ud) this).field_W = param3;
        ((ud) this).field_T = param3;
        ((ud) this).field_ab = param4;
        this.a(-26498, param1);
    }

    final static void a(String param0, int param1, int param2, java.awt.Color param3, boolean param4) {
        Exception var5 = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = jd.field_D.getGraphics();
              if (null != fg.field_i) {
                break L1;
              } else {
                fg.field_i = new java.awt.Font("Helvetica", 1, 13);
                break L1;
              }
            }
            L2: {
              if (param4) {
                var9.setColor(java.awt.Color.black);
                var9.fillRect(0, 0, ap.field_r, rh.field_f);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 == null) {
                param3 = new java.awt.Color(140, 17, 17);
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                L5: {
                  if (null == ba.field_h) {
                    ba.field_h = jd.field_D.createImage(304, 34);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = ba.field_h.getGraphics();
                var10.setColor(param3);
                var10.drawRect(0, 0, 303, 33);
                var10.fillRect(2, 2, 3 * param2, 30);
                var10.setColor(java.awt.Color.black);
                var10.drawRect(param1, 1, 301, 31);
                var10.fillRect(2 - -(param2 * 3), 2, -(param2 * 3) + 300, 30);
                var10.setFont(fg.field_i);
                var10.setColor(java.awt.Color.white);
                var10.drawString(param0, (304 + -(param0.length() * 6)) / 2, 22);
                boolean discarded$1 = var9.drawImage(ba.field_h, ap.field_r / 2 - 152, -18 + rh.field_f / 2, (java.awt.image.ImageObserver) null);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L6: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = -152 + ap.field_r / 2;
                var8 = -18 + rh.field_f / 2;
                var9.setColor(param3);
                var9.drawRect(var7, var8, 303, 33);
                var9.fillRect(var7 + 2, 2 + var8, param2 * 3, 30);
                var9.setColor(java.awt.Color.black);
                var9.drawRect(var7 - -1, 1 + var8, 301, 31);
                var9.fillRect(3 * param2 + var7 - -2, var8 - -2, 300 - param2 * 3, 30);
                var9.setFont(fg.field_i);
                var9.setColor(java.awt.Color.white);
                var9.drawString(param0, var7 + (304 + -(6 * param0.length())) / 2, 22 + var8);
                break L6;
              }
            }
            if (nd.field_o == null) {
              break L0;
            } else {
              var9.setFont(fg.field_i);
              var9.setColor(java.awt.Color.white);
              var9.drawString(nd.field_o, ap.field_r / 2 - 6 * nd.field_o.length() / 2, rh.field_f / 2 + -26);
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var5 = (Exception) (Object) decompiledCaughtException;
            jd.field_D.repaint();
            break L7;
          }
        }
    }

    final static int a(CharSequence param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = CrazyCrystals.field_B;
        if (-3 < (param1 ^ -1)) {
          throw new IllegalArgumentException("" + param1);
        } else {
          if (-37 <= (param1 ^ -1)) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 69 / ((param2 - 19) / 59);
            var8 = param0.length();
            var9 = 0;
            L0: while (true) {
              if ((var8 ^ -1) >= (var9 ^ -1)) {
                if (var5 == 0) {
                  throw new NumberFormatException();
                } else {
                  return var6;
                }
              } else {
                L1: {
                  L2: {
                    var10 = param0.charAt(var9);
                    if (0 != var9) {
                      break L2;
                    } else {
                      if (45 == var10) {
                        var4 = 1;
                        var9++;
                        break L1;
                      } else {
                        if (var10 != 43) {
                          break L2;
                        } else {
                          if (!param3) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var10 < 48) {
                        break L4;
                      } else {
                        if (var10 > 57) {
                          break L4;
                        } else {
                          var10 -= 48;
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if (var10 < 65) {
                        break L5;
                      } else {
                        if (var10 <= 90) {
                          var10 -= 55;
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var10 < 97) {
                        break L6;
                      } else {
                        if (122 < var10) {
                          break L6;
                        } else {
                          var10 -= 87;
                          break L3;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if ((var10 ^ -1) <= (param1 ^ -1)) {
                    throw new NumberFormatException();
                  } else {
                    L7: {
                      if (var4 != 0) {
                        var10 = -var10;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = var6 * param1 - -var10;
                    if (var6 == var11 / param1) {
                      var5 = 1;
                      var6 = var11;
                      break L1;
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                }
                var9++;
                continue L0;
              }
            }
          } else {
            throw new IllegalArgumentException("" + param1);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new int[8192];
        field_U = false;
        field_Z = 0;
    }
}
