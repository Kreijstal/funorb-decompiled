/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wea extends at {
    private int field_k;
    private gj field_j;
    private vg field_l;

    final static int b(boolean param0) {
        if (!param0) {
          if (2 <= lk.field_r) {
            if (-1 != (kt.field_k ^ -1)) {
              if (null != lh.field_s) {
                if (!lh.field_s.a(0)) {
                  return 14;
                } else {
                  if (lh.field_s.b("", false)) {
                    if (lh.field_s.a("", 20637)) {
                      if (!bv.field_B.a(0)) {
                        return 43;
                      } else {
                        if (!bv.field_B.a("commonui", 20637)) {
                          return 57;
                        } else {
                          if (!fi.field_n.a(0)) {
                            return 71;
                          } else {
                            if (fi.field_n.a("commonui", 20637)) {
                              if (em.field_T.a(0)) {
                                if (!em.field_T.b((byte) 120)) {
                                  return 86;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 82;
                              }
                            } else {
                              return 80;
                            }
                          }
                        }
                      }
                    } else {
                      return 29;
                    }
                  } else {
                    return 29;
                  }
                }
              } else {
                if (!bv.field_B.a(0)) {
                  return 43;
                } else {
                  if (!bv.field_B.a("commonui", 20637)) {
                    return 57;
                  } else {
                    if (!fi.field_n.a(0)) {
                      return 71;
                    } else {
                      if (fi.field_n.a("commonui", 20637)) {
                        if (em.field_T.a(0)) {
                          if (!em.field_T.b((byte) 120)) {
                            return 86;
                          } else {
                            return 100;
                          }
                        } else {
                          return 82;
                        }
                      } else {
                        return 80;
                      }
                    }
                  }
                }
              }
            } else {
              if (bv.field_B.a(0)) {
                if (!bv.field_B.a("commonui", 20637)) {
                  return 40;
                } else {
                  if (!fi.field_n.a(0)) {
                    return 50;
                  } else {
                    if (fi.field_n.a("commonui", 20637)) {
                      if (em.field_T.a(0)) {
                        if (em.field_T.b((byte) 114)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  }
                }
              } else {
                return 20;
              }
            }
          } else {
            return 0;
          }
        } else {
          return 48;
        }
    }

    final boolean c(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        bf var2_ref_bf = null;
        int var2 = 0;
        int var4 = 0;
        ad var5 = null;
        ad var6 = null;
        var4 = BachelorFridge.field_y;
        if (this.field_k == 25) {
          var2_ref_bf = (bf) ((Object) this.field_l.field_m.b((byte) 90));
          L0: while (true) {
            if (var2_ref_bf == null) {
              var2 = -45 % ((param0 - 71) / 47);
              fieldTemp$2 = this.field_k - 1;
              this.field_k = this.field_k - 1;
              if (-1 == (fieldTemp$2 ^ -1)) {
                return true;
              } else {
                return false;
              }
            } else {
              L1: {
                if (!(var2_ref_bf instanceof qja)) {
                  if (var2_ref_bf instanceof dla) {
                    var6 = ((dla) ((Object) var2_ref_bf)).field_n.a(-27449, this.field_j);
                    if (var6.field_s.i(81)) {
                      break L1;
                    } else {
                      if ((var6.field_f.field_s ^ -1) != -7) {
                        var6.b(-1, 5);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    var2_ref_bf = (bf) ((Object) this.field_l.field_m.c(0));
                    continue L0;
                  }
                } else {
                  var5 = ((qja) ((Object) var2_ref_bf)).field_i.a(-27449, this.field_j);
                  if (var5.field_s.i(98)) {
                    break L1;
                  } else {
                    if (var5.field_f.field_s != 3) {
                      var5.b(-1, 7);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var2_ref_bf = (bf) ((Object) this.field_l.field_m.c(0));
              continue L0;
            }
          }
        } else {
          var2 = -45 % ((param0 - 71) / 47);
          fieldTemp$3 = this.field_k - 1;
          this.field_k = this.field_k - 1;
          if (-1 == (fieldTemp$3 ^ -1)) {
            return true;
          } else {
            return false;
          }
        }
    }

    wea(gj param0, vg param1) {
        try {
            this.field_j = param0;
            this.field_l = param1;
            this.field_k = 25;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
