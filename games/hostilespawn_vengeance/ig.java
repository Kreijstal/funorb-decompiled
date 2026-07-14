/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

class ig extends ph {
    private int field_P;
    private boolean field_G;
    static ej field_N;
    private int field_J;
    static String field_H;
    private int field_O;
    private long field_Q;
    static bd field_S;
    static bd field_R;
    static int field_L;
    private long field_M;
    private int field_K;
    private boolean field_I;

    private final void f(byte param0) {
        if (param0 < 47) {
            return;
        }
        this.l(-6200);
        this.b(true);
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (!(((ig) this).field_J != 0)) {
            return ((ig) this).field_J;
        }
        if (param0 != 10747) {
            this.k(-75);
        }
        for (var2 = -1 + ((ig) this).field_J; var2 > 0; var2--) {
            // if_icmpeq L67
        }
        return var2;
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        if (-1 != ((ig) this).field_P) {
            var3 = ((ig) this).field_P - ((ig) this).field_n.length();
            if (!(-1 < (var3 ^ -1))) {
                return;
            }
            param1 = param1.substring(0, var3);
        }
        if (param0 != 0) {
            return;
        }
        if (((ig) this).field_J == ((ig) this).field_n.length()) {
            ((ig) this).field_n = ((ig) this).field_n + param1;
        } else {
            ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_J) + param1 + ((ig) this).field_n.substring(((ig) this).field_J, ((ig) this).field_n.length());
        }
        ((ig) this).field_J = ((ig) this).field_J + param1.length();
        ((ig) this).field_K = ((ig) this).field_J;
        ((ig) this).e((byte) 125);
    }

    final void a(byte param0, boolean param1, String param2) {
        if (!(param2 != null)) {
            param2 = "";
        }
        ((ig) this).field_n = param2;
        int var4 = param2.length();
        if ((((ig) this).field_P ^ -1) != 0) {
            if (!(((ig) this).field_P >= var4)) {
                ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_P);
            }
        }
        ((ig) this).field_K = ((ig) this).field_n.length();
        ((ig) this).field_J = ((ig) this).field_n.length();
        if (param0 < 18) {
            ((ig) this).field_I = true;
        }
        if (!(param1)) {
            ((ig) this).e((byte) 125);
        }
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        if (param3 != -1) {
          if (-2 == param3) {
            var10 = param1[param2];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param2 + param3;
            var5 = 0;
            if (param0 == 28) {
              var6_int = param2;
              L0: while (true) {
                if (var4 <= var6_int) {
                  var6 = new StringBuilder(var5);
                  var7 = param2;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param1[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  var7_ref_CharSequence = param1[var6_int];
                  if (var7_ref_CharSequence == null) {
                    var5 += 4;
                    var6_int++;
                    continue L0;
                  } else {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return "";
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        mi var8 = null;
        long var6 = 0L;
        if (null != ((ig) this).field_h) {
            if (0 == param3) {
                ((ig) this).field_h.a(param0, param1, 15430, (ag) this, ((ig) this).field_D);
                if (!(!(((ig) this).field_h instanceof mi))) {
                    var8 = (mi) (Object) ((ig) this).field_h;
                    if (((ig) this).field_J != ((ig) this).field_K) {
                        var8.a(param1, (byte) 41, ((ig) this).field_K, (ag) this, param0, ((ig) this).field_J);
                    }
                    var6 = hn.a((byte) 80);
                    if (!(-501L >= ((-((ig) this).field_M + var6) % 1000L ^ -1L))) {
                        var8.a(param0, (ag) this, ((ig) this).field_J, 0, param1);
                    }
                }
            }
        }
        if (param2 <= 42) {
            field_R = null;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, byte param4, ag param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
            if (!(((ig) this).field_h instanceof mi)) {
                return false;
            }
            var8_int = ((mi) (Object) ((ig) this).field_h).a(param1, j.field_c, param4 + -226, (ag) this, param2, rb.field_m);
            this.a(var8_int != -1 ? var8_int : 0, param4 ^ 12);
            var8 = hn.a((byte) 80);
            ((ig) this).field_I = 250L > -((ig) this).field_Q + var8 ? true : false;
            if (!(!((ig) this).field_I)) {
                ((ig) this).field_K = this.j(10747);
                ((ig) this).field_J = this.a(true);
                if (0 < ((ig) this).field_J) {
                    if (!(((ig) this).field_n.charAt(((ig) this).field_J + -1) != 32)) {
                        ((ig) this).field_J = ((ig) this).field_J - 1;
                    }
                }
                ((ig) this).field_O = ((ig) this).field_J;
            }
            ((ig) this).field_Q = var8;
            return true;
        }
        return false;
    }

    private final String g(byte param0) {
        int var2 = ((ig) this).field_J <= ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
        int var4 = 102 % ((-29 - param0) / 57);
        int var3 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
        return ((ig) this).field_n.substring(var2, var3);
    }

    private final void l(int param0) {
        if (param0 != -6200) {
            return;
        }
        String var2 = this.g((byte) 77);
        if (!(0 >= var2.length())) {
            java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.g((byte) 93)), (java.awt.datatransfer.ClipboardOwner) null);
        }
    }

    final static boolean c(boolean param0) {
        Object var2 = null;
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            var2 = null;
            java.net.URL discarded$2 = ig.a(false, (java.net.URL) null, (String) null, 120, (String) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (fa.field_c ^ -1)) {
              break L2;
            } else {
              if (md.field_k) {
                break L2;
              } else {
                if (kl.b(50)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    private final void k(int param0) {
        if (param0 != -1) {
            ((ig) this).field_O = 45;
        }
        if (((ig) this).field_p instanceof cd) {
            ((cd) (Object) ((ig) this).field_p).a((ig) this, -97);
        }
    }

    private final void h(byte param0) {
        ce var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        mi var9 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (((ig) this).field_G) {
          if (!(((ig) this).field_h instanceof mi)) {
            return;
          } else {
            var9 = (mi) (Object) ((ig) this).field_h;
            if (param0 == -121) {
              var3 = var9.a((ag) this, 1);
              var4 = var3.a(3915);
              var5 = var9.a((ag) this, (byte) 15);
              var6 = var9.a(true) >> -1722921311;
              if (var4 >= -var6 + var5) {
                L0: {
                  var7 = ((ig) this).field_q - -var3.b(((ig) this).field_J, 0);
                  if (-var6 + var5 >= var7) {
                    if (var6 <= var7) {
                      break L0;
                    } else {
                      ((ig) this).field_q = -var7 - -var6 + ((ig) this).field_q;
                      break L0;
                    }
                  } else {
                    ((ig) this).field_q = -var7 - (-var5 - -var6 - ((ig) this).field_q);
                    break L0;
                  }
                }
                L1: {
                  if (0 >= ((ig) this).field_q) {
                    if (var6 + -var5 > ((ig) this).field_q) {
                      ((ig) this).field_q = var6 + -var5;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    ((ig) this).field_q = 0;
                    break L1;
                  }
                }
                return;
              } else {
                ((ig) this).field_q = 0;
                ((ig) this).field_o = 0;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          ((ig) this).field_q = 0;
          ((ig) this).field_o = 0;
          return;
        }
    }

    final void o(int param0) {
        if (param0 > -121) {
            return;
        }
        ((ig) this).field_J = 0;
        ((ig) this).field_K = 0;
        ((ig) this).field_n = "";
        ((ig) this).e((byte) 125);
    }

    private final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((ig) this).field_K == ((ig) this).field_J)) {
            var2 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_K : ((ig) this).field_J;
            var3 = ((ig) this).field_J > ((ig) this).field_K ? ((ig) this).field_J : ((ig) this).field_K;
            ((ig) this).field_J = var2;
            ((ig) this).field_K = var2;
            ((ig) this).field_n = ((ig) this).field_n.substring(0, var2) + ((ig) this).field_n.substring(var3, ((ig) this).field_n.length());
            ((ig) this).e((byte) 125);
        }
        if (!param0) {
            ig.m(83);
        }
    }

    private final int a(boolean param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        if (!param0) {
            return 83;
        }
        int var2 = ((ig) this).field_n.length();
        if (!(var2 != ((ig) this).field_J)) {
            return ((ig) this).field_J;
        }
        for (var3 = 1 + ((ig) this).field_J; var3 < var2; var3++) {
            // if_icmpeq L72
        }
        return var3;
    }

    private final void n(int param0) {
        try {
            String var2 = null;
            try {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.b(true);
                this.a(0, var2);
            } catch (Exception exception) {
            }
            if (param0 <= 90) {
                this.n(-125);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, int param1) {
        ((ig) this).field_J = param0;
        if (param1 < 92) {
            ((ig) this).field_G = false;
        }
        if (!(qh.field_m[81])) {
            ((ig) this).field_K = ((ig) this).field_J;
        }
    }

    void e(byte param0) {
        if (param0 != 125) {
            return;
        }
        if (((ig) this).field_p instanceof cd) {
            ((cd) (Object) ((ig) this).field_p).a((ig) this, (byte) -125);
        }
    }

    public static void m(int param0) {
        field_R = null;
        field_N = null;
        field_H = null;
        field_S = null;
        if (param0 <= 5) {
            field_L = 78;
        }
    }

    final boolean a(int param0, ag param1, int param2, char param3) {
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        Object stackOut_54_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        L0: {
          ((ig) this).field_M = hn.a((byte) 80);
          if (param3 == 60) {
            break L0;
          } else {
            if (62 == param3) {
              break L0;
            } else {
              L1: {
                if (param3 < 32) {
                  break L1;
                } else {
                  if (param3 > 126) {
                    break L1;
                  } else {
                    L2: {
                      if (((ig) this).field_J == ((ig) this).field_K) {
                        break L2;
                      } else {
                        this.b(true);
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (0 == (((ig) this).field_P ^ -1)) {
                          break L4;
                        } else {
                          if (((ig) this).field_n.length() >= ((ig) this).field_P) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (((ig) this).field_J >= ((ig) this).field_n.length()) {
                          ((ig) this).field_n = ((ig) this).field_n + param3;
                          ((ig) this).field_J = ((ig) this).field_n.length();
                          ((ig) this).field_K = ((ig) this).field_n.length();
                          break L5;
                        } else {
                          ((ig) this).field_n = ((ig) this).field_n.substring(0, ((ig) this).field_J) + param3 + ((ig) this).field_n.substring(((ig) this).field_J, ((ig) this).field_n.length());
                          ((ig) this).field_J = ((ig) this).field_J + 1;
                          ((ig) this).field_K = ((ig) this).field_J;
                          break L5;
                        }
                      }
                      ((ig) this).e((byte) 125);
                      break L3;
                    }
                    return true;
                  }
                }
              }
              L6: {
                if (-86 != (param2 ^ -1)) {
                  if (-102 != (param2 ^ -1)) {
                    if (13 != param2) {
                      if (-97 != (param2 ^ -1)) {
                        if (97 == param2) {
                          if (((ig) this).field_J >= ((ig) this).field_n.length()) {
                            break L6;
                          } else {
                            L7: {
                              stackOut_54_0 = this;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_55_0 = stackOut_54_0;
                              if (!qh.field_m[82]) {
                                stackOut_56_0 = this;
                                stackOut_56_1 = ((ig) this).field_J - -1;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                break L7;
                              } else {
                                stackOut_55_0 = this;
                                stackOut_55_1 = this.a(true);
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                break L7;
                              }
                            }
                            this.a(stackIn_57_1, 124);
                            return true;
                          }
                        } else {
                          if (-103 != (param2 ^ -1)) {
                            if (param2 == -104) {
                              this.a(((ig) this).field_n.length(), 98);
                              return true;
                            } else {
                              if (-85 != param2) {
                                L8: {
                                  if (!qh.field_m[82]) {
                                    break L8;
                                  } else {
                                    if (param2 != 65) {
                                      break L8;
                                    } else {
                                      this.f((byte) 93);
                                      return true;
                                    }
                                  }
                                }
                                L9: {
                                  if (!qh.field_m[82]) {
                                    break L9;
                                  } else {
                                    if (-67 != (param2 ^ -1)) {
                                      break L9;
                                    } else {
                                      this.l(-6200);
                                      return true;
                                    }
                                  }
                                }
                                if (!qh.field_m[82]) {
                                  break L6;
                                } else {
                                  if (67 != param2) {
                                    break L6;
                                  } else {
                                    this.n(param0 + -158);
                                    return true;
                                  }
                                }
                              } else {
                                this.k(-1);
                                return true;
                              }
                            }
                          } else {
                            this.a(0, 115);
                            return true;
                          }
                        }
                      } else {
                        if ((((ig) this).field_J ^ -1) < -1) {
                          L10: {
                            stackOut_33_0 = this;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_34_0 = stackOut_33_0;
                            if (!qh.field_m[82]) {
                              stackOut_35_0 = this;
                              stackOut_35_1 = ((ig) this).field_J - 1;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              break L10;
                            } else {
                              stackOut_34_0 = this;
                              stackOut_34_1 = this.j(10747);
                              stackIn_36_0 = stackOut_34_0;
                              stackIn_36_1 = stackOut_34_1;
                              break L10;
                            }
                          }
                          this.a(stackIn_36_1, 114);
                          return true;
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      ((ig) this).o(-122);
                      return true;
                    }
                  } else {
                    if (((ig) this).field_K != ((ig) this).field_J) {
                      this.b(true);
                      return true;
                    } else {
                      if (((ig) this).field_J < ((ig) this).field_n.length()) {
                        ((ig) this).field_K = ((ig) this).field_J - -1;
                        this.b(true);
                        return true;
                      } else {
                        break L6;
                      }
                    }
                  }
                } else {
                  if (((ig) this).field_K == ((ig) this).field_J) {
                    if (0 < ((ig) this).field_J) {
                      ((ig) this).field_K = -1 + ((ig) this).field_J;
                      this.b(true);
                      return true;
                    } else {
                      break L6;
                    }
                  } else {
                    this.b(true);
                    return true;
                  }
                }
              }
              if (param0 == 274) {
                return false;
              } else {
                ((ig) this).field_Q = 124L;
                return false;
              }
            }
          }
        }
        return false;
    }

    final static java.net.URL a(boolean param0, java.net.URL param1, String param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            L0: {
              var9 = HostileSpawn.field_I ? 1 : 0;
              var5 = param1.getFile();
              if (param0) {
                break L0;
              } else {
                field_S = null;
                break L0;
              }
            }
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (0 > var7_int) {
                      break L3;
                    } else {
                      if (-1 < (param3 ^ -1)) {
                        break L2;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L1;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L4;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                    break L5;
                  } else {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (0 > var7_int) {
                      break L5;
                    } else {
                      if (param2 != null) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L1;
                      } else {
                        var6 = var7_int;
                        continue L1;
                      }
                    }
                  }
                }
                L6: {
                  L7: {
                    if (var5.regionMatches(var6, "/s=", 0, 3)) {
                      break L7;
                    } else {
                      if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L1;
                    } else {
                      var6 = var7_int;
                      continue L1;
                    }
                  } else {
                    break L6;
                  }
                }
                L8: {
                  var7 = new StringBuilder(var6);
                  StringBuilder discarded$11 = var7.append(var5.substring(0, var6));
                  if ((param3 ^ -1) >= -1) {
                    break L8;
                  } else {
                    StringBuilder discarded$12 = var7.append("/l=");
                    StringBuilder discarded$13 = var7.append(Integer.toString(param3));
                    break L8;
                  }
                }
                L9: {
                  if (param2 == null) {
                    if (param4 == null) {
                      break L9;
                    } else {
                      if (0 < param4.length()) {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param4);
                        break L9;
                      } else {
                        if (param4 == null) {
                          break L9;
                        } else {
                          if (0 >= param4.length()) {
                            break L9;
                          } else {
                            StringBuilder discarded$16 = var7.append("/s=");
                            StringBuilder discarded$17 = var7.append(param4);
                            break L9;
                          }
                        }
                      }
                    }
                  } else {
                    if (param4 == null) {
                      break L9;
                    } else {
                      if (0 >= param4.length()) {
                        break L9;
                      } else {
                        StringBuilder discarded$18 = var7.append("/s=");
                        StringBuilder discarded$19 = var7.append(param4);
                        break L9;
                      }
                    }
                  }
                }
                L10: {
                  if (var5.length() > var6) {
                    StringBuilder discarded$20 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$21 = var7.append(47);
                    break L10;
                  }
                }
                try {
                  stackOut_43_0 = new java.net.URL(param1, var7.toString());
                  stackIn_44_0 = stackOut_43_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_44_0;
                }
              }
              var6 = var7_int;
              continue L1;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(ag param0, int param1, int param2, int param3) {
        mi var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.h((byte) -121);
        if (!((((ig) this).field_r ^ -1) != -2)) {
            if (((ig) this).field_h instanceof mi) {
                var5 = (mi) (Object) ((ig) this).field_h;
                var6 = var5.a(param3, j.field_c, -115, (ag) this, param1, rb.field_m);
                if (!(-1 == var6)) {
                    if (((ig) this).field_I) {
                        if (var6 < ((ig) this).field_O) {
                            if (var6 > ((ig) this).field_K) {
                                var6 = ((ig) this).field_O;
                            }
                        }
                    }
                    ((ig) this).field_J = var6;
                }
            }
            ((ig) this).field_M = hn.a((byte) 80);
        }
    }

    ig(String param0, mh param1, int param2) {
        super(param0, param1);
        ((ig) this).field_Q = 0L;
        ((ig) this).field_I = false;
        ((ig) this).field_O = -1;
        ((ig) this).field_h = gf.field_e.field_j;
        ((ig) this).field_P = param2;
        ((ig) this).a((byte) 57, true, param0);
        ((ig) this).field_G = true;
        ((ig) this).field_M = hn.a((byte) 80);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Unpacking graphics";
        field_L = 0;
    }
}
