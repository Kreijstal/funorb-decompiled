/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class o extends da {
    int field_o;
    static int field_l;
    static int field_i;
    static String field_n;
    static int[] field_j;
    static jk field_k;
    int field_p;
    static boolean field_m;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9;
        int var10;
        int var11;
        int var12;
        var9 = param5 + param2;
        var10 = param3 + param6;
        if (param7 != 9) {
          return true;
        }
        var11 = param8 + param0;
        var12 = param4 + param1;
        if (param6 > param5) {
          if (var9 > param6 &&
            var10 >= var9) {
            if (param1 <= param8) {
              if (var12 > param8) {
                return true;
              }
              if (var11 > param1 &&
                var11 <= var12) {
                return true;
              }
              if (param5 > param6 ||
                param6 >= var9) {
                if (param5 >= var10) {
                  return false;
                }
                if (var9 < var10) {
                  return false;
                }
              }
              if (param1 >= param8 &&
                var11 > param1) {
                return true;
              }
              if (param8 >= var12) {
                return false;
              }
              if (var11 < var12) {
                return false;
              }
              return true;
            }
            if (var11 > param1 &&
              var11 <= var12) {
              return true;
            }
          }
          if (param5 > param6) {
            if (param5 >= var10) {
              return false;
            }
            if (var9 < var10) {
              return false;
            }
            if (param1 >= param8 &&
              var11 > param1) {
              return true;
            }
          } else {
            if (param6 >= var9) {
              if (param5 >= var10) {
                return false;
              }
              if (var9 < var10) {
                return false;
              }
              if (param1 >= param8 &&
                var11 > param1) {
                return true;
              }
              if (param8 >= var12) {
                return false;
              }
              return (var11 >= var12);
            }
            if (param1 < param8) {
              if (param8 >= var12) {
                return false;
              }
              if (var11 < var12) {
                return false;
              }
              return true;
            }
            if (var11 > param1) {
              return true;
            }
          }
          if (param8 >= var12) {
            return false;
          }
          if (var11 >= var12) {
            return true;
          }
          return false;
        }
        if (param5 < var10) {
          if (param1 <= param8) {
            if (var12 > param8) {
              return true;
            }
            if (var11 > param1 &&
              var11 <= var12) {
              return true;
            }
            if (param5 > param6 ||
              param6 >= var9) {
              if (param5 >= var10) {
                return false;
              }
              if (var9 < var10) {
                return false;
              }
            }
            if ((param1 < param8 ||
              var11 <= param1) &&
              (param8 >= var12 ||
              var11 < var12)) {
              return false;
            }
            return true;
          }
          if (var11 > param1 &&
            var11 <= var12) {
            return true;
          }
          boolean decompiledFrameRemainder6 = true;
          if (param5 <= param6) {
            if (param6 < var9) {
              if (param1 < param8) {
                decompiledFrameRemainder6 = !(param8 >= var12);
                if ((decompiledFrameRemainder6) &&
                  (var11 < var12)) {
                  return false;
                }
              } else {
                if (var11 <= param1) {
                  if (param8 < var12 &&
                    var11 >= var12) {
                    return true;
                  }
                  return false;
                }
              }
              if (decompiledFrameRemainder6) {
                return true;
              }
            }
            if (decompiledFrameRemainder6) {
              if (param5 < var10 &&
                var9 >= var10 && (param1 >= param8 &&
                var11 > param1 ||
                param8 < var12 &&
                var11 >= var12)) {
                return true;
              }
              return false;
            }
          }
          if ((decompiledFrameRemainder6) && (param5 < var10 &&
            var9 >= var10)) {
            if ((param1 < param8 ||
              var11 <= param1) &&
              (param8 >= var12 ||
              var11 < var12)) {
              return false;
            }
            return true;
          }
          return false;
        }
        if (var9 <= param6) {
          boolean decompiledFrameRemainder5 = true;
          if (param5 <= param6) {
            if (param6 < var9) {
              if (param1 < param8) {
                decompiledFrameRemainder5 = !(param8 >= var12);
                if ((decompiledFrameRemainder5) &&
                  (var11 < var12)) {
                  return false;
                }
              } else {
                if (var11 <= param1) {
                  if (param8 >= var12) {
                    return false;
                  }
                  if (var11 >= var12) {
                    return true;
                  }
                  return false;
                }
              }
              if (decompiledFrameRemainder5) {
                return true;
              }
            }
            if (decompiledFrameRemainder5) {
              boolean decompiledFrameRemainder4 = true;
              if (param5 < var10 &&
                var9 >= var10) {
                if (param1 < param8) {
                  decompiledFrameRemainder4 = !(param8 >= var12);
                  if ((decompiledFrameRemainder4) &&
                    (var11 < var12)) {
                    return false;
                  }
                } else {
                  if (var11 <= param1) {
                    if (param8 < var12 &&
                      var11 >= var12) {
                      return true;
                    }
                    return false;
                  }
                }
                if (decompiledFrameRemainder4) {
                  return true;
                }
              }
              return false;
            }
          }
          if ((decompiledFrameRemainder5) && (param5 < var10 &&
            var9 >= var10)) {
            if (param1 < param8) {
              if (param8 >= var12) {
                return false;
              }
              if (var11 < var12) {
                return false;
              }
            } else {
              if (var11 <= param1) {
                if (param8 < var12 &&
                  var11 >= var12) {
                  return true;
                }
                return false;
              }
            }
            return true;
          }
          return false;
        }
        if (var10 < var9) {
          boolean decompiledFrameRemainder3 = true;
          if (param5 <= param6) {
            if (param6 < var9) {
              if (param1 < param8) {
                decompiledFrameRemainder3 = !(param8 >= var12);
                if ((decompiledFrameRemainder3) &&
                  (var11 < var12)) {
                  return false;
                }
              } else {
                if (var11 <= param1) {
                  if (param8 >= var12) {
                    return false;
                  }
                  if (var11 >= var12) {
                    return true;
                  }
                  return false;
                }
              }
              if (decompiledFrameRemainder3) {
                return true;
              }
            }
            if (decompiledFrameRemainder3) {
              boolean decompiledFrameRemainder2 = true;
              if (param5 < var10 &&
                var9 >= var10) {
                if (param1 < param8) {
                  decompiledFrameRemainder2 = !(param8 >= var12);
                  if ((decompiledFrameRemainder2) &&
                    (var11 < var12)) {
                    return false;
                  }
                } else {
                  if (var11 <= param1) {
                    if (param8 < var12 &&
                      var11 >= var12) {
                      return true;
                    }
                    return false;
                  }
                }
                if (decompiledFrameRemainder2) {
                  return true;
                }
              }
              return false;
            }
          }
          if ((decompiledFrameRemainder3) && (param5 < var10 &&
            var9 >= var10)) {
            if (param1 < param8) {
              if (param8 >= var12) {
                return false;
              }
              if (var11 < var12) {
                return false;
              }
            } else {
              if (var11 <= param1) {
                if (param8 < var12 &&
                  var11 >= var12) {
                  return true;
                }
                return false;
              }
            }
            return true;
          }
          return false;
        }
        if (param1 <= param8) {
          if (var12 > param8) {
            return true;
          }
          if (var11 > param1 &&
            var11 <= var12) {
            return true;
          }
          if ((param5 <= param6 &&
            param6 < var9 ||
            param5 < var10 &&
            var9 >= var10) &&
            (param1 >= param8 &&
            var11 > param1 ||
            param8 < var12 &&
            var11 >= var12)) {
            return true;
          }
          return false;
        }
        if (var11 > param1 &&
          var11 <= var12) {
          return true;
        }
        boolean decompiledFrameRemainder1 = true;
        if (param5 <= param6) {
          if (param6 < var9) {
            if (param1 < param8) {
              decompiledFrameRemainder1 = !(param8 >= var12);
              if ((decompiledFrameRemainder1) &&
                (var11 < var12)) {
                return false;
              }
            } else {
              if (var11 <= param1) {
                if (param8 >= var12) {
                  return false;
                }
                if (var11 >= var12) {
                  return true;
                }
                return false;
              }
            }
            if (decompiledFrameRemainder1) {
              return true;
            }
          }
          if (decompiledFrameRemainder1) {
            boolean decompiledFrameRemainder0 = true;
            if (param5 < var10 &&
              var9 >= var10) {
              if (param1 < param8) {
                decompiledFrameRemainder0 = !(param8 >= var12);
                if ((decompiledFrameRemainder0) &&
                  (var11 < var12)) {
                  return false;
                }
              } else {
                if (var11 <= param1) {
                  if (param8 >= var12) {
                    return false;
                  }
                  if (var11 >= var12) {
                    return true;
                  }
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
            return false;
          }
        }
        if ((decompiledFrameRemainder1) && (param5 < var10 &&
          var9 >= var10)) {
          if (param1 < param8) {
            if (param8 >= var12) {
              return false;
            }
            if (var11 < var12) {
              return false;
            }
          } else {
            if (var11 <= param1) {
              if (param8 >= var12) {
                return false;
              }
              if (var11 >= var12) {
                return true;
              }
              return false;
            }
          }
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, boolean param2, java.awt.Color param3, String param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = bg.field_P.getGraphics();
            if (hh.field_a == null) {
              hh.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, sd.field_c, fl.field_v);
            }
            if (param3 == null) {
              param3 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == uf.field_i) {
                uf.field_i = bg.field_P.createImage(304, 34);
              }
              var10 = uf.field_i.getGraphics();
              var10.setColor(param3);
              var10.drawRect(0, 0, param1, 33);
              var10.fillRect(2, 2, 3 * param0, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(param0 * 3 + 2, 2, 300 - param0 * 3, 30);
              var10.setFont(hh.field_a);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param4, (304 - param4.length() * 6) / 2, 22);
              var9.drawImage(uf.field_i, sd.field_c / 2 - 152, fl.field_v / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = sd.field_c / 2 - 152;
              var8 = fl.field_v / 2 - 18;
              var9.setColor(param3);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(var7 + 2, 2 + var8, 3 * param0, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(3 * param0 + (var7 + 2), 2 + var8, 300 - 3 * param0, 30);
              var9.setFont(hh.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param4, (304 - 6 * param4.length()) / 2 + var7, var8 + 22);
            }
            if (dk.field_d != null) {
              var9.setFont(hh.field_a);
              var9.setColor(java.awt.Color.white);
              var9.drawString(dk.field_d, sd.field_c / 2 - dk.field_d.length() * 6 / 2, fl.field_v / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            bg.field_P.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_21_0 = var5_ref;
          stackIn_21_1 = new StringBuilder().append("o.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        eh.field_o = (param1 << 16) / 150;
        int var2 = -7 % ((param0 + 81) / 33);
        eh.field_m = 400 * param1 / 150;
        eh.field_k = 100 * param1 / 150;
    }

    public static void b(boolean param0) {
        field_j = null;
        field_k = null;
        field_n = null;
        if (!param0) {
          field_m = false;
        }
    }

    final static void a(int param0, boolean param1) {
        md.field_a = false;
        rj.field_g = param0;
        if (rj.field_g == 0) {
          gh.field_x = false;
        }
        if (!param1) {
          o.b(false);
        }
        rf.field_ib = 0;
        nd.field_e = s.field_k[1 + rj.field_g];
        bc.field_o = 13;
        bb.field_h = 13;
        ch.b(!param1);
    }

    private o() throws Throwable {
        throw new Error();
    }

    final static int a(int param0) {
        if (param0 != 18) {
          field_i = 4;
          return fh.field_c;
        }
        return fh.field_c;
    }

    static {
        field_n = "Help posts: OFF";
        field_i = 2;
    }
}
