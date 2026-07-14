/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends cg {
    private hf field_l;
    private hf field_j;
    static String field_k;

    mk(hf param0, hf param1, hf param2) {
        super(param0);
        ((mk) this).field_j = param2;
        ((mk) this).field_l = param1;
    }

    final static te c(byte param0) {
        try {
            Throwable var1 = null;
            te stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            te stackOut_2_0 = null;
            L0: {
              if (param0 == 100) {
                break L0;
              } else {
                int discarded$2 = mk.h(-40);
                break L0;
              }
            }
            try {
              stackOut_2_0 = (te) Class.forName("bh").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (te) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void b(byte param0) {
        int var1 = -52 / ((param0 - 43) / 36);
        field_k = null;
    }

    final String a(String param0, boolean param1) {
        String var4 = null;
        String var5 = null;
        String var6 = null;
        var6 = ((mk) this).field_l.field_r.toLowerCase();
        var4 = param0.toLowerCase();
        if (0 != var4.length()) {
          var5 = var4;
          if (te.a(param1, var5)) {
            return s.field_b;
          } else {
            if (hi.a(var5, 0)) {
              return hl.field_C;
            } else {
              if (!lc.a((byte) -33, var5)) {
                if (!this.b(param0, 0)) {
                  if (!param1) {
                    if (var6.length() > 0) {
                      if (gi.a(var5, -123, var6)) {
                        return qi.field_F;
                      } else {
                        if (la.a(var6, (byte) -115, var5)) {
                          return i.field_b;
                        } else {
                          if (g.a(var6, var5, -1)) {
                            return qi.field_F;
                          } else {
                            return s.field_b;
                          }
                        }
                      }
                    } else {
                      return ll.field_g;
                    }
                  } else {
                    ((mk) this).field_l = (hf) null;
                    if (var6.length() > 0) {
                      if (gi.a(var5, -123, var6)) {
                        return qi.field_F;
                      } else {
                        if (la.a(var6, (byte) -115, var5)) {
                          return i.field_b;
                        } else {
                          if (g.a(var6, var5, -1)) {
                            return qi.field_F;
                          } else {
                            return s.field_b;
                          }
                        }
                      }
                    } else {
                      return ll.field_g;
                    }
                  }
                } else {
                  return bj.field_u;
                }
              } else {
                return ta.field_fb;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static java.applet.Applet g(int param0) {
        if (!(uh.field_i == null)) {
            return uh.field_i;
        }
        if (param0 >= -116) {
            String discarded$0 = mk.a(-119, false, true, false);
            return (java.applet.Applet) (Object) jj.field_a;
        }
        return (java.applet.Applet) (Object) jj.field_a;
    }

    final static int h(int param0) {
        if (param0 != -1) {
            mk.b((byte) -72);
            return mh.field_b;
        }
        return mh.field_b;
    }

    final sg a(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        if (param1 <= -58) {
          var3 = ((mk) this).field_l.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() != 0) {
            if (!f.a(var4, 125, var3)) {
              return pe.field_b;
            } else {
              if (this.b(param0, 0)) {
                return pe.field_b;
              } else {
                return ii.field_e;
              }
            }
          } else {
            return pe.field_b;
          }
        } else {
          ((mk) this).field_l = (hf) null;
          var3 = ((mk) this).field_l.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() != 0) {
            if (!f.a(var4, 125, var3)) {
              return pe.field_b;
            } else {
              if (this.b(param0, 0)) {
                return pe.field_b;
              } else {
                return ii.field_e;
              }
            }
          } else {
            return pe.field_b;
          }
        }
    }

    private final boolean b(String param0, int param1) {
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        var7 = param0;
        if (param1 == 0) {
          var3 = ((mk) this).field_j.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (-1 < var3.length()) {
            if (-1 > (var4.length() ^ -1)) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < -1 + var3.length()) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if (0 > var4.indexOf(var6)) {
                    if ((var4.indexOf(var7) ^ -1) <= -1) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((mk) this).field_j = (hf) null;
          var3 = ((mk) this).field_j.field_r.toLowerCase();
          var4 = param0.toLowerCase();
          if (-1 > var3.length()) {
            if (-1 < var4.length()) {
              var5 = var3.lastIndexOf("@");
              if (0 <= var5) {
                if (var5 < -1 + var3.length()) {
                  var6 = var3.substring(0, var5);
                  var7 = var3.substring(var5 + 1);
                  if (0 > var4.indexOf(var6)) {
                    if (var4.indexOf(var7) > -1) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 >= 106) {
          var4 = 0;
          if (!param2) {
            if (param1) {
              L0: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return bf.field_d[var4];
            } else {
              L1: {
                if (param3) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return bf.field_d[var4];
            }
          } else {
            var4 += 4;
            if (param1) {
              L2: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return bf.field_d[var4];
            } else {
              L3: {
                if (param3) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return bf.field_d[var4];
            }
          }
        } else {
          te discarded$1 = mk.c((byte) -75);
          var4 = 0;
          if (param2) {
            var4 += 4;
            if (!param1) {
              L4: {
                if (param3) {
                  var4++;
                  break L4;
                } else {
                  break L4;
                }
              }
              return bf.field_d[var4];
            } else {
              L5: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L5;
                } else {
                  break L5;
                }
              }
              return bf.field_d[var4];
            }
          } else {
            if (param1) {
              L6: {
                var4 += 2;
                if (param3) {
                  var4++;
                  break L6;
                } else {
                  break L6;
                }
              }
              return bf.field_d[var4];
            } else {
              L7: {
                if (param3) {
                  var4++;
                  break L7;
                } else {
                  break L7;
                }
              }
              return bf.field_d[var4];
            }
          }
        }
    }

    static {
    }
}
