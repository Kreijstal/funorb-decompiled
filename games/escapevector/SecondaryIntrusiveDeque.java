/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryIntrusiveDeque {
    private DualLinkNode sentinel;
    static long field_b;
    private DualLinkNode cursor;

    final boolean isEmpty(int guard) {
        if (guard != -182442704) {
          this.cursor = (DualLinkNode) null;
        }
        return this.sentinel.secondaryNext == this.sentinel ? true : false;
    }

    final static void d(int param0) {
        SelfDestructEffects.field_j.field_g = param0;
        SelfDestructEffects.field_j.field_d = 0;
    }

    final int c(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = param0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (this.sentinel != var3) {
          var3 = var3.secondaryNext;
          var2++;
        }
        return var2;
    }

    final DualLinkNode removeFirst(byte guard) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel != var2) {
          if (guard != -75) {
            this.cursor = (DualLinkNode) null;
          }
          var2.unlinkSecondary(110);
          return var2;
        }
        return null;
    }

    final void addLast(int guard, DualLinkNode node) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary(109);
          }
          if (guard != -1) {
            field_b = 29L;
          }
          node.secondaryNext = this.sentinel;
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "va.J(" + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(PacketBuffer param0, boolean param1) {
        String stackIn_11_2 = null;
        try {
          int var2_int = param0.readUnsignedByte(0);
          if (!param1) {
            return true;
          }
          boolean stackIn_6_0 = !(var2_int != 1);
          boolean var3 = stackIn_6_0;
          boolean stackIn_7_0 = var3;
          return (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var2;
          StringBuilder stackIn_10_1 = new StringBuilder().append("va.H(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, boolean param11, int param12, int param13, int param14, int param15, int param16) {
        String stackIn_82_2 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        boolean var33 = false;
        int var35 = 0;
        int var42 = EscapeVector.obfuscationControl;
        try {
          if (param10 >= 0 &&
            param8 < bi.field_f) {
            if (param7 < 0 &&
              0 > param5 &&
              0 > param13) {
              return;
            }
            if (bi.field_c <= param7 &&
              bi.field_c <= param5 &&
              bi.field_c <= param13) {
              return;
            }
            if (!param11) {
              SecondaryIntrusiveDeque.d(-74);
            }
            int var34 = param10 - param8;
            if (param9 == param8) {
              if (param10 != param8) {
                var35 = param10 - param9;
                if (param5 <= param7) {
                  var21 = param1 << 16;
                  var25 = param6 << 16;
                  var20 = (-param7 + param13 << 16) / var34;
                  var19 = (-param5 + param13 << 16) / var35;
                  var30 = param2 << 16;
                  var18 = param7 << 16;
                  var17_int = param5 << 16;
                  var27 = (param15 - param6 << 16) / var35;
                  var23 = (param0 - param1 << 16) / var35;
                  var22 = param12 << 16;
                  var31 = (-param3 + param16 << 16) / var35;
                  var26 = param14 << 16;
                  var32 = (param16 - param2 << 16) / var34;
                  var29 = param3 << 16;
                  var24 = (-param12 + param0 << 16) / var34;
                  var28 = (-param14 + param15 << 16) / var34;
                } else {
                  var26 = param6 << 16;
                  var31 = (param16 - param2 << 16) / var34;
                  var30 = param3 << 16;
                  var17_int = param7 << 16;
                  var28 = (-param6 + param15 << 16) / var35;
                  var27 = (-param14 + param15 << 16) / var34;
                  var19 = (param13 - param7 << 16) / var34;
                  var21 = param12 << 16;
                  var18 = param5 << 16;
                  var22 = param1 << 16;
                  var25 = param14 << 16;
                  var29 = param2 << 16;
                  var32 = (-param3 + param16 << 16) / var35;
                  var23 = (-param12 + param0 << 16) / var34;
                  var24 = (param0 - param1 << 16) / var35;
                  var20 = (-param5 + param13 << 16) / var35;
                }
              } else {
                var22 = param1;
                var30 = param3;
                var27 = 0;
                var32 = 0;
                var18 = param5 << 16;
                var28 = 0;
                var17_int = param7 << 16;
                var23 = 0;
                var20 = 0;
                var24 = 0;
                var19 = 0;
                var31 = 0;
                var26 = param6;
                var25 = param14;
                var29 = param2;
                var21 = param12;
              }
              if (param8 < 0) {
                param8 = Math.min(-param8, -param8 + param9);
                var21 = var21 + param8 * var23;
                var25 = var25 + param8 * var27;
                var17_int = var17_int + var19 * param8;
                var29 = var29 + param8 * var31;
                var26 = var26 + var28 * param8;
                var22 = var22 + param8 * var24;
                var30 = var30 + var32 * param8;
                var18 = var18 + param8 * var20;
                param8 = 0;
              }
              var33 = false;
            } else {
              var22 = param12 << 16;
              var21 = param12 << 16;
              var30 = param2 << 16;
              var29 = param2 << 16;
              var26 = param14 << 16;
              var25 = param14 << 16;
              var18 = param7 << 16;
              var17_int = param7 << 16;
              var35 = param9 - param8;
              var20 = (param13 - param7 << 16) / var34;
              var19 = (-param7 + param5 << 16) / var35;
              if (var20 <= var19) {
                var23 = (-param12 + param0 << 16) / var34;
                var27 = (-param14 + param15 << 16) / var34;
                var24 = (param1 - param12 << 16) / var35;
                var33 = true;
                int var36 = var19;
                var19 = var20;
                var20 = var36;
                var32 = (param3 - param2 << 16) / var35;
                var28 = (param6 - param14 << 16) / var35;
                var31 = (-param2 + param16 << 16) / var34;
              } else {
                var23 = (param1 - param12 << 16) / var35;
                var24 = (param0 - param12 << 16) / var34;
                var32 = (-param2 + param16 << 16) / var34;
                var27 = (-param14 + param6 << 16) / var35;
                var31 = (-param2 + param3 << 16) / var35;
                var33 = false;
                var28 = (-param14 + param15 << 16) / var34;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param8 < 0) {
                if (0 > param9) {
                  param8 = param9 - param8;
                  var30 = var30 + param8 * var32;
                  var25 = var25 + param8 * var27;
                  var22 = var22 + var24 * param8;
                  var26 = var26 + var28 * param8;
                  var29 = var29 + var31 * param8;
                  var18 = var18 + var20 * param8;
                  var21 = var21 + param8 * var23;
                  var17_int = var17_int + var19 * param8;
                  param8 = param9;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param8 = -param8;
                  var29 = var29 + param8 * var31;
                  var25 = var25 + param8 * var27;
                  var26 = var26 + param8 * var28;
                  var22 = var22 + var24 * param8;
                  var30 = var30 + var32 * param8;
                  var18 = var18 + var20 * param8;
                  var21 = var21 + param8 * var23;
                  var17_int = var17_int + var19 * param8;
                  param8 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                int var36Lifetime2 = bi.field_a[param8];
                while (param8 < param9) {
                  int var37 = var17_int >> 16;
                  if (bi.field_c > var37) {
                    int var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 != 0) {
                      int var39 = (-var21 + var22) / var38;
                      int var40 = (var26 - var25) / var38;
                      int var41 = (var30 - var29) / var38;
                      if (bi.field_c <= var37 + var38) {
                        var38 = -1 + bi.field_c - var37;
                      }
                      if (var37 < 0) {
                        LinkButtonPainter.a(var25 - var40 * var37, var36Lifetime2, var41, (byte) -114, var29 - var37 * var41, var39, var40, var38 + var37, param4, var21 - var39 * var37);
                      } else {
                        LinkButtonPainter.a(var25, var37 + var36Lifetime2, var41, (byte) -121, var29, var39, var40, var38, param4, var21);
                      }
                    } else if (var37 >= 0 &&
                      bi.field_c > var37) {
                      LinkButtonPainter.a(var25, var37 + var36Lifetime2, 0, (byte) -116, var29, 0, 0, var38, param4, var21);
                    }
                  }
                  param8++;
                  if (param8 >= bi.field_f) {
                    return;
                  }
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var26 = var26 + var28;
                  var29 = var29 + var31;
                  var18 = var18 + var20;
                  var17_int = var17_int + var19;
                  var36Lifetime2 = var36Lifetime2 + SoftwareRasterizer.width;
                  var30 = var30 + var32;
                  var22 = var22 + var24;
                }
              }
              int var36Lifetime3 = -param9 + param10;
              if (var36Lifetime3 == 0) {
                var20 = 0;
                var27 = 0;
                var32 = 0;
                var31 = 0;
                var23 = 0;
                var19 = 0;
                var28 = 0;
                var24 = 0;
              } else {
                int var37Lifetime2 = param13 << 16;
                int var38Lifetime2 = param0 << 16;
                int var39Lifetime2 = param15 << 16;
                int var40Lifetime2 = param16 << 16;
                if (var33) {
                  var18 = param5 << 16;
                  var26 = param6 << 16;
                  var22 = param1 << 16;
                  var30 = param3 << 16;
                } else {
                  var25 = param6 << 16;
                  var17_int = param5 << 16;
                  var29 = param3 << 16;
                  var21 = param1 << 16;
                }
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var31 = (var40Lifetime2 - var29) / var36Lifetime3;
                var23 = (-var21 + var38Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var20 = (-var18 + var37Lifetime2) / var36Lifetime3;
                var24 = (var38Lifetime2 - var22) / var36Lifetime3;
              }
            }
            if (param8 < 0) {
              param8 = -param8;
              var17_int = var17_int + var19 * param8;
              var25 = var25 + param8 * var27;
              var29 = var29 + param8 * var31;
              var21 = var21 + var23 * param8;
              var18 = var18 + var20 * param8;
              var26 = var26 + param8 * var28;
              var30 = var30 + var32 * param8;
              var22 = var22 + var24 * param8;
              param8 = 0;
            }
            int var35Lifetime1 = bi.field_a[param8];
            while (param8 < param10) {
              int var36Lifetime1 = var17_int >> 16;
              if (bi.field_c > var36Lifetime1) {
                int var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  int var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  int var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  int var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (bi.field_c <= var37Lifetime1 + var36Lifetime1) {
                    var37Lifetime1 = -1 + (bi.field_c - var36Lifetime1);
                  }
                  if (var36Lifetime1 >= 0) {
                    LinkButtonPainter.a(var25, var36Lifetime1 + var35Lifetime1, var40Lifetime1, (byte) -109, var29, var38Lifetime1, var39Lifetime1, var37Lifetime1, param4, var21);
                  } else {
                    LinkButtonPainter.a(var25 - var39Lifetime1 * var36Lifetime1, var35Lifetime1, var40Lifetime1, (byte) -103, -(var40Lifetime1 * var36Lifetime1) + var29, var38Lifetime1, var39Lifetime1, var36Lifetime1 + var37Lifetime1, param4, -(var38Lifetime1 * var36Lifetime1) + var21);
                  }
                } else if (0 <= var36Lifetime1 &&
                  var36Lifetime1 < bi.field_c) {
                  LinkButtonPainter.a(var25, var35Lifetime1 + var36Lifetime1, 0, (byte) -114, var29, 0, 0, var37Lifetime1, param4, var21);
                }
              }
              param8++;
              if (param8 >= bi.field_f) {
                return;
              }
              var35Lifetime1 = var35Lifetime1 + SoftwareRasterizer.width;
              var17_int = var17_int + var19;
              var22 = var22 + var24;
              var30 = var30 + var32;
              var18 = var18 + var20;
              var29 = var29 + var31;
              var21 = var21 + var23;
              var26 = var26 + var28;
              var25 = var25 + var27;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var17 = decompiledCaughtException;
          RuntimeException stackIn_81_0 = var17;
          StringBuilder stackIn_81_1 = new StringBuilder().append("va.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          try {
            wi.field_i = param0;
            try {
              if (param1 > -110) {
                field_b = 2L;
              }
              String var3 = param2.getParameter("cookieprefix");
              String var4 = param2.getParameter("cookiehost");
              String var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (0 == param0.length()) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              JavaScriptBridge.evaluateScript((byte) -111, param2, "document.cookie=\"" + var5 + "\"");
            } catch (Throwable throwable) {
            }
            PairedTextColumns.updateBrowserLinks((byte) 15, param2);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "va.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final DualLinkNode next(byte guard) {
        int var2 = -2 / ((guard - 48) / 32);
        DualLinkNode var3 = this.cursor;
        if (var3 != this.sentinel) {
          this.cursor = var3.secondaryNext;
          return var3;
        }
        this.cursor = null;
        return null;
    }

    public SecondaryIntrusiveDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    final DualLinkNode first(int guard) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        if (guard != 0) {
          field_b = 88L;
        }
        return var2;
    }

    static {
    }
}
