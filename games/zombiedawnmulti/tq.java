/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends cj {
    hi field_Ib;
    static String field_Fb;
    cj field_Gb;
    static String field_Hb;
    cj field_Jb;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, int param1, int param2) {
        ((tq) this).field_Jb.field_zb = -param1 + (((tq) this).field_zb + -param2);
        ((tq) this).field_Gb.field_x = param0;
        ((tq) this).field_Jb.field_z = ((tq) this).field_z;
        ((tq) this).field_Gb.field_zb = -param2 + -param1 + ((tq) this).field_zb;
        ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, 0, ((tq) this).field_Jb.field_z, ((tq) this).field_z, -1, -((tq) this).field_Gb.field_Q, param1, -param1 + ((tq) this).field_zb);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param5 != -31465) {
          ((tq) this).a(67, 91, -23, -43, 80, -90, 37);
          ((tq) this).field_x = param3;
          ((tq) this).field_Q = param6;
          ((tq) this).field_z = param4;
          ((tq) this).field_zb = param2;
          this.a(0, param0, param1);
          return;
        } else {
          ((tq) this).field_x = param3;
          ((tq) this).field_Q = param6;
          ((tq) this).field_z = param4;
          ((tq) this).field_zb = param2;
          this.a(0, param0, param1);
          return;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var8 = 0;
        if (param0) {
          var8 = 1;
          ((tq) this).field_Gb.a((byte) 109, ((tq) this).field_Jb.field_z, param1, var8 != 0);
          this.a(param3, param4 + 4719, param2, false, param6);
          if (param4 != -4719) {
            return true;
          } else {
            return var8 != 0;
          }
        } else {
          if (((tq) this).field_L) {
            if (!param5) {
              var8 = 1;
              ((tq) this).field_Gb.a((byte) 109, ((tq) this).field_Jb.field_z, param1, var8 != 0);
              this.a(param3, param4 + 4719, param2, false, param6);
              if (param4 != -4719) {
                return true;
              } else {
                return var8 != 0;
              }
            } else {
              var8 = 0;
              ((tq) this).field_Gb.a((byte) 109, ((tq) this).field_Jb.field_z, param1, var8 != 0);
              this.a(param3, param4 + 4719, param2, false, param6);
              if (param4 != -4719) {
                return true;
              } else {
                return var8 != 0;
              }
            }
          } else {
            var8 = 0;
            ((tq) this).field_Gb.a((byte) 109, ((tq) this).field_Jb.field_z, param1, var8 != 0);
            this.a(param3, param4 + 4719, param2, false, param6);
            if (param4 != -4719) {
              return true;
            } else {
              return var8 != 0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        this.a(param2, 0, ((tq) this).field_Jb.field_z, param3, param0);
        if (param1 < 104) {
            field_Hb = null;
        }
    }

    public static void h(int param0) {
        field_Fb = null;
        if (param0 != 0) {
            tq.h(58);
            field_Hb = null;
            return;
        }
        field_Hb = null;
    }

    final boolean a(int param0, boolean param1, int param2, boolean param3, int param4, int param5) {
        if (param5 >= -22) {
          boolean discarded$2 = this.a(false, -109, -80, -22, -26, true, -105);
          return this.a(param3, param0, ((tq) this).field_Jb.field_z, param2, -4719, param1, param4);
        } else {
          return this.a(param3, param0, ((tq) this).field_Jb.field_z, param2, -4719, param1, param4);
        }
    }

    private final void a(int param0, int param1, int param2, boolean param3, int param4) {
        L0: {
          if (((tq) this).field_Ib.d(false)) {
            ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb + param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (((tq) this).field_Ib.e((byte) -37)) {
            ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb - param0;
            break L1;
          } else {
            break L1;
          }
        }
        if (!((tq) this).field_Ib.d((byte) 37)) {
          L2: {
            if (((tq) this).field_Ib.i(param1 + -1)) {
              ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb - param2;
              break L2;
            } else {
              break L2;
            }
          }
          if (!((tq) this).field_L) {
            if (param3) {
              if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) >= 0) {
                if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) > -((tq) this).field_Jb.field_z + (((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z)) {
                  ((tq) this).field_Gb.field_mb = -(((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I - ((tq) this).field_Jb.field_z) + -((tq) this).field_Gb.field_Q;
                  if (param1 == 0) {
                    L3: {
                      if (((tq) this).field_Ib.j(120)) {
                        ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                        ((tq) this).field_Gb.field_mb = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param1 == 0) {
                    L4: {
                      if (((tq) this).field_Ib.j(120)) {
                        ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                        ((tq) this).field_Gb.field_mb = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L5: {
                  ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                  if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) > -((tq) this).field_Jb.field_z + (((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z)) {
                    ((tq) this).field_Gb.field_mb = -(((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I - ((tq) this).field_Jb.field_z) + -((tq) this).field_Gb.field_Q;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (param1 == 0) {
                  L6: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L7: {
                if (-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I < -(((tq) this).field_Gb.field_Q + ((tq) this).field_Gb.field_mb)) {
                  ((tq) this).field_Gb.field_mb = -(-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z) - ((tq) this).field_Gb.field_Q;
                  break L7;
                } else {
                  break L7;
                }
              }
              if ((-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) ^ -1) > -1) {
                ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                if (param1 != 0) {
                  return;
                } else {
                  L8: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                }
              } else {
                if (param1 != 0) {
                  return;
                } else {
                  L9: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                }
              }
            }
          } else {
            ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb - param4;
            if (param3) {
              if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) < 0) {
                ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) > -((tq) this).field_Jb.field_z + (((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z)) {
                  ((tq) this).field_Gb.field_mb = -(((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I - ((tq) this).field_Jb.field_z) + -((tq) this).field_Gb.field_Q;
                  if (param1 != 0) {
                    return;
                  } else {
                    L10: {
                      if (((tq) this).field_Ib.j(120)) {
                        ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                        ((tq) this).field_Gb.field_mb = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                    return;
                  }
                } else {
                  if (param1 != 0) {
                    return;
                  } else {
                    L11: {
                      if (((tq) this).field_Ib.j(120)) {
                        ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                        ((tq) this).field_Gb.field_mb = 0;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                    return;
                  }
                }
              } else {
                L12: {
                  if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) > -((tq) this).field_Jb.field_z + (((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z)) {
                    ((tq) this).field_Gb.field_mb = -(((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I - ((tq) this).field_Jb.field_z) + -((tq) this).field_Gb.field_Q;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                if (param1 != 0) {
                  return;
                } else {
                  L13: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                }
              }
            } else {
              L14: {
                if (-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I < -(((tq) this).field_Gb.field_Q + ((tq) this).field_Gb.field_mb)) {
                  ((tq) this).field_Gb.field_mb = -(-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z) - ((tq) this).field_Gb.field_Q;
                  break L14;
                } else {
                  break L14;
                }
              }
              if ((-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) ^ -1) > -1) {
                ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                if (param1 != 0) {
                  return;
                } else {
                  L15: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                }
              } else {
                if (param1 != 0) {
                  return;
                } else {
                  L16: {
                    if (((tq) this).field_Ib.j(120)) {
                      ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                      ((tq) this).field_Gb.field_mb = 0;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
                  return;
                }
              }
            }
          }
        } else {
          L17: {
            ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb + param2;
            if (((tq) this).field_Ib.i(param1 + -1)) {
              ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb - param2;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (!((tq) this).field_L) {
              break L18;
            } else {
              ((tq) this).field_Gb.field_mb = ((tq) this).field_Gb.field_mb - param4;
              break L18;
            }
          }
          L19: {
            if (param3) {
              L20: {
                if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) >= 0) {
                  break L20;
                } else {
                  ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                  break L20;
                }
              }
              if (-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) > -((tq) this).field_Jb.field_z + (((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z)) {
                ((tq) this).field_Gb.field_mb = -(((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I - ((tq) this).field_Jb.field_z) + -((tq) this).field_Gb.field_Q;
                break L19;
              } else {
                break L19;
              }
            } else {
              L21: {
                if (-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_z + ((tq) this).field_Gb.field_I < -(((tq) this).field_Gb.field_Q + ((tq) this).field_Gb.field_mb)) {
                  ((tq) this).field_Gb.field_mb = -(-((tq) this).field_Jb.field_z + ((tq) this).field_Gb.field_I + ((tq) this).field_Gb.field_z) - ((tq) this).field_Gb.field_Q;
                  break L21;
                } else {
                  break L21;
                }
              }
              if ((-(((tq) this).field_Gb.field_mb + ((tq) this).field_Gb.field_Q) ^ -1) > -1) {
                ((tq) this).field_Gb.field_mb = -((tq) this).field_Gb.field_Q;
                break L19;
              } else {
                break L19;
              }
            }
          }
          if (param1 != 0) {
            return;
          } else {
            L22: {
              if (((tq) this).field_Ib.j(120)) {
                ((tq) this).field_Gb.field_Q = -((tq) this).field_Ib.a(param3, (byte) -66, ((tq) this).field_Jb.field_z, ((tq) this).field_Gb.field_z);
                ((tq) this).field_Gb.field_mb = 0;
                break L22;
              } else {
                break L22;
              }
            }
            ((tq) this).field_Ib.a(((tq) this).field_Gb.field_z, -((tq) this).field_Gb.field_Q, (byte) 124, ((tq) this).field_Jb.field_z);
            return;
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 & param1;
    }

    tq(long param0, cj param1, cj param2, hi param3) {
        super(param0, (cj) null);
        ((tq) this).field_Jb = new cj(0L, param2);
        ((tq) this).field_Ib = new hi(0L, param3);
        ((tq) this).a((byte) 50, ((tq) this).field_Jb);
        ((tq) this).a((byte) 50, (cj) (Object) ((tq) this).field_Ib);
        ((tq) this).field_Gb = param1;
        ((tq) this).field_Jb.a((byte) 50, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = "This password is part of your Player Name, and would be easy to guess";
        field_Fb = "<%0> has declined the invitation.";
    }
}
