/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class esb extends qq implements mkb {
    static asb field_j;
    private byte field_i;

    final int b(byte param0) {
        if (param0 != 125) {
            ((esb) this).field_i = (byte) -12;
            return ((esb) this).field_i;
        }
        return ((esb) this).field_i;
    }

    public final boolean a(int param0, int param1, int param2) {
        ((esb) this).field_i = (byte)param0;
        super.a(25427, param1);
        if (param2 <= 81) {
            ((esb) this).a(-84);
            return true;
        }
        return true;
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        Object var4 = null;
        if (param1 <= 16) {
          var4 = null;
          String discarded$2 = esb.a(-9, (CharSequence) null);
          return super.a(false, param0, ((esb) this).field_d.field_Vc);
        } else {
          return super.a(false, param0, ((esb) this).field_d.field_Vc);
        }
    }

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
        L0: {
          var6 = VoidHunters.field_G;
          var2 = param1.length();
          if (20 >= var2) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var10 = new char[var2];
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var3 = var7;
        if (param0 <= 2) {
          field_j = null;
          var4 = 0;
          if (var2 > var4) {
            var5 = param1.charAt(var4);
            if (var5 < 65) {
              if (97 > var5) {
                if (var5 >= 48) {
                  if (var5 > 57) {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                } else {
                  var3[var4] = (char)95;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                }
              } else {
                if (var5 > 122) {
                  if (var5 >= 48) {
                    if (var5 > 57) {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var10);
                    } else {
                      var3[var4] = (char)var5;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var10);
                    }
                  } else {
                    var3[var4] = (char)95;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                } else {
                  var3[var4] = (char)var5;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  var4++;
                  return new String(var10);
                }
              }
            } else {
              if (var5 > 90) {
                if (97 <= var5) {
                  if (var5 > 122) {
                    if (var5 >= 48) {
                      if (var5 > 57) {
                        var3[var4] = (char)95;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var10);
                      } else {
                        var3[var4] = (char)var5;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        var4++;
                        return new String(var10);
                      }
                    } else {
                      var3[var4] = (char)95;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      var4++;
                      return new String(var10);
                    }
                  } else {
                    var3[var4] = (char)var5;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    var4++;
                    return new String(var10);
                  }
                } else {
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
                  return new String(var10);
                }
              } else {
                var3[var4] = (char)(var5 + 32);
                var4++;
                var4++;
                var4++;
                var4++;
                var4++;
                return new String(var10);
              }
            }
          } else {
            return new String(var10);
          }
        } else {
          var4 = 0;
          L3: while (true) {
            if (var2 <= var4) {
              return new String(var10);
            } else {
              L4: {
                var5 = param1.charAt(var4);
                if (var5 < 65) {
                  break L4;
                } else {
                  if (var5 <= 90) {
                    var3[var4] = (char)(var5 + 32);
                    var4++;
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                L6: {
                  if (97 > var5) {
                    break L6;
                  } else {
                    if (var5 <= 122) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (var5 < 48) {
                    break L7;
                  } else {
                    if (var5 <= 57) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
                var3[var4] = (char)95;
                var4++;
                var4++;
                continue L3;
              }
              var3[var4] = (char)var5;
              var4++;
              var4++;
              continue L3;
            }
          }
        }
    }

    public final boolean b(int param0) {
        Object var3 = null;
        if (param0 != -20836) {
          var3 = null;
          String discarded$2 = esb.a(91, (CharSequence) null);
          return super.a((byte) -124, ((esb) this).field_d.field_Vc);
        } else {
          return super.a((byte) -124, ((esb) this).field_d.field_Vc);
        }
    }

    public static void e(int param0) {
        if (param0 >= -104) {
            Object var2 = null;
            String discarded$0 = esb.a(27, (CharSequence) null);
            field_j = null;
            return;
        }
        field_j = null;
    }

    esb(jp param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final void a(int param0) {
        if (param0 > -84) {
            return;
        }
        super.a(-119);
    }

    static {
    }
}
